import * as React from 'react';
import UnionValue from '../model/UnionValue';
import ManipulableList, { ItemRendererProps } from './ManipulableList';
import Values from '../model/Values';
import EditableUnionValue from './EditableUnionValue';
import { VariantType } from '../model/Variant';
import './UnionValueListEdit.css';

interface UnionValueListEditProps extends React.ClassAttributes<UnionValueListEdit> {
    list: UnionValue[],
    type?: VariantType, // TODO add type restraction.
    readOnly?: boolean,
    className?: string,
    fixedItems?: boolean,
    afterChange?(list: UnionValue[]): void,
}

class UnionValueListEdit extends React.Component<UnionValueListEditProps> {
    protected static defaultProps: Partial<UnionValueListEditProps> = {
        readOnly: false,
        fixedItems: false,
    };

    private manipulableListRef: React.RefObject<ManipulableList<UnionValue>>;
    private pendingNewItem: UnionValue | null = null;

    constructor(props: UnionValueListEditProps) {
        super(props);

        this.manipulableListRef = React.createRef();

        this.itemRenderer = this.itemRenderer.bind(this);
        this.addNewItem = this.addNewItem.bind(this);
        this.removeItem = this.removeItem.bind(this);
        this.onItemMoved = this.onItemMoved.bind(this);
        this.onItemRemoved = this.onItemRemoved.bind(this);
        this.onItemAppended = this.onItemAppended.bind(this);
        this.onItemUpdated = this.onItemUpdated.bind(this);
    }

    protected addNewItem() {
        const mlist: ManipulableList<UnionValue> | null = this.manipulableListRef.current;
        if (mlist === null) {
            return;
        }
        this.pendingNewItem = Values.blank();
        mlist.addItem(this.pendingNewItem);
    }

    protected removeItem() {
        const mlist: ManipulableList<UnionValue> | null = this.manipulableListRef.current;
        if (mlist === null) {
            return;
        }
        mlist.tryRemoveSelected();
    }

    protected onItemMoved(item: UnionValue, oldIndex: number, newIndex: number) {
        this.onUpdate();
    }

    protected onItemRemoved(item: UnionValue, index: number) {
        this.onUpdate();
    }

    protected onItemAppended(item: UnionValue, index: number) {
        this.pendingNewItem = item;
        this.onUpdate();
    }

    protected onItemUpdated(oldItem: UnionValue, newItem: UnionValue, index: number) {
        this.onUpdate();
    }

    protected onUpdate() {
        this.forceUpdate();
        if (typeof this.props.afterChange !== 'undefined') {
            this.props.afterChange(this.props.list);
        }
    }

    protected itemRenderer(props: ItemRendererProps<UnionValue>) {
        const afterChange = (value: UnionValue) => {
            props.updateItem(value);
        };

        let editMode = false;
        if (this.pendingNewItem === props.value) {
            editMode = !this.props.readOnly;
            this.pendingNewItem = null;
        }

        return (
            <EditableUnionValue
                value={props.value}
                editMode={editMode}
                afterChange={afterChange} />
        );
    }

    public render() {
        const list = this.props.list;

        let className = "union-value-list-edit";
        if (typeof this.props.className !== 'undefined') {
            className += " " + this.props.className;
        }

        return (
            <div className={className}>
                <ManipulableList<UnionValue>
                    ref={this.manipulableListRef}
                    list={list}
                    itemRenderer={this.itemRenderer}
                    sortable={!this.props.fixedItems}
                    appendable={!this.props.fixedItems}
                    removable={!this.props.fixedItems}
                    onItemMoved={this.onItemMoved}
                    onItemRemoved={this.onItemRemoved}
                    onItemAppended={this.onItemAppended}
                    onItemUpdated={this.onItemUpdated}
                    createItem={Values.blank} />
                {this.props.fixedItems || (
                    <div className="actions">
                        <button
                            type="button"
                            className="add-item"
                            onClick={this.addNewItem}>添加</button>
                        <button
                            type="button"
                            className="remove-item"
                            onClick={this.removeItem}>删除</button>
                    </div>
                )}
            </div>
        );
    }
}

export default UnionValueListEdit;
export { UnionValueListEditProps };

import * as React from 'react';
import Workbook from '../model/Workbook';
import Service from '../action/Service';
import ActionHandler from '../action/ActionHandler';
import Action from '../action/Action';
import ActionHerald from '../action/ActionHerald';
import EditRequest from '../action/EditRequest';
import EditResponse from '../action/EditResponse';
import WorkbookView from './WorkbookView';
import ReactLoading from 'react-loading';
import './WorkbookPresenter.css';

interface WorkbookPresenterProps extends React.ClassAttributes<WorkbookPresenter> {
    workbook: Workbook;
    service: Service;
    className?: string;
}

interface WorkbookPresenterState {
    txId: number;
    message: string;
    serviceStatus: string;
    showMask: boolean;
}

class WorkbookPresenter extends React.Component<WorkbookPresenterProps, WorkbookPresenterState> implements ActionHerald {
    protected listeners: Set<ActionHandler> = new Set();

    constructor(props: WorkbookPresenterProps) {
        super(props);

        this.state = {
            txId: 0,
            message: '',
            serviceStatus: '就绪',
            showMask: false
        };

        this.handleAction = this.handleAction.bind(this);
        this.onServiceOk = this.onServiceOk.bind(this);
        this.onServiceError = this.onServiceError.bind(this);
    }

    public subscribe(handler: ActionHandler) {
        this.listeners.add(handler);
    }

    public unsubscribe(handler: ActionHandler) {
        this.listeners.delete(handler);
    }

    protected handleAction(action: Action) {
        // console.log('handleAction', action);
        // ignore local actions such as asset been selected.
        if (action.isLocalAction()) {
            return;
        }
        // Workbook presenter only deal with submit form action.
        // And there supposed to be no other remote actions from WorkbookView.
        if (typeof action.submitForm === 'undefined') {
            // throw new Error('Illegal action.');
            return;
        }

        const request = new EditRequest(this.state.txId + 1, action);
        this.setState({
            txId: request.txId,
            message: `服务请求中，txId=${request.txId}…`,
            serviceStatus: "忙碌…",
            showMask: true,
        });
        this.props.service.call(
            request,
            this.onServiceOk,
            this.onServiceError,
        );
    }

    protected onServiceOk(resp: EditResponse) {
        // make sure resp is an EditResponse instance.
        resp = EditResponse.deserialize(resp);
        if (resp.statusCode === 0) {
            if (typeof resp.changes !== 'undefined') {
                this.applyChanges(resp.changes.actions);
            }

        } else {
            // TODO
        }
        this.setState({ showMask: false });
    }

    protected applyChanges(actions: Action[]) {
        // console.log('applyChanges', actions);
        for (const action of actions) {
            this.listeners.forEach(handler => handler(action));
        }
    }

    protected onServiceError() {
        // TODO
        this.setState({ showMask: false });
    }

    render() {
        return (
            <>
                <WorkbookView
                    className={this.props.className}
                    workbook={this.props.workbook}
                    editable={false}
                    onAction={this.handleAction}
                    herald={this} />
                {this.state.showMask && (
                    <div className="loading-mask">
                        <ReactLoading
                            className="workbook-loading"
                            type="spinningBubbles"
                            color="rgba(153, 153, 153, .9)"
                            width="8rem"
                            height="8rem" />
                    </div>
                )}
            </>
        );
    }
}

export default WorkbookPresenter;
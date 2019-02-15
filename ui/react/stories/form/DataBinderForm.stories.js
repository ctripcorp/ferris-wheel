import React, { Component } from 'react';
import { DataBinderForm, Binder } from '../../src';
import { action } from '@storybook/addon-actions';

class DataBinderFormStories extends Component {
    binder = new Binder();

    constructor(props) {
        super(props);

        this.afterChange = this.afterChange.bind(this);
    }

    afterChange(binder) {
        action('DataBinderForm afterChange')(binder);
    }

    render() {
        return (
            <div>
                <h3>DataBinderForm</h3>
                <DataBinderForm
                    binder={this.binder}
                    afterChange={this.afterChange} />
            </div>
        );
    }
}

export default DataBinderFormStories;

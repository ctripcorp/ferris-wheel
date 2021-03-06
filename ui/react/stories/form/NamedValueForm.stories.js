import React, { Component } from 'react';
import { NamedValueForm, NamedValue, Values } from '../../src';
import { action } from '@storybook/addon-actions';

class NamedValueFormStories extends Component {
    param = new NamedValue('testP', Values.blank());

    constructor(props) {
        super(props);
        this.afterChange = this.afterChange.bind(this);
    }

    afterChange(param) {
        action('NamedValueForm afterChange')(param);
    }

    render() {
        return (
            <div>
                <h3>NamedValueForm</h3>
                <NamedValueForm
                    namedValue={this.param}
                    afterChange={this.afterChange} />
            </div>
        );
    }
}

export default NamedValueFormStories;
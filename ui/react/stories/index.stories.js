import React from 'react';
import { storiesOf } from '@storybook/react';
import { action } from '@storybook/addon-actions';
// import { linkTo } from '@storybook/addon-links';

// import { Button, Welcome } from '@storybook/react/demo';

import {
  Button,
  CheckBox,
  DropdownButton,
  Select,
  Toolbar,
  Group
} from '../src';

import GaugeChartStories from './chart/GaugeChart.stories';
import PlotlyChartsStories from './chart/PlotlyCharts.stories';

import CheckBoxStories from './ctrl/CheckBox.stories';
import DateSelectStories from './ctrl/DateSelect.stories';
import EditableListStories from './ctrl/EditableList.stories';
import EditableTextStories from './ctrl/EditableText.stories';
import EditableUnionValueStories from './ctrl/EditableUnionValue.stories';
import EditBoxStories from './ctrl/EditBox.stories';
import FormatInputStories from './ctrl/FormatInput.stories';
import InlineEditableStories from './ctrl/InlineEditable.stories';
import IntervalInputStories from './ctrl/IntervalInput.stories';
import ManipulableListStories from './ctrl/ManipulableList.stories';
import NumberInputStories from './ctrl/NumberInput.stories';
import OmniInputStories from './ctrl/OmniInput.stories';
import PlacementSelectorStories from './ctrl/PlacementSelector.stories';
import RadioGroupStories from './ctrl/RadioGroup.stories';
import SelectStories from './ctrl/Select.stories';
import UnionValueEditStories from './ctrl/UnionValueEdit.stories';
import UnionValueListEditStories from './ctrl/UnionValueListEdit.stories';
import ColorInputStories from './ctrl/ColorInput.stories';

import AddFormFormStories from './form/AddFormForm.stories';
import AxisFormStories from './form/AxisForm.stories';
import BandFormStroies from './form/BandForm.stroies';
import ChartFormStories from './form/ChartForm.stories';
import DataBinderFormStories from './form/DataBinderForm.stories';
import FieldStories from './form/Field.stories';
import SmartFieldStories from "./form/SmartField.stories";
import SmartFormStories from "./form/SmartForm.stories";
import FormFieldFormStories from './form/FormFieldForm.stories';
import FormFormStories from './form/FormForm.stories';
import LayoutFormStories from './form/LayoutForm.stories';
import ParameterFormStories from './form/ParameterForm.stories';
import PivotFieldFormStories from './form/PivotFieldForm.stories';
import PivotFilterFormStories from './form/PivotFilterForm.stories';
import PivotFormStories from './form/PivotForm.stories';
import PivotValueFormStories from './form/PivotValueForm.stories';
import QueryTemplateFormStories from './form/QueryTemplateForm.stories';
import SeriesBinderFormStories from './form/SeriesBinderForm.stories';
import SeriesFormStories from './form/SeriesForm.stories';
import AssetViewStories from './view/AssetView.stories';
import ChartViewStories from './view/ChartView.stories';
import FormViewStories from './view/FormView.stories';
import GroupViewStories from './view/GroupView.stories';
import ModalStories from './view/Modal.stories';
import SheetViewStories from './view/SheetView.stories';
import TableViewStories from './view/TableView.stories';
import TextViewStories from './view/TextView.stories';
import WorkbookEditorStories from './view/WorkbookEditor.stories';
import WorkbookPresenterStories from './view/WorkbookPresenter.stories'
import WorkbookViewStories from './view/WorkbookView.stories';
import QueryWizardStories from './view/QueryWizard.stories';
import FormatFormStories from './ctrl/FormatForm.stories';
import TableStories from './table/Table.stories';

import DefaultThemeEditor from "./theme/DefaultThemeEditor.stories";

// storiesOf('Welcome', module)
//   .add('Example', () => <ExampleStories />);

storiesOf('Chart', module)
  .add('Gauge', () => <GaugeChartStories />)
  .add('PlotlyCharts', () => <PlotlyChartsStories />);


storiesOf('Control', module)
  .add('Button', () =>
    <div>
      <h3>Button</h3>
      <Button
        name="btn-demo"
        label="Button Demo"
        tips="This is a button demonstration."
        onClick={action('Button click')} />
      <Button
        name="btn-demo-disabled"
        label="Disabled Button"
        tips="This is a disabled button demonstration."
        disabled={true}
        onClick={action('Button click')} />
      <Button
        label="Anchor"
        tips="A button style anchor"
        href="/" />
    </div>)
  .add('CheckBox', () => <CheckBoxStories />)
  .add('ColorInput', () => <ColorInputStories />)
  .add('DateSelect', () => <DateSelectStories />)
  .add('DropdownButton', () =>
    <div>
      <h3>DropdownButton</h3>
      <div>
        <DropdownButton
          primary={{
            name: "dropdown-btn-primary",
            label: "Primary",
            onClick: action("Primary Click"),
          }}
          items={[{
            name: "dropdown-btn-ext1",
            label: "Ext1",
            onClick: action("Ext1"),
          }, {
            name: "dropdown-btn-ext2",
            label: "Ext2",
            onClick: action("Ext2"),
          }]} />
      </div>
      <div style={{ marginTop: 10 }}>
        <DropdownButton
          primary={{
            name: "dropdown-btn-without-event-handler",
            label: "Primary without event handler",
            tips: "Primary button without event handler will be used to trigger dropdown.",
          }}
          items={[{
            name: "dropdown-btn-ext3",
            label: "Ext3",
            onClick: action("Ext3"),
          }, {
            name: "dropdown-btn-ext4",
            label: "Ext4",
            onClick: action("Ext4"),
          }]} />
      </div>
    </div>)
  .add('EditableList', () => <EditableListStories />)
  .add('EditableText', () => <EditableTextStories />)
  .add('EditableUnionValue', () => <EditableUnionValueStories />)
  .add('EditBox', () => <EditBoxStories />)
  .add('FormatInput', () => <FormatInputStories />)
  .add('InlineEditable', () => <InlineEditableStories />)
  .add('IntervalInput', () => <IntervalInputStories />)
  .add('ManipulableList', () => <ManipulableListStories />)
  .add('NumberInput', () => <NumberInputStories />)
  .add('OmniInput', () => <OmniInputStories />)
  .add('PlacementSelector', () => <PlacementSelectorStories />)
  .add('RadioGroup', () => <RadioGroupStories />)
  .add('Select', () => <SelectStories />)
  .add('Toolbar', () =>
    <div>
      <h3>Toolbar</h3>
      <Toolbar>
        <Group>
          <Button name="b1" />
        </Group>
        <Group>
          <Button name="b2" />
          <Button name="b3" />
        </Group>
        <Group>
          <Button name="b4" />
          <Button name="b5" />
          <Button name="b6" />
        </Group>
        <Group>
          <DropdownButton
            primary={{
              name: "Dropdown"
            }}
            items={[{
              name: "Dropdown A"
            }, {
              name: "Dropdown B"
            }]} />
        </Group>
      </Toolbar>
    </div>)
  .add('UnionValueEdit', () => <UnionValueEditStories />)
  .add('UnionValueListEdit', () => <UnionValueListEditStories />);


storiesOf('Form', module)
  .add('AddFormForm', () => <AddFormFormStories />)
  .add('AxisForm', () => <AxisFormStories />)
  .add('BandForm', () => <BandFormStroies />)
  .add('ChartForm', () => <ChartFormStories />)
  .add('DataBinderForm', () => <DataBinderFormStories />)
  .add('Field', () => <FieldStories />)
  .add('FormatForm', () => <FormatFormStories />)
  .add('FormFieldForm', () => <FormFieldFormStories />)
  .add('FormForm', () => <FormFormStories />)
  .add('LayoutForm', () => <LayoutFormStories />)
  .add('ParameterForm', () => <ParameterFormStories />)
  .add('PivotFieldForm', () => <PivotFieldFormStories />)
  .add('PivotFilterForm', () => <PivotFilterFormStories />)
  .add('PivotForm', () => <PivotFormStories />)
  .add('PivotValueForm', () => <PivotValueFormStories />)
  .add('QueryTemplateForm', () => <QueryTemplateFormStories />)
  .add('SeriesBinderForm', () => <SeriesBinderFormStories />)
  .add('SeriesForm', () => <SeriesFormStories />)
  .add('SmartField', () => <SmartFieldStories />)
  .add('SmartForm', () => <SmartFormStories />);


storiesOf('Table', module)
  .add('Table', () => <TableStories />);


storiesOf('View', module)
  .add('AssetView', () => <AssetViewStories />)
  .add('ChartView', () => <ChartViewStories />)
  .add('FormView', () => <FormViewStories />)
  .add('GroupView', () => <GroupViewStories />)
  .add('Modal', () => <ModalStories />)
  .add('SheetView', () => <SheetViewStories />)
  .add('TableView', () => <TableViewStories />)
  .add('TextView', () => <TextViewStories />)
  .add('WorkbookEditor', () => <WorkbookEditorStories />)
  .add('WorkbookPresenter', () => <WorkbookPresenterStories />)
  .add('WorkbookView', () => <WorkbookViewStories />)
  .add('QueryWizard', () => <QueryWizardStories />);


storiesOf("Theme", module)
  .add('DefaultThemeEditor', () => <DefaultThemeEditor />);
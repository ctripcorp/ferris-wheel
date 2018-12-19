// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

public interface PivotAutomatonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.PivotAutomaton)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ferriswheel.v1.UnionValue data = 1;</code>
   */
  boolean hasData();
  /**
   * <code>.ferriswheel.v1.UnionValue data = 1;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValue getData();
  /**
   * <code>.ferriswheel.v1.UnionValue data = 1;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder getDataOrBuilder();

  /**
   * <code>repeated .ferriswheel.v1.PivotFilter filters = 2;</code>
   */
  java.util.List<com.ctrip.ferriswheel.proto.v1.PivotFilter> 
      getFiltersList();
  /**
   * <code>repeated .ferriswheel.v1.PivotFilter filters = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.PivotFilter getFilters(int index);
  /**
   * <code>repeated .ferriswheel.v1.PivotFilter filters = 2;</code>
   */
  int getFiltersCount();
  /**
   * <code>repeated .ferriswheel.v1.PivotFilter filters = 2;</code>
   */
  java.util.List<? extends com.ctrip.ferriswheel.proto.v1.PivotFilterOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <code>repeated .ferriswheel.v1.PivotFilter filters = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.PivotFilterOrBuilder getFiltersOrBuilder(
      int index);

  /**
   * <code>repeated .ferriswheel.v1.PivotField rows = 3;</code>
   */
  java.util.List<com.ctrip.ferriswheel.proto.v1.PivotField> 
      getRowsList();
  /**
   * <code>repeated .ferriswheel.v1.PivotField rows = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.PivotField getRows(int index);
  /**
   * <code>repeated .ferriswheel.v1.PivotField rows = 3;</code>
   */
  int getRowsCount();
  /**
   * <code>repeated .ferriswheel.v1.PivotField rows = 3;</code>
   */
  java.util.List<? extends com.ctrip.ferriswheel.proto.v1.PivotFieldOrBuilder> 
      getRowsOrBuilderList();
  /**
   * <code>repeated .ferriswheel.v1.PivotField rows = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.PivotFieldOrBuilder getRowsOrBuilder(
      int index);

  /**
   * <code>repeated .ferriswheel.v1.PivotField columns = 4;</code>
   */
  java.util.List<com.ctrip.ferriswheel.proto.v1.PivotField> 
      getColumnsList();
  /**
   * <code>repeated .ferriswheel.v1.PivotField columns = 4;</code>
   */
  com.ctrip.ferriswheel.proto.v1.PivotField getColumns(int index);
  /**
   * <code>repeated .ferriswheel.v1.PivotField columns = 4;</code>
   */
  int getColumnsCount();
  /**
   * <code>repeated .ferriswheel.v1.PivotField columns = 4;</code>
   */
  java.util.List<? extends com.ctrip.ferriswheel.proto.v1.PivotFieldOrBuilder> 
      getColumnsOrBuilderList();
  /**
   * <code>repeated .ferriswheel.v1.PivotField columns = 4;</code>
   */
  com.ctrip.ferriswheel.proto.v1.PivotFieldOrBuilder getColumnsOrBuilder(
      int index);

  /**
   * <code>repeated .ferriswheel.v1.PivotValue values = 5;</code>
   */
  java.util.List<com.ctrip.ferriswheel.proto.v1.PivotValue> 
      getValuesList();
  /**
   * <code>repeated .ferriswheel.v1.PivotValue values = 5;</code>
   */
  com.ctrip.ferriswheel.proto.v1.PivotValue getValues(int index);
  /**
   * <code>repeated .ferriswheel.v1.PivotValue values = 5;</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .ferriswheel.v1.PivotValue values = 5;</code>
   */
  java.util.List<? extends com.ctrip.ferriswheel.proto.v1.PivotValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .ferriswheel.v1.PivotValue values = 5;</code>
   */
  com.ctrip.ferriswheel.proto.v1.PivotValueOrBuilder getValuesOrBuilder(
      int index);
}
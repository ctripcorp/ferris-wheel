// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

public interface ChartBinderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.ChartBinder)
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
   * <code>.ferriswheel.v1.Orientation orientation = 2;</code>
   */
  int getOrientationValue();
  /**
   * <code>.ferriswheel.v1.Orientation orientation = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Orientation getOrientation();

  /**
   * <code>.ferriswheel.v1.Placement categories_placement = 3;</code>
   */
  int getCategoriesPlacementValue();
  /**
   * <code>.ferriswheel.v1.Placement categories_placement = 3;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Placement getCategoriesPlacement();

  /**
   * <code>.ferriswheel.v1.Placement series_name_placement = 4;</code>
   */
  int getSeriesNamePlacementValue();
  /**
   * <code>.ferriswheel.v1.Placement series_name_placement = 4;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Placement getSeriesNamePlacement();
}

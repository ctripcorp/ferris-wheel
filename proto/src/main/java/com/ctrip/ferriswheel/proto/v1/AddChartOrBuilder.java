// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

public interface AddChartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.AddChart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sheet_name = 1;</code>
   */
  java.lang.String getSheetName();
  /**
   * <code>string sheet_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getSheetNameBytes();

  /**
   * <code>.ferriswheel.v1.Chart chart = 2;</code>
   */
  boolean hasChart();
  /**
   * <code>.ferriswheel.v1.Chart chart = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Chart getChart();
  /**
   * <code>.ferriswheel.v1.Chart chart = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.ChartOrBuilder getChartOrBuilder();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

public interface CellOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.Cell)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 column_index = 1;</code>
   */
  int getColumnIndex();

  /**
   * <code>.ferriswheel.v1.UnionValue value = 2;</code>
   */
  boolean hasValue();
  /**
   * <code>.ferriswheel.v1.UnionValue value = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValue getValue();
  /**
   * <code>.ferriswheel.v1.UnionValue value = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder getValueOrBuilder();
}

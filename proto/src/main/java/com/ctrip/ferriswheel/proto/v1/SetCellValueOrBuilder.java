// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

public interface SetCellValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.SetCellValue)
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
   * <code>string table_name = 2;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>string table_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>int32 row_index = 3;</code>
   */
  int getRowIndex();

  /**
   * <code>int32 column_index = 4;</code>
   */
  int getColumnIndex();

  /**
   * <code>.ferriswheel.v1.UnionValue value = 5;</code>
   */
  boolean hasValue();
  /**
   * <code>.ferriswheel.v1.UnionValue value = 5;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValue getValue();
  /**
   * <code>.ferriswheel.v1.UnionValue value = 5;</code>
   */
  com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder getValueOrBuilder();
}

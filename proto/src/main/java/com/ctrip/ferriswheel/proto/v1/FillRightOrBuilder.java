// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

public interface FillRightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.FillRight)
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
   * <code>int32 first_row = 3;</code>
   */
  int getFirstRow();

  /**
   * <code>int32 last_row = 4;</code>
   */
  int getLastRow();

  /**
   * <code>int32 column_index = 5;</code>
   */
  int getColumnIndex();

  /**
   * <code>int32 n_columns = 6;</code>
   */
  int getNColumns();
}

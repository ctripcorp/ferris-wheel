// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

public interface FillDownOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.FillDown)
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
   * <code>int32 first_column = 4;</code>
   */
  int getFirstColumn();

  /**
   * <code>int32 last_column = 5;</code>
   */
  int getLastColumn();

  /**
   * <code>int32 n_rows = 6;</code>
   */
  int getNRows();
}

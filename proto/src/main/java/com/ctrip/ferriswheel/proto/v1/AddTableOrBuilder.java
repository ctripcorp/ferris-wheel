// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

public interface AddTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.AddTable)
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
   * <code>.ferriswheel.v1.Table table = 2;</code>
   */
  boolean hasTable();
  /**
   * <code>.ferriswheel.v1.Table table = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Table getTable();
  /**
   * <code>.ferriswheel.v1.Table table = 2;</code>
   */
  com.ctrip.ferriswheel.proto.v1.TableOrBuilder getTableOrBuilder();
}

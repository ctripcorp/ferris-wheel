// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

public interface NamedValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.NamedValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

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

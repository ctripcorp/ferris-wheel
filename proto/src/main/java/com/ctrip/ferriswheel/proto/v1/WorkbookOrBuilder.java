// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

public interface WorkbookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ferriswheel.v1.Workbook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ferriswheel.v1.Version version = 1;</code>
   */
  boolean hasVersion();
  /**
   * <code>.ferriswheel.v1.Version version = 1;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Version getVersion();
  /**
   * <code>.ferriswheel.v1.Version version = 1;</code>
   */
  com.ctrip.ferriswheel.proto.v1.VersionOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * reserved for future use
   * </pre>
   *
   * <code>uint64 flags = 2;</code>
   */
  long getFlags();

  /**
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .ferriswheel.v1.Sheet sheets = 4;</code>
   */
  java.util.List<com.ctrip.ferriswheel.proto.v1.Sheet> 
      getSheetsList();
  /**
   * <code>repeated .ferriswheel.v1.Sheet sheets = 4;</code>
   */
  com.ctrip.ferriswheel.proto.v1.Sheet getSheets(int index);
  /**
   * <code>repeated .ferriswheel.v1.Sheet sheets = 4;</code>
   */
  int getSheetsCount();
  /**
   * <code>repeated .ferriswheel.v1.Sheet sheets = 4;</code>
   */
  java.util.List<? extends com.ctrip.ferriswheel.proto.v1.SheetOrBuilder> 
      getSheetsOrBuilderList();
  /**
   * <code>repeated .ferriswheel.v1.Sheet sheets = 4;</code>
   */
  com.ctrip.ferriswheel.proto.v1.SheetOrBuilder getSheetsOrBuilder(
      int index);
}

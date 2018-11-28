// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.ExecuteQuery}
 */
public  final class ExecuteQuery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.ExecuteQuery)
    ExecuteQueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecuteQuery.newBuilder() to construct.
  private ExecuteQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecuteQuery() {
    sheetName_ = "";
    tableName_ = "";
    params_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExecuteQuery(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sheetName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            tableName_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              params_ = new java.util.ArrayList<com.ctrip.ferriswheel.proto.v1.NamedValue>();
              mutable_bitField0_ |= 0x00000004;
            }
            params_.add(
                input.readMessage(com.ctrip.ferriswheel.proto.v1.NamedValue.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        params_ = java.util.Collections.unmodifiableList(params_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ExecuteQuery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ExecuteQuery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.ExecuteQuery.class, com.ctrip.ferriswheel.proto.v1.ExecuteQuery.Builder.class);
  }

  private int bitField0_;
  public static final int SHEET_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object sheetName_;
  /**
   * <code>string sheet_name = 1;</code>
   */
  public java.lang.String getSheetName() {
    java.lang.Object ref = sheetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sheetName_ = s;
      return s;
    }
  }
  /**
   * <code>string sheet_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSheetNameBytes() {
    java.lang.Object ref = sheetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sheetName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object tableName_;
  /**
   * <code>string table_name = 2;</code>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <code>string table_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMS_FIELD_NUMBER = 3;
  private java.util.List<com.ctrip.ferriswheel.proto.v1.NamedValue> params_;
  /**
   * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
   */
  public java.util.List<com.ctrip.ferriswheel.proto.v1.NamedValue> getParamsList() {
    return params_;
  }
  /**
   * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
   */
  public java.util.List<? extends com.ctrip.ferriswheel.proto.v1.NamedValueOrBuilder> 
      getParamsOrBuilderList() {
    return params_;
  }
  /**
   * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
   */
  public int getParamsCount() {
    return params_.size();
  }
  /**
   * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.NamedValue getParams(int index) {
    return params_.get(index);
  }
  /**
   * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.NamedValueOrBuilder getParamsOrBuilder(
      int index) {
    return params_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSheetNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sheetName_);
    }
    if (!getTableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tableName_);
    }
    for (int i = 0; i < params_.size(); i++) {
      output.writeMessage(3, params_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSheetNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sheetName_);
    }
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tableName_);
    }
    for (int i = 0; i < params_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, params_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.ExecuteQuery)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.ExecuteQuery other = (com.ctrip.ferriswheel.proto.v1.ExecuteQuery) obj;

    boolean result = true;
    result = result && getSheetName()
        .equals(other.getSheetName());
    result = result && getTableName()
        .equals(other.getTableName());
    result = result && getParamsList()
        .equals(other.getParamsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SHEET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSheetName().hashCode();
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    if (getParamsCount() > 0) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParamsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.ExecuteQuery prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ferriswheel.v1.ExecuteQuery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.ExecuteQuery)
      com.ctrip.ferriswheel.proto.v1.ExecuteQueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ExecuteQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ExecuteQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.ExecuteQuery.class, com.ctrip.ferriswheel.proto.v1.ExecuteQuery.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.ExecuteQuery.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getParamsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sheetName_ = "";

      tableName_ = "";

      if (paramsBuilder_ == null) {
        params_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        paramsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ExecuteQuery_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ExecuteQuery getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.ExecuteQuery.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ExecuteQuery build() {
      com.ctrip.ferriswheel.proto.v1.ExecuteQuery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ExecuteQuery buildPartial() {
      com.ctrip.ferriswheel.proto.v1.ExecuteQuery result = new com.ctrip.ferriswheel.proto.v1.ExecuteQuery(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.sheetName_ = sheetName_;
      result.tableName_ = tableName_;
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          params_ = java.util.Collections.unmodifiableList(params_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.params_ = params_;
      } else {
        result.params_ = paramsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ctrip.ferriswheel.proto.v1.ExecuteQuery) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.ExecuteQuery)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.ExecuteQuery other) {
      if (other == com.ctrip.ferriswheel.proto.v1.ExecuteQuery.getDefaultInstance()) return this;
      if (!other.getSheetName().isEmpty()) {
        sheetName_ = other.sheetName_;
        onChanged();
      }
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (paramsBuilder_ == null) {
        if (!other.params_.isEmpty()) {
          if (params_.isEmpty()) {
            params_ = other.params_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureParamsIsMutable();
            params_.addAll(other.params_);
          }
          onChanged();
        }
      } else {
        if (!other.params_.isEmpty()) {
          if (paramsBuilder_.isEmpty()) {
            paramsBuilder_.dispose();
            paramsBuilder_ = null;
            params_ = other.params_;
            bitField0_ = (bitField0_ & ~0x00000004);
            paramsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParamsFieldBuilder() : null;
          } else {
            paramsBuilder_.addAllMessages(other.params_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ctrip.ferriswheel.proto.v1.ExecuteQuery parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.ExecuteQuery) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object sheetName_ = "";
    /**
     * <code>string sheet_name = 1;</code>
     */
    public java.lang.String getSheetName() {
      java.lang.Object ref = sheetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sheetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sheet_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSheetNameBytes() {
      java.lang.Object ref = sheetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sheetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sheet_name = 1;</code>
     */
    public Builder setSheetName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sheetName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sheet_name = 1;</code>
     */
    public Builder clearSheetName() {
      
      sheetName_ = getDefaultInstance().getSheetName();
      onChanged();
      return this;
    }
    /**
     * <code>string sheet_name = 1;</code>
     */
    public Builder setSheetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sheetName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tableName_ = "";
    /**
     * <code>string table_name = 2;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string table_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string table_name = 2;</code>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string table_name = 2;</code>
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>string table_name = 2;</code>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tableName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.ferriswheel.proto.v1.NamedValue> params_ =
      java.util.Collections.emptyList();
    private void ensureParamsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        params_ = new java.util.ArrayList<com.ctrip.ferriswheel.proto.v1.NamedValue>(params_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.NamedValue, com.ctrip.ferriswheel.proto.v1.NamedValue.Builder, com.ctrip.ferriswheel.proto.v1.NamedValueOrBuilder> paramsBuilder_;

    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public java.util.List<com.ctrip.ferriswheel.proto.v1.NamedValue> getParamsList() {
      if (paramsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(params_);
      } else {
        return paramsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public int getParamsCount() {
      if (paramsBuilder_ == null) {
        return params_.size();
      } else {
        return paramsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.NamedValue getParams(int index) {
      if (paramsBuilder_ == null) {
        return params_.get(index);
      } else {
        return paramsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder setParams(
        int index, com.ctrip.ferriswheel.proto.v1.NamedValue value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.set(index, value);
        onChanged();
      } else {
        paramsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder setParams(
        int index, com.ctrip.ferriswheel.proto.v1.NamedValue.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.set(index, builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder addParams(com.ctrip.ferriswheel.proto.v1.NamedValue value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.add(value);
        onChanged();
      } else {
        paramsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder addParams(
        int index, com.ctrip.ferriswheel.proto.v1.NamedValue value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamsIsMutable();
        params_.add(index, value);
        onChanged();
      } else {
        paramsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder addParams(
        com.ctrip.ferriswheel.proto.v1.NamedValue.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.add(builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder addParams(
        int index, com.ctrip.ferriswheel.proto.v1.NamedValue.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.add(index, builderForValue.build());
        onChanged();
      } else {
        paramsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder addAllParams(
        java.lang.Iterable<? extends com.ctrip.ferriswheel.proto.v1.NamedValue> values) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, params_);
        onChanged();
      } else {
        paramsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder clearParams() {
      if (paramsBuilder_ == null) {
        params_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        paramsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public Builder removeParams(int index) {
      if (paramsBuilder_ == null) {
        ensureParamsIsMutable();
        params_.remove(index);
        onChanged();
      } else {
        paramsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.NamedValue.Builder getParamsBuilder(
        int index) {
      return getParamsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.NamedValueOrBuilder getParamsOrBuilder(
        int index) {
      if (paramsBuilder_ == null) {
        return params_.get(index);  } else {
        return paramsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public java.util.List<? extends com.ctrip.ferriswheel.proto.v1.NamedValueOrBuilder> 
         getParamsOrBuilderList() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(params_);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.NamedValue.Builder addParamsBuilder() {
      return getParamsFieldBuilder().addBuilder(
          com.ctrip.ferriswheel.proto.v1.NamedValue.getDefaultInstance());
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.NamedValue.Builder addParamsBuilder(
        int index) {
      return getParamsFieldBuilder().addBuilder(
          index, com.ctrip.ferriswheel.proto.v1.NamedValue.getDefaultInstance());
    }
    /**
     * <code>repeated .ferriswheel.v1.NamedValue params = 3;</code>
     */
    public java.util.List<com.ctrip.ferriswheel.proto.v1.NamedValue.Builder> 
         getParamsBuilderList() {
      return getParamsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.NamedValue, com.ctrip.ferriswheel.proto.v1.NamedValue.Builder, com.ctrip.ferriswheel.proto.v1.NamedValueOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.ferriswheel.proto.v1.NamedValue, com.ctrip.ferriswheel.proto.v1.NamedValue.Builder, com.ctrip.ferriswheel.proto.v1.NamedValueOrBuilder>(
                params_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.ExecuteQuery)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.ExecuteQuery)
  private static final com.ctrip.ferriswheel.proto.v1.ExecuteQuery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.ExecuteQuery();
  }

  public static com.ctrip.ferriswheel.proto.v1.ExecuteQuery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecuteQuery>
      PARSER = new com.google.protobuf.AbstractParser<ExecuteQuery>() {
    @java.lang.Override
    public ExecuteQuery parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExecuteQuery(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExecuteQuery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecuteQuery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.ExecuteQuery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


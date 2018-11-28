// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.TransferAsset}
 */
public  final class TransferAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.TransferAsset)
    TransferAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferAsset.newBuilder() to construct.
  private TransferAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferAsset() {
    fromSheetName_ = "";
    fromAssetName_ = "";
    toSheetName_ = "";
    toAssetName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransferAsset(
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

            fromSheetName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fromAssetName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            toSheetName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            toAssetName_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_TransferAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_TransferAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.TransferAsset.class, com.ctrip.ferriswheel.proto.v1.TransferAsset.Builder.class);
  }

  public static final int FROM_SHEET_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object fromSheetName_;
  /**
   * <code>string from_sheet_name = 1;</code>
   */
  public java.lang.String getFromSheetName() {
    java.lang.Object ref = fromSheetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromSheetName_ = s;
      return s;
    }
  }
  /**
   * <code>string from_sheet_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFromSheetNameBytes() {
    java.lang.Object ref = fromSheetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromSheetName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_ASSET_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object fromAssetName_;
  /**
   * <code>string from_asset_name = 2;</code>
   */
  public java.lang.String getFromAssetName() {
    java.lang.Object ref = fromAssetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromAssetName_ = s;
      return s;
    }
  }
  /**
   * <code>string from_asset_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFromAssetNameBytes() {
    java.lang.Object ref = fromAssetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromAssetName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_SHEET_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object toSheetName_;
  /**
   * <code>string to_sheet_name = 3;</code>
   */
  public java.lang.String getToSheetName() {
    java.lang.Object ref = toSheetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toSheetName_ = s;
      return s;
    }
  }
  /**
   * <code>string to_sheet_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getToSheetNameBytes() {
    java.lang.Object ref = toSheetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toSheetName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_ASSET_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object toAssetName_;
  /**
   * <code>string to_asset_name = 4;</code>
   */
  public java.lang.String getToAssetName() {
    java.lang.Object ref = toAssetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toAssetName_ = s;
      return s;
    }
  }
  /**
   * <code>string to_asset_name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getToAssetNameBytes() {
    java.lang.Object ref = toAssetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toAssetName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getFromSheetNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fromSheetName_);
    }
    if (!getFromAssetNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fromAssetName_);
    }
    if (!getToSheetNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, toSheetName_);
    }
    if (!getToAssetNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, toAssetName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFromSheetNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fromSheetName_);
    }
    if (!getFromAssetNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fromAssetName_);
    }
    if (!getToSheetNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, toSheetName_);
    }
    if (!getToAssetNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, toAssetName_);
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.TransferAsset)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.TransferAsset other = (com.ctrip.ferriswheel.proto.v1.TransferAsset) obj;

    boolean result = true;
    result = result && getFromSheetName()
        .equals(other.getFromSheetName());
    result = result && getFromAssetName()
        .equals(other.getFromAssetName());
    result = result && getToSheetName()
        .equals(other.getToSheetName());
    result = result && getToAssetName()
        .equals(other.getToAssetName());
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
    hash = (37 * hash) + FROM_SHEET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFromSheetName().hashCode();
    hash = (37 * hash) + FROM_ASSET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFromAssetName().hashCode();
    hash = (37 * hash) + TO_SHEET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getToSheetName().hashCode();
    hash = (37 * hash) + TO_ASSET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getToAssetName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.TransferAsset parseFrom(
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
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.TransferAsset prototype) {
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
   * Protobuf type {@code ferriswheel.v1.TransferAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.TransferAsset)
      com.ctrip.ferriswheel.proto.v1.TransferAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_TransferAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_TransferAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.TransferAsset.class, com.ctrip.ferriswheel.proto.v1.TransferAsset.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.TransferAsset.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fromSheetName_ = "";

      fromAssetName_ = "";

      toSheetName_ = "";

      toAssetName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_TransferAsset_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.TransferAsset getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.TransferAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.TransferAsset build() {
      com.ctrip.ferriswheel.proto.v1.TransferAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.TransferAsset buildPartial() {
      com.ctrip.ferriswheel.proto.v1.TransferAsset result = new com.ctrip.ferriswheel.proto.v1.TransferAsset(this);
      result.fromSheetName_ = fromSheetName_;
      result.fromAssetName_ = fromAssetName_;
      result.toSheetName_ = toSheetName_;
      result.toAssetName_ = toAssetName_;
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
      if (other instanceof com.ctrip.ferriswheel.proto.v1.TransferAsset) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.TransferAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.TransferAsset other) {
      if (other == com.ctrip.ferriswheel.proto.v1.TransferAsset.getDefaultInstance()) return this;
      if (!other.getFromSheetName().isEmpty()) {
        fromSheetName_ = other.fromSheetName_;
        onChanged();
      }
      if (!other.getFromAssetName().isEmpty()) {
        fromAssetName_ = other.fromAssetName_;
        onChanged();
      }
      if (!other.getToSheetName().isEmpty()) {
        toSheetName_ = other.toSheetName_;
        onChanged();
      }
      if (!other.getToAssetName().isEmpty()) {
        toAssetName_ = other.toAssetName_;
        onChanged();
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
      com.ctrip.ferriswheel.proto.v1.TransferAsset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.TransferAsset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fromSheetName_ = "";
    /**
     * <code>string from_sheet_name = 1;</code>
     */
    public java.lang.String getFromSheetName() {
      java.lang.Object ref = fromSheetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromSheetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from_sheet_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromSheetNameBytes() {
      java.lang.Object ref = fromSheetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromSheetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from_sheet_name = 1;</code>
     */
    public Builder setFromSheetName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromSheetName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string from_sheet_name = 1;</code>
     */
    public Builder clearFromSheetName() {
      
      fromSheetName_ = getDefaultInstance().getFromSheetName();
      onChanged();
      return this;
    }
    /**
     * <code>string from_sheet_name = 1;</code>
     */
    public Builder setFromSheetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromSheetName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fromAssetName_ = "";
    /**
     * <code>string from_asset_name = 2;</code>
     */
    public java.lang.String getFromAssetName() {
      java.lang.Object ref = fromAssetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromAssetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from_asset_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFromAssetNameBytes() {
      java.lang.Object ref = fromAssetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromAssetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from_asset_name = 2;</code>
     */
    public Builder setFromAssetName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromAssetName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string from_asset_name = 2;</code>
     */
    public Builder clearFromAssetName() {
      
      fromAssetName_ = getDefaultInstance().getFromAssetName();
      onChanged();
      return this;
    }
    /**
     * <code>string from_asset_name = 2;</code>
     */
    public Builder setFromAssetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromAssetName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object toSheetName_ = "";
    /**
     * <code>string to_sheet_name = 3;</code>
     */
    public java.lang.String getToSheetName() {
      java.lang.Object ref = toSheetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toSheetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_sheet_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getToSheetNameBytes() {
      java.lang.Object ref = toSheetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toSheetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_sheet_name = 3;</code>
     */
    public Builder setToSheetName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toSheetName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string to_sheet_name = 3;</code>
     */
    public Builder clearToSheetName() {
      
      toSheetName_ = getDefaultInstance().getToSheetName();
      onChanged();
      return this;
    }
    /**
     * <code>string to_sheet_name = 3;</code>
     */
    public Builder setToSheetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toSheetName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object toAssetName_ = "";
    /**
     * <code>string to_asset_name = 4;</code>
     */
    public java.lang.String getToAssetName() {
      java.lang.Object ref = toAssetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toAssetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_asset_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getToAssetNameBytes() {
      java.lang.Object ref = toAssetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toAssetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_asset_name = 4;</code>
     */
    public Builder setToAssetName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toAssetName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string to_asset_name = 4;</code>
     */
    public Builder clearToAssetName() {
      
      toAssetName_ = getDefaultInstance().getToAssetName();
      onChanged();
      return this;
    }
    /**
     * <code>string to_asset_name = 4;</code>
     */
    public Builder setToAssetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toAssetName_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.TransferAsset)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.TransferAsset)
  private static final com.ctrip.ferriswheel.proto.v1.TransferAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.TransferAsset();
  }

  public static com.ctrip.ferriswheel.proto.v1.TransferAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferAsset>
      PARSER = new com.google.protobuf.AbstractParser<TransferAsset>() {
    @java.lang.Override
    public TransferAsset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransferAsset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransferAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.TransferAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.PivotFilter}
 */
public  final class PivotFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.PivotFilter)
    PivotFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PivotFilter.newBuilder() to construct.
  private PivotFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PivotFilter() {
    field_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PivotFilter(
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

            field_ = s;
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
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_PivotFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_PivotFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.PivotFilter.class, com.ctrip.ferriswheel.proto.v1.PivotFilter.Builder.class);
  }

  public static final int FIELD_FIELD_NUMBER = 1;
  private volatile java.lang.Object field_;
  /**
   * <code>string field = 1;</code>
   */
  public java.lang.String getField() {
    java.lang.Object ref = field_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      field_ = s;
      return s;
    }
  }
  /**
   * <code>string field = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFieldBytes() {
    java.lang.Object ref = field_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      field_ = b;
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
    if (!getFieldBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, field_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFieldBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, field_);
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.PivotFilter)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.PivotFilter other = (com.ctrip.ferriswheel.proto.v1.PivotFilter) obj;

    boolean result = true;
    result = result && getField()
        .equals(other.getField());
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
    hash = (37 * hash) + FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getField().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.PivotFilter parseFrom(
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
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.PivotFilter prototype) {
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
   * Protobuf type {@code ferriswheel.v1.PivotFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.PivotFilter)
      com.ctrip.ferriswheel.proto.v1.PivotFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_PivotFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_PivotFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.PivotFilter.class, com.ctrip.ferriswheel.proto.v1.PivotFilter.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.PivotFilter.newBuilder()
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
      field_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_PivotFilter_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.PivotFilter getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.PivotFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.PivotFilter build() {
      com.ctrip.ferriswheel.proto.v1.PivotFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.PivotFilter buildPartial() {
      com.ctrip.ferriswheel.proto.v1.PivotFilter result = new com.ctrip.ferriswheel.proto.v1.PivotFilter(this);
      result.field_ = field_;
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
      if (other instanceof com.ctrip.ferriswheel.proto.v1.PivotFilter) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.PivotFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.PivotFilter other) {
      if (other == com.ctrip.ferriswheel.proto.v1.PivotFilter.getDefaultInstance()) return this;
      if (!other.getField().isEmpty()) {
        field_ = other.field_;
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
      com.ctrip.ferriswheel.proto.v1.PivotFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.PivotFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object field_ = "";
    /**
     * <code>string field = 1;</code>
     */
    public java.lang.String getField() {
      java.lang.Object ref = field_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        field_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string field = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFieldBytes() {
      java.lang.Object ref = field_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        field_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string field = 1;</code>
     */
    public Builder setField(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      field_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string field = 1;</code>
     */
    public Builder clearField() {
      
      field_ = getDefaultInstance().getField();
      onChanged();
      return this;
    }
    /**
     * <code>string field = 1;</code>
     */
    public Builder setFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      field_ = value;
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


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.PivotFilter)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.PivotFilter)
  private static final com.ctrip.ferriswheel.proto.v1.PivotFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.PivotFilter();
  }

  public static com.ctrip.ferriswheel.proto.v1.PivotFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PivotFilter>
      PARSER = new com.google.protobuf.AbstractParser<PivotFilter>() {
    @java.lang.Override
    public PivotFilter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PivotFilter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PivotFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PivotFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.PivotFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


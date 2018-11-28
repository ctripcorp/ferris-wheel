// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.ParamRule}
 */
public  final class ParamRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.ParamRule)
    ParamRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParamRule.newBuilder() to construct.
  private ParamRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParamRule() {
    name_ = "";
    type_ = 0;
    nullable_ = false;
    allowedValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ParamRule(
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

            name_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 24: {

            nullable_ = input.readBool();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              allowedValues_ = new java.util.ArrayList<com.ctrip.ferriswheel.proto.v1.UnionValue>();
              mutable_bitField0_ |= 0x00000008;
            }
            allowedValues_.add(
                input.readMessage(com.ctrip.ferriswheel.proto.v1.UnionValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        allowedValues_ = java.util.Collections.unmodifiableList(allowedValues_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_ParamRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_ParamRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.ParamRule.class, com.ctrip.ferriswheel.proto.v1.ParamRule.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>.ferriswheel.v1.VariantType type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.ferriswheel.v1.VariantType type = 2;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.VariantType getType() {
    @SuppressWarnings("deprecation")
    com.ctrip.ferriswheel.proto.v1.VariantType result = com.ctrip.ferriswheel.proto.v1.VariantType.valueOf(type_);
    return result == null ? com.ctrip.ferriswheel.proto.v1.VariantType.UNRECOGNIZED : result;
  }

  public static final int NULLABLE_FIELD_NUMBER = 3;
  private boolean nullable_;
  /**
   * <code>bool nullable = 3;</code>
   */
  public boolean getNullable() {
    return nullable_;
  }

  public static final int ALLOWED_VALUES_FIELD_NUMBER = 4;
  private java.util.List<com.ctrip.ferriswheel.proto.v1.UnionValue> allowedValues_;
  /**
   * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
   */
  public java.util.List<com.ctrip.ferriswheel.proto.v1.UnionValue> getAllowedValuesList() {
    return allowedValues_;
  }
  /**
   * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
   */
  public java.util.List<? extends com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder> 
      getAllowedValuesOrBuilderList() {
    return allowedValues_;
  }
  /**
   * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
   */
  public int getAllowedValuesCount() {
    return allowedValues_.size();
  }
  /**
   * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.UnionValue getAllowedValues(int index) {
    return allowedValues_.get(index);
  }
  /**
   * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder getAllowedValuesOrBuilder(
      int index) {
    return allowedValues_.get(index);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (type_ != com.ctrip.ferriswheel.proto.v1.VariantType.VT_UNSET.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (nullable_ != false) {
      output.writeBool(3, nullable_);
    }
    for (int i = 0; i < allowedValues_.size(); i++) {
      output.writeMessage(4, allowedValues_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (type_ != com.ctrip.ferriswheel.proto.v1.VariantType.VT_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (nullable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, nullable_);
    }
    for (int i = 0; i < allowedValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, allowedValues_.get(i));
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.ParamRule)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.ParamRule other = (com.ctrip.ferriswheel.proto.v1.ParamRule) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && type_ == other.type_;
    result = result && (getNullable()
        == other.getNullable());
    result = result && getAllowedValuesList()
        .equals(other.getAllowedValuesList());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + NULLABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNullable());
    if (getAllowedValuesCount() > 0) {
      hash = (37 * hash) + ALLOWED_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ParamRule parseFrom(
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
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.ParamRule prototype) {
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
   * Protobuf type {@code ferriswheel.v1.ParamRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.ParamRule)
      com.ctrip.ferriswheel.proto.v1.ParamRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_ParamRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_ParamRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.ParamRule.class, com.ctrip.ferriswheel.proto.v1.ParamRule.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.ParamRule.newBuilder()
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
        getAllowedValuesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      type_ = 0;

      nullable_ = false;

      if (allowedValuesBuilder_ == null) {
        allowedValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        allowedValuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_ParamRule_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ParamRule getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.ParamRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ParamRule build() {
      com.ctrip.ferriswheel.proto.v1.ParamRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ParamRule buildPartial() {
      com.ctrip.ferriswheel.proto.v1.ParamRule result = new com.ctrip.ferriswheel.proto.v1.ParamRule(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.type_ = type_;
      result.nullable_ = nullable_;
      if (allowedValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          allowedValues_ = java.util.Collections.unmodifiableList(allowedValues_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.allowedValues_ = allowedValues_;
      } else {
        result.allowedValues_ = allowedValuesBuilder_.build();
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
      if (other instanceof com.ctrip.ferriswheel.proto.v1.ParamRule) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.ParamRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.ParamRule other) {
      if (other == com.ctrip.ferriswheel.proto.v1.ParamRule.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getNullable() != false) {
        setNullable(other.getNullable());
      }
      if (allowedValuesBuilder_ == null) {
        if (!other.allowedValues_.isEmpty()) {
          if (allowedValues_.isEmpty()) {
            allowedValues_ = other.allowedValues_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureAllowedValuesIsMutable();
            allowedValues_.addAll(other.allowedValues_);
          }
          onChanged();
        }
      } else {
        if (!other.allowedValues_.isEmpty()) {
          if (allowedValuesBuilder_.isEmpty()) {
            allowedValuesBuilder_.dispose();
            allowedValuesBuilder_ = null;
            allowedValues_ = other.allowedValues_;
            bitField0_ = (bitField0_ & ~0x00000008);
            allowedValuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAllowedValuesFieldBuilder() : null;
          } else {
            allowedValuesBuilder_.addAllMessages(other.allowedValues_);
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
      com.ctrip.ferriswheel.proto.v1.ParamRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.ParamRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.ferriswheel.v1.VariantType type = 2;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.ferriswheel.v1.VariantType type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ferriswheel.v1.VariantType type = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.VariantType getType() {
      @SuppressWarnings("deprecation")
      com.ctrip.ferriswheel.proto.v1.VariantType result = com.ctrip.ferriswheel.proto.v1.VariantType.valueOf(type_);
      return result == null ? com.ctrip.ferriswheel.proto.v1.VariantType.UNRECOGNIZED : result;
    }
    /**
     * <code>.ferriswheel.v1.VariantType type = 2;</code>
     */
    public Builder setType(com.ctrip.ferriswheel.proto.v1.VariantType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ferriswheel.v1.VariantType type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean nullable_ ;
    /**
     * <code>bool nullable = 3;</code>
     */
    public boolean getNullable() {
      return nullable_;
    }
    /**
     * <code>bool nullable = 3;</code>
     */
    public Builder setNullable(boolean value) {
      
      nullable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool nullable = 3;</code>
     */
    public Builder clearNullable() {
      
      nullable_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.ctrip.ferriswheel.proto.v1.UnionValue> allowedValues_ =
      java.util.Collections.emptyList();
    private void ensureAllowedValuesIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        allowedValues_ = new java.util.ArrayList<com.ctrip.ferriswheel.proto.v1.UnionValue>(allowedValues_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.UnionValue, com.ctrip.ferriswheel.proto.v1.UnionValue.Builder, com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder> allowedValuesBuilder_;

    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public java.util.List<com.ctrip.ferriswheel.proto.v1.UnionValue> getAllowedValuesList() {
      if (allowedValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(allowedValues_);
      } else {
        return allowedValuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public int getAllowedValuesCount() {
      if (allowedValuesBuilder_ == null) {
        return allowedValues_.size();
      } else {
        return allowedValuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.UnionValue getAllowedValues(int index) {
      if (allowedValuesBuilder_ == null) {
        return allowedValues_.get(index);
      } else {
        return allowedValuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder setAllowedValues(
        int index, com.ctrip.ferriswheel.proto.v1.UnionValue value) {
      if (allowedValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedValuesIsMutable();
        allowedValues_.set(index, value);
        onChanged();
      } else {
        allowedValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder setAllowedValues(
        int index, com.ctrip.ferriswheel.proto.v1.UnionValue.Builder builderForValue) {
      if (allowedValuesBuilder_ == null) {
        ensureAllowedValuesIsMutable();
        allowedValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        allowedValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder addAllowedValues(com.ctrip.ferriswheel.proto.v1.UnionValue value) {
      if (allowedValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedValuesIsMutable();
        allowedValues_.add(value);
        onChanged();
      } else {
        allowedValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder addAllowedValues(
        int index, com.ctrip.ferriswheel.proto.v1.UnionValue value) {
      if (allowedValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedValuesIsMutable();
        allowedValues_.add(index, value);
        onChanged();
      } else {
        allowedValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder addAllowedValues(
        com.ctrip.ferriswheel.proto.v1.UnionValue.Builder builderForValue) {
      if (allowedValuesBuilder_ == null) {
        ensureAllowedValuesIsMutable();
        allowedValues_.add(builderForValue.build());
        onChanged();
      } else {
        allowedValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder addAllowedValues(
        int index, com.ctrip.ferriswheel.proto.v1.UnionValue.Builder builderForValue) {
      if (allowedValuesBuilder_ == null) {
        ensureAllowedValuesIsMutable();
        allowedValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        allowedValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder addAllAllowedValues(
        java.lang.Iterable<? extends com.ctrip.ferriswheel.proto.v1.UnionValue> values) {
      if (allowedValuesBuilder_ == null) {
        ensureAllowedValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allowedValues_);
        onChanged();
      } else {
        allowedValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder clearAllowedValues() {
      if (allowedValuesBuilder_ == null) {
        allowedValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        allowedValuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public Builder removeAllowedValues(int index) {
      if (allowedValuesBuilder_ == null) {
        ensureAllowedValuesIsMutable();
        allowedValues_.remove(index);
        onChanged();
      } else {
        allowedValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.UnionValue.Builder getAllowedValuesBuilder(
        int index) {
      return getAllowedValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder getAllowedValuesOrBuilder(
        int index) {
      if (allowedValuesBuilder_ == null) {
        return allowedValues_.get(index);  } else {
        return allowedValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public java.util.List<? extends com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder> 
         getAllowedValuesOrBuilderList() {
      if (allowedValuesBuilder_ != null) {
        return allowedValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(allowedValues_);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.UnionValue.Builder addAllowedValuesBuilder() {
      return getAllowedValuesFieldBuilder().addBuilder(
          com.ctrip.ferriswheel.proto.v1.UnionValue.getDefaultInstance());
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.UnionValue.Builder addAllowedValuesBuilder(
        int index) {
      return getAllowedValuesFieldBuilder().addBuilder(
          index, com.ctrip.ferriswheel.proto.v1.UnionValue.getDefaultInstance());
    }
    /**
     * <code>repeated .ferriswheel.v1.UnionValue allowed_values = 4;</code>
     */
    public java.util.List<com.ctrip.ferriswheel.proto.v1.UnionValue.Builder> 
         getAllowedValuesBuilderList() {
      return getAllowedValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.UnionValue, com.ctrip.ferriswheel.proto.v1.UnionValue.Builder, com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder> 
        getAllowedValuesFieldBuilder() {
      if (allowedValuesBuilder_ == null) {
        allowedValuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.ferriswheel.proto.v1.UnionValue, com.ctrip.ferriswheel.proto.v1.UnionValue.Builder, com.ctrip.ferriswheel.proto.v1.UnionValueOrBuilder>(
                allowedValues_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        allowedValues_ = null;
      }
      return allowedValuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.ParamRule)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.ParamRule)
  private static final com.ctrip.ferriswheel.proto.v1.ParamRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.ParamRule();
  }

  public static com.ctrip.ferriswheel.proto.v1.ParamRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParamRule>
      PARSER = new com.google.protobuf.AbstractParser<ParamRule>() {
    @java.lang.Override
    public ParamRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ParamRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ParamRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParamRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.ParamRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


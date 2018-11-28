// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.AutomateTable}
 */
public  final class AutomateTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.AutomateTable)
    AutomateTableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutomateTable.newBuilder() to construct.
  private AutomateTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutomateTable() {
    sheetName_ = "";
    tableName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AutomateTable(
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
            com.ctrip.ferriswheel.proto.v1.TableAutomaton.Builder subBuilder = null;
            if (automaton_ != null) {
              subBuilder = automaton_.toBuilder();
            }
            automaton_ = input.readMessage(com.ctrip.ferriswheel.proto.v1.TableAutomaton.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(automaton_);
              automaton_ = subBuilder.buildPartial();
            }

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
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AutomateTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AutomateTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.AutomateTable.class, com.ctrip.ferriswheel.proto.v1.AutomateTable.Builder.class);
  }

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

  public static final int AUTOMATON_FIELD_NUMBER = 3;
  private com.ctrip.ferriswheel.proto.v1.TableAutomaton automaton_;
  /**
   * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
   */
  public boolean hasAutomaton() {
    return automaton_ != null;
  }
  /**
   * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.TableAutomaton getAutomaton() {
    return automaton_ == null ? com.ctrip.ferriswheel.proto.v1.TableAutomaton.getDefaultInstance() : automaton_;
  }
  /**
   * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.TableAutomatonOrBuilder getAutomatonOrBuilder() {
    return getAutomaton();
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
    if (automaton_ != null) {
      output.writeMessage(3, getAutomaton());
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
    if (automaton_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAutomaton());
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.AutomateTable)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.AutomateTable other = (com.ctrip.ferriswheel.proto.v1.AutomateTable) obj;

    boolean result = true;
    result = result && getSheetName()
        .equals(other.getSheetName());
    result = result && getTableName()
        .equals(other.getTableName());
    result = result && (hasAutomaton() == other.hasAutomaton());
    if (hasAutomaton()) {
      result = result && getAutomaton()
          .equals(other.getAutomaton());
    }
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
    if (hasAutomaton()) {
      hash = (37 * hash) + AUTOMATON_FIELD_NUMBER;
      hash = (53 * hash) + getAutomaton().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.AutomateTable parseFrom(
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
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.AutomateTable prototype) {
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
   * Protobuf type {@code ferriswheel.v1.AutomateTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.AutomateTable)
      com.ctrip.ferriswheel.proto.v1.AutomateTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AutomateTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AutomateTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.AutomateTable.class, com.ctrip.ferriswheel.proto.v1.AutomateTable.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.AutomateTable.newBuilder()
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
      sheetName_ = "";

      tableName_ = "";

      if (automatonBuilder_ == null) {
        automaton_ = null;
      } else {
        automaton_ = null;
        automatonBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AutomateTable_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.AutomateTable getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.AutomateTable.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.AutomateTable build() {
      com.ctrip.ferriswheel.proto.v1.AutomateTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.AutomateTable buildPartial() {
      com.ctrip.ferriswheel.proto.v1.AutomateTable result = new com.ctrip.ferriswheel.proto.v1.AutomateTable(this);
      result.sheetName_ = sheetName_;
      result.tableName_ = tableName_;
      if (automatonBuilder_ == null) {
        result.automaton_ = automaton_;
      } else {
        result.automaton_ = automatonBuilder_.build();
      }
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
      if (other instanceof com.ctrip.ferriswheel.proto.v1.AutomateTable) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.AutomateTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.AutomateTable other) {
      if (other == com.ctrip.ferriswheel.proto.v1.AutomateTable.getDefaultInstance()) return this;
      if (!other.getSheetName().isEmpty()) {
        sheetName_ = other.sheetName_;
        onChanged();
      }
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (other.hasAutomaton()) {
        mergeAutomaton(other.getAutomaton());
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
      com.ctrip.ferriswheel.proto.v1.AutomateTable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.AutomateTable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private com.ctrip.ferriswheel.proto.v1.TableAutomaton automaton_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.TableAutomaton, com.ctrip.ferriswheel.proto.v1.TableAutomaton.Builder, com.ctrip.ferriswheel.proto.v1.TableAutomatonOrBuilder> automatonBuilder_;
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    public boolean hasAutomaton() {
      return automatonBuilder_ != null || automaton_ != null;
    }
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.TableAutomaton getAutomaton() {
      if (automatonBuilder_ == null) {
        return automaton_ == null ? com.ctrip.ferriswheel.proto.v1.TableAutomaton.getDefaultInstance() : automaton_;
      } else {
        return automatonBuilder_.getMessage();
      }
    }
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    public Builder setAutomaton(com.ctrip.ferriswheel.proto.v1.TableAutomaton value) {
      if (automatonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        automaton_ = value;
        onChanged();
      } else {
        automatonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    public Builder setAutomaton(
        com.ctrip.ferriswheel.proto.v1.TableAutomaton.Builder builderForValue) {
      if (automatonBuilder_ == null) {
        automaton_ = builderForValue.build();
        onChanged();
      } else {
        automatonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    public Builder mergeAutomaton(com.ctrip.ferriswheel.proto.v1.TableAutomaton value) {
      if (automatonBuilder_ == null) {
        if (automaton_ != null) {
          automaton_ =
            com.ctrip.ferriswheel.proto.v1.TableAutomaton.newBuilder(automaton_).mergeFrom(value).buildPartial();
        } else {
          automaton_ = value;
        }
        onChanged();
      } else {
        automatonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    public Builder clearAutomaton() {
      if (automatonBuilder_ == null) {
        automaton_ = null;
        onChanged();
      } else {
        automaton_ = null;
        automatonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.TableAutomaton.Builder getAutomatonBuilder() {
      
      onChanged();
      return getAutomatonFieldBuilder().getBuilder();
    }
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.TableAutomatonOrBuilder getAutomatonOrBuilder() {
      if (automatonBuilder_ != null) {
        return automatonBuilder_.getMessageOrBuilder();
      } else {
        return automaton_ == null ?
            com.ctrip.ferriswheel.proto.v1.TableAutomaton.getDefaultInstance() : automaton_;
      }
    }
    /**
     * <code>.ferriswheel.v1.TableAutomaton automaton = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.TableAutomaton, com.ctrip.ferriswheel.proto.v1.TableAutomaton.Builder, com.ctrip.ferriswheel.proto.v1.TableAutomatonOrBuilder> 
        getAutomatonFieldBuilder() {
      if (automatonBuilder_ == null) {
        automatonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ctrip.ferriswheel.proto.v1.TableAutomaton, com.ctrip.ferriswheel.proto.v1.TableAutomaton.Builder, com.ctrip.ferriswheel.proto.v1.TableAutomatonOrBuilder>(
                getAutomaton(),
                getParentForChildren(),
                isClean());
        automaton_ = null;
      }
      return automatonBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.AutomateTable)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.AutomateTable)
  private static final com.ctrip.ferriswheel.proto.v1.AutomateTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.AutomateTable();
  }

  public static com.ctrip.ferriswheel.proto.v1.AutomateTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutomateTable>
      PARSER = new com.google.protobuf.AbstractParser<AutomateTable>() {
    @java.lang.Override
    public AutomateTable parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AutomateTable(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AutomateTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutomateTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.AutomateTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.ChangeList}
 */
public  final class ChangeList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.ChangeList)
    ChangeListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeList.newBuilder() to construct.
  private ChangeList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeList() {
    actions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeList(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              actions_ = new java.util.ArrayList<com.ctrip.ferriswheel.proto.v1.Action>();
              mutable_bitField0_ |= 0x00000001;
            }
            actions_.add(
                input.readMessage(com.ctrip.ferriswheel.proto.v1.Action.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        actions_ = java.util.Collections.unmodifiableList(actions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ChangeList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ChangeList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.ChangeList.class, com.ctrip.ferriswheel.proto.v1.ChangeList.Builder.class);
  }

  public static final int ACTIONS_FIELD_NUMBER = 1;
  private java.util.List<com.ctrip.ferriswheel.proto.v1.Action> actions_;
  /**
   * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
   */
  public java.util.List<com.ctrip.ferriswheel.proto.v1.Action> getActionsList() {
    return actions_;
  }
  /**
   * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
   */
  public java.util.List<? extends com.ctrip.ferriswheel.proto.v1.ActionOrBuilder> 
      getActionsOrBuilderList() {
    return actions_;
  }
  /**
   * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
   */
  public int getActionsCount() {
    return actions_.size();
  }
  /**
   * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.Action getActions(int index) {
    return actions_.get(index);
  }
  /**
   * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.ActionOrBuilder getActionsOrBuilder(
      int index) {
    return actions_.get(index);
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
    for (int i = 0; i < actions_.size(); i++) {
      output.writeMessage(1, actions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < actions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, actions_.get(i));
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.ChangeList)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.ChangeList other = (com.ctrip.ferriswheel.proto.v1.ChangeList) obj;

    boolean result = true;
    result = result && getActionsList()
        .equals(other.getActionsList());
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
    if (getActionsCount() > 0) {
      hash = (37 * hash) + ACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getActionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.ChangeList parseFrom(
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
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.ChangeList prototype) {
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
   * Protobuf type {@code ferriswheel.v1.ChangeList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.ChangeList)
      com.ctrip.ferriswheel.proto.v1.ChangeListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ChangeList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ChangeList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.ChangeList.class, com.ctrip.ferriswheel.proto.v1.ChangeList.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.ChangeList.newBuilder()
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
        getActionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (actionsBuilder_ == null) {
        actions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        actionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_ChangeList_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ChangeList getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.ChangeList.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ChangeList build() {
      com.ctrip.ferriswheel.proto.v1.ChangeList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.ChangeList buildPartial() {
      com.ctrip.ferriswheel.proto.v1.ChangeList result = new com.ctrip.ferriswheel.proto.v1.ChangeList(this);
      int from_bitField0_ = bitField0_;
      if (actionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          actions_ = java.util.Collections.unmodifiableList(actions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.actions_ = actions_;
      } else {
        result.actions_ = actionsBuilder_.build();
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
      if (other instanceof com.ctrip.ferriswheel.proto.v1.ChangeList) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.ChangeList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.ChangeList other) {
      if (other == com.ctrip.ferriswheel.proto.v1.ChangeList.getDefaultInstance()) return this;
      if (actionsBuilder_ == null) {
        if (!other.actions_.isEmpty()) {
          if (actions_.isEmpty()) {
            actions_ = other.actions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureActionsIsMutable();
            actions_.addAll(other.actions_);
          }
          onChanged();
        }
      } else {
        if (!other.actions_.isEmpty()) {
          if (actionsBuilder_.isEmpty()) {
            actionsBuilder_.dispose();
            actionsBuilder_ = null;
            actions_ = other.actions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            actionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getActionsFieldBuilder() : null;
          } else {
            actionsBuilder_.addAllMessages(other.actions_);
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
      com.ctrip.ferriswheel.proto.v1.ChangeList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.ChangeList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.ctrip.ferriswheel.proto.v1.Action> actions_ =
      java.util.Collections.emptyList();
    private void ensureActionsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        actions_ = new java.util.ArrayList<com.ctrip.ferriswheel.proto.v1.Action>(actions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.Action, com.ctrip.ferriswheel.proto.v1.Action.Builder, com.ctrip.ferriswheel.proto.v1.ActionOrBuilder> actionsBuilder_;

    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public java.util.List<com.ctrip.ferriswheel.proto.v1.Action> getActionsList() {
      if (actionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(actions_);
      } else {
        return actionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public int getActionsCount() {
      if (actionsBuilder_ == null) {
        return actions_.size();
      } else {
        return actionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.Action getActions(int index) {
      if (actionsBuilder_ == null) {
        return actions_.get(index);
      } else {
        return actionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder setActions(
        int index, com.ctrip.ferriswheel.proto.v1.Action value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.set(index, value);
        onChanged();
      } else {
        actionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder setActions(
        int index, com.ctrip.ferriswheel.proto.v1.Action.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.set(index, builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder addActions(com.ctrip.ferriswheel.proto.v1.Action value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.add(value);
        onChanged();
      } else {
        actionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder addActions(
        int index, com.ctrip.ferriswheel.proto.v1.Action value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.add(index, value);
        onChanged();
      } else {
        actionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder addActions(
        com.ctrip.ferriswheel.proto.v1.Action.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.add(builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder addActions(
        int index, com.ctrip.ferriswheel.proto.v1.Action.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.add(index, builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder addAllActions(
        java.lang.Iterable<? extends com.ctrip.ferriswheel.proto.v1.Action> values) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, actions_);
        onChanged();
      } else {
        actionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder clearActions() {
      if (actionsBuilder_ == null) {
        actions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        actionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public Builder removeActions(int index) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.remove(index);
        onChanged();
      } else {
        actionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.Action.Builder getActionsBuilder(
        int index) {
      return getActionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.ActionOrBuilder getActionsOrBuilder(
        int index) {
      if (actionsBuilder_ == null) {
        return actions_.get(index);  } else {
        return actionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public java.util.List<? extends com.ctrip.ferriswheel.proto.v1.ActionOrBuilder> 
         getActionsOrBuilderList() {
      if (actionsBuilder_ != null) {
        return actionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(actions_);
      }
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.Action.Builder addActionsBuilder() {
      return getActionsFieldBuilder().addBuilder(
          com.ctrip.ferriswheel.proto.v1.Action.getDefaultInstance());
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.Action.Builder addActionsBuilder(
        int index) {
      return getActionsFieldBuilder().addBuilder(
          index, com.ctrip.ferriswheel.proto.v1.Action.getDefaultInstance());
    }
    /**
     * <code>repeated .ferriswheel.v1.Action actions = 1;</code>
     */
    public java.util.List<com.ctrip.ferriswheel.proto.v1.Action.Builder> 
         getActionsBuilderList() {
      return getActionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.Action, com.ctrip.ferriswheel.proto.v1.Action.Builder, com.ctrip.ferriswheel.proto.v1.ActionOrBuilder> 
        getActionsFieldBuilder() {
      if (actionsBuilder_ == null) {
        actionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ctrip.ferriswheel.proto.v1.Action, com.ctrip.ferriswheel.proto.v1.Action.Builder, com.ctrip.ferriswheel.proto.v1.ActionOrBuilder>(
                actions_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        actions_ = null;
      }
      return actionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.ChangeList)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.ChangeList)
  private static final com.ctrip.ferriswheel.proto.v1.ChangeList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.ChangeList();
  }

  public static com.ctrip.ferriswheel.proto.v1.ChangeList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeList>
      PARSER = new com.google.protobuf.AbstractParser<ChangeList>() {
    @java.lang.Override
    public ChangeList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.ChangeList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


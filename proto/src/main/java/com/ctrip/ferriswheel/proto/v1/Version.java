// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.Version}
 */
public  final class Version extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.Version)
    VersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Version.newBuilder() to construct.
  private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Version() {
    major_ = 0;
    minor_ = 0;
    build_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Version(
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
          case 8: {

            major_ = input.readUInt32();
            break;
          }
          case 16: {

            minor_ = input.readUInt32();
            break;
          }
          case 24: {

            build_ = input.readUInt32();
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
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Version_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Version_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.Version.class, com.ctrip.ferriswheel.proto.v1.Version.Builder.class);
  }

  public static final int MAJOR_FIELD_NUMBER = 1;
  private int major_;
  /**
   * <code>uint32 major = 1;</code>
   */
  public int getMajor() {
    return major_;
  }

  public static final int MINOR_FIELD_NUMBER = 2;
  private int minor_;
  /**
   * <code>uint32 minor = 2;</code>
   */
  public int getMinor() {
    return minor_;
  }

  public static final int BUILD_FIELD_NUMBER = 3;
  private int build_;
  /**
   * <code>uint32 build = 3;</code>
   */
  public int getBuild() {
    return build_;
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
    if (major_ != 0) {
      output.writeUInt32(1, major_);
    }
    if (minor_ != 0) {
      output.writeUInt32(2, minor_);
    }
    if (build_ != 0) {
      output.writeUInt32(3, build_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (major_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, major_);
    }
    if (minor_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, minor_);
    }
    if (build_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, build_);
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.Version)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.Version other = (com.ctrip.ferriswheel.proto.v1.Version) obj;

    boolean result = true;
    result = result && (getMajor()
        == other.getMajor());
    result = result && (getMinor()
        == other.getMinor());
    result = result && (getBuild()
        == other.getBuild());
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
    hash = (37 * hash) + MAJOR_FIELD_NUMBER;
    hash = (53 * hash) + getMajor();
    hash = (37 * hash) + MINOR_FIELD_NUMBER;
    hash = (53 * hash) + getMinor();
    hash = (37 * hash) + BUILD_FIELD_NUMBER;
    hash = (53 * hash) + getBuild();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.Version parseFrom(
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
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.Version prototype) {
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
   * Protobuf type {@code ferriswheel.v1.Version}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.Version)
      com.ctrip.ferriswheel.proto.v1.VersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Version_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.Version.class, com.ctrip.ferriswheel.proto.v1.Version.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.Version.newBuilder()
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
      major_ = 0;

      minor_ = 0;

      build_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.internal_static_ferriswheel_v1_Version_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.Version getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.Version.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.Version build() {
      com.ctrip.ferriswheel.proto.v1.Version result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.Version buildPartial() {
      com.ctrip.ferriswheel.proto.v1.Version result = new com.ctrip.ferriswheel.proto.v1.Version(this);
      result.major_ = major_;
      result.minor_ = minor_;
      result.build_ = build_;
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
      if (other instanceof com.ctrip.ferriswheel.proto.v1.Version) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.Version)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.Version other) {
      if (other == com.ctrip.ferriswheel.proto.v1.Version.getDefaultInstance()) return this;
      if (other.getMajor() != 0) {
        setMajor(other.getMajor());
      }
      if (other.getMinor() != 0) {
        setMinor(other.getMinor());
      }
      if (other.getBuild() != 0) {
        setBuild(other.getBuild());
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
      com.ctrip.ferriswheel.proto.v1.Version parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.Version) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int major_ ;
    /**
     * <code>uint32 major = 1;</code>
     */
    public int getMajor() {
      return major_;
    }
    /**
     * <code>uint32 major = 1;</code>
     */
    public Builder setMajor(int value) {
      
      major_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 major = 1;</code>
     */
    public Builder clearMajor() {
      
      major_ = 0;
      onChanged();
      return this;
    }

    private int minor_ ;
    /**
     * <code>uint32 minor = 2;</code>
     */
    public int getMinor() {
      return minor_;
    }
    /**
     * <code>uint32 minor = 2;</code>
     */
    public Builder setMinor(int value) {
      
      minor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 minor = 2;</code>
     */
    public Builder clearMinor() {
      
      minor_ = 0;
      onChanged();
      return this;
    }

    private int build_ ;
    /**
     * <code>uint32 build = 3;</code>
     */
    public int getBuild() {
      return build_;
    }
    /**
     * <code>uint32 build = 3;</code>
     */
    public Builder setBuild(int value) {
      
      build_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 build = 3;</code>
     */
    public Builder clearBuild() {
      
      build_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.Version)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.Version)
  private static final com.ctrip.ferriswheel.proto.v1.Version DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.Version();
  }

  public static com.ctrip.ferriswheel.proto.v1.Version getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Version>
      PARSER = new com.google.protobuf.AbstractParser<Version>() {
    @java.lang.Override
    public Version parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Version(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Version> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Version> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.Version getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

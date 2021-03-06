// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/action.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf type {@code ferriswheel.v1.AddChart}
 */
public  final class AddChart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ferriswheel.v1.AddChart)
    AddChartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddChart.newBuilder() to construct.
  private AddChart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddChart() {
    sheetName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddChart(
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
            com.ctrip.ferriswheel.proto.v1.Chart.Builder subBuilder = null;
            if (chart_ != null) {
              subBuilder = chart_.toBuilder();
            }
            chart_ = input.readMessage(com.ctrip.ferriswheel.proto.v1.Chart.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(chart_);
              chart_ = subBuilder.buildPartial();
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
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AddChart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AddChart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ctrip.ferriswheel.proto.v1.AddChart.class, com.ctrip.ferriswheel.proto.v1.AddChart.Builder.class);
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

  public static final int CHART_FIELD_NUMBER = 2;
  private com.ctrip.ferriswheel.proto.v1.Chart chart_;
  /**
   * <code>.ferriswheel.v1.Chart chart = 2;</code>
   */
  public boolean hasChart() {
    return chart_ != null;
  }
  /**
   * <code>.ferriswheel.v1.Chart chart = 2;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.Chart getChart() {
    return chart_ == null ? com.ctrip.ferriswheel.proto.v1.Chart.getDefaultInstance() : chart_;
  }
  /**
   * <code>.ferriswheel.v1.Chart chart = 2;</code>
   */
  public com.ctrip.ferriswheel.proto.v1.ChartOrBuilder getChartOrBuilder() {
    return getChart();
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
    if (chart_ != null) {
      output.writeMessage(2, getChart());
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
    if (chart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChart());
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
    if (!(obj instanceof com.ctrip.ferriswheel.proto.v1.AddChart)) {
      return super.equals(obj);
    }
    com.ctrip.ferriswheel.proto.v1.AddChart other = (com.ctrip.ferriswheel.proto.v1.AddChart) obj;

    boolean result = true;
    result = result && getSheetName()
        .equals(other.getSheetName());
    result = result && (hasChart() == other.hasChart());
    if (hasChart()) {
      result = result && getChart()
          .equals(other.getChart());
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
    if (hasChart()) {
      hash = (37 * hash) + CHART_FIELD_NUMBER;
      hash = (53 * hash) + getChart().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ctrip.ferriswheel.proto.v1.AddChart parseFrom(
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
  public static Builder newBuilder(com.ctrip.ferriswheel.proto.v1.AddChart prototype) {
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
   * Protobuf type {@code ferriswheel.v1.AddChart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ferriswheel.v1.AddChart)
      com.ctrip.ferriswheel.proto.v1.AddChartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AddChart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AddChart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ctrip.ferriswheel.proto.v1.AddChart.class, com.ctrip.ferriswheel.proto.v1.AddChart.Builder.class);
    }

    // Construct using com.ctrip.ferriswheel.proto.v1.AddChart.newBuilder()
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

      if (chartBuilder_ == null) {
        chart_ = null;
      } else {
        chart_ = null;
        chartBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ctrip.ferriswheel.proto.v1.ActionOuterClass.internal_static_ferriswheel_v1_AddChart_descriptor;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.AddChart getDefaultInstanceForType() {
      return com.ctrip.ferriswheel.proto.v1.AddChart.getDefaultInstance();
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.AddChart build() {
      com.ctrip.ferriswheel.proto.v1.AddChart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ctrip.ferriswheel.proto.v1.AddChart buildPartial() {
      com.ctrip.ferriswheel.proto.v1.AddChart result = new com.ctrip.ferriswheel.proto.v1.AddChart(this);
      result.sheetName_ = sheetName_;
      if (chartBuilder_ == null) {
        result.chart_ = chart_;
      } else {
        result.chart_ = chartBuilder_.build();
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
      if (other instanceof com.ctrip.ferriswheel.proto.v1.AddChart) {
        return mergeFrom((com.ctrip.ferriswheel.proto.v1.AddChart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ctrip.ferriswheel.proto.v1.AddChart other) {
      if (other == com.ctrip.ferriswheel.proto.v1.AddChart.getDefaultInstance()) return this;
      if (!other.getSheetName().isEmpty()) {
        sheetName_ = other.sheetName_;
        onChanged();
      }
      if (other.hasChart()) {
        mergeChart(other.getChart());
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
      com.ctrip.ferriswheel.proto.v1.AddChart parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ctrip.ferriswheel.proto.v1.AddChart) e.getUnfinishedMessage();
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

    private com.ctrip.ferriswheel.proto.v1.Chart chart_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.Chart, com.ctrip.ferriswheel.proto.v1.Chart.Builder, com.ctrip.ferriswheel.proto.v1.ChartOrBuilder> chartBuilder_;
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    public boolean hasChart() {
      return chartBuilder_ != null || chart_ != null;
    }
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.Chart getChart() {
      if (chartBuilder_ == null) {
        return chart_ == null ? com.ctrip.ferriswheel.proto.v1.Chart.getDefaultInstance() : chart_;
      } else {
        return chartBuilder_.getMessage();
      }
    }
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    public Builder setChart(com.ctrip.ferriswheel.proto.v1.Chart value) {
      if (chartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chart_ = value;
        onChanged();
      } else {
        chartBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    public Builder setChart(
        com.ctrip.ferriswheel.proto.v1.Chart.Builder builderForValue) {
      if (chartBuilder_ == null) {
        chart_ = builderForValue.build();
        onChanged();
      } else {
        chartBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    public Builder mergeChart(com.ctrip.ferriswheel.proto.v1.Chart value) {
      if (chartBuilder_ == null) {
        if (chart_ != null) {
          chart_ =
            com.ctrip.ferriswheel.proto.v1.Chart.newBuilder(chart_).mergeFrom(value).buildPartial();
        } else {
          chart_ = value;
        }
        onChanged();
      } else {
        chartBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    public Builder clearChart() {
      if (chartBuilder_ == null) {
        chart_ = null;
        onChanged();
      } else {
        chart_ = null;
        chartBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.Chart.Builder getChartBuilder() {
      
      onChanged();
      return getChartFieldBuilder().getBuilder();
    }
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    public com.ctrip.ferriswheel.proto.v1.ChartOrBuilder getChartOrBuilder() {
      if (chartBuilder_ != null) {
        return chartBuilder_.getMessageOrBuilder();
      } else {
        return chart_ == null ?
            com.ctrip.ferriswheel.proto.v1.Chart.getDefaultInstance() : chart_;
      }
    }
    /**
     * <code>.ferriswheel.v1.Chart chart = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ctrip.ferriswheel.proto.v1.Chart, com.ctrip.ferriswheel.proto.v1.Chart.Builder, com.ctrip.ferriswheel.proto.v1.ChartOrBuilder> 
        getChartFieldBuilder() {
      if (chartBuilder_ == null) {
        chartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ctrip.ferriswheel.proto.v1.Chart, com.ctrip.ferriswheel.proto.v1.Chart.Builder, com.ctrip.ferriswheel.proto.v1.ChartOrBuilder>(
                getChart(),
                getParentForChildren(),
                isClean());
        chart_ = null;
      }
      return chartBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ferriswheel.v1.AddChart)
  }

  // @@protoc_insertion_point(class_scope:ferriswheel.v1.AddChart)
  private static final com.ctrip.ferriswheel.proto.v1.AddChart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ctrip.ferriswheel.proto.v1.AddChart();
  }

  public static com.ctrip.ferriswheel.proto.v1.AddChart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddChart>
      PARSER = new com.google.protobuf.AbstractParser<AddChart>() {
    @java.lang.Override
    public AddChart parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddChart(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddChart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddChart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ctrip.ferriswheel.proto.v1.AddChart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


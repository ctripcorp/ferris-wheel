// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/ctrip/ferriswheel/proto/workbook.proto

package com.ctrip.ferriswheel.proto.v1;

/**
 * Protobuf enum {@code ferriswheel.v1.AggregateType}
 */
public enum AggregateType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AT_UNSET = 0;</code>
   */
  AT_UNSET(0),
  /**
   * <code>AT_SUMMARY = 1;</code>
   */
  AT_SUMMARY(1),
  /**
   * <code>AT_COUNT = 2;</code>
   */
  AT_COUNT(2),
  /**
   * <code>AT_AVERAGE = 3;</code>
   */
  AT_AVERAGE(3),
  /**
   * <code>AT_MAXIMUM = 4;</code>
   */
  AT_MAXIMUM(4),
  /**
   * <code>AT_MINIMUM = 5;</code>
   */
  AT_MINIMUM(5),
  /**
   * <code>AT_PRODUCT = 6;</code>
   */
  AT_PRODUCT(6),
  /**
   * <code>AT_DECIMAL_ONLY_COUNT = 7;</code>
   */
  AT_DECIMAL_ONLY_COUNT(7),
  /**
   * <code>AT_STANDARD_DEVIATION = 8;</code>
   */
  AT_STANDARD_DEVIATION(8),
  /**
   * <code>AT_GLOBAL_STANDARD_DEVIATION = 9;</code>
   */
  AT_GLOBAL_STANDARD_DEVIATION(9),
  /**
   * <code>AT_VARIANCE = 10;</code>
   */
  AT_VARIANCE(10),
  /**
   * <code>AT_GLOBAL_VARIANCE = 11;</code>
   */
  AT_GLOBAL_VARIANCE(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AT_UNSET = 0;</code>
   */
  public static final int AT_UNSET_VALUE = 0;
  /**
   * <code>AT_SUMMARY = 1;</code>
   */
  public static final int AT_SUMMARY_VALUE = 1;
  /**
   * <code>AT_COUNT = 2;</code>
   */
  public static final int AT_COUNT_VALUE = 2;
  /**
   * <code>AT_AVERAGE = 3;</code>
   */
  public static final int AT_AVERAGE_VALUE = 3;
  /**
   * <code>AT_MAXIMUM = 4;</code>
   */
  public static final int AT_MAXIMUM_VALUE = 4;
  /**
   * <code>AT_MINIMUM = 5;</code>
   */
  public static final int AT_MINIMUM_VALUE = 5;
  /**
   * <code>AT_PRODUCT = 6;</code>
   */
  public static final int AT_PRODUCT_VALUE = 6;
  /**
   * <code>AT_DECIMAL_ONLY_COUNT = 7;</code>
   */
  public static final int AT_DECIMAL_ONLY_COUNT_VALUE = 7;
  /**
   * <code>AT_STANDARD_DEVIATION = 8;</code>
   */
  public static final int AT_STANDARD_DEVIATION_VALUE = 8;
  /**
   * <code>AT_GLOBAL_STANDARD_DEVIATION = 9;</code>
   */
  public static final int AT_GLOBAL_STANDARD_DEVIATION_VALUE = 9;
  /**
   * <code>AT_VARIANCE = 10;</code>
   */
  public static final int AT_VARIANCE_VALUE = 10;
  /**
   * <code>AT_GLOBAL_VARIANCE = 11;</code>
   */
  public static final int AT_GLOBAL_VARIANCE_VALUE = 11;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AggregateType valueOf(int value) {
    return forNumber(value);
  }

  public static AggregateType forNumber(int value) {
    switch (value) {
      case 0: return AT_UNSET;
      case 1: return AT_SUMMARY;
      case 2: return AT_COUNT;
      case 3: return AT_AVERAGE;
      case 4: return AT_MAXIMUM;
      case 5: return AT_MINIMUM;
      case 6: return AT_PRODUCT;
      case 7: return AT_DECIMAL_ONLY_COUNT;
      case 8: return AT_STANDARD_DEVIATION;
      case 9: return AT_GLOBAL_STANDARD_DEVIATION;
      case 10: return AT_VARIANCE;
      case 11: return AT_GLOBAL_VARIANCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AggregateType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AggregateType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AggregateType>() {
          public AggregateType findValueByNumber(int number) {
            return AggregateType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.ctrip.ferriswheel.proto.v1.WorkbookOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final AggregateType[] VALUES = values();

  public static AggregateType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AggregateType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ferriswheel.v1.AggregateType)
}


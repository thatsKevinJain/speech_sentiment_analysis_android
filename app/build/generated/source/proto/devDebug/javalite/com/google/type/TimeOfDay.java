// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/timeofday.proto

package com.google.type;

/**
 * <pre>
 * Represents a time of day. The date and time zone are either not significant
 * or are specified elsewhere. An API may chose to allow leap seconds. Related
 * types are [google.type.Date][google.type.Date] and [google.protobuf.Timestamp][google.protobuf.Timestamp].
 * </pre>
 *
 * Protobuf type {@code google.type.TimeOfDay}
 */
public  final class TimeOfDay extends
    com.google.protobuf.GeneratedMessageLite<
        TimeOfDay, TimeOfDay.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.TimeOfDay)
    TimeOfDayOrBuilder {
  private TimeOfDay() {
  }
  public static final int HOURS_FIELD_NUMBER = 1;
  private int hours_;
  /**
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>optional int32 hours = 1;</code>
   */
  public int getHours() {
    return hours_;
  }
  /**
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>optional int32 hours = 1;</code>
   */
  private void setHours(int value) {
    
    hours_ = value;
  }
  /**
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>optional int32 hours = 1;</code>
   */
  private void clearHours() {
    
    hours_ = 0;
  }

  public static final int MINUTES_FIELD_NUMBER = 2;
  private int minutes_;
  /**
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>optional int32 minutes = 2;</code>
   */
  public int getMinutes() {
    return minutes_;
  }
  /**
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>optional int32 minutes = 2;</code>
   */
  private void setMinutes(int value) {
    
    minutes_ = value;
  }
  /**
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>optional int32 minutes = 2;</code>
   */
  private void clearMinutes() {
    
    minutes_ = 0;
  }

  public static final int SECONDS_FIELD_NUMBER = 3;
  private int seconds_;
  /**
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>optional int32 seconds = 3;</code>
   */
  public int getSeconds() {
    return seconds_;
  }
  /**
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>optional int32 seconds = 3;</code>
   */
  private void setSeconds(int value) {
    
    seconds_ = value;
  }
  /**
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>optional int32 seconds = 3;</code>
   */
  private void clearSeconds() {
    
    seconds_ = 0;
  }

  public static final int NANOS_FIELD_NUMBER = 4;
  private int nanos_;
  /**
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>optional int32 nanos = 4;</code>
   */
  public int getNanos() {
    return nanos_;
  }
  /**
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>optional int32 nanos = 4;</code>
   */
  private void setNanos(int value) {
    
    nanos_ = value;
  }
  /**
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>optional int32 nanos = 4;</code>
   */
  private void clearNanos() {
    
    nanos_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (hours_ != 0) {
      output.writeInt32(1, hours_);
    }
    if (minutes_ != 0) {
      output.writeInt32(2, minutes_);
    }
    if (seconds_ != 0) {
      output.writeInt32(3, seconds_);
    }
    if (nanos_ != 0) {
      output.writeInt32(4, nanos_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (hours_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, hours_);
    }
    if (minutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minutes_);
    }
    if (seconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, seconds_);
    }
    if (nanos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, nanos_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.TimeOfDay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.TimeOfDay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.TimeOfDay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.TimeOfDay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.TimeOfDay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.type.TimeOfDay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.type.TimeOfDay prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Represents a time of day. The date and time zone are either not significant
   * or are specified elsewhere. An API may chose to allow leap seconds. Related
   * types are [google.type.Date][google.type.Date] and [google.protobuf.Timestamp][google.protobuf.Timestamp].
   * </pre>
   *
   * Protobuf type {@code google.type.TimeOfDay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.TimeOfDay, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.TimeOfDay)
      com.google.type.TimeOfDayOrBuilder {
    // Construct using com.google.type.TimeOfDay.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>optional int32 hours = 1;</code>
     */
    public int getHours() {
      return instance.getHours();
    }
    /**
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>optional int32 hours = 1;</code>
     */
    public Builder setHours(int value) {
      copyOnWrite();
      instance.setHours(value);
      return this;
    }
    /**
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>optional int32 hours = 1;</code>
     */
    public Builder clearHours() {
      copyOnWrite();
      instance.clearHours();
      return this;
    }

    /**
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>optional int32 minutes = 2;</code>
     */
    public int getMinutes() {
      return instance.getMinutes();
    }
    /**
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>optional int32 minutes = 2;</code>
     */
    public Builder setMinutes(int value) {
      copyOnWrite();
      instance.setMinutes(value);
      return this;
    }
    /**
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>optional int32 minutes = 2;</code>
     */
    public Builder clearMinutes() {
      copyOnWrite();
      instance.clearMinutes();
      return this;
    }

    /**
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>optional int32 seconds = 3;</code>
     */
    public int getSeconds() {
      return instance.getSeconds();
    }
    /**
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>optional int32 seconds = 3;</code>
     */
    public Builder setSeconds(int value) {
      copyOnWrite();
      instance.setSeconds(value);
      return this;
    }
    /**
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>optional int32 seconds = 3;</code>
     */
    public Builder clearSeconds() {
      copyOnWrite();
      instance.clearSeconds();
      return this;
    }

    /**
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>optional int32 nanos = 4;</code>
     */
    public int getNanos() {
      return instance.getNanos();
    }
    /**
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>optional int32 nanos = 4;</code>
     */
    public Builder setNanos(int value) {
      copyOnWrite();
      instance.setNanos(value);
      return this;
    }
    /**
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>optional int32 nanos = 4;</code>
     */
    public Builder clearNanos() {
      copyOnWrite();
      instance.clearNanos();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.TimeOfDay)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.TimeOfDay();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.type.TimeOfDay other = (com.google.type.TimeOfDay) arg1;
        hours_ = visitor.visitInt(hours_ != 0, hours_,
            other.hours_ != 0, other.hours_);
        minutes_ = visitor.visitInt(minutes_ != 0, minutes_,
            other.minutes_ != 0, other.minutes_);
        seconds_ = visitor.visitInt(seconds_ != 0, seconds_,
            other.seconds_ != 0, other.seconds_);
        nanos_ = visitor.visitInt(nanos_ != 0, nanos_,
            other.nanos_ != 0, other.nanos_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {

                hours_ = input.readInt32();
                break;
              }
              case 16: {

                minutes_ = input.readInt32();
                break;
              }
              case 24: {

                seconds_ = input.readInt32();
                break;
              }
              case 32: {

                nanos_ = input.readInt32();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.type.TimeOfDay.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.type.TimeOfDay)
  private static final com.google.type.TimeOfDay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TimeOfDay();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.type.TimeOfDay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TimeOfDay> PARSER;

  public static com.google.protobuf.Parser<TimeOfDay> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/latlng.proto

package com.google.type;

/**
 * <pre>
 * An object representing a latitude/longitude pair. This is expressed as a pair
 * of doubles representing degrees latitude and degrees longitude. Unless
 * specified otherwise, this must conform to the
 * &lt;a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf"&gt;WGS84
 * standard&lt;/a&gt;. Values must be within normalized ranges.
 * </pre>
 *
 * Protobuf type {@code google.type.LatLng}
 */
public  final class LatLng extends
    com.google.protobuf.GeneratedMessageLite<
        LatLng, LatLng.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.LatLng)
    LatLngOrBuilder {
  private LatLng() {
  }
  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_;
  /**
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>optional double latitude = 1;</code>
   */
  public double getLatitude() {
    return latitude_;
  }
  /**
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>optional double latitude = 1;</code>
   */
  private void setLatitude(double value) {
    
    latitude_ = value;
  }
  /**
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>optional double latitude = 1;</code>
   */
  private void clearLatitude() {
    
    latitude_ = 0D;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_;
  /**
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>optional double longitude = 2;</code>
   */
  public double getLongitude() {
    return longitude_;
  }
  /**
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>optional double longitude = 2;</code>
   */
  private void setLongitude(double value) {
    
    longitude_ = value;
  }
  /**
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>optional double longitude = 2;</code>
   */
  private void clearLongitude() {
    
    longitude_ = 0D;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (latitude_ != 0D) {
      output.writeDouble(1, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(2, longitude_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, longitude_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.LatLng parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.LatLng parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.LatLng parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.type.LatLng parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.type.LatLng prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * An object representing a latitude/longitude pair. This is expressed as a pair
   * of doubles representing degrees latitude and degrees longitude. Unless
   * specified otherwise, this must conform to the
   * &lt;a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf"&gt;WGS84
   * standard&lt;/a&gt;. Values must be within normalized ranges.
   * </pre>
   *
   * Protobuf type {@code google.type.LatLng}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.LatLng, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.LatLng)
      com.google.type.LatLngOrBuilder {
    // Construct using com.google.type.LatLng.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>optional double latitude = 1;</code>
     */
    public double getLatitude() {
      return instance.getLatitude();
    }
    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>optional double latitude = 1;</code>
     */
    public Builder setLatitude(double value) {
      copyOnWrite();
      instance.setLatitude(value);
      return this;
    }
    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>optional double latitude = 1;</code>
     */
    public Builder clearLatitude() {
      copyOnWrite();
      instance.clearLatitude();
      return this;
    }

    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>optional double longitude = 2;</code>
     */
    public double getLongitude() {
      return instance.getLongitude();
    }
    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>optional double longitude = 2;</code>
     */
    public Builder setLongitude(double value) {
      copyOnWrite();
      instance.setLongitude(value);
      return this;
    }
    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>optional double longitude = 2;</code>
     */
    public Builder clearLongitude() {
      copyOnWrite();
      instance.clearLongitude();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.LatLng)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.LatLng();
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
        com.google.type.LatLng other = (com.google.type.LatLng) arg1;
        latitude_ = visitor.visitDouble(latitude_ != 0D, latitude_,
            other.latitude_ != 0D, other.latitude_);
        longitude_ = visitor.visitDouble(longitude_ != 0D, longitude_,
            other.longitude_ != 0D, other.longitude_);
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
              case 9: {

                latitude_ = input.readDouble();
                break;
              }
              case 17: {

                longitude_ = input.readDouble();
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
        if (PARSER == null) {    synchronized (com.google.type.LatLng.class) {
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


  // @@protoc_insertion_point(class_scope:google.type.LatLng)
  private static final com.google.type.LatLng DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LatLng();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.type.LatLng getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LatLng> PARSER;

  public static com.google.protobuf.Parser<LatLng> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


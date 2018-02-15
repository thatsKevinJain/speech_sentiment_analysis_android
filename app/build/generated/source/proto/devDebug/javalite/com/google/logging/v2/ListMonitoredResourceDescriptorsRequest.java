// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

/**
 * <pre>
 * The parameters to ListMonitoredResourceDescriptors
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.ListMonitoredResourceDescriptorsRequest}
 */
public  final class ListMonitoredResourceDescriptorsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.ListMonitoredResourceDescriptorsRequest)
    ListMonitoredResourceDescriptorsRequestOrBuilder {
  private ListMonitoredResourceDescriptorsRequest() {
    pageToken_ = "";
  }
  public static final int PAGE_SIZE_FIELD_NUMBER = 1;
  private int pageSize_;
  /**
   * <pre>
   * Optional. The maximum number of results to return from this request.  Fewer
   * results might be returned. You must check for the `nextPageToken` result to
   * determine if additional results are available, which you can retrieve by
   * passing the `nextPageToken` value in the `pageToken` parameter to the next
   * request.
   * </pre>
   *
   * <code>optional int32 page_size = 1;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }
  /**
   * <pre>
   * Optional. The maximum number of results to return from this request.  Fewer
   * results might be returned. You must check for the `nextPageToken` result to
   * determine if additional results are available, which you can retrieve by
   * passing the `nextPageToken` value in the `pageToken` parameter to the next
   * request.
   * </pre>
   *
   * <code>optional int32 page_size = 1;</code>
   */
  private void setPageSize(int value) {
    
    pageSize_ = value;
  }
  /**
   * <pre>
   * Optional. The maximum number of results to return from this request.  Fewer
   * results might be returned. You must check for the `nextPageToken` result to
   * determine if additional results are available, which you can retrieve by
   * passing the `nextPageToken` value in the `pageToken` parameter to the next
   * request.
   * </pre>
   *
   * <code>optional int32 page_size = 1;</code>
   */
  private void clearPageSize() {
    
    pageSize_ = 0;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
  private java.lang.String pageToken_;
  /**
   * <pre>
   * Optional. If the `pageToken` request parameter is supplied, then the next
   * page of results in the set are retrieved.  The `pageToken` parameter must
   * be set with the value of the `nextPageToken` result parameter from the
   * previous request.
   * </pre>
   *
   * <code>optional string page_token = 2;</code>
   */
  public java.lang.String getPageToken() {
    return pageToken_;
  }
  /**
   * <pre>
   * Optional. If the `pageToken` request parameter is supplied, then the next
   * page of results in the set are retrieved.  The `pageToken` parameter must
   * be set with the value of the `nextPageToken` result parameter from the
   * previous request.
   * </pre>
   *
   * <code>optional string page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(pageToken_);
  }
  /**
   * <pre>
   * Optional. If the `pageToken` request parameter is supplied, then the next
   * page of results in the set are retrieved.  The `pageToken` parameter must
   * be set with the value of the `nextPageToken` result parameter from the
   * previous request.
   * </pre>
   *
   * <code>optional string page_token = 2;</code>
   */
  private void setPageToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    pageToken_ = value;
  }
  /**
   * <pre>
   * Optional. If the `pageToken` request parameter is supplied, then the next
   * page of results in the set are retrieved.  The `pageToken` parameter must
   * be set with the value of the `nextPageToken` result parameter from the
   * previous request.
   * </pre>
   *
   * <code>optional string page_token = 2;</code>
   */
  private void clearPageToken() {
    
    pageToken_ = getDefaultInstance().getPageToken();
  }
  /**
   * <pre>
   * Optional. If the `pageToken` request parameter is supplied, then the next
   * page of results in the set are retrieved.  The `pageToken` parameter must
   * be set with the value of the `nextPageToken` result parameter from the
   * previous request.
   * </pre>
   *
   * <code>optional string page_token = 2;</code>
   */
  private void setPageTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    pageToken_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pageSize_ != 0) {
      output.writeInt32(1, pageSize_);
    }
    if (!pageToken_.isEmpty()) {
      output.writeString(2, getPageToken());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pageSize_);
    }
    if (!pageToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getPageToken());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.logging.v2.ListMonitoredResourceDescriptorsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * The parameters to ListMonitoredResourceDescriptors
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.ListMonitoredResourceDescriptorsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.logging.v2.ListMonitoredResourceDescriptorsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.ListMonitoredResourceDescriptorsRequest)
      com.google.logging.v2.ListMonitoredResourceDescriptorsRequestOrBuilder {
    // Construct using com.google.logging.v2.ListMonitoredResourceDescriptorsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Optional. The maximum number of results to return from this request.  Fewer
     * results might be returned. You must check for the `nextPageToken` result to
     * determine if additional results are available, which you can retrieve by
     * passing the `nextPageToken` value in the `pageToken` parameter to the next
     * request.
     * </pre>
     *
     * <code>optional int32 page_size = 1;</code>
     */
    public int getPageSize() {
      return instance.getPageSize();
    }
    /**
     * <pre>
     * Optional. The maximum number of results to return from this request.  Fewer
     * results might be returned. You must check for the `nextPageToken` result to
     * determine if additional results are available, which you can retrieve by
     * passing the `nextPageToken` value in the `pageToken` parameter to the next
     * request.
     * </pre>
     *
     * <code>optional int32 page_size = 1;</code>
     */
    public Builder setPageSize(int value) {
      copyOnWrite();
      instance.setPageSize(value);
      return this;
    }
    /**
     * <pre>
     * Optional. The maximum number of results to return from this request.  Fewer
     * results might be returned. You must check for the `nextPageToken` result to
     * determine if additional results are available, which you can retrieve by
     * passing the `nextPageToken` value in the `pageToken` parameter to the next
     * request.
     * </pre>
     *
     * <code>optional int32 page_size = 1;</code>
     */
    public Builder clearPageSize() {
      copyOnWrite();
      instance.clearPageSize();
      return this;
    }

    /**
     * <pre>
     * Optional. If the `pageToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `pageToken` parameter must
     * be set with the value of the `nextPageToken` result parameter from the
     * previous request.
     * </pre>
     *
     * <code>optional string page_token = 2;</code>
     */
    public java.lang.String getPageToken() {
      return instance.getPageToken();
    }
    /**
     * <pre>
     * Optional. If the `pageToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `pageToken` parameter must
     * be set with the value of the `nextPageToken` result parameter from the
     * previous request.
     * </pre>
     *
     * <code>optional string page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      return instance.getPageTokenBytes();
    }
    /**
     * <pre>
     * Optional. If the `pageToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `pageToken` parameter must
     * be set with the value of the `nextPageToken` result parameter from the
     * previous request.
     * </pre>
     *
     * <code>optional string page_token = 2;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setPageToken(value);
      return this;
    }
    /**
     * <pre>
     * Optional. If the `pageToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `pageToken` parameter must
     * be set with the value of the `nextPageToken` result parameter from the
     * previous request.
     * </pre>
     *
     * <code>optional string page_token = 2;</code>
     */
    public Builder clearPageToken() {
      copyOnWrite();
      instance.clearPageToken();
      return this;
    }
    /**
     * <pre>
     * Optional. If the `pageToken` request parameter is supplied, then the next
     * page of results in the set are retrieved.  The `pageToken` parameter must
     * be set with the value of the `nextPageToken` result parameter from the
     * previous request.
     * </pre>
     *
     * <code>optional string page_token = 2;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPageTokenBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.ListMonitoredResourceDescriptorsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.logging.v2.ListMonitoredResourceDescriptorsRequest();
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
        com.google.logging.v2.ListMonitoredResourceDescriptorsRequest other = (com.google.logging.v2.ListMonitoredResourceDescriptorsRequest) arg1;
        pageSize_ = visitor.visitInt(pageSize_ != 0, pageSize_,
            other.pageSize_ != 0, other.pageSize_);
        pageToken_ = visitor.visitString(!pageToken_.isEmpty(), pageToken_,
            !other.pageToken_.isEmpty(), other.pageToken_);
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

                pageSize_ = input.readInt32();
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                pageToken_ = s;
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
        if (PARSER == null) {    synchronized (com.google.logging.v2.ListMonitoredResourceDescriptorsRequest.class) {
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


  // @@protoc_insertion_point(class_scope:google.logging.v2.ListMonitoredResourceDescriptorsRequest)
  private static final com.google.logging.v2.ListMonitoredResourceDescriptorsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListMonitoredResourceDescriptorsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.logging.v2.ListMonitoredResourceDescriptorsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListMonitoredResourceDescriptorsRequest> PARSER;

  public static com.google.protobuf.Parser<ListMonitoredResourceDescriptorsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


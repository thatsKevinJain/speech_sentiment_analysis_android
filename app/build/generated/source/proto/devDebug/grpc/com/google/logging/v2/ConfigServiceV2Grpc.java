package com.google.logging.v2;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: google/logging/v2/logging_config.proto")
public final class ConfigServiceV2Grpc {

  private ConfigServiceV2Grpc() {}

  public static final String SERVICE_NAME = "google.logging.v2.ConfigServiceV2";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.ListSinksRequest,
      com.google.logging.v2.ListSinksResponse> METHOD_LIST_SINKS =
      io.grpc.MethodDescriptor.<com.google.logging.v2.ListSinksRequest, com.google.logging.v2.ListSinksResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.ConfigServiceV2", "ListSinks"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.ListSinksRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.ListSinksResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.GetSinkRequest,
      com.google.logging.v2.LogSink> METHOD_GET_SINK =
      io.grpc.MethodDescriptor.<com.google.logging.v2.GetSinkRequest, com.google.logging.v2.LogSink>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.ConfigServiceV2", "GetSink"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.GetSinkRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.LogSink.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.CreateSinkRequest,
      com.google.logging.v2.LogSink> METHOD_CREATE_SINK =
      io.grpc.MethodDescriptor.<com.google.logging.v2.CreateSinkRequest, com.google.logging.v2.LogSink>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.ConfigServiceV2", "CreateSink"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.CreateSinkRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.LogSink.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.UpdateSinkRequest,
      com.google.logging.v2.LogSink> METHOD_UPDATE_SINK =
      io.grpc.MethodDescriptor.<com.google.logging.v2.UpdateSinkRequest, com.google.logging.v2.LogSink>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.ConfigServiceV2", "UpdateSink"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.UpdateSinkRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.LogSink.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.DeleteSinkRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SINK =
      io.grpc.MethodDescriptor.<com.google.logging.v2.DeleteSinkRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.ConfigServiceV2", "DeleteSink"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.DeleteSinkRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigServiceV2Stub newStub(io.grpc.Channel channel) {
    return new ConfigServiceV2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigServiceV2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConfigServiceV2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigServiceV2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConfigServiceV2FutureStub(channel);
  }

  /**
   */
  public static abstract class ConfigServiceV2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists sinks.
     * </pre>
     */
    public void listSinks(com.google.logging.v2.ListSinksRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListSinksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SINKS, responseObserver);
    }

    /**
     * <pre>
     * Gets a sink.
     * </pre>
     */
    public void getSink(com.google.logging.v2.GetSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SINK, responseObserver);
    }

    /**
     * <pre>
     * Creates a sink.
     * </pre>
     */
    public void createSink(com.google.logging.v2.CreateSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SINK, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates a sink.
     * </pre>
     */
    public void updateSink(com.google.logging.v2.UpdateSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SINK, responseObserver);
    }

    /**
     * <pre>
     * Deletes a sink.
     * </pre>
     */
    public void deleteSink(com.google.logging.v2.DeleteSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SINK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_SINKS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.ListSinksRequest,
                com.google.logging.v2.ListSinksResponse>(
                  this, METHODID_LIST_SINKS)))
          .addMethod(
            METHOD_GET_SINK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.GetSinkRequest,
                com.google.logging.v2.LogSink>(
                  this, METHODID_GET_SINK)))
          .addMethod(
            METHOD_CREATE_SINK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.CreateSinkRequest,
                com.google.logging.v2.LogSink>(
                  this, METHODID_CREATE_SINK)))
          .addMethod(
            METHOD_UPDATE_SINK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.UpdateSinkRequest,
                com.google.logging.v2.LogSink>(
                  this, METHODID_UPDATE_SINK)))
          .addMethod(
            METHOD_DELETE_SINK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.DeleteSinkRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SINK)))
          .build();
    }
  }

  /**
   */
  public static final class ConfigServiceV2Stub extends io.grpc.stub.AbstractStub<ConfigServiceV2Stub> {
    private ConfigServiceV2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigServiceV2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceV2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigServiceV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists sinks.
     * </pre>
     */
    public void listSinks(com.google.logging.v2.ListSinksRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListSinksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SINKS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a sink.
     * </pre>
     */
    public void getSink(com.google.logging.v2.GetSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SINK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a sink.
     * </pre>
     */
    public void createSink(com.google.logging.v2.CreateSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SINK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates a sink.
     * </pre>
     */
    public void updateSink(com.google.logging.v2.UpdateSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SINK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a sink.
     * </pre>
     */
    public void deleteSink(com.google.logging.v2.DeleteSinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SINK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConfigServiceV2BlockingStub extends io.grpc.stub.AbstractStub<ConfigServiceV2BlockingStub> {
    private ConfigServiceV2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigServiceV2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceV2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigServiceV2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists sinks.
     * </pre>
     */
    public com.google.logging.v2.ListSinksResponse listSinks(com.google.logging.v2.ListSinksRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SINKS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a sink.
     * </pre>
     */
    public com.google.logging.v2.LogSink getSink(com.google.logging.v2.GetSinkRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SINK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a sink.
     * </pre>
     */
    public com.google.logging.v2.LogSink createSink(com.google.logging.v2.CreateSinkRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SINK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates a sink.
     * </pre>
     */
    public com.google.logging.v2.LogSink updateSink(com.google.logging.v2.UpdateSinkRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SINK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a sink.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSink(com.google.logging.v2.DeleteSinkRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SINK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConfigServiceV2FutureStub extends io.grpc.stub.AbstractStub<ConfigServiceV2FutureStub> {
    private ConfigServiceV2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigServiceV2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigServiceV2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigServiceV2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists sinks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.ListSinksResponse> listSinks(
        com.google.logging.v2.ListSinksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SINKS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a sink.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogSink> getSink(
        com.google.logging.v2.GetSinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SINK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a sink.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogSink> createSink(
        com.google.logging.v2.CreateSinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SINK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates a sink.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogSink> updateSink(
        com.google.logging.v2.UpdateSinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SINK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a sink.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSink(
        com.google.logging.v2.DeleteSinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SINK, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SINKS = 0;
  private static final int METHODID_GET_SINK = 1;
  private static final int METHODID_CREATE_SINK = 2;
  private static final int METHODID_UPDATE_SINK = 3;
  private static final int METHODID_DELETE_SINK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigServiceV2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigServiceV2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SINKS:
          serviceImpl.listSinks((com.google.logging.v2.ListSinksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.ListSinksResponse>) responseObserver);
          break;
        case METHODID_GET_SINK:
          serviceImpl.getSink((com.google.logging.v2.GetSinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink>) responseObserver);
          break;
        case METHODID_CREATE_SINK:
          serviceImpl.createSink((com.google.logging.v2.CreateSinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink>) responseObserver);
          break;
        case METHODID_UPDATE_SINK:
          serviceImpl.updateSink((com.google.logging.v2.UpdateSinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogSink>) responseObserver);
          break;
        case METHODID_DELETE_SINK:
          serviceImpl.deleteSink((com.google.logging.v2.DeleteSinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConfigServiceV2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_LIST_SINKS)
              .addMethod(METHOD_GET_SINK)
              .addMethod(METHOD_CREATE_SINK)
              .addMethod(METHOD_UPDATE_SINK)
              .addMethod(METHOD_DELETE_SINK)
              .build();
        }
      }
    }
    return result;
  }
}

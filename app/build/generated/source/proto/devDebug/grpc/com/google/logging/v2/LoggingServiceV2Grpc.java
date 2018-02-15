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
 * <pre>
 * Service for ingesting and querying logs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: google/logging/v2/logging.proto")
public final class LoggingServiceV2Grpc {

  private LoggingServiceV2Grpc() {}

  public static final String SERVICE_NAME = "google.logging.v2.LoggingServiceV2";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.DeleteLogRequest,
      com.google.protobuf.Empty> METHOD_DELETE_LOG =
      io.grpc.MethodDescriptor.<com.google.logging.v2.DeleteLogRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.LoggingServiceV2", "DeleteLog"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.DeleteLogRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.WriteLogEntriesRequest,
      com.google.logging.v2.WriteLogEntriesResponse> METHOD_WRITE_LOG_ENTRIES =
      io.grpc.MethodDescriptor.<com.google.logging.v2.WriteLogEntriesRequest, com.google.logging.v2.WriteLogEntriesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.LoggingServiceV2", "WriteLogEntries"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.WriteLogEntriesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.WriteLogEntriesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.ListLogEntriesRequest,
      com.google.logging.v2.ListLogEntriesResponse> METHOD_LIST_LOG_ENTRIES =
      io.grpc.MethodDescriptor.<com.google.logging.v2.ListLogEntriesRequest, com.google.logging.v2.ListLogEntriesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.LoggingServiceV2", "ListLogEntries"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.ListLogEntriesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.ListLogEntriesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,
      com.google.logging.v2.ListMonitoredResourceDescriptorsResponse> METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS =
      io.grpc.MethodDescriptor.<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest, com.google.logging.v2.ListMonitoredResourceDescriptorsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "google.logging.v2.LoggingServiceV2", "ListMonitoredResourceDescriptors"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.ListMonitoredResourceDescriptorsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.google.logging.v2.ListMonitoredResourceDescriptorsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoggingServiceV2Stub newStub(io.grpc.Channel channel) {
    return new LoggingServiceV2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoggingServiceV2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoggingServiceV2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoggingServiceV2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoggingServiceV2FutureStub(channel);
  }

  /**
   * <pre>
   * Service for ingesting and querying logs.
   * </pre>
   */
  public static abstract class LoggingServiceV2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Deletes a log and all its log entries.
     * The log will reappear if it receives new entries.
     * </pre>
     */
    public void deleteLog(com.google.logging.v2.DeleteLogRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_LOG, responseObserver);
    }

    /**
     * <pre>
     * Writes log entries to Cloud Logging.
     * All log entries in Cloud Logging are written by this method.
     * </pre>
     */
    public void writeLogEntries(com.google.logging.v2.WriteLogEntriesRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.WriteLogEntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_WRITE_LOG_ENTRIES, responseObserver);
    }

    /**
     * <pre>
     * Lists log entries.  Use this method to retrieve log entries from Cloud
     * Logging.  For ways to export log entries, see
     * [Exporting Logs](/logging/docs/export).
     * </pre>
     */
    public void listLogEntries(com.google.logging.v2.ListLogEntriesRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListLogEntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_LOG_ENTRIES, responseObserver);
    }

    /**
     * <pre>
     * Lists monitored resource descriptors that are used by Cloud Logging.
     * </pre>
     */
    public void listMonitoredResourceDescriptors(com.google.logging.v2.ListMonitoredResourceDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListMonitoredResourceDescriptorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DELETE_LOG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.DeleteLogRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_LOG)))
          .addMethod(
            METHOD_WRITE_LOG_ENTRIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.WriteLogEntriesRequest,
                com.google.logging.v2.WriteLogEntriesResponse>(
                  this, METHODID_WRITE_LOG_ENTRIES)))
          .addMethod(
            METHOD_LIST_LOG_ENTRIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.ListLogEntriesRequest,
                com.google.logging.v2.ListLogEntriesResponse>(
                  this, METHODID_LIST_LOG_ENTRIES)))
          .addMethod(
            METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,
                com.google.logging.v2.ListMonitoredResourceDescriptorsResponse>(
                  this, METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for ingesting and querying logs.
   * </pre>
   */
  public static final class LoggingServiceV2Stub extends io.grpc.stub.AbstractStub<LoggingServiceV2Stub> {
    private LoggingServiceV2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoggingServiceV2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggingServiceV2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoggingServiceV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Deletes a log and all its log entries.
     * The log will reappear if it receives new entries.
     * </pre>
     */
    public void deleteLog(com.google.logging.v2.DeleteLogRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_LOG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Writes log entries to Cloud Logging.
     * All log entries in Cloud Logging are written by this method.
     * </pre>
     */
    public void writeLogEntries(com.google.logging.v2.WriteLogEntriesRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.WriteLogEntriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_WRITE_LOG_ENTRIES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists log entries.  Use this method to retrieve log entries from Cloud
     * Logging.  For ways to export log entries, see
     * [Exporting Logs](/logging/docs/export).
     * </pre>
     */
    public void listLogEntries(com.google.logging.v2.ListLogEntriesRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListLogEntriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_LOG_ENTRIES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists monitored resource descriptors that are used by Cloud Logging.
     * </pre>
     */
    public void listMonitoredResourceDescriptors(com.google.logging.v2.ListMonitoredResourceDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListMonitoredResourceDescriptorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for ingesting and querying logs.
   * </pre>
   */
  public static final class LoggingServiceV2BlockingStub extends io.grpc.stub.AbstractStub<LoggingServiceV2BlockingStub> {
    private LoggingServiceV2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoggingServiceV2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggingServiceV2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoggingServiceV2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deletes a log and all its log entries.
     * The log will reappear if it receives new entries.
     * </pre>
     */
    public com.google.protobuf.Empty deleteLog(com.google.logging.v2.DeleteLogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_LOG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Writes log entries to Cloud Logging.
     * All log entries in Cloud Logging are written by this method.
     * </pre>
     */
    public com.google.logging.v2.WriteLogEntriesResponse writeLogEntries(com.google.logging.v2.WriteLogEntriesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_WRITE_LOG_ENTRIES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists log entries.  Use this method to retrieve log entries from Cloud
     * Logging.  For ways to export log entries, see
     * [Exporting Logs](/logging/docs/export).
     * </pre>
     */
    public com.google.logging.v2.ListLogEntriesResponse listLogEntries(com.google.logging.v2.ListLogEntriesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_LOG_ENTRIES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists monitored resource descriptors that are used by Cloud Logging.
     * </pre>
     */
    public com.google.logging.v2.ListMonitoredResourceDescriptorsResponse listMonitoredResourceDescriptors(com.google.logging.v2.ListMonitoredResourceDescriptorsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for ingesting and querying logs.
   * </pre>
   */
  public static final class LoggingServiceV2FutureStub extends io.grpc.stub.AbstractStub<LoggingServiceV2FutureStub> {
    private LoggingServiceV2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoggingServiceV2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggingServiceV2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoggingServiceV2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deletes a log and all its log entries.
     * The log will reappear if it receives new entries.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteLog(
        com.google.logging.v2.DeleteLogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_LOG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Writes log entries to Cloud Logging.
     * All log entries in Cloud Logging are written by this method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.WriteLogEntriesResponse> writeLogEntries(
        com.google.logging.v2.WriteLogEntriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_WRITE_LOG_ENTRIES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists log entries.  Use this method to retrieve log entries from Cloud
     * Logging.  For ways to export log entries, see
     * [Exporting Logs](/logging/docs/export).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.ListLogEntriesResponse> listLogEntries(
        com.google.logging.v2.ListLogEntriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_LOG_ENTRIES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists monitored resource descriptors that are used by Cloud Logging.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.ListMonitoredResourceDescriptorsResponse> listMonitoredResourceDescriptors(
        com.google.logging.v2.ListMonitoredResourceDescriptorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS, getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_LOG = 0;
  private static final int METHODID_WRITE_LOG_ENTRIES = 1;
  private static final int METHODID_LIST_LOG_ENTRIES = 2;
  private static final int METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoggingServiceV2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoggingServiceV2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_LOG:
          serviceImpl.deleteLog((com.google.logging.v2.DeleteLogRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_WRITE_LOG_ENTRIES:
          serviceImpl.writeLogEntries((com.google.logging.v2.WriteLogEntriesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.WriteLogEntriesResponse>) responseObserver);
          break;
        case METHODID_LIST_LOG_ENTRIES:
          serviceImpl.listLogEntries((com.google.logging.v2.ListLogEntriesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.ListLogEntriesResponse>) responseObserver);
          break;
        case METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS:
          serviceImpl.listMonitoredResourceDescriptors((com.google.logging.v2.ListMonitoredResourceDescriptorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.ListMonitoredResourceDescriptorsResponse>) responseObserver);
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
      synchronized (LoggingServiceV2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_DELETE_LOG)
              .addMethod(METHOD_WRITE_LOG_ENTRIES)
              .addMethod(METHOD_LIST_LOG_ENTRIES)
              .addMethod(METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS)
              .build();
        }
      }
    }
    return result;
  }
}

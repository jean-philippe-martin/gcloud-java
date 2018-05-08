// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * NodePoolAutoscaling contains information required by cluster autoscaler to
 * adjust the size of the node pool to the current cluster usage.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.NodePoolAutoscaling}
 */
public  final class NodePoolAutoscaling extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.NodePoolAutoscaling)
    NodePoolAutoscalingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodePoolAutoscaling.newBuilder() to construct.
  private NodePoolAutoscaling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodePoolAutoscaling() {
    enabled_ = false;
    minNodeCount_ = 0;
    maxNodeCount_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodePoolAutoscaling(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            enabled_ = input.readBool();
            break;
          }
          case 16: {

            minNodeCount_ = input.readInt32();
            break;
          }
          case 24: {

            maxNodeCount_ = input.readInt32();
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
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_NodePoolAutoscaling_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_NodePoolAutoscaling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.NodePoolAutoscaling.class, com.google.container.v1.NodePoolAutoscaling.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <pre>
   * Is autoscaling enabled for this node pool.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   */
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int MIN_NODE_COUNT_FIELD_NUMBER = 2;
  private int minNodeCount_;
  /**
   * <pre>
   * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
   * max_node_count.
   * </pre>
   *
   * <code>int32 min_node_count = 2;</code>
   */
  public int getMinNodeCount() {
    return minNodeCount_;
  }

  public static final int MAX_NODE_COUNT_FIELD_NUMBER = 3;
  private int maxNodeCount_;
  /**
   * <pre>
   * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count. There
   * has to enough quota to scale up the cluster.
   * </pre>
   *
   * <code>int32 max_node_count = 3;</code>
   */
  public int getMaxNodeCount() {
    return maxNodeCount_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (minNodeCount_ != 0) {
      output.writeInt32(2, minNodeCount_);
    }
    if (maxNodeCount_ != 0) {
      output.writeInt32(3, maxNodeCount_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    if (minNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minNodeCount_);
    }
    if (maxNodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxNodeCount_);
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
    if (!(obj instanceof com.google.container.v1.NodePoolAutoscaling)) {
      return super.equals(obj);
    }
    com.google.container.v1.NodePoolAutoscaling other = (com.google.container.v1.NodePoolAutoscaling) obj;

    boolean result = true;
    result = result && (getEnabled()
        == other.getEnabled());
    result = result && (getMinNodeCount()
        == other.getMinNodeCount());
    result = result && (getMaxNodeCount()
        == other.getMaxNodeCount());
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + MIN_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinNodeCount();
    hash = (37 * hash) + MAX_NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNodeCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.NodePoolAutoscaling parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.NodePoolAutoscaling parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.container.v1.NodePoolAutoscaling prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * NodePoolAutoscaling contains information required by cluster autoscaler to
   * adjust the size of the node pool to the current cluster usage.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.NodePoolAutoscaling}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.NodePoolAutoscaling)
      com.google.container.v1.NodePoolAutoscalingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_NodePoolAutoscaling_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_NodePoolAutoscaling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.NodePoolAutoscaling.class, com.google.container.v1.NodePoolAutoscaling.Builder.class);
    }

    // Construct using com.google.container.v1.NodePoolAutoscaling.newBuilder()
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
    public Builder clear() {
      super.clear();
      enabled_ = false;

      minNodeCount_ = 0;

      maxNodeCount_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_NodePoolAutoscaling_descriptor;
    }

    public com.google.container.v1.NodePoolAutoscaling getDefaultInstanceForType() {
      return com.google.container.v1.NodePoolAutoscaling.getDefaultInstance();
    }

    public com.google.container.v1.NodePoolAutoscaling build() {
      com.google.container.v1.NodePoolAutoscaling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.container.v1.NodePoolAutoscaling buildPartial() {
      com.google.container.v1.NodePoolAutoscaling result = new com.google.container.v1.NodePoolAutoscaling(this);
      result.enabled_ = enabled_;
      result.minNodeCount_ = minNodeCount_;
      result.maxNodeCount_ = maxNodeCount_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.NodePoolAutoscaling) {
        return mergeFrom((com.google.container.v1.NodePoolAutoscaling)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.NodePoolAutoscaling other) {
      if (other == com.google.container.v1.NodePoolAutoscaling.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.getMinNodeCount() != 0) {
        setMinNodeCount(other.getMinNodeCount());
      }
      if (other.getMaxNodeCount() != 0) {
        setMaxNodeCount(other.getMaxNodeCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.container.v1.NodePoolAutoscaling parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.NodePoolAutoscaling) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enabled_ ;
    /**
     * <pre>
     * Is autoscaling enabled for this node pool.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     */
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * Is autoscaling enabled for this node pool.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Is autoscaling enabled for this node pool.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
    }

    private int minNodeCount_ ;
    /**
     * <pre>
     * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
     * max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 2;</code>
     */
    public int getMinNodeCount() {
      return minNodeCount_;
    }
    /**
     * <pre>
     * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
     * max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 2;</code>
     */
    public Builder setMinNodeCount(int value) {
      
      minNodeCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
     * max_node_count.
     * </pre>
     *
     * <code>int32 min_node_count = 2;</code>
     */
    public Builder clearMinNodeCount() {
      
      minNodeCount_ = 0;
      onChanged();
      return this;
    }

    private int maxNodeCount_ ;
    /**
     * <pre>
     * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count. There
     * has to enough quota to scale up the cluster.
     * </pre>
     *
     * <code>int32 max_node_count = 3;</code>
     */
    public int getMaxNodeCount() {
      return maxNodeCount_;
    }
    /**
     * <pre>
     * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count. There
     * has to enough quota to scale up the cluster.
     * </pre>
     *
     * <code>int32 max_node_count = 3;</code>
     */
    public Builder setMaxNodeCount(int value) {
      
      maxNodeCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count. There
     * has to enough quota to scale up the cluster.
     * </pre>
     *
     * <code>int32 max_node_count = 3;</code>
     */
    public Builder clearMaxNodeCount() {
      
      maxNodeCount_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.container.v1.NodePoolAutoscaling)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.NodePoolAutoscaling)
  private static final com.google.container.v1.NodePoolAutoscaling DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.NodePoolAutoscaling();
  }

  public static com.google.container.v1.NodePoolAutoscaling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodePoolAutoscaling>
      PARSER = new com.google.protobuf.AbstractParser<NodePoolAutoscaling>() {
    public NodePoolAutoscaling parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NodePoolAutoscaling(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodePoolAutoscaling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodePoolAutoscaling> getParserForType() {
    return PARSER;
  }

  public com.google.container.v1.NodePoolAutoscaling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

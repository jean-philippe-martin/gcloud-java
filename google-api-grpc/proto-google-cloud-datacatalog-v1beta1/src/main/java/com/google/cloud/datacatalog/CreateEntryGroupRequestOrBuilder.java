// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface CreateEntryGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateEntryGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project this entry group is in. Example:
   * * projects/{project_id}/locations/{location}
   * Note that this EntryGroup and its child resources may not actually be
   * stored in the location in this name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project this entry group is in. Example:
   * * projects/{project_id}/locations/{location}
   * Note that this EntryGroup and its child resources may not actually be
   * stored in the location in this name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the entry group to create.
   * </pre>
   *
   * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getEntryGroupId();
  /**
   *
   *
   * <pre>
   * Required. The id of the entry group to create.
   * </pre>
   *
   * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getEntryGroupIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The entry group to create. Defaults to an empty entry group.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryGroup entry_group = 2;</code>
   */
  boolean hasEntryGroup();
  /**
   *
   *
   * <pre>
   * Optional. The entry group to create. Defaults to an empty entry group.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryGroup entry_group = 2;</code>
   */
  com.google.cloud.datacatalog.EntryGroup getEntryGroup();
  /**
   *
   *
   * <pre>
   * Optional. The entry group to create. Defaults to an empty entry group.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryGroup entry_group = 2;</code>
   */
  com.google.cloud.datacatalog.EntryGroupOrBuilder getEntryGroupOrBuilder();
}
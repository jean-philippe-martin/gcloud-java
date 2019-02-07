/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * Request object for method compute.urlMaps.invalidateCache. Initiates a cache invalidation
 * operation, invalidating the specified path, scoped to the specified UrlMap.
 */
public final class InvalidateCacheUrlMapHttpRequest implements ApiMessage {
  private final String access_token;
  private final CacheInvalidationRule cacheInvalidationRuleResource;
  private final String callback;
  private final String fields;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String requestId;
  private final String urlMap;
  private final String userIp;

  private InvalidateCacheUrlMapHttpRequest() {
    this.access_token = null;
    this.cacheInvalidationRuleResource = null;
    this.callback = null;
    this.fields = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.requestId = null;
    this.urlMap = null;
    this.userIp = null;
  }

  private InvalidateCacheUrlMapHttpRequest(
      String access_token,
      CacheInvalidationRule cacheInvalidationRuleResource,
      String callback,
      String fields,
      String key,
      String prettyPrint,
      String quotaUser,
      String requestId,
      String urlMap,
      String userIp) {
    this.access_token = access_token;
    this.cacheInvalidationRuleResource = cacheInvalidationRuleResource;
    this.callback = callback;
    this.fields = fields;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.requestId = requestId;
    this.urlMap = urlMap;
    this.userIp = userIp;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("access_token".equals(fieldName)) {
      return access_token;
    }
    if ("cacheInvalidationRuleResource".equals(fieldName)) {
      return cacheInvalidationRuleResource;
    }
    if ("callback".equals(fieldName)) {
      return callback;
    }
    if ("fields".equals(fieldName)) {
      return fields;
    }
    if ("key".equals(fieldName)) {
      return key;
    }
    if ("prettyPrint".equals(fieldName)) {
      return prettyPrint;
    }
    if ("quotaUser".equals(fieldName)) {
      return quotaUser;
    }
    if ("requestId".equals(fieldName)) {
      return requestId;
    }
    if ("urlMap".equals(fieldName)) {
      return urlMap;
    }
    if ("userIp".equals(fieldName)) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public CacheInvalidationRule getApiMessageRequestBody() {
    return cacheInvalidationRuleResource;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  /** OAuth 2.0 token for the current user. */
  public String getAccessToken() {
    return access_token;
  }

  public CacheInvalidationRule getCacheInvalidationRuleResource() {
    return cacheInvalidationRuleResource;
  }

  /** Name of the JavaScript callback function that handles the response. */
  public String getCallback() {
    return callback;
  }

  /** Selector specifying a subset of fields to include in the response. */
  public String getFields() {
    return fields;
  }

  /** API key. Required unless you provide an OAuth 2.0 token. */
  public String getKey() {
    return key;
  }

  /** Returns response with indentations and line breaks. */
  public String getPrettyPrint() {
    return prettyPrint;
  }

  /** Alternative to userIp. */
  public String getQuotaUser() {
    return quotaUser;
  }

  /**
   * An optional request ID to identify requests. Specify a unique request ID so that if you must
   * retry your request, the server will know to ignore the request if it has already been
   * completed.
   *
   * <p>For example, consider a situation where you make an initial request and the request times
   * out. If you make the request again with the same request ID, the server can check if original
   * operation with the same request ID was received, and if so, will ignore the second request.
   * This prevents clients from accidentally creating duplicate commitments.
   *
   * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
   * (00000000-0000-0000-0000-000000000000).
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Name of the UrlMap scoping this request. It must have the format
   * `{project}/global/urlMaps/{urlMap}/invalidateCache`. \`{urlMap}\` must start with a letter, and
   * contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`), &#42; underscores
   * (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs (\`%\`). It must
   * be between 3 and 255 characters in length, and it &#42; must not start with \`"goog"\`.
   */
  public String getUrlMap() {
    return urlMap;
  }

  /** IP address of the end user for whom the API call is being made. */
  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InvalidateCacheUrlMapHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InvalidateCacheUrlMapHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InvalidateCacheUrlMapHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InvalidateCacheUrlMapHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private CacheInvalidationRule cacheInvalidationRuleResource;
    private String callback;
    private String fields;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String requestId;
    private String urlMap;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(InvalidateCacheUrlMapHttpRequest other) {
      if (other == InvalidateCacheUrlMapHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCacheInvalidationRuleResource() != null) {
        this.cacheInvalidationRuleResource = other.cacheInvalidationRuleResource;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getRequestId() != null) {
        this.requestId = other.requestId;
      }
      if (other.getUrlMap() != null) {
        this.urlMap = other.urlMap;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(InvalidateCacheUrlMapHttpRequest source) {
      this.access_token = source.access_token;
      this.cacheInvalidationRuleResource = source.cacheInvalidationRuleResource;
      this.callback = source.callback;
      this.fields = source.fields;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.requestId = source.requestId;
      this.urlMap = source.urlMap;
      this.userIp = source.userIp;
    }

    /** OAuth 2.0 token for the current user. */
    public String getAccessToken() {
      return access_token;
    }

    /** OAuth 2.0 token for the current user. */
    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public CacheInvalidationRule getCacheInvalidationRuleResource() {
      return cacheInvalidationRuleResource;
    }

    public Builder setCacheInvalidationRuleResource(
        CacheInvalidationRule cacheInvalidationRuleResource) {
      this.cacheInvalidationRuleResource = cacheInvalidationRuleResource;
      return this;
    }

    /** Name of the JavaScript callback function that handles the response. */
    public String getCallback() {
      return callback;
    }

    /** Name of the JavaScript callback function that handles the response. */
    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    /** Selector specifying a subset of fields to include in the response. */
    public String getFields() {
      return fields;
    }

    /** Selector specifying a subset of fields to include in the response. */
    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    /** API key. Required unless you provide an OAuth 2.0 token. */
    public String getKey() {
      return key;
    }

    /** API key. Required unless you provide an OAuth 2.0 token. */
    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    /** Returns response with indentations and line breaks. */
    public String getPrettyPrint() {
      return prettyPrint;
    }

    /** Returns response with indentations and line breaks. */
    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    /** Alternative to userIp. */
    public String getQuotaUser() {
      return quotaUser;
    }

    /** Alternative to userIp. */
    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must
     * retry your request, the server will know to ignore the request if it has already been
     * completed.
     *
     * <p>For example, consider a situation where you make an initial request and the request times
     * out. If you make the request again with the same request ID, the server can check if original
     * operation with the same request ID was received, and if so, will ignore the second request.
     * This prevents clients from accidentally creating duplicate commitments.
     *
     * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
     * (00000000-0000-0000-0000-000000000000).
     */
    public String getRequestId() {
      return requestId;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must
     * retry your request, the server will know to ignore the request if it has already been
     * completed.
     *
     * <p>For example, consider a situation where you make an initial request and the request times
     * out. If you make the request again with the same request ID, the server can check if original
     * operation with the same request ID was received, and if so, will ignore the second request.
     * This prevents clients from accidentally creating duplicate commitments.
     *
     * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
     * (00000000-0000-0000-0000-000000000000).
     */
    public Builder setRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    /**
     * Name of the UrlMap scoping this request. It must have the format
     * `{project}/global/urlMaps/{urlMap}/invalidateCache`. \`{urlMap}\` must start with a letter,
     * and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`), &#42;
     * underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs
     * (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start with
     * \`"goog"\`.
     */
    public String getUrlMap() {
      return urlMap;
    }

    /**
     * Name of the UrlMap scoping this request. It must have the format
     * `{project}/global/urlMaps/{urlMap}/invalidateCache`. \`{urlMap}\` must start with a letter,
     * and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`), &#42;
     * underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs
     * (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start with
     * \`"goog"\`.
     */
    public Builder setUrlMap(String urlMap) {
      this.urlMap = urlMap;
      return this;
    }

    /** IP address of the end user for whom the API call is being made. */
    public String getUserIp() {
      return userIp;
    }

    /** IP address of the end user for whom the API call is being made. */
    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public InvalidateCacheUrlMapHttpRequest build() {
      String missing = "";

      if (urlMap == null) {
        missing += " urlMap";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new InvalidateCacheUrlMapHttpRequest(
          access_token,
          cacheInvalidationRuleResource,
          callback,
          fields,
          key,
          prettyPrint,
          quotaUser,
          requestId,
          urlMap,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCacheInvalidationRuleResource(this.cacheInvalidationRuleResource);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRequestId(this.requestId);
      newBuilder.setUrlMap(this.urlMap);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InvalidateCacheUrlMapHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "cacheInvalidationRuleResource="
        + cacheInvalidationRuleResource
        + ", "
        + "callback="
        + callback
        + ", "
        + "fields="
        + fields
        + ", "
        + "key="
        + key
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "requestId="
        + requestId
        + ", "
        + "urlMap="
        + urlMap
        + ", "
        + "userIp="
        + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InvalidateCacheUrlMapHttpRequest) {
      InvalidateCacheUrlMapHttpRequest that = (InvalidateCacheUrlMapHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(
              this.cacheInvalidationRuleResource, that.getCacheInvalidationRuleResource())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.requestId, that.getRequestId())
          && Objects.equals(this.urlMap, that.getUrlMap())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        cacheInvalidationRuleResource,
        callback,
        fields,
        key,
        prettyPrint,
        quotaUser,
        requestId,
        urlMap,
        userIp);
  }
}

/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.2.0
 * Contact: info@bluerain.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.id4i.api;

import de.id4i.ApiCallback;
import de.id4i.ApiClient;
import de.id4i.ApiException;
import de.id4i.ApiResponse;
import de.id4i.Configuration;
import de.id4i.Pair;
import de.id4i.ProgressRequestBody;
import de.id4i.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import de.id4i.api.model.ApiError;
import de.id4i.api.model.GuidAlias;
import de.id4i.api.model.PaginatedGuidResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AliasApi {
    private ApiClient apiClient;

    public AliasApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AliasApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addGuidAlias
     * @param id4n The GUID to operate on (required)
     * @param aliasType Alias type, see the corresponding API model (required)
     * @param alias The alias to add or update (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addGuidAliasCall(String id4n, String aliasType, GuidAlias alias, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = alias;
        
        // create path and map variables
        String localVarPath = "/api/v1/guids/{id4n}/alias/{aliasType}"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()))
            .replaceAll("\\{" + "aliasType" + "\\}", apiClient.escapeString(aliasType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addGuidAliasValidateBeforeCall(String id4n, String aliasType, GuidAlias alias, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling addGuidAlias(Async)");
        }
        
        // verify the required parameter 'aliasType' is set
        if (aliasType == null) {
            throw new ApiException("Missing the required parameter 'aliasType' when calling addGuidAlias(Async)");
        }
        
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new ApiException("Missing the required parameter 'alias' when calling addGuidAlias(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addGuidAliasCall(id4n, aliasType, alias, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add alias for GUIDs
     * Adds or replaces aliases for single GUIDs (alias type item and mapp) or groups of GUIDs (alias types gtin, ean and article)
     * @param id4n The GUID to operate on (required)
     * @param aliasType Alias type, see the corresponding API model (required)
     * @param alias The alias to add or update (required)
     * @return ApiError
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiError addGuidAlias(String id4n, String aliasType, GuidAlias alias) throws ApiException {
        ApiResponse<ApiError> resp = addGuidAliasWithHttpInfo(id4n, aliasType, alias);
        return resp.getData();
    }

    /**
     * Add alias for GUIDs
     * Adds or replaces aliases for single GUIDs (alias type item and mapp) or groups of GUIDs (alias types gtin, ean and article)
     * @param id4n The GUID to operate on (required)
     * @param aliasType Alias type, see the corresponding API model (required)
     * @param alias The alias to add or update (required)
     * @return ApiResponse&lt;ApiError&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiError> addGuidAliasWithHttpInfo(String id4n, String aliasType, GuidAlias alias) throws ApiException {
        com.squareup.okhttp.Call call = addGuidAliasValidateBeforeCall(id4n, aliasType, alias, null, null);
        Type localVarReturnType = new TypeToken<ApiError>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add alias for GUIDs (asynchronously)
     * Adds or replaces aliases for single GUIDs (alias type item and mapp) or groups of GUIDs (alias types gtin, ean and article)
     * @param id4n The GUID to operate on (required)
     * @param aliasType Alias type, see the corresponding API model (required)
     * @param alias The alias to add or update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addGuidAliasAsync(String id4n, String aliasType, GuidAlias alias, final ApiCallback<ApiError> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addGuidAliasValidateBeforeCall(id4n, aliasType, alias, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiError>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addGuidAlias1
     * @param id4n The GUID to operate on (required)
     * @param aliasType Alias type, see the corresponding API model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addGuidAlias1Call(String id4n, String aliasType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/guids/{id4n}/alias/{aliasType}"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()))
            .replaceAll("\\{" + "aliasType" + "\\}", apiClient.escapeString(aliasType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addGuidAlias1ValidateBeforeCall(String id4n, String aliasType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling addGuidAlias1(Async)");
        }
        
        // verify the required parameter 'aliasType' is set
        if (aliasType == null) {
            throw new ApiException("Missing the required parameter 'aliasType' when calling addGuidAlias1(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addGuidAlias1Call(id4n, aliasType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Remove aliases from GUIDs
     * Remove the alias of the given type
     * @param id4n The GUID to operate on (required)
     * @param aliasType Alias type, see the corresponding API model (required)
     * @return ApiError
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiError addGuidAlias1(String id4n, String aliasType) throws ApiException {
        ApiResponse<ApiError> resp = addGuidAlias1WithHttpInfo(id4n, aliasType);
        return resp.getData();
    }

    /**
     * Remove aliases from GUIDs
     * Remove the alias of the given type
     * @param id4n The GUID to operate on (required)
     * @param aliasType Alias type, see the corresponding API model (required)
     * @return ApiResponse&lt;ApiError&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiError> addGuidAlias1WithHttpInfo(String id4n, String aliasType) throws ApiException {
        com.squareup.okhttp.Call call = addGuidAlias1ValidateBeforeCall(id4n, aliasType, null, null);
        Type localVarReturnType = new TypeToken<ApiError>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove aliases from GUIDs (asynchronously)
     * Remove the alias of the given type
     * @param id4n The GUID to operate on (required)
     * @param aliasType Alias type, see the corresponding API model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addGuidAlias1Async(String id4n, String aliasType, final ApiCallback<ApiError> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addGuidAlias1ValidateBeforeCall(id4n, aliasType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiError>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGuidAliasTypes
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGuidAliasTypesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/search/guids/aliases/types";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getGuidAliasTypesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getGuidAliasTypesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List all supported alias types
     * Retrieve this list to find out all alias types to use with alias search and change operations
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getGuidAliasTypes() throws ApiException {
        ApiResponse<List<String>> resp = getGuidAliasTypesWithHttpInfo();
        return resp.getData();
    }

    /**
     * List all supported alias types
     * Retrieve this list to find out all alias types to use with alias search and change operations
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getGuidAliasTypesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getGuidAliasTypesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all supported alias types (asynchronously)
     * Retrieve this list to find out all alias types to use with alias search and change operations
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGuidAliasTypesAsync(final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getGuidAliasTypesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGuidAliases
     * @param id4n The GUID to operate on (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGuidAliasesCall(String id4n, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/guids/{id4n}/alias"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getGuidAliasesValidateBeforeCall(String id4n, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling getGuidAliases(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getGuidAliasesCall(id4n, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all aliases for the given GUID
     * Looks up the alias for each alias type (group and single GUID) and returns all found ones
     * @param id4n The GUID to operate on (required)
     * @return Map&lt;String, String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, String> getGuidAliases(String id4n) throws ApiException {
        ApiResponse<Map<String, String>> resp = getGuidAliasesWithHttpInfo(id4n);
        return resp.getData();
    }

    /**
     * Get all aliases for the given GUID
     * Looks up the alias for each alias type (group and single GUID) and returns all found ones
     * @param id4n The GUID to operate on (required)
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, String>> getGuidAliasesWithHttpInfo(String id4n) throws ApiException {
        com.squareup.okhttp.Call call = getGuidAliasesValidateBeforeCall(id4n, null, null);
        Type localVarReturnType = new TypeToken<Map<String, String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all aliases for the given GUID (asynchronously)
     * Looks up the alias for each alias type (group and single GUID) and returns all found ones
     * @param id4n The GUID to operate on (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGuidAliasesAsync(String id4n, final ApiCallback<Map<String, String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getGuidAliasesValidateBeforeCall(id4n, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchByAlias
     * @param alias The alias to search for (required)
     * @param aliasType Alias type type to search for (required)
     * @param offset Start with the n-th element (optional)
     * @param limit The maximum count of returned elements (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchByAliasCall(String alias, String aliasType, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/search/guids";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (alias != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "alias", alias));
        if (aliasType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "aliasType", aliasType));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchByAliasValidateBeforeCall(String alias, String aliasType, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new ApiException("Missing the required parameter 'alias' when calling searchByAlias(Async)");
        }
        
        // verify the required parameter 'aliasType' is set
        if (aliasType == null) {
            throw new ApiException("Missing the required parameter 'aliasType' when calling searchByAlias(Async)");
        }
        
        
        com.squareup.okhttp.Call call = searchByAliasCall(alias, aliasType, offset, limit, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Search for GUIDs by alias
     * 
     * @param alias The alias to search for (required)
     * @param aliasType Alias type type to search for (required)
     * @param offset Start with the n-th element (optional)
     * @param limit The maximum count of returned elements (optional)
     * @return PaginatedGuidResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedGuidResponse searchByAlias(String alias, String aliasType, Integer offset, Integer limit) throws ApiException {
        ApiResponse<PaginatedGuidResponse> resp = searchByAliasWithHttpInfo(alias, aliasType, offset, limit);
        return resp.getData();
    }

    /**
     * Search for GUIDs by alias
     * 
     * @param alias The alias to search for (required)
     * @param aliasType Alias type type to search for (required)
     * @param offset Start with the n-th element (optional)
     * @param limit The maximum count of returned elements (optional)
     * @return ApiResponse&lt;PaginatedGuidResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedGuidResponse> searchByAliasWithHttpInfo(String alias, String aliasType, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = searchByAliasValidateBeforeCall(alias, aliasType, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<PaginatedGuidResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search for GUIDs by alias (asynchronously)
     * 
     * @param alias The alias to search for (required)
     * @param aliasType Alias type type to search for (required)
     * @param offset Start with the n-th element (optional)
     * @param limit The maximum count of returned elements (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchByAliasAsync(String alias, String aliasType, Integer offset, Integer limit, final ApiCallback<PaginatedGuidResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchByAliasValidateBeforeCall(alias, aliasType, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedGuidResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

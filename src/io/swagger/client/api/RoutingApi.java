/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.0.1-alpha
 * Contact: info@bluerain.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ApiError;
import io.swagger.client.model.Route;
import io.swagger.client.model.RoutingFile;
import io.swagger.client.model.RoutingFileRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoutingApi {
    private ApiClient apiClient;

    public RoutingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoutingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getRoute
     * @param id4n id4n (required)
     * @param type The type of route you want to have (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRouteCall(String id4n, String type, String authorization, String acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/routingfiles/{id4n}/route/{type}"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()))
            .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (acceptLanguage != null)
        localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRouteValidateBeforeCall(String id4n, String type, String authorization, String acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling getRoute(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getRoute(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getRouteCall(id4n, type, authorization, acceptLanguage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve current route of a GUID (or ID4N)
     * 
     * @param id4n id4n (required)
     * @param type The type of route you want to have (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @return Route
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Route getRoute(String id4n, String type, String authorization, String acceptLanguage) throws ApiException {
        ApiResponse<Route> resp = getRouteWithHttpInfo(id4n, type, authorization, acceptLanguage);
        return resp.getData();
    }

    /**
     * Retrieve current route of a GUID (or ID4N)
     * 
     * @param id4n id4n (required)
     * @param type The type of route you want to have (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @return ApiResponse&lt;Route&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Route> getRouteWithHttpInfo(String id4n, String type, String authorization, String acceptLanguage) throws ApiException {
        com.squareup.okhttp.Call call = getRouteValidateBeforeCall(id4n, type, authorization, acceptLanguage, null, null);
        Type localVarReturnType = new TypeToken<Route>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve current route of a GUID (or ID4N) (asynchronously)
     * 
     * @param id4n id4n (required)
     * @param type The type of route you want to have (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRouteAsync(String id4n, String type, String authorization, String acceptLanguage, final ApiCallback<Route> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRouteValidateBeforeCall(id4n, type, authorization, acceptLanguage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Route>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRoutingFile
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @param organizationId organizationId (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRoutingFileCall(String id4n, String authorization, String acceptLanguage, Long organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = organizationId;
        
        // create path and map variables
        String localVarPath = "/api/v1/routingfiles/{id4n}"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (acceptLanguage != null)
        localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRoutingFileValidateBeforeCall(String id4n, String authorization, String acceptLanguage, Long organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling getRoutingFile(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getRoutingFileCall(id4n, authorization, acceptLanguage, organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve routing file
     * 
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @param organizationId organizationId (optional)
     * @return RoutingFile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RoutingFile getRoutingFile(String id4n, String authorization, String acceptLanguage, Long organizationId) throws ApiException {
        ApiResponse<RoutingFile> resp = getRoutingFileWithHttpInfo(id4n, authorization, acceptLanguage, organizationId);
        return resp.getData();
    }

    /**
     * Retrieve routing file
     * 
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @param organizationId organizationId (optional)
     * @return ApiResponse&lt;RoutingFile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RoutingFile> getRoutingFileWithHttpInfo(String id4n, String authorization, String acceptLanguage, Long organizationId) throws ApiException {
        com.squareup.okhttp.Call call = getRoutingFileValidateBeforeCall(id4n, authorization, acceptLanguage, organizationId, null, null);
        Type localVarReturnType = new TypeToken<RoutingFile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve routing file (asynchronously)
     * 
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @param organizationId organizationId (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRoutingFileAsync(String id4n, String authorization, String acceptLanguage, Long organizationId, final ApiCallback<RoutingFile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRoutingFileValidateBeforeCall(id4n, authorization, acceptLanguage, organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RoutingFile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateRoutingFile
     * @param rfr rfr (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateRoutingFileCall(RoutingFileRequest rfr, String id4n, String authorization, String acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = rfr;
        
        // create path and map variables
        String localVarPath = "/api/v1/routingfiles/{id4n}"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (acceptLanguage != null)
        localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRoutingFileValidateBeforeCall(RoutingFileRequest rfr, String id4n, String authorization, String acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'rfr' is set
        if (rfr == null) {
            throw new ApiException("Missing the required parameter 'rfr' when calling updateRoutingFile(Async)");
        }
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling updateRoutingFile(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateRoutingFileCall(rfr, id4n, authorization, acceptLanguage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Store routing file
     * 
     * @param rfr rfr (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @return ApiError
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiError updateRoutingFile(RoutingFileRequest rfr, String id4n, String authorization, String acceptLanguage) throws ApiException {
        ApiResponse<ApiError> resp = updateRoutingFileWithHttpInfo(rfr, id4n, authorization, acceptLanguage);
        return resp.getData();
    }

    /**
     * Store routing file
     * 
     * @param rfr rfr (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @return ApiResponse&lt;ApiError&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiError> updateRoutingFileWithHttpInfo(RoutingFileRequest rfr, String id4n, String authorization, String acceptLanguage) throws ApiException {
        com.squareup.okhttp.Call call = updateRoutingFileValidateBeforeCall(rfr, id4n, authorization, acceptLanguage, null, null);
        Type localVarReturnType = new TypeToken<ApiError>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Store routing file (asynchronously)
     * 
     * @param rfr rfr (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token as returned from /login (optional)
     * @param acceptLanguage Requested language (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateRoutingFileAsync(RoutingFileRequest rfr, String id4n, String authorization, String acceptLanguage, final ApiCallback<ApiError> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateRoutingFileValidateBeforeCall(rfr, id4n, authorization, acceptLanguage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiError>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

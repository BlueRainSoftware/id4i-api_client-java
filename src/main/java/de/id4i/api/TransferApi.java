/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.7.1
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
import de.id4i.api.model.TransferReceiveInfo;
import de.id4i.api.model.TransferSendInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransferApi {
    private ApiClient apiClient;

    public TransferApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getReceiveInfo
     * @param id4n The ID4N to retrieve information about (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReceiveInfoCall(String id4n, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/transfers/{id4n}/receiveInfo"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getReceiveInfoValidateBeforeCall(String id4n, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling getReceiveInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = getReceiveInfoCall(id4n, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Show transfer information
     * 
     * @param id4n The ID4N to retrieve information about (required)
     * @return TransferReceiveInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransferReceiveInfo getReceiveInfo(String id4n) throws ApiException {
        ApiResponse<TransferReceiveInfo> resp = getReceiveInfoWithHttpInfo(id4n);
        return resp.getData();
    }

    /**
     * Show transfer information
     * 
     * @param id4n The ID4N to retrieve information about (required)
     * @return ApiResponse&lt;TransferReceiveInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransferReceiveInfo> getReceiveInfoWithHttpInfo(String id4n) throws ApiException {
        com.squareup.okhttp.Call call = getReceiveInfoValidateBeforeCall(id4n, null, null);
        Type localVarReturnType = new TypeToken<TransferReceiveInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show transfer information (asynchronously)
     * 
     * @param id4n The ID4N to retrieve information about (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReceiveInfoAsync(String id4n, final ApiCallback<TransferReceiveInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getReceiveInfoValidateBeforeCall(id4n, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransferReceiveInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSendInfo
     * @param id4n The ID4N to retrieve information about (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSendInfoCall(String id4n, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/transfers/{id4n}/sendInfo"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSendInfoValidateBeforeCall(String id4n, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling getSendInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = getSendInfoCall(id4n, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Show transfer preparation information
     * 
     * @param id4n The ID4N to retrieve information about (required)
     * @return TransferSendInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransferSendInfo getSendInfo(String id4n) throws ApiException {
        ApiResponse<TransferSendInfo> resp = getSendInfoWithHttpInfo(id4n);
        return resp.getData();
    }

    /**
     * Show transfer preparation information
     * 
     * @param id4n The ID4N to retrieve information about (required)
     * @return ApiResponse&lt;TransferSendInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransferSendInfo> getSendInfoWithHttpInfo(String id4n) throws ApiException {
        com.squareup.okhttp.Call call = getSendInfoValidateBeforeCall(id4n, null, null);
        Type localVarReturnType = new TypeToken<TransferSendInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show transfer preparation information (asynchronously)
     * 
     * @param id4n The ID4N to retrieve information about (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSendInfoAsync(String id4n, final ApiCallback<TransferSendInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSendInfoValidateBeforeCall(id4n, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransferSendInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for prepare
     * @param id4n The ID4N to prepare for transfer (required)
     * @param request Transfer preparation status (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call prepareCall(String id4n, TransferSendInfo request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/v1/transfers/{id4n}/sendInfo"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call prepareValidateBeforeCall(String id4n, TransferSendInfo request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling prepare(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling prepare(Async)");
        }
        

        com.squareup.okhttp.Call call = prepareCall(id4n, request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Prepare an object for transfer
     * 
     * @param id4n The ID4N to prepare for transfer (required)
     * @param request Transfer preparation status (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object prepare(String id4n, TransferSendInfo request) throws ApiException {
        ApiResponse<Object> resp = prepareWithHttpInfo(id4n, request);
        return resp.getData();
    }

    /**
     * Prepare an object for transfer
     * 
     * @param id4n The ID4N to prepare for transfer (required)
     * @param request Transfer preparation status (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> prepareWithHttpInfo(String id4n, TransferSendInfo request) throws ApiException {
        com.squareup.okhttp.Call call = prepareValidateBeforeCall(id4n, request, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Prepare an object for transfer (asynchronously)
     * 
     * @param id4n The ID4N to prepare for transfer (required)
     * @param request Transfer preparation status (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call prepareAsync(String id4n, TransferSendInfo request, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = prepareValidateBeforeCall(id4n, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for receive
     * @param id4n This ID4N identifies the object to take hold of (required)
     * @param request Required information to receive an id4n object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call receiveCall(String id4n, TransferReceiveInfo request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/v1/transfers/{id4n}/receiveInfo"
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/xml", "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call receiveValidateBeforeCall(String id4n, TransferReceiveInfo request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling receive(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling receive(Async)");
        }
        

        com.squareup.okhttp.Call call = receiveCall(id4n, request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Transfer a GUID or collection, obtaining it (i.e. becoming the holder) and if allowed also taking ownership
     * Taking ownership can be forbidden by a previous owner. See methods prepare and getInfo
     * @param id4n This ID4N identifies the object to take hold of (required)
     * @param request Required information to receive an id4n object (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void receive(String id4n, TransferReceiveInfo request) throws ApiException {
        receiveWithHttpInfo(id4n, request);
    }

    /**
     * Transfer a GUID or collection, obtaining it (i.e. becoming the holder) and if allowed also taking ownership
     * Taking ownership can be forbidden by a previous owner. See methods prepare and getInfo
     * @param id4n This ID4N identifies the object to take hold of (required)
     * @param request Required information to receive an id4n object (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> receiveWithHttpInfo(String id4n, TransferReceiveInfo request) throws ApiException {
        com.squareup.okhttp.Call call = receiveValidateBeforeCall(id4n, request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Transfer a GUID or collection, obtaining it (i.e. becoming the holder) and if allowed also taking ownership (asynchronously)
     * Taking ownership can be forbidden by a previous owner. See methods prepare and getInfo
     * @param id4n This ID4N identifies the object to take hold of (required)
     * @param request Required information to receive an id4n object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call receiveAsync(String id4n, TransferReceiveInfo request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = receiveValidateBeforeCall(id4n, request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}

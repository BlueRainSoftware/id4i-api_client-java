/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.1.4-SNAPSHOT
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
import de.id4i.api.model.InputStreamResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MicrostorageApi {
    private ApiClient apiClient;

    public MicrostorageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MicrostorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for read
     * @param organization organization (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readCall(Long organization, String id4n, String authorization, String acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/microstorage/{id4n}/{organization}"
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
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
    private com.squareup.okhttp.Call readValidateBeforeCall(Long organization, String id4n, String authorization, String acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling read(Async)");
        }
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling read(Async)");
        }
        
        
        com.squareup.okhttp.Call call = readCall(organization, id4n, authorization, acceptLanguage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read data from microstorage
     * 
     * @param organization organization (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @return InputStreamResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InputStreamResource read(Long organization, String id4n, String authorization, String acceptLanguage) throws ApiException {
        ApiResponse<InputStreamResource> resp = readWithHttpInfo(organization, id4n, authorization, acceptLanguage);
        return resp.getData();
    }

    /**
     * Read data from microstorage
     * 
     * @param organization organization (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @return ApiResponse&lt;InputStreamResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InputStreamResource> readWithHttpInfo(Long organization, String id4n, String authorization, String acceptLanguage) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(organization, id4n, authorization, acceptLanguage, null, null);
        Type localVarReturnType = new TypeToken<InputStreamResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read data from microstorage (asynchronously)
     * 
     * @param organization organization (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readAsync(Long organization, String id4n, String authorization, String acceptLanguage, final ApiCallback<InputStreamResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readValidateBeforeCall(organization, id4n, authorization, acceptLanguage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InputStreamResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for write
     * @param organization organization (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @param contentType Content-Type (optional)
     * @param contentLength Content-Length (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call writeCall(Long organization, String id4n, String authorization, String acceptLanguage, String contentType, Long contentLength, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/microstorage/{id4n}/{organization}"
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "id4n" + "\\}", apiClient.escapeString(id4n.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (acceptLanguage != null)
        localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
        if (contentLength != null)
        localVarHeaderParams.put("Content-Length", apiClient.parameterToString(contentLength));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
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
    private com.squareup.okhttp.Call writeValidateBeforeCall(Long organization, String id4n, String authorization, String acceptLanguage, String contentType, Long contentLength, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling write(Async)");
        }
        
        // verify the required parameter 'id4n' is set
        if (id4n == null) {
            throw new ApiException("Missing the required parameter 'id4n' when calling write(Async)");
        }
        
        
        com.squareup.okhttp.Call call = writeCall(organization, id4n, authorization, acceptLanguage, contentType, contentLength, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Write data to microstorage
     * 
     * @param organization organization (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @param contentType Content-Type (optional)
     * @param contentLength Content-Length (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object write(Long organization, String id4n, String authorization, String acceptLanguage, String contentType, Long contentLength) throws ApiException {
        ApiResponse<Object> resp = writeWithHttpInfo(organization, id4n, authorization, acceptLanguage, contentType, contentLength);
        return resp.getData();
    }

    /**
     * Write data to microstorage
     * 
     * @param organization organization (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @param contentType Content-Type (optional)
     * @param contentLength Content-Length (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> writeWithHttpInfo(Long organization, String id4n, String authorization, String acceptLanguage, String contentType, Long contentLength) throws ApiException {
        com.squareup.okhttp.Call call = writeValidateBeforeCall(organization, id4n, authorization, acceptLanguage, contentType, contentLength, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Write data to microstorage (asynchronously)
     * 
     * @param organization organization (required)
     * @param id4n id4n (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @param contentType Content-Type (optional)
     * @param contentLength Content-Length (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call writeAsync(Long organization, String id4n, String authorization, String acceptLanguage, String contentType, Long contentLength, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = writeValidateBeforeCall(organization, id4n, authorization, acceptLanguage, contentType, contentLength, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

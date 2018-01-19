/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.1.1
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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImagesApi {
    private ApiClient apiClient;

    public ImagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImagesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for resolveImageUsingGET
     * @param imageID The id of the image to be resolved. (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resolveImageUsingGETCall(String imageID, String authorization, String acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/public/image/{imageID}"
            .replaceAll("\\{" + "imageID" + "\\}", apiClient.escapeString(imageID.toString()));

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
    private com.squareup.okhttp.Call resolveImageUsingGETValidateBeforeCall(String imageID, String authorization, String acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'imageID' is set
        if (imageID == null) {
            throw new ApiException("Missing the required parameter 'imageID' when calling resolveImageUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = resolveImageUsingGETCall(imageID, authorization, acceptLanguage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Resolve image
     * 
     * @param imageID The id of the image to be resolved. (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] resolveImageUsingGET(String imageID, String authorization, String acceptLanguage) throws ApiException {
        ApiResponse<byte[]> resp = resolveImageUsingGETWithHttpInfo(imageID, authorization, acceptLanguage);
        return resp.getData();
    }

    /**
     * Resolve image
     * 
     * @param imageID The id of the image to be resolved. (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> resolveImageUsingGETWithHttpInfo(String imageID, String authorization, String acceptLanguage) throws ApiException {
        com.squareup.okhttp.Call call = resolveImageUsingGETValidateBeforeCall(imageID, authorization, acceptLanguage, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resolve image (asynchronously)
     * 
     * @param imageID The id of the image to be resolved. (required)
     * @param authorization Authorization JWT Bearer Token (optional)
     * @param acceptLanguage Requested language (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resolveImageUsingGETAsync(String imageID, String authorization, String acceptLanguage, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = resolveImageUsingGETValidateBeforeCall(imageID, authorization, acceptLanguage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

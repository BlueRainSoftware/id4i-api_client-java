/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.8.1-SNAPSHOT
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
import java.time.LocalDateTime;
import de.id4i.api.model.PaginatedChangeLogEntryResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditingApi {
    private ApiClient apiClient;

    public AuditingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuditingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listOrganizationChangeLog
     * @param organizationId The namespace identifying the organization whose change log entries are to be listed (required)
     * @param messageMimeType The Mime-type for the message format that should be returned. e.g. &#39;text/plain&#39; or &#39;text/mustache&#39;  (optional, default to text/mustache)
     * @param fromDate From date time as UTC Date-Time format (optional)
     * @param toDate To date time as UTC Date-Time format (optional)
     * @param offset Start with the n-th element (optional)
     * @param limit The maximum count of returned elements (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listOrganizationChangeLogCall(String organizationId, String messageMimeType, LocalDateTime fromDate, LocalDateTime toDate, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/changelog/organization/{organizationId}/"
            .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (messageMimeType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("messageMimeType", messageMimeType));
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

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
    private com.squareup.okhttp.Call listOrganizationChangeLogValidateBeforeCall(String organizationId, String messageMimeType, LocalDateTime fromDate, LocalDateTime toDate, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationChangeLog(Async)");
        }
        

        com.squareup.okhttp.Call call = listOrganizationChangeLogCall(organizationId, messageMimeType, fromDate, toDate, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List change log entries of an organization
     * Listing change log entries of the specified organization id.
     * @param organizationId The namespace identifying the organization whose change log entries are to be listed (required)
     * @param messageMimeType The Mime-type for the message format that should be returned. e.g. &#39;text/plain&#39; or &#39;text/mustache&#39;  (optional, default to text/mustache)
     * @param fromDate From date time as UTC Date-Time format (optional)
     * @param toDate To date time as UTC Date-Time format (optional)
     * @param offset Start with the n-th element (optional)
     * @param limit The maximum count of returned elements (optional)
     * @return PaginatedChangeLogEntryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedChangeLogEntryResponse listOrganizationChangeLog(String organizationId, String messageMimeType, LocalDateTime fromDate, LocalDateTime toDate, Integer offset, Integer limit) throws ApiException {
        ApiResponse<PaginatedChangeLogEntryResponse> resp = listOrganizationChangeLogWithHttpInfo(organizationId, messageMimeType, fromDate, toDate, offset, limit);
        return resp.getData();
    }

    /**
     * List change log entries of an organization
     * Listing change log entries of the specified organization id.
     * @param organizationId The namespace identifying the organization whose change log entries are to be listed (required)
     * @param messageMimeType The Mime-type for the message format that should be returned. e.g. &#39;text/plain&#39; or &#39;text/mustache&#39;  (optional, default to text/mustache)
     * @param fromDate From date time as UTC Date-Time format (optional)
     * @param toDate To date time as UTC Date-Time format (optional)
     * @param offset Start with the n-th element (optional)
     * @param limit The maximum count of returned elements (optional)
     * @return ApiResponse&lt;PaginatedChangeLogEntryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedChangeLogEntryResponse> listOrganizationChangeLogWithHttpInfo(String organizationId, String messageMimeType, LocalDateTime fromDate, LocalDateTime toDate, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationChangeLogValidateBeforeCall(organizationId, messageMimeType, fromDate, toDate, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<PaginatedChangeLogEntryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List change log entries of an organization (asynchronously)
     * Listing change log entries of the specified organization id.
     * @param organizationId The namespace identifying the organization whose change log entries are to be listed (required)
     * @param messageMimeType The Mime-type for the message format that should be returned. e.g. &#39;text/plain&#39; or &#39;text/mustache&#39;  (optional, default to text/mustache)
     * @param fromDate From date time as UTC Date-Time format (optional)
     * @param toDate To date time as UTC Date-Time format (optional)
     * @param offset Start with the n-th element (optional)
     * @param limit The maximum count of returned elements (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationChangeLogAsync(String organizationId, String messageMimeType, LocalDateTime fromDate, LocalDateTime toDate, Integer offset, Integer limit, final ApiCallback<PaginatedChangeLogEntryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationChangeLogValidateBeforeCall(organizationId, messageMimeType, fromDate, toDate, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedChangeLogEntryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

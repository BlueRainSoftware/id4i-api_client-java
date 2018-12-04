/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.5
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
import de.id4i.api.model.BillingPosition;
import java.time.LocalDateTime;
import de.id4i.api.model.ServiceCosts;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingApi {
    private ApiClient apiClient;

    public BillingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BillingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getPositionsForOrganization
     * @param organizationId The organization to compute the billing information for (required)
     * @param fromDate Billing start date (optional)
     * @param toDate Billing end date (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPositionsForOrganizationCall(String organizationId, LocalDateTime fromDate, LocalDateTime toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/billing/{organizationId}/positions"
            .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));

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
    private com.squareup.okhttp.Call getPositionsForOrganizationValidateBeforeCall(String organizationId, LocalDateTime fromDate, LocalDateTime toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling getPositionsForOrganization(Async)");
        }
        

        com.squareup.okhttp.Call call = getPositionsForOrganizationCall(organizationId, fromDate, toDate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get billing positions for a given organization
     * 
     * @param organizationId The organization to compute the billing information for (required)
     * @param fromDate Billing start date (optional)
     * @param toDate Billing end date (optional)
     * @return List&lt;BillingPosition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BillingPosition> getPositionsForOrganization(String organizationId, LocalDateTime fromDate, LocalDateTime toDate) throws ApiException {
        ApiResponse<List<BillingPosition>> resp = getPositionsForOrganizationWithHttpInfo(organizationId, fromDate, toDate);
        return resp.getData();
    }

    /**
     * Get billing positions for a given organization
     * 
     * @param organizationId The organization to compute the billing information for (required)
     * @param fromDate Billing start date (optional)
     * @param toDate Billing end date (optional)
     * @return ApiResponse&lt;List&lt;BillingPosition&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BillingPosition>> getPositionsForOrganizationWithHttpInfo(String organizationId, LocalDateTime fromDate, LocalDateTime toDate) throws ApiException {
        com.squareup.okhttp.Call call = getPositionsForOrganizationValidateBeforeCall(organizationId, fromDate, toDate, null, null);
        Type localVarReturnType = new TypeToken<List<BillingPosition>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get billing positions for a given organization (asynchronously)
     * 
     * @param organizationId The organization to compute the billing information for (required)
     * @param fromDate Billing start date (optional)
     * @param toDate Billing end date (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPositionsForOrganizationAsync(String organizationId, LocalDateTime fromDate, LocalDateTime toDate, final ApiCallback<List<BillingPosition>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPositionsForOrganizationValidateBeforeCall(organizationId, fromDate, toDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BillingPosition>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSumForOrganization
     * @param organizationId The organization to compute the billing information for (required)
     * @param fromDate Billing start date (optional)
     * @param toDate Billing end date (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSumForOrganizationCall(String organizationId, LocalDateTime fromDate, LocalDateTime toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/billing/{organizationId}"
            .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));

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
    private com.squareup.okhttp.Call getSumForOrganizationValidateBeforeCall(String organizationId, LocalDateTime fromDate, LocalDateTime toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling getSumForOrganization(Async)");
        }
        

        com.squareup.okhttp.Call call = getSumForOrganizationCall(organizationId, fromDate, toDate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get billing amount of services for a given organization
     * 
     * @param organizationId The organization to compute the billing information for (required)
     * @param fromDate Billing start date (optional)
     * @param toDate Billing end date (optional)
     * @return ServiceCosts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ServiceCosts getSumForOrganization(String organizationId, LocalDateTime fromDate, LocalDateTime toDate) throws ApiException {
        ApiResponse<ServiceCosts> resp = getSumForOrganizationWithHttpInfo(organizationId, fromDate, toDate);
        return resp.getData();
    }

    /**
     * Get billing amount of services for a given organization
     * 
     * @param organizationId The organization to compute the billing information for (required)
     * @param fromDate Billing start date (optional)
     * @param toDate Billing end date (optional)
     * @return ApiResponse&lt;ServiceCosts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ServiceCosts> getSumForOrganizationWithHttpInfo(String organizationId, LocalDateTime fromDate, LocalDateTime toDate) throws ApiException {
        com.squareup.okhttp.Call call = getSumForOrganizationValidateBeforeCall(organizationId, fromDate, toDate, null, null);
        Type localVarReturnType = new TypeToken<ServiceCosts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get billing amount of services for a given organization (asynchronously)
     * 
     * @param organizationId The organization to compute the billing information for (required)
     * @param fromDate Billing start date (optional)
     * @param toDate Billing end date (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSumForOrganizationAsync(String organizationId, LocalDateTime fromDate, LocalDateTime toDate, final ApiCallback<ServiceCosts> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSumForOrganizationValidateBeforeCall(organizationId, fromDate, toDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ServiceCosts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

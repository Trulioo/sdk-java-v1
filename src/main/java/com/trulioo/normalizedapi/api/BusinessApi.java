package com.trulioo.normalizedapi.api;

import com.trulioo.normalizedapi.ApiCallback;
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.ApiResponse;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.Pair;
import com.trulioo.normalizedapi.ProgressRequestBody;
import com.trulioo.normalizedapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.trulioo.normalizedapi.model.BusinessSearchRequest;
import com.trulioo.normalizedapi.model.BusinessSearchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessApi {
    private ApiClient apiClient;

    public BusinessApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BusinessApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getBusinessSearchResult
     * @param id transaction record id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getBusinessSearchResultCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/business/v1/search/transactionrecord/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        
        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private okhttp3.Call getBusinessSearchResultValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getBusinessSearchResult(Async)");
        }
        
        okhttp3.Call call = getBusinessSearchResultCall(id, progressListener, progressRequestListener);
        return call;
    }

    /**
     * returns the a business search result.
     * 
     * @param id transaction record id (required)
     * @return BusinessSearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BusinessSearchResponse getBusinessSearchResult(String id) throws ApiException {
        ApiResponse<BusinessSearchResponse> resp = getBusinessSearchResultWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * returns the a business search result.
     * 
     * @param id transaction record id (required)
     * @return ApiResponse&lt;BusinessSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BusinessSearchResponse> getBusinessSearchResultWithHttpInfo(String id) throws ApiException {
        okhttp3.Call call = getBusinessSearchResultValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<BusinessSearchResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * returns the a business search result. (asynchronously)
     * 
     * @param id transaction record id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getBusinessSearchResultAsync(String id, final ApiCallback<BusinessSearchResponse> callback) throws ApiException {

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

        okhttp3.Call call = getBusinessSearchResultValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BusinessSearchResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param request  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call searchCall(BusinessSearchRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/business/v1/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private okhttp3.Call searchValidateBeforeCall(BusinessSearchRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling search(Async)");
        }
        
        okhttp3.Call call = searchCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Calling this method will perform a business search.
     * 
     * @param request  (required)
     * @return BusinessSearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BusinessSearchResponse search(BusinessSearchRequest request) throws ApiException {
        ApiResponse<BusinessSearchResponse> resp = searchWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Calling this method will perform a business search.
     * 
     * @param request  (required)
     * @return ApiResponse&lt;BusinessSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BusinessSearchResponse> searchWithHttpInfo(BusinessSearchRequest request) throws ApiException {
        okhttp3.Call call = searchValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BusinessSearchResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calling this method will perform a business search. (asynchronously)
     * 
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call searchAsync(BusinessSearchRequest request, final ApiCallback<BusinessSearchResponse> callback) throws ApiException {

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

        okhttp3.Call call = searchValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BusinessSearchResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

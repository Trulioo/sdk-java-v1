package com.trulioo.normalizedapi.api;

import com.trulioo.normalizedapi.ApiCallback;
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.ApiResponse;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.Pair;
import com.trulioo.normalizedapi.ProgressRequestBody;
import com.trulioo.normalizedapi.ProgressResponseBody;
import com.trulioo.normalizedapi.auth.ApiKeyAuth;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.trulioo.normalizedapi.model.TransactionStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionApi {
    private ApiClient apiClient;

    public ConnectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for connectionAsyncCallbackUrl
     * @param transactionStatus transactionStatus (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call connectionAsyncCallbackUrlCall(TransactionStatus transactionStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = transactionStatus;
        
        // create path and map variables
        String localVarPath = "/connection/v1/async-callback";

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call connectionAsyncCallbackUrlValidateBeforeCall(TransactionStatus transactionStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'transactionStatus' is set
        if (transactionStatus == null) {
            throw new ApiException("Missing the required parameter 'transactionStatus' when calling connectionAsyncCallbackUrl(Async)");
        }
        
        
        okhttp3.Call call = connectionAsyncCallbackUrlCall(transactionStatus, progressListener, progressRequestListener);
        return call;

    }

    /**
     * If set, the transaction will run asynchronously and Trulioo will try to update the client with transaction state updates until completed. If callback is not desired but the client wants to initiate an asynchronous transaction, provide https://api.globaldatacompany.com/connection/v1/async-callback as the Callback URL.
     * 
     * @param transactionStatus transactionStatus (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object connectionAsyncCallbackUrl(TransactionStatus transactionStatus) throws ApiException {
        ApiResponse<Object> resp = connectionAsyncCallbackUrlWithHttpInfo(transactionStatus);
        return resp.getData();
    }

    /**
     * If set, the transaction will run asynchronously and Trulioo will try to update the client with transaction state updates until completed. If callback is not desired but the client wants to initiate an asynchronous transaction, provide https://api.globaldatacompany.com/connection/v1/async-callback as the Callback URL.
     * 
     * @param transactionStatus transactionStatus (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> connectionAsyncCallbackUrlWithHttpInfo(TransactionStatus transactionStatus) throws ApiException {
        okhttp3.Call call = connectionAsyncCallbackUrlValidateBeforeCall(transactionStatus, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * If set, the transaction will run asynchronously and Trulioo will try to update the client with transaction state updates until completed. If callback is not desired but the client wants to initiate an asynchronous transaction, provide https://api.globaldatacompany.com/connection/v1/async-callback as the Callback URL. (asynchronously)
     * 
     * @param transactionStatus transactionStatus (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call connectionAsyncCallbackUrlAsync(TransactionStatus transactionStatus, final ApiCallback<Object> callback) throws ApiException {

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

        okhttp3.Call call = connectionAsyncCallbackUrlValidateBeforeCall(transactionStatus, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for sayHello
     * @param name Name to be returned in the response (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call sayHelloCall(String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/connection/v1/sayhello/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call sayHelloValidateBeforeCall(String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling sayHello(Async)");
        }
        
        okhttp3.Call call = sayHelloCall(name, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.
     * 
     * @param name Name to be returned in the response (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String sayHello(String name) throws ApiException {
        ApiResponse<String> resp = sayHelloWithHttpInfo(name);
        return resp.getData();
    }

    /**
     * This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.
     * 
     * @param name Name to be returned in the response (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> sayHelloWithHttpInfo(String name) throws ApiException {
        okhttp3.Call call = sayHelloValidateBeforeCall(name, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system. (asynchronously)
     * 
     * @param name Name to be returned in the response (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call sayHelloAsync(String name, final ApiCallback<String> callback) throws ApiException {

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

        okhttp3.Call call = sayHelloValidateBeforeCall(name, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for testAuthentication
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call testAuthenticationCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/connection/v1/testauthentication";

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

        String[] localVarAuthNames;        
        if (apiClient.getAuthentication("apiKey") != null && ((ApiKeyAuth)apiClient.getAuthentication("apiKey")).getApiKey() != null)
        {
            localVarAuthNames = new String[] { "apiKey" };
        }
        else{
            localVarAuthNames = new String[] { "basic" };
        }

        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call testAuthenticationValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {      
        okhttp3.Call call = testAuthenticationCall(progressListener, progressRequestListener);
        return call;
        
    }

    /**
     * This method enables you to check if your credentials are valid. You will need to use basic authentication to ensure a successful response.
     * 
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String testAuthentication() throws ApiException {
        ApiResponse<String> resp = testAuthenticationWithHttpInfo();
        return resp.getData();
    }

    /**
     * This method enables you to check if your credentials are valid. You will need to use basic authentication to ensure a successful response.
     * 
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> testAuthenticationWithHttpInfo() throws ApiException {
        okhttp3.Call call = testAuthenticationValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This method enables you to check if your credentials are valid. You will need to use basic authentication to ensure a successful response. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call testAuthenticationAsync(final ApiCallback<String> callback) throws ApiException {

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

        okhttp3.Call call = testAuthenticationValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

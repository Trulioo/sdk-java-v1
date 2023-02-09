package com.trulioo.normalizedapi.api;

import com.trulioo.normalizedapi.model.TransactionRecordResult;
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

import com.trulioo.normalizedapi.model.TransactionStatus;
import com.trulioo.normalizedapi.model.VerifyRequest;
import com.trulioo.normalizedapi.model.VerifyResult;
import com.trulioo.normalizedapi.model.VerifyResultPartial;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerificationsApi {
    private ApiClient apiClient;

    public VerificationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VerificationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    /**
     * Build call for documentDownload
     * @param transactionRecordId id of the transactionrecord, this will be a GUID (required)
     * @param fieldName document field name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call documentDownloadCall(String transactionRecordId, String fieldName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/verifications/v1/documentdownload/{transactionRecordId}/{fieldName}"
            .replaceAll("\\{" + "transactionRecordId" + "\\}", apiClient.escapeString(transactionRecordId.toString()))
            .replaceAll("\\{" + "fieldName" + "\\}", apiClient.escapeString(fieldName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private okhttp3.Call documentDownloadValidateBeforeCall(String transactionRecordId, String fieldName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'transactionRecordId' is set
        if (transactionRecordId == null) {
            throw new ApiException("Missing the required parameter 'transactionRecordId' when calling documentDownload(Async)");
        }
        
        // verify the required parameter 'fieldName' is set
        if (fieldName == null) {
            throw new ApiException("Missing the required parameter 'fieldName' when calling documentDownload(Async)");
        }
        
        okhttp3.Call call = documentDownloadCall(transactionRecordId, fieldName, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Download Document
     * 
     * @param transactionRecordId id of the transactionrecord, this will be a GUID (required)
     * @param fieldName document field name (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object documentDownload(String transactionRecordId, String fieldName) throws ApiException {
        ApiResponse<Object> resp = documentDownloadWithHttpInfo(transactionRecordId, fieldName);
        return resp.getData();
    }

    /**
     * Download Document
     * 
     * @param transactionRecordId id of the transactionrecord, this will be a GUID (required)
     * @param fieldName document field name (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> documentDownloadWithHttpInfo(String transactionRecordId, String fieldName) throws ApiException {
        okhttp3.Call call = documentDownloadValidateBeforeCall(transactionRecordId, fieldName, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download Document (asynchronously)
     * 
     * @param transactionRecordId id of the transactionrecord, this will be a GUID (required)
     * @param fieldName document field name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call documentDownloadAsync(String transactionRecordId, String fieldName, final ApiCallback<Object> callback) throws ApiException {

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

        okhttp3.Call call = documentDownloadValidateBeforeCall(transactionRecordId, fieldName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTransactionRecord
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTransactionRecordCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/verifications/v1/transactionrecord/{id}"
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

    private okhttp3.Call getTransactionRecordValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTransactionRecord(Async)");
        }
        
        okhttp3.Call call = getTransactionRecordCall(id, progressListener, progressRequestListener);
        return call;
    }

    /**
     * This method is used to retrieve the request and results of a verification performed using the verify method.  The response for this method includes the same information as verify method&#39;s response, along with data present in the input fields of the verify request.
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @return TransactionRecordResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionRecordResult getTransactionRecord(String id) throws ApiException {
        ApiResponse<TransactionRecordResult> resp = getTransactionRecordWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * This method is used to retrieve the request and results of a verification performed using the verify method.  The response for this method includes the same information as verify method&#39;s response, along with data present in the input fields of the verify request.
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @return ApiResponse&lt;TransactionRecordResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionRecordResult> getTransactionRecordWithHttpInfo(String id) throws ApiException {
        okhttp3.Call call = getTransactionRecordValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<TransactionRecordResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This method is used to retrieve the request and results of a verification performed using the verify method.  The response for this method includes the same information as verify method&#39;s response, along with data present in the input fields of the verify request. (asynchronously)
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTransactionRecordAsync(String id, final ApiCallback<TransactionRecordResult> callback) throws ApiException {

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

        okhttp3.Call call = getTransactionRecordValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionRecordResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTransactionRecordAddress
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTransactionRecordAddressCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/verifications/v1/transactionrecord/{id}/withaddress"
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

    private okhttp3.Call getTransactionRecordAddressValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTransactionRecordAddress(Async)");
        }
        
        okhttp3.Call call = getTransactionRecordAddressCall(id, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing.
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @return TransactionRecordResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionRecordResult getTransactionRecordAddress(String id) throws ApiException {
        ApiResponse<TransactionRecordResult> resp = getTransactionRecordAddressWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing.
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @return ApiResponse&lt;TransactionRecordResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionRecordResult> getTransactionRecordAddressWithHttpInfo(String id) throws ApiException {
        okhttp3.Call call = getTransactionRecordAddressValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<TransactionRecordResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing. (asynchronously)
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTransactionRecordAddressAsync(String id, final ApiCallback<TransactionRecordResult> callback) throws ApiException {

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

        okhttp3.Call call = getTransactionRecordAddressValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionRecordResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTransactionRecordVerbose
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTransactionRecordVerboseCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/verifications/v1/transactionrecord/{id}/verbose"
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

    private okhttp3.Call getTransactionRecordVerboseValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTransactionRecordVerbose(Async)");
        }
        
        okhttp3.Call call = getTransactionRecordVerboseCall(id, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing and watchlist details.
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @return TransactionRecordResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionRecordResult getTransactionRecordVerbose(String id) throws ApiException {
        ApiResponse<TransactionRecordResult> resp = getTransactionRecordVerboseWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing and watchlist details.
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @return ApiResponse&lt;TransactionRecordResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionRecordResult> getTransactionRecordVerboseWithHttpInfo(String id) throws ApiException {
        okhttp3.Call call = getTransactionRecordVerboseValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<TransactionRecordResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing and watchlist details. (asynchronously)
     * 
     * @param id id of the transactionrecord, this will be a GUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTransactionRecordVerboseAsync(String id, final ApiCallback<TransactionRecordResult> callback) throws ApiException {

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

        okhttp3.Call call = getTransactionRecordVerboseValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionRecordResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    /**
     * Build call for getTransactionRecordDocument
     * @param transactionRecordID
     * @param documentField
     * @param progressListener
     * @param progressRequestListener
     * @return Call to execute
     * @throws ApiException
     */
    public okhttp3.Call getTransactionRecordDocumentCall(String transactionRecordID, String documentField, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    	Object localVarPostBody = null;
    	
    	// create path and map variables
    	String localVarPath = "/verifications/v1/transactionrecord/{transactionRecordID}/{documentField}"
                .replaceAll("\\{" + "transactionRecordID" + "\\}", apiClient.escapeString(transactionRecordID.toString()))
                .replaceAll("\\{" + "documentField" + "\\}", apiClient.escapeString(documentField.toString()));
    	
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
    
    private okhttp3.Call getTransactionRecordDocumentValidateBeforeCall(String transactionRecordID, String documentField, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    	// verify the required parameter 'transactionRecordID' is set
        if (transactionRecordID == null) {
            throw new ApiException("Missing the required parameter 'transactionRecordID' when calling getTransactionRecordDocument(Async)");
        }
        
        okhttp3.Call call = getTransactionRecordDocumentCall(transactionRecordID, documentField, progressListener, progressRequestListener);
        return call;
    }
    
    /**
     * This method is used to retrieve the document of a verification performed using the verify method.
     * @param transactionRecordID
     * @param documentField
     * @return string
     * @throws ApiException
     */
    public String getTransactionRecordDocument(String transactionRecordID, String documentField) throws ApiException {
    	ApiResponse<String> resp = getTransactionRecordDocumentWithHttpInfo(transactionRecordID, documentField);
    	return resp.getData();
    }
    
    /**
     * This method is used to retrieve the document of a verification performed using the verify method.
     * The response for this method includes the processed base64 JPEG formatted string
     * @param transactionRecordID
     * @param documentField
     * @return string
     * @throws ApiException
     */
    public ApiResponse<String> getTransactionRecordDocumentWithHttpInfo(String transactionRecordID, String documentField) throws ApiException{
    	okhttp3.Call call = getTransactionRecordDocumentValidateBeforeCall(transactionRecordID, documentField, null, null);
    	Type localVarReturnType = new TypeToken<String>(){}.getType();
    	return apiClient.execute(call, localVarReturnType);
    }
    
    /**
     * This method is used to retrieve the document of a verification performed using the verify method.
     * The response for this method includes the processed base64 JPEG formatted string
     * @param transactionRecordID
     * @param documentField
     * @param callback
     * @return string
     * @throws ApiException
     */
    public okhttp3.Call getTransactionRecordDocumentAsync(String transactionRecordID, String documentField, final ApiCallback<String> callback) throws ApiException {
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
        
        okhttp3.Call call = getTransactionRecordDocumentValidateBeforeCall(transactionRecordID, documentField, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    /**
     * Build call for getTransactionStatus
     * @param id id of the asynchronous transaction, this will be a GUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTransactionStatusCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/verifications/v1/transaction/{id}/status"
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

    private okhttp3.Call getTransactionStatusValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTransactionStatus(Async)");
        }

        okhttp3.Call call = getTransactionStatusCall(id, progressListener, progressRequestListener);
        return call;
    }

    /**
     * This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.
     * 
     * @param id id of the asynchronous transaction, this will be a GUID (required)
     * @return TransactionStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionStatus getTransactionStatus(String id) throws ApiException {
        ApiResponse<TransactionStatus> resp = getTransactionStatusWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.
     * 
     * @param id id of the asynchronous transaction, this will be a GUID (required)
     * @return ApiResponse&lt;TransactionStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionStatus> getTransactionStatusWithHttpInfo(String id) throws ApiException {
        okhttp3.Call call = getTransactionStatusValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<TransactionStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out. (asynchronously)
     * 
     * @param id id of the asynchronous transaction, this will be a GUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTransactionStatusAsync(String id, final ApiCallback<TransactionStatus> callback) throws ApiException {

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

        okhttp3.Call call = getTransactionStatusValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    /**
     * Build call for getPartialResults
     * @param TransactionID (required)
     * @param progressListener
     * @param progressRequestListener
     * @return Call to execute
     * @throws ApiException
     */
    public okhttp3.Call getPartialResultsCall(String transactionID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    	Object localVarPostBody = null;
    	
    	// create path and map variables
        String localVarPath = "/verifications/v1/transaction/{transactionID}/partialresult"
            .replaceAll("\\{" + "transactionID" + "\\}", apiClient.escapeString(transactionID.toString()));
        
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
    
    private okhttp3.Call getPartialResultsValidateBeforeCall(String transactionID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    	// verify the required parameter 'transactionID' is set
        if (transactionID == null) {
            throw new ApiException("Missing the required parameter 'transactionID' when calling getPartialResults(Async)");
        }
        
        okhttp3.Call call = getPartialResultsCall(transactionID, progressListener, progressRequestListener);
        return call;
    }
    
    /**
     * This method is used to retrieve the partial result of an asynchronous transaction.
     * @param transactionID
     * @return VerifyResultPartial
     * @throws ApiException
     */
    public VerifyResultPartial getPartialResults(String transactionID) throws ApiException {
    	ApiResponse<VerifyResultPartial> resp = getPartialResultsWithHttpInfo(transactionID);
    	return resp.getData();
    }
    
    /**
     * This method is used to retrieve the partial result of an asynchronous transaction.
     * @param transactionID
     * @return VerifyResultPartial
     * @throws ApiException
     */
    public ApiResponse<VerifyResultPartial> getPartialResultsWithHttpInfo(String transactionID) throws ApiException {
    	okhttp3.Call call = getPartialResultsValidateBeforeCall(transactionID, null, null);
    	Type localVarReturnType = new TypeToken<VerifyResultPartial>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    /**
     * This method is used to retrieve the partial result of an asynchronous transaction.
     * @param id
     * @param callback
     * @return VerifyResultPartial
     * @throws ApiException
     */
    public okhttp3.Call getPartialResultsAsync(String id, final ApiCallback<VerifyResultPartial> callback) throws ApiException {
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
        
        okhttp3.Call call = getPartialResultsValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifyResultPartial>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    /**
     * Build call for verify
     * @param request  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call verifyCall(VerifyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/verifications/v1/verify";

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

    private okhttp3.Call verifyValidateBeforeCall(VerifyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling verify(Async)");
        }

        okhttp3.Call call = verifyCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get  additional address information in the result.  You can query configuration to get what fields are available to you in each each country.  It is also possible to get sample requests from the customer portal.
     * 
     * @param request  (required)
     * @return VerifyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifyResult verify(VerifyRequest request) throws ApiException {
        ApiResponse<VerifyResult> resp = verifyWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get  additional address information in the result.  You can query configuration to get what fields are available to you in each each country.  It is also possible to get sample requests from the customer portal.
     * 
     * @param request  (required)
     * @return ApiResponse&lt;VerifyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifyResult> verifyWithHttpInfo(VerifyRequest request) throws ApiException {
        okhttp3.Call call = verifyValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<VerifyResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get  additional address information in the result.  You can query configuration to get what fields are available to you in each each country.  It is also possible to get sample requests from the customer portal. (asynchronously)
     * 
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call verifyAsync(VerifyRequest request, final ApiCallback<VerifyResult> callback) throws ApiException {

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

        okhttp3.Call call = verifyValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifyResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

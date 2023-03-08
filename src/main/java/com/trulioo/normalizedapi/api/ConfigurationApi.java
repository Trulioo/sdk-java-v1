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

import com.trulioo.normalizedapi.model.BusinessRegistrationNumber;
import com.trulioo.normalizedapi.model.Consent;
import com.trulioo.normalizedapi.model.CountrySubdivision;
import com.trulioo.normalizedapi.model.NormalizedDatasourceGroupCountry;
import com.trulioo.normalizedapi.model.TestEntityDataFields;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigurationApi {
    private ApiClient apiClient;

    public ConfigurationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigurationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getConsents
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getConsentsCall(String countryCode, String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/v1/consents/{configurationName}/{countryCode}"
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()))
            .replaceAll("\\{" + "configurationName" + "\\}", apiClient.escapeString(configurationName.toString()));

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

    private okhttp3.Call getConsentsValidateBeforeCall(String countryCode, String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getConsents(Async)");
        }
        
        // verify the required parameter 'configurationName' is set
        if (configurationName == null) {
            throw new ApiException("Missing the required parameter 'configurationName' when calling getConsents(Async)");
        }
        
        okhttp3.Call call = getConsentsCall(countryCode, configurationName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This method retrieves the consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of strings that Verify method&#39;s ConsentForDataSources field expects to perform a verification using those data sources.   A failure to provide an element from the string collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getConsents(String countryCode, String configurationName) throws ApiException {
        ApiResponse<List<String>> resp = getConsentsWithHttpInfo(countryCode, configurationName);
        return resp.getData();
    }

    /**
     * This method retrieves the consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of strings that Verify method&#39;s ConsentForDataSources field expects to perform a verification using those data sources.   A failure to provide an element from the string collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getConsentsWithHttpInfo(String countryCode, String configurationName) throws ApiException {
        okhttp3.Call call = getConsentsValidateBeforeCall(countryCode, configurationName, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This method retrieves the consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of strings that Verify method&#39;s ConsentForDataSources field expects to perform a verification using those data sources.   A failure to provide an element from the string collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error. (asynchronously)
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getConsentsAsync(String countryCode, String configurationName, final ApiCallback<List<String>> callback) throws ApiException {

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

        okhttp3.Call call = getConsentsValidateBeforeCall(countryCode, configurationName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCountryCodes
     * @param configurationName Identity Verification (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getCountryCodesCall(String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/v1/countrycodes/{configurationName}"
            .replaceAll("\\{" + "configurationName" + "\\}", apiClient.escapeString(configurationName.toString()));

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

    private okhttp3.Call getCountryCodesValidateBeforeCall(String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'configurationName' is set
        if (configurationName == null) {
            throw new ApiException("Missing the required parameter 'configurationName' when calling getCountryCodes(Async)");
        }
        
        okhttp3.Call call = getCountryCodesCall(configurationName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This method retrieves all the countries that are available to perform a verification.
     * 
     * @param configurationName Identity Verification (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getCountryCodes(String configurationName) throws ApiException {
        ApiResponse<List<String>> resp = getCountryCodesWithHttpInfo(configurationName);
        return resp.getData();
    }

    /**
     * This method retrieves all the countries that are available to perform a verification.
     * 
     * @param configurationName Identity Verification (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getCountryCodesWithHttpInfo(String configurationName) throws ApiException {
        okhttp3.Call call = getCountryCodesValidateBeforeCall(configurationName, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This method retrieves all the countries that are available to perform a verification. (asynchronously)
     * 
     * @param configurationName Identity Verification (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getCountryCodesAsync(String configurationName, final ApiCallback<List<String>> callback) throws ApiException {

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

        okhttp3.Call call = getCountryCodesValidateBeforeCall(configurationName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCountrySubdivisions
     * @param countryCode Country alpha2 code, get the the call to countrycodes (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getCountrySubdivisionsCall(String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/v1/countrysubdivisions/{countryCode}"
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()));

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

    private okhttp3.Call getCountrySubdivisionsValidateBeforeCall(String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getCountrySubdivisions(Async)");
        }
        
        okhttp3.Call call = getCountrySubdivisionsCall(countryCode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the provinces states or other subdivisions for a country, mostly matches ISO 3166-2
     * 
     * @param countryCode Country alpha2 code, get the the call to countrycodes (required)
     * @return List&lt;CountrySubdivision&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CountrySubdivision> getCountrySubdivisions(String countryCode) throws ApiException {
        ApiResponse<List<CountrySubdivision>> resp = getCountrySubdivisionsWithHttpInfo(countryCode);
        return resp.getData();
    }

    /**
     * Gets the provinces states or other subdivisions for a country, mostly matches ISO 3166-2
     * 
     * @param countryCode Country alpha2 code, get the the call to countrycodes (required)
     * @return ApiResponse&lt;List&lt;CountrySubdivision&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CountrySubdivision>> getCountrySubdivisionsWithHttpInfo(String countryCode) throws ApiException {
        okhttp3.Call call = getCountrySubdivisionsValidateBeforeCall(countryCode, null, null);
        Type localVarReturnType = new TypeToken<List<CountrySubdivision>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the provinces states or other subdivisions for a country, mostly matches ISO 3166-2 (asynchronously)
     * 
     * @param countryCode Country alpha2 code, get the the call to countrycodes (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getCountrySubdivisionsAsync(String countryCode, final ApiCallback<List<CountrySubdivision>> callback) throws ApiException {

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

        okhttp3.Call call = getCountrySubdivisionsValidateBeforeCall(countryCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CountrySubdivision>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasources
     * @param configurationName Identity Verification (required)
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDatasourcesCall(String configurationName, String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/v1/datasources/{configurationName}/{countryCode}"
            .replaceAll("\\{" + "configurationName" + "\\}", apiClient.escapeString(configurationName.toString()))
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()));

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

    private okhttp3.Call getDatasourcesValidateBeforeCall(String configurationName, String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'configurationName' is set
        if (configurationName == null) {
            throw new ApiException("Missing the required parameter 'configurationName' when calling getDatasources(Async)");
        }
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getDatasources(Async)");
        }
        
        okhttp3.Call call = getDatasourcesCall(configurationName, countryCode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets datasource groups configured for your product and country.
     * 
     * @param configurationName Identity Verification (required)
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @return List&lt;NormalizedDatasourceGroupCountry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NormalizedDatasourceGroupCountry> getDatasources(String configurationName, String countryCode) throws ApiException {
        ApiResponse<List<NormalizedDatasourceGroupCountry>> resp = getDatasourcesWithHttpInfo(configurationName, countryCode);
        return resp.getData();
    }

    /**
     * Gets datasource groups configured for your product and country.
     * 
     * @param configurationName Identity Verification (required)
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @return ApiResponse&lt;List&lt;NormalizedDatasourceGroupCountry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NormalizedDatasourceGroupCountry>> getDatasourcesWithHttpInfo(String configurationName, String countryCode) throws ApiException {
        okhttp3.Call call = getDatasourcesValidateBeforeCall(configurationName, countryCode, null, null);
        Type localVarReturnType = new TypeToken<List<NormalizedDatasourceGroupCountry>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets datasource groups configured for your product and country. (asynchronously)
     * 
     * @param configurationName Identity Verification (required)
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDatasourcesAsync(String configurationName, String countryCode, final ApiCallback<List<NormalizedDatasourceGroupCountry>> callback) throws ApiException {

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

        okhttp3.Call call = getDatasourcesValidateBeforeCall(configurationName, countryCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NormalizedDatasourceGroupCountry>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDetailedConsents
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDetailedConsentsCall(String countryCode, String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/v1/detailedConsents/{configurationName}/{countryCode}"
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()))
            .replaceAll("\\{" + "configurationName" + "\\}", apiClient.escapeString(configurationName.toString()));

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

    private okhttp3.Call getDetailedConsentsValidateBeforeCall(String countryCode, String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getDetailedConsents(Async)");
        }
        
        // verify the required parameter 'configurationName' is set
        if (configurationName == null) {
            throw new ApiException("Missing the required parameter 'configurationName' when calling getDetailedConsents(Async)");
        }
        
        okhttp3.Call call = getDetailedConsentsCall(countryCode, configurationName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This method retrieves details about consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of objects.  Each object contains the Name of the data source, Text outlining what the user is consenting to, and optionally a Url where the user can find more information about how their data will be used.    Failure to provide a Name from the object collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @return List&lt;Consent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Consent> getDetailedConsents(String countryCode, String configurationName) throws ApiException {
        ApiResponse<List<Consent>> resp = getDetailedConsentsWithHttpInfo(countryCode, configurationName);
        return resp.getData();
    }

    /**
     * This method retrieves details about consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of objects.  Each object contains the Name of the data source, Text outlining what the user is consenting to, and optionally a Url where the user can find more information about how their data will be used.    Failure to provide a Name from the object collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @return ApiResponse&lt;List&lt;Consent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Consent>> getDetailedConsentsWithHttpInfo(String countryCode, String configurationName) throws ApiException {
        okhttp3.Call call = getDetailedConsentsValidateBeforeCall(countryCode, configurationName, null, null);
        Type localVarReturnType = new TypeToken<List<Consent>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This method retrieves details about consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of objects.  Each object contains the Name of the data source, Text outlining what the user is consenting to, and optionally a Url where the user can find more information about how their data will be used.    Failure to provide a Name from the object collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error. (asynchronously)
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDetailedConsentsAsync(String countryCode, String configurationName, final ApiCallback<List<Consent>> callback) throws ApiException {

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

        okhttp3.Call call = getDetailedConsentsValidateBeforeCall(countryCode, configurationName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Consent>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentTypes
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDocumentTypesCall(String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/v1/documentTypes/{countryCode}"
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()));

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

    private okhttp3.Call getDocumentTypesValidateBeforeCall(String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getDocumentTypes(Async)");
        }

        okhttp3.Call call = getDocumentTypesCall(countryCode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the document types available for a country.
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @return Map&lt;String, List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, List<String>> getDocumentTypes(String countryCode) throws ApiException {
        ApiResponse<Map<String, List<String>>> resp = getDocumentTypesWithHttpInfo(countryCode);
        return resp.getData();
    }

    /**
     * Gets the document types available for a country.
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @return ApiResponse&lt;Map&lt;String, List&lt;String&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, List<String>>> getDocumentTypesWithHttpInfo(String countryCode) throws ApiException {
        okhttp3.Call call = getDocumentTypesValidateBeforeCall(countryCode, null, null);
        Type localVarReturnType = new TypeToken<Map<String, List<String>>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the document types available for a country. (asynchronously)
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDocumentTypesAsync(String countryCode, final ApiCallback<Map<String, List<String>>> callback) throws ApiException {

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

        okhttp3.Call call = getDocumentTypesValidateBeforeCall(countryCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, List<String>>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFields
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFieldsCall(String countryCode, String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/v1/fields/{configurationName}/{countryCode}"
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()))
            .replaceAll("\\{" + "configurationName" + "\\}", apiClient.escapeString(configurationName.toString()));

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

    private okhttp3.Call getFieldsValidateBeforeCall(String countryCode, String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getFields(Async)");
        }
        
        // verify the required parameter 'configurationName' is set
        if (configurationName == null) {
            throw new ApiException("Missing the required parameter 'configurationName' when calling getFields(Async)");
        }
        
        okhttp3.Call call = getFieldsCall(countryCode, configurationName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generates json schema for the API, the schema is dynamic based on the country and configuration you are using.  http://json-schema.org/documentation.html
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object getFields(String countryCode, String configurationName) throws ApiException {
        ApiResponse<Object> resp = getFieldsWithHttpInfo(countryCode, configurationName);
        return resp.getData();
    }

    /**
     * Generates json schema for the API, the schema is dynamic based on the country and configuration you are using.  http://json-schema.org/documentation.html
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> getFieldsWithHttpInfo(String countryCode, String configurationName) throws ApiException {
        okhttp3.Call call = getFieldsValidateBeforeCall(countryCode, configurationName, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generates json schema for the API, the schema is dynamic based on the country and configuration you are using.  http://json-schema.org/documentation.html (asynchronously)
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFieldsAsync(String countryCode, String configurationName, final ApiCallback<Object> callback) throws ApiException {

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

        okhttp3.Call call = getFieldsValidateBeforeCall(countryCode, configurationName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRecommendedFields
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getRecommendedFieldsCall(String countryCode, String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/configuration/v1/recommendedfields/{configurationName}/{countryCode}"
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()))
            .replaceAll("\\{" + "configurationName" + "\\}", apiClient.escapeString(configurationName.toString()));

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

    private okhttp3.Call getRecommendedFieldsValidateBeforeCall(String countryCode, String configurationName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getRecommendedFields(Async)");
        }
        
        // verify the required parameter 'configurationName' is set
        if (configurationName == null) {
            throw new ApiException("Missing the required parameter 'configurationName' when calling getRecommendedFields(Async)");
        }
        
        okhttp3.Call call = getRecommendedFieldsCall(countryCode, configurationName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generates json schema for the API, the schema is dynamic based on the recommendedFields country and account you are using.  http://json-schema.org/documentation.html
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object getRecommendedFields(String countryCode, String configurationName) throws ApiException {
        ApiResponse<Object> resp = getRecommendedFieldsWithHttpInfo(countryCode, configurationName);
        return resp.getData();
    }

    /**
     * Generates json schema for the API, the schema is dynamic based on the recommendedFields country and account you are using.  http://json-schema.org/documentation.html
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> getRecommendedFieldsWithHttpInfo(String countryCode, String configurationName) throws ApiException {
        okhttp3.Call call = getRecommendedFieldsValidateBeforeCall(countryCode, configurationName, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generates json schema for the API, the schema is dynamic based on the recommendedFields country and account you are using.  http://json-schema.org/documentation.html (asynchronously)
     * 
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param configurationName Identity Verification (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getRecommendedFieldsAsync(String countryCode, String configurationName, final ApiCallback<Object> callback) throws ApiException {
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

        okhttp3.Call call = getRecommendedFieldsValidateBeforeCall(countryCode, configurationName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTestEntities
     * @param configurationName Identity Verification (required)
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTestEntitiesCall(String configurationName, String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/configuration/v1/testentities/{configurationName}/{countryCode}"
            .replaceAll("\\{" + "configurationName" + "\\}", apiClient.escapeString(configurationName.toString()))
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()));

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

    private okhttp3.Call getTestEntitiesValidateBeforeCall(String configurationName, String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'configurationName' is set
        if (configurationName == null) {
            throw new ApiException("Missing the required parameter 'configurationName' when calling getTestEntities(Async)");
        }
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getTestEntities(Async)");
        }
        
        okhttp3.Call call = getTestEntitiesCall(configurationName, countryCode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the test entities configured for your product and country.
     * 
     * @param configurationName Identity Verification (required)
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @return List&lt;DataFields&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TestEntityDataFields> getTestEntities(String configurationName, String countryCode) throws ApiException {
        ApiResponse<List<TestEntityDataFields>> resp = getTestEntitiesWithHttpInfo(configurationName, countryCode);
        return resp.getData();
    }

    /**
     * Gets the test entities configured for your product and country.
     * 
     * @param configurationName Identity Verification (required)
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @return ApiResponse&lt;List&lt;DataFields&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TestEntityDataFields>> getTestEntitiesWithHttpInfo(String configurationName, String countryCode) throws ApiException {
        okhttp3.Call call = getTestEntitiesValidateBeforeCall(configurationName, countryCode, null, null);
        Type localVarReturnType = new TypeToken<List<TestEntityDataFields>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the test entities configured for your product and country. (asynchronously)
     * 
     * @param configurationName Identity Verification (required)
     * @param countryCode Call CountryCodes to get the countries available to you. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTestEntitiesAsync(String configurationName, String countryCode, final ApiCallback<List<TestEntityDataFields>> callback) throws ApiException {

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

        okhttp3.Call call = getTestEntitiesValidateBeforeCall(configurationName, countryCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TestEntityDataFields>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public okhttp3.Call getBusinessRegistrationNumbersCall(String countryCode, String jurisdictionCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException { 
    	Object localVarPostBody = null;
    	Boolean useJurisdictionCode = jurisdictionCode != null;
        // create path and map variables
    	String localVarPath = null;
    	if(useJurisdictionCode) {
    		localVarPath = "/configuration/v1/businessregistrationnumbers/{countryCode}/{jurisdictionCode}"
    				.replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()))
    				.replaceAll("\\{" + "jurisdictionCode" + "\\}", apiClient.escapeString(jurisdictionCode.toString()));
    	}
    	else {
    		localVarPath = "/configuration/v1/businessregistrationnumbers/{countryCode}"
    				.replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()));
    	}
    	
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = { };
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
    
    private okhttp3.Call getBusinessRegistrationNumbersBeforeCall(String countryCode, String jurisdictionCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    	// verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getBusinessRegistrationNumbers(Async)");
        }
        
        okhttp3.Call call = getBusinessRegistrationNumbersCall(countryCode, jurisdictionCode, progressListener, progressRequestListener);
        return call;
    }
    
    /**
     * Build call to get the currently configured business registration numbers, for country and an optionally supplied jurisdiction
     * @param countryCode (required)
     * @param jurisdictionCode
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public List<BusinessRegistrationNumber> getBusinessRegistrationNumbers(String countryCode, String jurisdictionCode) throws ApiException {
    	ApiResponse<List<BusinessRegistrationNumber>> response = getBusinessRegistrationNumbersWithHttpInfo(countryCode, jurisdictionCode);
    	return response.getData();
    }
    
    public List<BusinessRegistrationNumber> getBusinessRegistrationNumbers(String countryCode) throws ApiException {
    	ApiResponse<List<BusinessRegistrationNumber>> response = getBusinessRegistrationNumbersWithHttpInfo(countryCode, null);
    	return response.getData();
    }
    
    public ApiResponse<List<BusinessRegistrationNumber>> getBusinessRegistrationNumbersWithHttpInfo(String countryCode, String jurisdictionCode) throws ApiException {
    	okhttp3.Call call = getBusinessRegistrationNumbersBeforeCall(countryCode, jurisdictionCode, null, null);
    	Type localVarReturnType = new TypeToken<List<BusinessRegistrationNumber>>(){}.getType();
    	return apiClient.execute(call, localVarReturnType);
    }
    
    /**
     * Build call to get the currently configured business registration numbers, for country and an optionally supplied jurisdiction
     * @param countryCode (required)
     * @param jurisdictionCode
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getBusinessRegistrationNumbersAsync(String countryCode, String jurisdictionCode, final ApiCallback<List<BusinessRegistrationNumber>> callback) throws ApiException {
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
        
        okhttp3.Call call = getBusinessRegistrationNumbersBeforeCall(countryCode, jurisdictionCode, progressListener, progressRequestListener);
    	Type localVarReturnType = new TypeToken<List<BusinessRegistrationNumber>>(){}.getType();
    	apiClient.executeAsync(call, localVarReturnType, callback);
    	
        return call;
    }
    
    /**
     * Build call to get the currently configured business registration numbers, for country and an optionally supplied jurisdiction
     * @param countryCode (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getBusinessRegistrationNumbersAsync(String countryCode, final ApiCallback<List<BusinessRegistrationNumber>> callback) throws ApiException {
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
        
        okhttp3.Call call = getBusinessRegistrationNumbersBeforeCall(countryCode, null, progressListener, progressRequestListener);
    	Type localVarReturnType = new TypeToken<List<BusinessRegistrationNumber>>(){}.getType();
    	apiClient.executeAsync(call, localVarReturnType, callback);
    	
        return call;
    }
    
    public okhttp3.Call getCountryJOICall(String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException { 
    	Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/configuration/v1/countryJOI/{countryCode}"
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()));
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
    
        
    private okhttp3.Call getCountryJOIBeforeCall(String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling getCountryJOI(Async)");
        }
        
        okhttp3.Call call = getCountryJOICall(countryCode, progressListener, progressRequestListener);
        return call;
    }
    
    /**
     * Build call to get the jurisdictions of incorporation for a country
     * @param countryCode (required)
     * @return List&lt;CountrySubdivision&gt;
     * @throws ApiException
     */
    public List<CountrySubdivision> getCountryJOI(String countryCode) throws ApiException { 
    	ApiResponse<List<CountrySubdivision>> response = getCountryJOIWithHttpInfo(countryCode);
    	return response.getData();
    }
    
    public ApiResponse<List<CountrySubdivision>> getCountryJOIWithHttpInfo(String countryCode) throws ApiException {
    	okhttp3.Call call = getCountryJOIBeforeCall(countryCode, null, null);
    	Type localVarReturnType = new TypeToken<List<CountrySubdivision>>(){}.getType();
    	return apiClient.execute(call, localVarReturnType);
    }
    
    /**
     * Build call to get the jurisdictions of incorporation for a country
     * @param countryCode (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     */
    public okhttp3.Call getCountryJOIAsync(String countryCode, final ApiCallback<List<CountrySubdivision>> callback) throws ApiException {
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
        
        okhttp3.Call call = getCountryJOIBeforeCall(countryCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CountrySubdivision>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        
        return call;
    }
}

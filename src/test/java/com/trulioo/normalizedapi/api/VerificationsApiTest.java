/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.api;

import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.model.TransactionRecordResult;
import com.trulioo.normalizedapi.model.VerifyRequest;
import com.trulioo.normalizedapi.model.VerifyResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerificationsApi
 */
@Ignore
public class VerificationsApiTest {

    private final VerificationsApi api = new VerificationsApi();

    
    /**
     * This method is used to retrieve the request and results of a verification performed using the verify method.   The response for this method includes the same information as verify method&#39;s response, along with data present in the input fields of the verify request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionRecordTest() throws ApiException {
        String id = null;
        TransactionRecordResult response = api.getTransactionRecord(id);

        // TODO: test validations
    }
    
    /**
     * Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionRecordAddressTest() throws ApiException {
        String id = null;
        TransactionRecordResult response = api.getTransactionRecordAddress(id);

        // TODO: test validations
    }
    
    /**
     * Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing and watchlist details.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionRecordVerboseTest() throws ApiException {
        String id = null;
        TransactionRecordResult response = api.getTransactionRecordVerbose(id);

        // TODO: test validations
    }
    
    /**
     * Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get  additional address information in the result.  You can query configuration to get what fields are available to you in each each country.  It is also possible to get sample requests from the customer portal.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyTest() throws ApiException {
        VerifyRequest request = null;
        VerifyResult response = api.verify(request);

        // TODO: test validations
    }
    
}

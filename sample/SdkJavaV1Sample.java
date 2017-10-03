package SdkJavaV1Sample;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;

import com.trulioo.normalizedapi.*;
import com.trulioo.normalizedapi.api.*;
import com.trulioo.normalizedapi.model.*;


public class SdkJavaV1Sample {
    
    public static void main(String[] args) throws ApiException {
        
        //Set client here
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername("UserName");
        apiClient.setPassword("Password");
        //apiClient.setVerifyingSsl(false); Ignore ssl error if needed
        //apiClient.setConnectTimeout(60000); Customise timeout if needed
        
        //ConnectionApi
        ConnectionApi connectionClient = new ConnectionApi(apiClient);
        
        //sayHello
        String hello = connectionClient.sayHello("sayHello");
        System.out.println(hello);
        
        //sayHelloAsync
        connectionClient.sayHelloAsync("sayHello async", new ApiCallback<String>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, e);
            }
            
            @Override
            public void onSuccess(String result, int statusCode, Map<String, List<String>> responseHeaders) {
                System.out.println(result);
            }
            
            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //testAuthentication
        String testResult = connectionClient.testAuthentication();
        System.out.println(testResult);
        
        //testAuthenticationAsync
        connectionClient.testAuthenticationAsync(new ApiCallback<String>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
            }
            
            @Override
            public void onSuccess(String t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }
            
            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        
		
        //VerificationsApi
        VerificationsApi verificationClient = new VerificationsApi(apiClient);
        
        VerifyRequest request = new VerifyRequest()
                .acceptTruliooTermsAndConditions(Boolean.TRUE)
                .demo(false)
                .configurationName("Identity Verification")
                .countryCode("CA")
                .consentForDataSources(new ArrayList<>())
                .dataFields(new DataFields()
                        .personInfo(new PersonInfo()
                                .firstGivenName("Kaufman")
                                .firstSurName("Murray")
                                .yearOfBirth(1969)
                                .monthOfBirth(7)
                                .dayOfBirth(8))
                        .location(new Location()
                                .postalCode("V5Y3K8")
                                .buildingNumber("123")
                                .streetName("W 1st")
                                .streetType("Ave")
                                .stateProvinceCode("BC")
                                .city("Vancouver"))
                        .nationalIds(Arrays.asList(new NationalId().number("540223144").type("SocialService")))
                        .document(new Document()
                                .documentBackImage("test image back".getBytes())
                                .documentFrontImage("test image front".getBytes())
                                .documentType("DrivingLicence"))
                );
        
        //verify
        VerifyResult result = verificationClient.verify(request);
        System.out.println(result);
        
        //verifyAsync
        verificationClient.verifyAsync(request, new ApiCallback<VerifyResult>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
            }
            
            @Override
            public void onSuccess(VerifyResult t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }
            
            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //getTransactionRecord
        TransactionRecordResult recordResult = verificationClient.getTransactionRecord("8dfffd53-405a-46e7-88e2-3c51e5c80cc5");
        System.out.println(recordResult);
        
        //getTransactionRecordAsync
        verificationClient.getTransactionRecordAsync("8dfffd53-405a-46e7-88e2-3c51e5c80cc5", new ApiCallback<TransactionRecordResult>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
            }
            
            @Override
            public void onSuccess(TransactionRecordResult t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }
            
            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        //ConfigurationApi
        ConfigurationApi configurationClient = new ConfigurationApi(apiClient);
        
        //getConsents
        List<String> r = configurationClient.getConsents("US", "Identity Verification");
        System.out.println(r);
        
        //getConsentsAsync
        configurationClient.getConsentsAsync("US", "Identity Verification", new ApiCallback<List<String>>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
            }
            
            @Override
            public void onSuccess(List<String> t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }
            
            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //getCountryCodes
        List<String> countryCodes = configurationClient.getCountryCodes("Identity Verification");
        System.out.println(countryCodes);
        
        //getCountryCodesAsync
        configurationClient.getCountryCodesAsync("Identity Verification", new ApiCallback<List<String>>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
            }
            
            @Override
            public void onSuccess(List<String> t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }
            
            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //getCountrySubdivisions
        List<CountrySubdivision> countrySubdivisions = configurationClient.getCountrySubdivisions("AU");
        System.out.println(countrySubdivisions);
        
        configurationClient.getCountrySubdivisionsAsync("AU", new ApiCallback<List<CountrySubdivision>>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
            }
            
            @Override
            public void onSuccess(List<CountrySubdivision> t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }
            
            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //getFields
        Object o = configurationClient.getFields("US", "Identity Verification");
        System.out.println(o);
        
        //getFieldsAsync
        configurationClient.getFieldsAsync("US", "Identity Verification", new ApiCallback<Object>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
            }
            
            @Override
            public void onSuccess(Object t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }
            
            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //getDocumentTypes
        Map<String, List<String>> documentTypes = configurationClient.getDocumentTypes("US");
        System.out.println(documentTypes);
        
        //getDocumentTypesAsync
        configurationClient.getDocumentTypesAsync("US", new ApiCallback<Map<String, List<String>>>() {
            @Override
            public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
                Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
            }
            
            @Override
            public void onSuccess(Map<String, List<String>> t, int i, Map<String, List<String>> map) {
                System.out.println(t);
            }
            
            @Override
            public void onUploadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void onDownloadProgress(long l, long l1, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}

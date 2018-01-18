/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.0.1-alpha
 * Contact: info@bluerain.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.id4i.api;

import de.id4i.ApiException;
import de.id4i.api.model.ApiError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImagesApi
 */
@Ignore
public class ImagesApiTest {

    private final ImagesApi api = new ImagesApi();

    
    /**
     * Resolve image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resolveImageUsingGETTest() throws ApiException {
        String imageID = null;
        String authorization = null;
        String acceptLanguage = null;
        byte[] response = api.resolveImageUsingGET(imageID, authorization, acceptLanguage);

        // TODO: test validations
    }
    
}

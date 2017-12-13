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
import de.id4i.api.model.CreateLabelledCollectionRequest;
import de.id4i.api.model.CreateLogisticCollectionRequest;
import de.id4i.api.model.CreateRoutingCollectionRequest;
import de.id4i.api.model.GuidCollection;
import de.id4i.api.model.Id4n;
import de.id4i.api.model.ListOfId4ns;
import de.id4i.api.model.PaginatedGuidCollection;
import de.id4i.api.model.PaginatedGuidResponse;
import de.id4i.api.model.ResponseEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectionsApi
 */
@Ignore
public class CollectionsApiTest {

    private final CollectionsApi api = new CollectionsApi();

    
    /**
     * Add element to collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addElementToCollectionTest() throws ApiException {
        String id4n = null;
        String elementGuid = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.addElementToCollection(id4n, elementGuid, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Add element to labelled collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addElementToLabelledCollectionTest() throws ApiException {
        String collectionId4n = null;
        String elementGuid = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.addElementToLabelledCollection(collectionId4n, elementGuid, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Add element to logistic collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addElementToLogisticCollectionTest() throws ApiException {
        String collectionId4n = null;
        String guid = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.addElementToLogisticCollection(collectionId4n, guid, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Add element to routing collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addElementToRoutingCollectionTest() throws ApiException {
        String collectionId4n = null;
        String guid = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.addElementToRoutingCollection(collectionId4n, guid, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Add elements to collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addElementsToCollectionTest() throws ApiException {
        String id4n = null;
        ListOfId4ns listOfGuids = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.addElementsToCollection(id4n, listOfGuids, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Add elements to labelled collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addElementsToLabelledCollectionTest() throws ApiException {
        String collectionId4n = null;
        ListOfId4ns listOfGuids = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.addElementsToLabelledCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Add elements to logistic collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addElementsToLogisticCollectionTest() throws ApiException {
        String collectionId4n = null;
        ListOfId4ns listOfGuids = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.addElementsToLogisticCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Add element to routing collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addElementsToRoutingCollectionTest() throws ApiException {
        String collectionId4n = null;
        ListOfId4ns listOfGuids = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.addElementsToRoutingCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Create labelled collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLabelledCollectionTest() throws ApiException {
        CreateLabelledCollectionRequest createInfo = null;
        String authorization = null;
        String acceptLanguage = null;
        Id4n response = api.createLabelledCollection(createInfo, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Create logistic collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLogisticCollectionTest() throws ApiException {
        CreateLogisticCollectionRequest createInfo = null;
        String authorization = null;
        String acceptLanguage = null;
        Id4n response = api.createLogisticCollection(createInfo, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Create routing collecton
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoutingCollectionTest() throws ApiException {
        CreateRoutingCollectionRequest createInfo = null;
        String authorization = null;
        String acceptLanguage = null;
        Id4n response = api.createRoutingCollection(createInfo, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Delete collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.deleteCollection(id4n, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Delete labelled collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLabelledCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.deleteLabelledCollection(id4n, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Delete logistic collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLogisticCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        ResponseEntity response = api.deleteLogisticCollection(id4n, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Delete routing collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoutingCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.deleteRoutingCollection(id4n, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Find collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        GuidCollection response = api.findCollection(id4n, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Find labelled collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findLabelledCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        GuidCollection response = api.findLabelledCollection(id4n, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Find logistic collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findLogisticCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        GuidCollection response = api.findLogisticCollection(id4n, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Find routing collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findRoutingCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        GuidCollection response = api.findRoutingCollection(id4n, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Get collections of organization
     *
     * Retrieving all collections of an organization in a paginated manner.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCollectionsOfOrganizationTest() throws ApiException {
        Long organizationId = null;
        String authorization = null;
        String acceptLanguage = null;
        Integer offset = null;
        Integer limit = null;
        String type = null;
        String label = null;
        PaginatedGuidCollection response = api.getAllCollectionsOfOrganization(organizationId, authorization, acceptLanguage, offset, limit, type, label);

        // TODO: test validations
    }
    
    /**
     * List contents of the collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listElementsOfCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        Integer offset = null;
        Integer limit = null;
        PaginatedGuidResponse response = api.listElementsOfCollection(id4n, authorization, acceptLanguage, offset, limit);

        // TODO: test validations
    }
    
    /**
     * List contents of the collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listElementsOfLabelledCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        Integer offset = null;
        Integer limit = null;
        PaginatedGuidResponse response = api.listElementsOfLabelledCollection(id4n, authorization, acceptLanguage, offset, limit);

        // TODO: test validations
    }
    
    /**
     * List contents of the collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listElementsOfLogisticCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        Integer offset = null;
        Integer limit = null;
        PaginatedGuidResponse response = api.listElementsOfLogisticCollection(id4n, authorization, acceptLanguage, offset, limit);

        // TODO: test validations
    }
    
    /**
     * List contents of the collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listElementsOfRoutingCollectionTest() throws ApiException {
        String id4n = null;
        String authorization = null;
        String acceptLanguage = null;
        Integer offset = null;
        Integer limit = null;
        PaginatedGuidResponse response = api.listElementsOfRoutingCollection(id4n, authorization, acceptLanguage, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Remove element from collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeElementFromCollectionTest() throws ApiException {
        String id4n = null;
        String elementGuid = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.removeElementFromCollection(id4n, elementGuid, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Remove element from labelled collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeElementFromLabelledCollectionTest() throws ApiException {
        String collectionId4n = null;
        String elementGuid = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.removeElementFromLabelledCollection(collectionId4n, elementGuid, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Remove element from logistic collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeElementFromLogisticCollectionTest() throws ApiException {
        String collectionId4n = null;
        String guid = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.removeElementFromLogisticCollection(collectionId4n, guid, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Remove element from routing collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeElementFromRoutingCollectionTest() throws ApiException {
        String collectionId4n = null;
        String guid = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.removeElementFromRoutingCollection(collectionId4n, guid, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Remove elements from collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeElementsFromCollectionTest() throws ApiException {
        String id4n = null;
        ListOfId4ns listOfGuids = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.removeElementsFromCollection(id4n, listOfGuids, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Remove elements from labelled collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeElementsFromLabelledCollectionTest() throws ApiException {
        String collectionId4n = null;
        ListOfId4ns listOfGuids = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.removeElementsFromLabelledCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Remove elements from logistic collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeElementsFromLogisticCollectionTest() throws ApiException {
        String collectionId4n = null;
        ListOfId4ns listofGuids = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.removeElementsFromLogisticCollection(collectionId4n, listofGuids, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Remove elements from routing collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeElementsFromRoutingCollectionTest() throws ApiException {
        String collectionId4n = null;
        ListOfId4ns listOfGuids = null;
        String authorization = null;
        String acceptLanguage = null;
        ApiError response = api.removeElementsFromRoutingCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Alter collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionTest() throws ApiException {
        String id4n = null;
        GuidCollection request = null;
        String authorization = null;
        String acceptLanguage = null;
        ResponseEntity response = api.updateCollection(id4n, request, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Rename labelled collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLabelledCollectionTest() throws ApiException {
        String id4n = null;
        GuidCollection request = null;
        String authorization = null;
        String acceptLanguage = null;
        ResponseEntity response = api.updateLabelledCollection(id4n, request, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Update logistic collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLogisticCollectionTest() throws ApiException {
        String id4n = null;
        GuidCollection request = null;
        String authorization = null;
        String acceptLanguage = null;
        ResponseEntity response = api.updateLogisticCollection(id4n, request, authorization, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * Update routing collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRoutingCollectionTest() throws ApiException {
        String id4n = null;
        GuidCollection request = null;
        String authorization = null;
        String acceptLanguage = null;
        ResponseEntity response = api.updateRoutingCollection(id4n, request, authorization, acceptLanguage);

        // TODO: test validations
    }
    
}

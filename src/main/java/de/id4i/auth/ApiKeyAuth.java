/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.8.5-SNAPSHOT
 * Contact: info@bluerain.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.id4i.auth;

import de.id4i.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-23T12:18:32.685Z")
public class ApiKeyAuth implements Authentication {
  private final String location;
  private final String paramName;

  private String apiKey;
  private String apiKeyPrefix;

  public ApiKeyAuth(String location, String paramName) {
    this.location = location;
    this.paramName = paramName;
  }

  public String getLocation() {
    return location;
  }

  public String getParamName() {
    return paramName;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getApiKeyPrefix() {
    return apiKeyPrefix;
  }

  public void setApiKeyPrefix(String apiKeyPrefix) {
    this.apiKeyPrefix = apiKeyPrefix;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (apiKey == null) {
      return;
    }
    String value;
    if (apiKeyPrefix != null) {
      value = apiKeyPrefix + " " + apiKey;
    } else {
      value = apiKey;
    }
    if ("query".equals(location)) {
      queryParams.add(new Pair(paramName, value));
    } else if ("header".equals(location)) {
      headerParams.put(paramName, value);
    }
  }
}

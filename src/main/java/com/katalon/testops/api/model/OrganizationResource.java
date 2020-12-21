/*
 * Katalon TestOps API reference
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.katalon.testops.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.katalon.testops.api.model.OrganizationFeatureFlagResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OrganizationResource
 */
@JsonPropertyOrder({
  OrganizationResource.JSON_PROPERTY_ID,
  OrganizationResource.JSON_PROPERTY_NAME,
  OrganizationResource.JSON_PROPERTY_ROLE,
  OrganizationResource.JSON_PROPERTY_ORG_FEATURE_FLAG,
  OrganizationResource.JSON_PROPERTY_QUOTA_K_S_E,
  OrganizationResource.JSON_PROPERTY_MACHINE_QUOTA_K_S_E,
  OrganizationResource.JSON_PROPERTY_QUOTA_ENGINE,
  OrganizationResource.JSON_PROPERTY_MACHINE_QUOTA_ENGINE,
  OrganizationResource.JSON_PROPERTY_USED_K_S_E,
  OrganizationResource.JSON_PROPERTY_USED_ENGINE,
  OrganizationResource.JSON_PROPERTY_QUOTA_TEST_OPS,
  OrganizationResource.JSON_PROPERTY_USED_TEST_OPS,
  OrganizationResource.JSON_PROPERTY_NUMBER_USER,
  OrganizationResource.JSON_PROPERTY_QUOTA_FLOATING_ENGINE,
  OrganizationResource.JSON_PROPERTY_USED_FLOATING_ENGINE,
  OrganizationResource.JSON_PROPERTY_CAN_CREATE_OFFLINE_K_S_E,
  OrganizationResource.JSON_PROPERTY_CAN_CREATE_OFFLINE_R_E,
  OrganizationResource.JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_ENGINE,
  OrganizationResource.JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_K_S_E,
  OrganizationResource.JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_FLOATING_ENGINE,
  OrganizationResource.JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_TEST_OPS,
  OrganizationResource.JSON_PROPERTY_SUBSCRIBED,
  OrganizationResource.JSON_PROPERTY_KSE_PAYGO,
  OrganizationResource.JSON_PROPERTY_KRE_PAYGO,
  OrganizationResource.JSON_PROPERTY_PAYGO_QUOTA,
  OrganizationResource.JSON_PROPERTY_DOMAIN,
  OrganizationResource.JSON_PROPERTY_SUBDOMAIN_URL,
  OrganizationResource.JSON_PROPERTY_STRICT_DOMAIN,
  OrganizationResource.JSON_PROPERTY_LOGO_URL,
  OrganizationResource.JSON_PROPERTY_SAML_S_S_O,
  OrganizationResource.JSON_PROPERTY_KRE_LICENSE,
  OrganizationResource.JSON_PROPERTY_TEST_OPS_PACKAGE,
  OrganizationResource.JSON_PROPERTY_TEST_OPS_BASIC_REASON
})
@JsonTypeName("OrganizationResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrganizationResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    OWNER("OWNER"),
    
    ADMIN("ADMIN"),
    
    USER("USER"),
    
    BILLING_MANAGER("BILLING_MANAGER");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;

  public static final String JSON_PROPERTY_ORG_FEATURE_FLAG = "orgFeatureFlag";
  private OrganizationFeatureFlagResource orgFeatureFlag;

  public static final String JSON_PROPERTY_QUOTA_K_S_E = "quotaKSE";
  private Long quotaKSE;

  public static final String JSON_PROPERTY_MACHINE_QUOTA_K_S_E = "machineQuotaKSE";
  private Long machineQuotaKSE;

  public static final String JSON_PROPERTY_QUOTA_ENGINE = "quotaEngine";
  private Long quotaEngine;

  public static final String JSON_PROPERTY_MACHINE_QUOTA_ENGINE = "machineQuotaEngine";
  private Long machineQuotaEngine;

  public static final String JSON_PROPERTY_USED_K_S_E = "usedKSE";
  private Long usedKSE;

  public static final String JSON_PROPERTY_USED_ENGINE = "usedEngine";
  private Long usedEngine;

  public static final String JSON_PROPERTY_QUOTA_TEST_OPS = "quotaTestOps";
  private Long quotaTestOps;

  public static final String JSON_PROPERTY_USED_TEST_OPS = "usedTestOps";
  private Long usedTestOps;

  public static final String JSON_PROPERTY_NUMBER_USER = "numberUser";
  private Long numberUser;

  public static final String JSON_PROPERTY_QUOTA_FLOATING_ENGINE = "quotaFloatingEngine";
  private Long quotaFloatingEngine;

  public static final String JSON_PROPERTY_USED_FLOATING_ENGINE = "usedFloatingEngine";
  private Long usedFloatingEngine;

  public static final String JSON_PROPERTY_CAN_CREATE_OFFLINE_K_S_E = "canCreateOfflineKSE";
  private Boolean canCreateOfflineKSE;

  public static final String JSON_PROPERTY_CAN_CREATE_OFFLINE_R_E = "canCreateOfflineRE";
  private Boolean canCreateOfflineRE;

  public static final String JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_ENGINE = "subscriptionExpiryDateEngine";
  private OffsetDateTime subscriptionExpiryDateEngine;

  public static final String JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_K_S_E = "subscriptionExpiryDateKSE";
  private OffsetDateTime subscriptionExpiryDateKSE;

  public static final String JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_FLOATING_ENGINE = "subscriptionExpiryDateFloatingEngine";
  private OffsetDateTime subscriptionExpiryDateFloatingEngine;

  public static final String JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_TEST_OPS = "subscriptionExpiryDateTestOps";
  private OffsetDateTime subscriptionExpiryDateTestOps;

  public static final String JSON_PROPERTY_SUBSCRIBED = "subscribed";
  private Boolean subscribed;

  public static final String JSON_PROPERTY_KSE_PAYGO = "ksePaygo";
  private Boolean ksePaygo;

  public static final String JSON_PROPERTY_KRE_PAYGO = "krePaygo";
  private Boolean krePaygo;

  public static final String JSON_PROPERTY_PAYGO_QUOTA = "paygoQuota";
  private Long paygoQuota;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_SUBDOMAIN_URL = "subdomainUrl";
  private String subdomainUrl;

  public static final String JSON_PROPERTY_STRICT_DOMAIN = "strictDomain";
  private Boolean strictDomain;

  public static final String JSON_PROPERTY_LOGO_URL = "logoUrl";
  private String logoUrl;

  public static final String JSON_PROPERTY_SAML_S_S_O = "samlSSO";
  private Boolean samlSSO;

  public static final String JSON_PROPERTY_KRE_LICENSE = "kreLicense";
  private Boolean kreLicense;

  /**
   * Gets or Sets testOpsPackage
   */
  public enum TestOpsPackageEnum {
    BASIC("BASIC"),
    
    ADVANCED("ADVANCED"),
    
    ENTERPRISE("ENTERPRISE");

    private String value;

    TestOpsPackageEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TestOpsPackageEnum fromValue(String value) {
      for (TestOpsPackageEnum b : TestOpsPackageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TEST_OPS_PACKAGE = "testOpsPackage";
  private TestOpsPackageEnum testOpsPackage;

  /**
   * Gets or Sets testOpsBasicReason
   */
  public enum TestOpsBasicReasonEnum {
    USER("DISABLED_BY_USER"),
    
    ADMIN("DISABLED_BY_ADMIN");

    private String value;

    TestOpsBasicReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TestOpsBasicReasonEnum fromValue(String value) {
      for (TestOpsBasicReasonEnum b : TestOpsBasicReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TEST_OPS_BASIC_REASON = "testOpsBasicReason";
  private TestOpsBasicReasonEnum testOpsBasicReason;


  public OrganizationResource id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public OrganizationResource name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrganizationResource role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public OrganizationResource orgFeatureFlag(OrganizationFeatureFlagResource orgFeatureFlag) {
    
    this.orgFeatureFlag = orgFeatureFlag;
    return this;
  }

   /**
   * Get orgFeatureFlag
   * @return orgFeatureFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORG_FEATURE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrganizationFeatureFlagResource getOrgFeatureFlag() {
    return orgFeatureFlag;
  }


  public void setOrgFeatureFlag(OrganizationFeatureFlagResource orgFeatureFlag) {
    this.orgFeatureFlag = orgFeatureFlag;
  }


  public OrganizationResource quotaKSE(Long quotaKSE) {
    
    this.quotaKSE = quotaKSE;
    return this;
  }

   /**
   * Get quotaKSE
   * @return quotaKSE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTA_K_S_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuotaKSE() {
    return quotaKSE;
  }


  public void setQuotaKSE(Long quotaKSE) {
    this.quotaKSE = quotaKSE;
  }


  public OrganizationResource machineQuotaKSE(Long machineQuotaKSE) {
    
    this.machineQuotaKSE = machineQuotaKSE;
    return this;
  }

   /**
   * Get machineQuotaKSE
   * @return machineQuotaKSE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MACHINE_QUOTA_K_S_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMachineQuotaKSE() {
    return machineQuotaKSE;
  }


  public void setMachineQuotaKSE(Long machineQuotaKSE) {
    this.machineQuotaKSE = machineQuotaKSE;
  }


  public OrganizationResource quotaEngine(Long quotaEngine) {
    
    this.quotaEngine = quotaEngine;
    return this;
  }

   /**
   * Get quotaEngine
   * @return quotaEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTA_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuotaEngine() {
    return quotaEngine;
  }


  public void setQuotaEngine(Long quotaEngine) {
    this.quotaEngine = quotaEngine;
  }


  public OrganizationResource machineQuotaEngine(Long machineQuotaEngine) {
    
    this.machineQuotaEngine = machineQuotaEngine;
    return this;
  }

   /**
   * Get machineQuotaEngine
   * @return machineQuotaEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MACHINE_QUOTA_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMachineQuotaEngine() {
    return machineQuotaEngine;
  }


  public void setMachineQuotaEngine(Long machineQuotaEngine) {
    this.machineQuotaEngine = machineQuotaEngine;
  }


  public OrganizationResource usedKSE(Long usedKSE) {
    
    this.usedKSE = usedKSE;
    return this;
  }

   /**
   * Get usedKSE
   * @return usedKSE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USED_K_S_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUsedKSE() {
    return usedKSE;
  }


  public void setUsedKSE(Long usedKSE) {
    this.usedKSE = usedKSE;
  }


  public OrganizationResource usedEngine(Long usedEngine) {
    
    this.usedEngine = usedEngine;
    return this;
  }

   /**
   * Get usedEngine
   * @return usedEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USED_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUsedEngine() {
    return usedEngine;
  }


  public void setUsedEngine(Long usedEngine) {
    this.usedEngine = usedEngine;
  }


  public OrganizationResource quotaTestOps(Long quotaTestOps) {
    
    this.quotaTestOps = quotaTestOps;
    return this;
  }

   /**
   * Get quotaTestOps
   * @return quotaTestOps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTA_TEST_OPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuotaTestOps() {
    return quotaTestOps;
  }


  public void setQuotaTestOps(Long quotaTestOps) {
    this.quotaTestOps = quotaTestOps;
  }


  public OrganizationResource usedTestOps(Long usedTestOps) {
    
    this.usedTestOps = usedTestOps;
    return this;
  }

   /**
   * Get usedTestOps
   * @return usedTestOps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USED_TEST_OPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUsedTestOps() {
    return usedTestOps;
  }


  public void setUsedTestOps(Long usedTestOps) {
    this.usedTestOps = usedTestOps;
  }


  public OrganizationResource numberUser(Long numberUser) {
    
    this.numberUser = numberUser;
    return this;
  }

   /**
   * Get numberUser
   * @return numberUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberUser() {
    return numberUser;
  }


  public void setNumberUser(Long numberUser) {
    this.numberUser = numberUser;
  }


  public OrganizationResource quotaFloatingEngine(Long quotaFloatingEngine) {
    
    this.quotaFloatingEngine = quotaFloatingEngine;
    return this;
  }

   /**
   * Get quotaFloatingEngine
   * @return quotaFloatingEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTA_FLOATING_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuotaFloatingEngine() {
    return quotaFloatingEngine;
  }


  public void setQuotaFloatingEngine(Long quotaFloatingEngine) {
    this.quotaFloatingEngine = quotaFloatingEngine;
  }


  public OrganizationResource usedFloatingEngine(Long usedFloatingEngine) {
    
    this.usedFloatingEngine = usedFloatingEngine;
    return this;
  }

   /**
   * Get usedFloatingEngine
   * @return usedFloatingEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USED_FLOATING_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUsedFloatingEngine() {
    return usedFloatingEngine;
  }


  public void setUsedFloatingEngine(Long usedFloatingEngine) {
    this.usedFloatingEngine = usedFloatingEngine;
  }


  public OrganizationResource canCreateOfflineKSE(Boolean canCreateOfflineKSE) {
    
    this.canCreateOfflineKSE = canCreateOfflineKSE;
    return this;
  }

   /**
   * Get canCreateOfflineKSE
   * @return canCreateOfflineKSE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAN_CREATE_OFFLINE_K_S_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanCreateOfflineKSE() {
    return canCreateOfflineKSE;
  }


  public void setCanCreateOfflineKSE(Boolean canCreateOfflineKSE) {
    this.canCreateOfflineKSE = canCreateOfflineKSE;
  }


  public OrganizationResource canCreateOfflineRE(Boolean canCreateOfflineRE) {
    
    this.canCreateOfflineRE = canCreateOfflineRE;
    return this;
  }

   /**
   * Get canCreateOfflineRE
   * @return canCreateOfflineRE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAN_CREATE_OFFLINE_R_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanCreateOfflineRE() {
    return canCreateOfflineRE;
  }


  public void setCanCreateOfflineRE(Boolean canCreateOfflineRE) {
    this.canCreateOfflineRE = canCreateOfflineRE;
  }


  public OrganizationResource subscriptionExpiryDateEngine(OffsetDateTime subscriptionExpiryDateEngine) {
    
    this.subscriptionExpiryDateEngine = subscriptionExpiryDateEngine;
    return this;
  }

   /**
   * Get subscriptionExpiryDateEngine
   * @return subscriptionExpiryDateEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubscriptionExpiryDateEngine() {
    return subscriptionExpiryDateEngine;
  }


  public void setSubscriptionExpiryDateEngine(OffsetDateTime subscriptionExpiryDateEngine) {
    this.subscriptionExpiryDateEngine = subscriptionExpiryDateEngine;
  }


  public OrganizationResource subscriptionExpiryDateKSE(OffsetDateTime subscriptionExpiryDateKSE) {
    
    this.subscriptionExpiryDateKSE = subscriptionExpiryDateKSE;
    return this;
  }

   /**
   * Get subscriptionExpiryDateKSE
   * @return subscriptionExpiryDateKSE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_K_S_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubscriptionExpiryDateKSE() {
    return subscriptionExpiryDateKSE;
  }


  public void setSubscriptionExpiryDateKSE(OffsetDateTime subscriptionExpiryDateKSE) {
    this.subscriptionExpiryDateKSE = subscriptionExpiryDateKSE;
  }


  public OrganizationResource subscriptionExpiryDateFloatingEngine(OffsetDateTime subscriptionExpiryDateFloatingEngine) {
    
    this.subscriptionExpiryDateFloatingEngine = subscriptionExpiryDateFloatingEngine;
    return this;
  }

   /**
   * Get subscriptionExpiryDateFloatingEngine
   * @return subscriptionExpiryDateFloatingEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_FLOATING_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubscriptionExpiryDateFloatingEngine() {
    return subscriptionExpiryDateFloatingEngine;
  }


  public void setSubscriptionExpiryDateFloatingEngine(OffsetDateTime subscriptionExpiryDateFloatingEngine) {
    this.subscriptionExpiryDateFloatingEngine = subscriptionExpiryDateFloatingEngine;
  }


  public OrganizationResource subscriptionExpiryDateTestOps(OffsetDateTime subscriptionExpiryDateTestOps) {
    
    this.subscriptionExpiryDateTestOps = subscriptionExpiryDateTestOps;
    return this;
  }

   /**
   * Get subscriptionExpiryDateTestOps
   * @return subscriptionExpiryDateTestOps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_EXPIRY_DATE_TEST_OPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubscriptionExpiryDateTestOps() {
    return subscriptionExpiryDateTestOps;
  }


  public void setSubscriptionExpiryDateTestOps(OffsetDateTime subscriptionExpiryDateTestOps) {
    this.subscriptionExpiryDateTestOps = subscriptionExpiryDateTestOps;
  }


  public OrganizationResource subscribed(Boolean subscribed) {
    
    this.subscribed = subscribed;
    return this;
  }

   /**
   * Get subscribed
   * @return subscribed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubscribed() {
    return subscribed;
  }


  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }


  public OrganizationResource ksePaygo(Boolean ksePaygo) {
    
    this.ksePaygo = ksePaygo;
    return this;
  }

   /**
   * Get ksePaygo
   * @return ksePaygo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KSE_PAYGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKsePaygo() {
    return ksePaygo;
  }


  public void setKsePaygo(Boolean ksePaygo) {
    this.ksePaygo = ksePaygo;
  }


  public OrganizationResource krePaygo(Boolean krePaygo) {
    
    this.krePaygo = krePaygo;
    return this;
  }

   /**
   * Get krePaygo
   * @return krePaygo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KRE_PAYGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKrePaygo() {
    return krePaygo;
  }


  public void setKrePaygo(Boolean krePaygo) {
    this.krePaygo = krePaygo;
  }


  public OrganizationResource paygoQuota(Long paygoQuota) {
    
    this.paygoQuota = paygoQuota;
    return this;
  }

   /**
   * Get paygoQuota
   * @return paygoQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYGO_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPaygoQuota() {
    return paygoQuota;
  }


  public void setPaygoQuota(Long paygoQuota) {
    this.paygoQuota = paygoQuota;
  }


  public OrganizationResource domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public OrganizationResource subdomainUrl(String subdomainUrl) {
    
    this.subdomainUrl = subdomainUrl;
    return this;
  }

   /**
   * Get subdomainUrl
   * @return subdomainUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBDOMAIN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubdomainUrl() {
    return subdomainUrl;
  }


  public void setSubdomainUrl(String subdomainUrl) {
    this.subdomainUrl = subdomainUrl;
  }


  public OrganizationResource strictDomain(Boolean strictDomain) {
    
    this.strictDomain = strictDomain;
    return this;
  }

   /**
   * Get strictDomain
   * @return strictDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRICT_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStrictDomain() {
    return strictDomain;
  }


  public void setStrictDomain(Boolean strictDomain) {
    this.strictDomain = strictDomain;
  }


  public OrganizationResource logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public OrganizationResource samlSSO(Boolean samlSSO) {
    
    this.samlSSO = samlSSO;
    return this;
  }

   /**
   * Get samlSSO
   * @return samlSSO
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAML_S_S_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSamlSSO() {
    return samlSSO;
  }


  public void setSamlSSO(Boolean samlSSO) {
    this.samlSSO = samlSSO;
  }


  public OrganizationResource kreLicense(Boolean kreLicense) {
    
    this.kreLicense = kreLicense;
    return this;
  }

   /**
   * Get kreLicense
   * @return kreLicense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KRE_LICENSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKreLicense() {
    return kreLicense;
  }


  public void setKreLicense(Boolean kreLicense) {
    this.kreLicense = kreLicense;
  }


  public OrganizationResource testOpsPackage(TestOpsPackageEnum testOpsPackage) {
    
    this.testOpsPackage = testOpsPackage;
    return this;
  }

   /**
   * Get testOpsPackage
   * @return testOpsPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_OPS_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestOpsPackageEnum getTestOpsPackage() {
    return testOpsPackage;
  }


  public void setTestOpsPackage(TestOpsPackageEnum testOpsPackage) {
    this.testOpsPackage = testOpsPackage;
  }


  public OrganizationResource testOpsBasicReason(TestOpsBasicReasonEnum testOpsBasicReason) {
    
    this.testOpsBasicReason = testOpsBasicReason;
    return this;
  }

   /**
   * Get testOpsBasicReason
   * @return testOpsBasicReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_OPS_BASIC_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestOpsBasicReasonEnum getTestOpsBasicReason() {
    return testOpsBasicReason;
  }


  public void setTestOpsBasicReason(TestOpsBasicReasonEnum testOpsBasicReason) {
    this.testOpsBasicReason = testOpsBasicReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationResource organizationResource = (OrganizationResource) o;
    return Objects.equals(this.id, organizationResource.id) &&
        Objects.equals(this.name, organizationResource.name) &&
        Objects.equals(this.role, organizationResource.role) &&
        Objects.equals(this.orgFeatureFlag, organizationResource.orgFeatureFlag) &&
        Objects.equals(this.quotaKSE, organizationResource.quotaKSE) &&
        Objects.equals(this.machineQuotaKSE, organizationResource.machineQuotaKSE) &&
        Objects.equals(this.quotaEngine, organizationResource.quotaEngine) &&
        Objects.equals(this.machineQuotaEngine, organizationResource.machineQuotaEngine) &&
        Objects.equals(this.usedKSE, organizationResource.usedKSE) &&
        Objects.equals(this.usedEngine, organizationResource.usedEngine) &&
        Objects.equals(this.quotaTestOps, organizationResource.quotaTestOps) &&
        Objects.equals(this.usedTestOps, organizationResource.usedTestOps) &&
        Objects.equals(this.numberUser, organizationResource.numberUser) &&
        Objects.equals(this.quotaFloatingEngine, organizationResource.quotaFloatingEngine) &&
        Objects.equals(this.usedFloatingEngine, organizationResource.usedFloatingEngine) &&
        Objects.equals(this.canCreateOfflineKSE, organizationResource.canCreateOfflineKSE) &&
        Objects.equals(this.canCreateOfflineRE, organizationResource.canCreateOfflineRE) &&
        Objects.equals(this.subscriptionExpiryDateEngine, organizationResource.subscriptionExpiryDateEngine) &&
        Objects.equals(this.subscriptionExpiryDateKSE, organizationResource.subscriptionExpiryDateKSE) &&
        Objects.equals(this.subscriptionExpiryDateFloatingEngine, organizationResource.subscriptionExpiryDateFloatingEngine) &&
        Objects.equals(this.subscriptionExpiryDateTestOps, organizationResource.subscriptionExpiryDateTestOps) &&
        Objects.equals(this.subscribed, organizationResource.subscribed) &&
        Objects.equals(this.ksePaygo, organizationResource.ksePaygo) &&
        Objects.equals(this.krePaygo, organizationResource.krePaygo) &&
        Objects.equals(this.paygoQuota, organizationResource.paygoQuota) &&
        Objects.equals(this.domain, organizationResource.domain) &&
        Objects.equals(this.subdomainUrl, organizationResource.subdomainUrl) &&
        Objects.equals(this.strictDomain, organizationResource.strictDomain) &&
        Objects.equals(this.logoUrl, organizationResource.logoUrl) &&
        Objects.equals(this.samlSSO, organizationResource.samlSSO) &&
        Objects.equals(this.kreLicense, organizationResource.kreLicense) &&
        Objects.equals(this.testOpsPackage, organizationResource.testOpsPackage) &&
        Objects.equals(this.testOpsBasicReason, organizationResource.testOpsBasicReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, role, orgFeatureFlag, quotaKSE, machineQuotaKSE, quotaEngine, machineQuotaEngine, usedKSE, usedEngine, quotaTestOps, usedTestOps, numberUser, quotaFloatingEngine, usedFloatingEngine, canCreateOfflineKSE, canCreateOfflineRE, subscriptionExpiryDateEngine, subscriptionExpiryDateKSE, subscriptionExpiryDateFloatingEngine, subscriptionExpiryDateTestOps, subscribed, ksePaygo, krePaygo, paygoQuota, domain, subdomainUrl, strictDomain, logoUrl, samlSSO, kreLicense, testOpsPackage, testOpsBasicReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    orgFeatureFlag: ").append(toIndentedString(orgFeatureFlag)).append("\n");
    sb.append("    quotaKSE: ").append(toIndentedString(quotaKSE)).append("\n");
    sb.append("    machineQuotaKSE: ").append(toIndentedString(machineQuotaKSE)).append("\n");
    sb.append("    quotaEngine: ").append(toIndentedString(quotaEngine)).append("\n");
    sb.append("    machineQuotaEngine: ").append(toIndentedString(machineQuotaEngine)).append("\n");
    sb.append("    usedKSE: ").append(toIndentedString(usedKSE)).append("\n");
    sb.append("    usedEngine: ").append(toIndentedString(usedEngine)).append("\n");
    sb.append("    quotaTestOps: ").append(toIndentedString(quotaTestOps)).append("\n");
    sb.append("    usedTestOps: ").append(toIndentedString(usedTestOps)).append("\n");
    sb.append("    numberUser: ").append(toIndentedString(numberUser)).append("\n");
    sb.append("    quotaFloatingEngine: ").append(toIndentedString(quotaFloatingEngine)).append("\n");
    sb.append("    usedFloatingEngine: ").append(toIndentedString(usedFloatingEngine)).append("\n");
    sb.append("    canCreateOfflineKSE: ").append(toIndentedString(canCreateOfflineKSE)).append("\n");
    sb.append("    canCreateOfflineRE: ").append(toIndentedString(canCreateOfflineRE)).append("\n");
    sb.append("    subscriptionExpiryDateEngine: ").append(toIndentedString(subscriptionExpiryDateEngine)).append("\n");
    sb.append("    subscriptionExpiryDateKSE: ").append(toIndentedString(subscriptionExpiryDateKSE)).append("\n");
    sb.append("    subscriptionExpiryDateFloatingEngine: ").append(toIndentedString(subscriptionExpiryDateFloatingEngine)).append("\n");
    sb.append("    subscriptionExpiryDateTestOps: ").append(toIndentedString(subscriptionExpiryDateTestOps)).append("\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    ksePaygo: ").append(toIndentedString(ksePaygo)).append("\n");
    sb.append("    krePaygo: ").append(toIndentedString(krePaygo)).append("\n");
    sb.append("    paygoQuota: ").append(toIndentedString(paygoQuota)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    subdomainUrl: ").append(toIndentedString(subdomainUrl)).append("\n");
    sb.append("    strictDomain: ").append(toIndentedString(strictDomain)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    samlSSO: ").append(toIndentedString(samlSSO)).append("\n");
    sb.append("    kreLicense: ").append(toIndentedString(kreLicense)).append("\n");
    sb.append("    testOpsPackage: ").append(toIndentedString(testOpsPackage)).append("\n");
    sb.append("    testOpsBasicReason: ").append(toIndentedString(testOpsBasicReason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

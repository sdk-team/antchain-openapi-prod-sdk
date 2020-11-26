// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcOrganizationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 企业码
    @NameInMap("org_code")
    @Validation(maxLength = 64)
    public String orgCode;

    // 企业名称
    @NameInMap("org_name")
    @Validation(maxLength = 64)
    public String orgName;

    public static CreateBaasEbcOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcOrganizationRequest self = new CreateBaasEbcOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcOrganizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasEbcOrganizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasEbcOrganizationRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateBaasEbcOrganizationRequest setOrgCode(String orgCode) {
        this.orgCode = orgCode;
        return this;
    }
    public String getOrgCode() {
        return this.orgCode;
    }

    public CreateBaasEbcOrganizationRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

}

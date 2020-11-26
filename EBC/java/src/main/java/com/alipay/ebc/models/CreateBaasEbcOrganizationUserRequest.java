// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcOrganizationUserRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 企业id
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 个人id
    @NameInMap("person_did")
    @Validation(maxLength = 128)
    public String personDid;

    // 机构内部用户工号
    @NameInMap("uid")
    @Validation(maxLength = 64)
    public String uid;

    public static CreateBaasEbcOrganizationUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcOrganizationUserRequest self = new CreateBaasEbcOrganizationUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcOrganizationUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasEbcOrganizationUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasEbcOrganizationUserRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateBaasEbcOrganizationUserRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public CreateBaasEbcOrganizationUserRequest setPersonDid(String personDid) {
        this.personDid = personDid;
        return this;
    }
    public String getPersonDid() {
        return this.personDid;
    }

    public CreateBaasEbcOrganizationUserRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}

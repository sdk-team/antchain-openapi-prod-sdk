// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class QueryBaasEbcUserCertRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 企业did
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 企业用户id
    @NameInMap("org_user_id")
    @Validation(maxLength = 128)
    public String orgUserId;

    public static QueryBaasEbcUserCertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasEbcUserCertRequest self = new QueryBaasEbcUserCertRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasEbcUserCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasEbcUserCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasEbcUserCertRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public QueryBaasEbcUserCertRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public QueryBaasEbcUserCertRequest setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId;
        return this;
    }
    public String getOrgUserId() {
        return this.orgUserId;
    }

}

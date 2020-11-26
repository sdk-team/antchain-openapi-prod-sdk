// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CancelBaasEbcPersonRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 个人id
    @NameInMap("person_did")
    @Validation(maxLength = 128)
    public String personDid;

    public static CancelBaasEbcPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBaasEbcPersonRequest self = new CancelBaasEbcPersonRequest();
        return TeaModel.build(map, self);
    }

    public CancelBaasEbcPersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelBaasEbcPersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelBaasEbcPersonRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CancelBaasEbcPersonRequest setPersonDid(String personDid) {
        this.personDid = personDid;
        return this;
    }
    public String getPersonDid() {
        return this.personDid;
    }

}

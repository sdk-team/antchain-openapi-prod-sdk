// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class ResumeBaasEbcPersonRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 个人did
    @NameInMap("person_did")
    @Validation(maxLength = 128)
    public String personDid;

    public static ResumeBaasEbcPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeBaasEbcPersonRequest self = new ResumeBaasEbcPersonRequest();
        return TeaModel.build(map, self);
    }

    public ResumeBaasEbcPersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResumeBaasEbcPersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResumeBaasEbcPersonRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public ResumeBaasEbcPersonRequest setPersonDid(String personDid) {
        this.personDid = personDid;
        return this;
    }
    public String getPersonDid() {
        return this.personDid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class ApplyBaasEbcCertUrlRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 证书code
    @NameInMap("cert_code")
    @Validation(maxLength = 128)
    public String certCode;

    // 机构did
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 证书持有人id
    @NameInMap("org_user_id")
    public String orgUserId;

    public static ApplyBaasEbcCertUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyBaasEbcCertUrlRequest self = new ApplyBaasEbcCertUrlRequest();
        return TeaModel.build(map, self);
    }

    public ApplyBaasEbcCertUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyBaasEbcCertUrlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyBaasEbcCertUrlRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public ApplyBaasEbcCertUrlRequest setCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }
    public String getCertCode() {
        return this.certCode;
    }

    public ApplyBaasEbcCertUrlRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public ApplyBaasEbcCertUrlRequest setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId;
        return this;
    }
    public String getOrgUserId() {
        return this.orgUserId;
    }

}

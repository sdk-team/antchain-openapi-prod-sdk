// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class UpdateBaasEbcUserCertRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 证书id
    @NameInMap("cert_id")
    @Validation(maxLength = 128)
    public String certId;

    // 首次发布时间
    @NameInMap("cert_publish_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String certPublishTime;

    // 1-有效 2-冻结 3-失效 4-作废 5-其他
    @NameInMap("cert_status")
    public Long certStatus;

    // 企业did
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 企业用户id
    @NameInMap("org_user_id")
    @Validation(maxLength = 128)
    public String orgUserId;

    // 隐私属性描述列表
    // 
    @NameInMap("privacy_desc_list")
    public java.util.List<PrivacyDesc> privacyDescList;

    // 托管属性描述列表
    // 
    @NameInMap("proxy_desc_list")
    public java.util.List<ProxyDesc> proxyDescList;

    // 公开属性描述列表
    // 
    @NameInMap("public_desc_list")
    public java.util.List<PublicDesc> publicDescList;

    // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
    @NameInMap("secret_key")
    @Validation(maxLength = 512)
    public String secretKey;

    public static UpdateBaasEbcUserCertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasEbcUserCertRequest self = new UpdateBaasEbcUserCertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaasEbcUserCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBaasEbcUserCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBaasEbcUserCertRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public UpdateBaasEbcUserCertRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public UpdateBaasEbcUserCertRequest setCertPublishTime(String certPublishTime) {
        this.certPublishTime = certPublishTime;
        return this;
    }
    public String getCertPublishTime() {
        return this.certPublishTime;
    }

    public UpdateBaasEbcUserCertRequest setCertStatus(Long certStatus) {
        this.certStatus = certStatus;
        return this;
    }
    public Long getCertStatus() {
        return this.certStatus;
    }

    public UpdateBaasEbcUserCertRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public UpdateBaasEbcUserCertRequest setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId;
        return this;
    }
    public String getOrgUserId() {
        return this.orgUserId;
    }

    public UpdateBaasEbcUserCertRequest setPrivacyDescList(java.util.List<PrivacyDesc> privacyDescList) {
        this.privacyDescList = privacyDescList;
        return this;
    }
    public java.util.List<PrivacyDesc> getPrivacyDescList() {
        return this.privacyDescList;
    }

    public UpdateBaasEbcUserCertRequest setProxyDescList(java.util.List<ProxyDesc> proxyDescList) {
        this.proxyDescList = proxyDescList;
        return this;
    }
    public java.util.List<ProxyDesc> getProxyDescList() {
        return this.proxyDescList;
    }

    public UpdateBaasEbcUserCertRequest setPublicDescList(java.util.List<PublicDesc> publicDescList) {
        this.publicDescList = publicDescList;
        return this;
    }
    public java.util.List<PublicDesc> getPublicDescList() {
        return this.publicDescList;
    }

    public UpdateBaasEbcUserCertRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

}

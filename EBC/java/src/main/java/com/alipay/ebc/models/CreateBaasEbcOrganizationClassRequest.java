// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcOrganizationClassRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 班级容量
    @NameInMap("capacity")
    public Long capacity;

    // 结束时间
    @NameInMap("class_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String classEndTime;

    // 班级名称
    @NameInMap("class_name")
    @Validation(maxLength = 64)
    public String className;

    // 开始时间
    @NameInMap("class_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String classStartTime;

    // 1:有效、2:暂停、3:失效
    @NameInMap("class_status")
    public Long classStatus;

    // 企业id
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

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

    // 1线上、2线下、3混合
    @NameInMap("type")
    public Long type;

    public static CreateBaasEbcOrganizationClassRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcOrganizationClassRequest self = new CreateBaasEbcOrganizationClassRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcOrganizationClassRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasEbcOrganizationClassRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasEbcOrganizationClassRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateBaasEbcOrganizationClassRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public CreateBaasEbcOrganizationClassRequest setClassEndTime(String classEndTime) {
        this.classEndTime = classEndTime;
        return this;
    }
    public String getClassEndTime() {
        return this.classEndTime;
    }

    public CreateBaasEbcOrganizationClassRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public CreateBaasEbcOrganizationClassRequest setClassStartTime(String classStartTime) {
        this.classStartTime = classStartTime;
        return this;
    }
    public String getClassStartTime() {
        return this.classStartTime;
    }

    public CreateBaasEbcOrganizationClassRequest setClassStatus(Long classStatus) {
        this.classStatus = classStatus;
        return this;
    }
    public Long getClassStatus() {
        return this.classStatus;
    }

    public CreateBaasEbcOrganizationClassRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public CreateBaasEbcOrganizationClassRequest setPrivacyDescList(java.util.List<PrivacyDesc> privacyDescList) {
        this.privacyDescList = privacyDescList;
        return this;
    }
    public java.util.List<PrivacyDesc> getPrivacyDescList() {
        return this.privacyDescList;
    }

    public CreateBaasEbcOrganizationClassRequest setProxyDescList(java.util.List<ProxyDesc> proxyDescList) {
        this.proxyDescList = proxyDescList;
        return this;
    }
    public java.util.List<ProxyDesc> getProxyDescList() {
        return this.proxyDescList;
    }

    public CreateBaasEbcOrganizationClassRequest setPublicDescList(java.util.List<PublicDesc> publicDescList) {
        this.publicDescList = publicDescList;
        return this;
    }
    public java.util.List<PublicDesc> getPublicDescList() {
        return this.publicDescList;
    }

    public CreateBaasEbcOrganizationClassRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public CreateBaasEbcOrganizationClassRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}

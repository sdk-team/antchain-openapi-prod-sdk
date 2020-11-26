// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcUserCertRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 证书编号
    @NameInMap("cert_code")
    @Validation(maxLength = 64)
    public String certCode;

    // 时间周期结束时间
    @NameInMap("cert_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String certEndTime;

    // 证书名称-中文
    @NameInMap("cert_name_cn")
    @Validation(maxLength = 64)
    public String certNameCn;

    // 证书名称-英文（拼音）
    @NameInMap("cert_name_en")
    @Validation(maxLength = 64)
    public String certNameEn;

    // 首次发布时间
    @NameInMap("cert_publish_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String certPublishTime;

    // 时间周期开始时间
    @NameInMap("cert_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String certStartTime;

    // 1-有效 2-冻结 3-失效 4-作废 5-其他
    @NameInMap("cert_status")
    public Long certStatus;

    // 证书归属国家 使用“ISO 3166-1”代码表-数字码 https://zh.wikipedia.org/wiki/ISO_3166-1
    @NameInMap("country")
    @Validation(maxLength = 32)
    public String country;

    // 有效期类型1.长期有效 2.时间周期
    @NameInMap("expire_type")
    public Long expireType;

    // 证书持有人姓名
    // 
    @NameInMap("holder_name")
    @Validation(maxLength = 64)
    public String holderName;

    // 证书等级类型： 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
    @NameInMap("level")
    @Validation(maxLength = 32)
    public String level;

    // 企业id
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 企业名称
    @NameInMap("org_name")
    @Validation(maxLength = 64)
    public String orgName;

    // 企业用户id
    @NameInMap("org_user_id")
    @Validation(maxLength = 128)
    public String orgUserId;

    // 持有人主证件编号，无身份证的个人使用0000000000000000
    // 请使用我们提供的公钥对数据进行加密
    // 
    @NameInMap("primary_id_no")
    @Validation(maxLength = 1024)
    public String primaryIdNo;

    // 隐私属性描述列表
    @NameInMap("privacy_desc_list")
    public java.util.List<PrivacyDesc> privacyDescList;

    // 托管属性描述列表
    @NameInMap("proxy_desc_list")
    public java.util.List<ProxyDesc> proxyDescList;

    // 公开属性描述列表
    @NameInMap("public_desc_list")
    public java.util.List<PublicDesc> publicDescList;

    // 持有人辅助证件编号-1
    // 请使用我们提供的公钥对数据进行加密
    @NameInMap("second_id_no_1")
    @Validation(maxLength = 1024)
    public String secondIdNo1;

    // 持有人辅助证件编号-2
    // 请使用我们提供的公钥对数据进行加密
    @NameInMap("second_id_no_2")
    @Validation(maxLength = 1024)
    public String secondIdNo2;

    // 持有人辅助证件编号-3
    // 请使用我们提供的公钥对数据进行加密
    @NameInMap("second_id_no_3")
    @Validation(maxLength = 1024)
    public String secondIdNo3;

    // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
    @NameInMap("secret_key")
    @Validation(maxLength = 512)
    public String secretKey;

    // -数字码类型为156时可使用如下类目： --学历证书-XLZ --职业证书--ZYZ -其他国家传入--QT
    @NameInMap("type")
    @Validation(maxLength = 64)
    public String type;

    public static CreateBaasEbcUserCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcUserCertRequest self = new CreateBaasEbcUserCertRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcUserCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasEbcUserCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasEbcUserCertRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateBaasEbcUserCertRequest setCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }
    public String getCertCode() {
        return this.certCode;
    }

    public CreateBaasEbcUserCertRequest setCertEndTime(String certEndTime) {
        this.certEndTime = certEndTime;
        return this;
    }
    public String getCertEndTime() {
        return this.certEndTime;
    }

    public CreateBaasEbcUserCertRequest setCertNameCn(String certNameCn) {
        this.certNameCn = certNameCn;
        return this;
    }
    public String getCertNameCn() {
        return this.certNameCn;
    }

    public CreateBaasEbcUserCertRequest setCertNameEn(String certNameEn) {
        this.certNameEn = certNameEn;
        return this;
    }
    public String getCertNameEn() {
        return this.certNameEn;
    }

    public CreateBaasEbcUserCertRequest setCertPublishTime(String certPublishTime) {
        this.certPublishTime = certPublishTime;
        return this;
    }
    public String getCertPublishTime() {
        return this.certPublishTime;
    }

    public CreateBaasEbcUserCertRequest setCertStartTime(String certStartTime) {
        this.certStartTime = certStartTime;
        return this;
    }
    public String getCertStartTime() {
        return this.certStartTime;
    }

    public CreateBaasEbcUserCertRequest setCertStatus(Long certStatus) {
        this.certStatus = certStatus;
        return this;
    }
    public Long getCertStatus() {
        return this.certStatus;
    }

    public CreateBaasEbcUserCertRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateBaasEbcUserCertRequest setExpireType(Long expireType) {
        this.expireType = expireType;
        return this;
    }
    public Long getExpireType() {
        return this.expireType;
    }

    public CreateBaasEbcUserCertRequest setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }
    public String getHolderName() {
        return this.holderName;
    }

    public CreateBaasEbcUserCertRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateBaasEbcUserCertRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public CreateBaasEbcUserCertRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public CreateBaasEbcUserCertRequest setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId;
        return this;
    }
    public String getOrgUserId() {
        return this.orgUserId;
    }

    public CreateBaasEbcUserCertRequest setPrimaryIdNo(String primaryIdNo) {
        this.primaryIdNo = primaryIdNo;
        return this;
    }
    public String getPrimaryIdNo() {
        return this.primaryIdNo;
    }

    public CreateBaasEbcUserCertRequest setPrivacyDescList(java.util.List<PrivacyDesc> privacyDescList) {
        this.privacyDescList = privacyDescList;
        return this;
    }
    public java.util.List<PrivacyDesc> getPrivacyDescList() {
        return this.privacyDescList;
    }

    public CreateBaasEbcUserCertRequest setProxyDescList(java.util.List<ProxyDesc> proxyDescList) {
        this.proxyDescList = proxyDescList;
        return this;
    }
    public java.util.List<ProxyDesc> getProxyDescList() {
        return this.proxyDescList;
    }

    public CreateBaasEbcUserCertRequest setPublicDescList(java.util.List<PublicDesc> publicDescList) {
        this.publicDescList = publicDescList;
        return this;
    }
    public java.util.List<PublicDesc> getPublicDescList() {
        return this.publicDescList;
    }

    public CreateBaasEbcUserCertRequest setSecondIdNo1(String secondIdNo1) {
        this.secondIdNo1 = secondIdNo1;
        return this;
    }
    public String getSecondIdNo1() {
        return this.secondIdNo1;
    }

    public CreateBaasEbcUserCertRequest setSecondIdNo2(String secondIdNo2) {
        this.secondIdNo2 = secondIdNo2;
        return this;
    }
    public String getSecondIdNo2() {
        return this.secondIdNo2;
    }

    public CreateBaasEbcUserCertRequest setSecondIdNo3(String secondIdNo3) {
        this.secondIdNo3 = secondIdNo3;
        return this;
    }
    public String getSecondIdNo3() {
        return this.secondIdNo3;
    }

    public CreateBaasEbcUserCertRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public CreateBaasEbcUserCertRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcPersonRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 姓名
    @NameInMap("person_name")
    @Validation(maxLength = 32)
    public String personName;

    // 持有人主证件编号，无身份证的个人使用0000000000000000
    // 请使用我们提供的公钥对数据进行加密
    @NameInMap("primary_id_no")
    @Validation(maxLength = 1024)
    public String primaryIdNo;

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

    // 持有人辅助证件编号-1
    // 请使用我们提供的公钥对数据进行加密
    @NameInMap("second_id_no_1")
    @Validation(maxLength = 1024)
    public String secondIdNo1;

    // 持有人辅助证件编号-1
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

    public static CreateBaasEbcPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcPersonRequest self = new CreateBaasEbcPersonRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcPersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasEbcPersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasEbcPersonRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateBaasEbcPersonRequest setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public String getPersonName() {
        return this.personName;
    }

    public CreateBaasEbcPersonRequest setPrimaryIdNo(String primaryIdNo) {
        this.primaryIdNo = primaryIdNo;
        return this;
    }
    public String getPrimaryIdNo() {
        return this.primaryIdNo;
    }

    public CreateBaasEbcPersonRequest setPrivacyDescList(java.util.List<PrivacyDesc> privacyDescList) {
        this.privacyDescList = privacyDescList;
        return this;
    }
    public java.util.List<PrivacyDesc> getPrivacyDescList() {
        return this.privacyDescList;
    }

    public CreateBaasEbcPersonRequest setProxyDescList(java.util.List<ProxyDesc> proxyDescList) {
        this.proxyDescList = proxyDescList;
        return this;
    }
    public java.util.List<ProxyDesc> getProxyDescList() {
        return this.proxyDescList;
    }

    public CreateBaasEbcPersonRequest setPublicDescList(java.util.List<PublicDesc> publicDescList) {
        this.publicDescList = publicDescList;
        return this;
    }
    public java.util.List<PublicDesc> getPublicDescList() {
        return this.publicDescList;
    }

    public CreateBaasEbcPersonRequest setSecondIdNo1(String secondIdNo1) {
        this.secondIdNo1 = secondIdNo1;
        return this;
    }
    public String getSecondIdNo1() {
        return this.secondIdNo1;
    }

    public CreateBaasEbcPersonRequest setSecondIdNo2(String secondIdNo2) {
        this.secondIdNo2 = secondIdNo2;
        return this;
    }
    public String getSecondIdNo2() {
        return this.secondIdNo2;
    }

    public CreateBaasEbcPersonRequest setSecondIdNo3(String secondIdNo3) {
        this.secondIdNo3 = secondIdNo3;
        return this;
    }
    public String getSecondIdNo3() {
        return this.secondIdNo3;
    }

    public CreateBaasEbcPersonRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class Cert extends TeaModel {
    // 证书编号
    @NameInMap("cert_code")
    @Validation(maxLength = 64)
    public String certCode;

    // 时间周期结束时间
    @NameInMap("cert_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String certEndTime;

    // 证书id
    @NameInMap("cert_id")
    @Validation(maxLength = 128)
    public String certId;

    // 证书名称-中文
    @NameInMap("cert_name_cn")
    @Validation(maxLength = 64)
    public String certNameCn;

    // 证书名称-英文（拼音）
    @NameInMap("cert_name_en")
    public String certNameEn;

    // 首次发布时间
    @NameInMap("cert_publish_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String certPublishTime;

    // 时间周期开始时间
    @NameInMap("cert_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String certStartTime;

    // 1-有效
    // 2-冻结
    // 3-失效
    // 4-作废
    // 5-其他
    @NameInMap("cert_status")
    public Long certStatus;

    // 实体证书图片url
    @NameInMap("cert_url")
    @Validation(maxLength = 256)
    public String certUrl;

    // 证书归属国家
    // 使用“ISO 3166-1”代码表-数字码
    // https://zh.wikipedia.org/wiki/ISO_3166-1
    @NameInMap("country")
    @Validation(maxLength = 32)
    public String country;

    // 1.长期有效
    // 2.时间周期
    @NameInMap("expire_type")
    public Long expireType;

    // 其他信息文件url
    @NameInMap("feature_url")
    @Validation(maxLength = 512)
    public String featureUrl;

    // 持有人的人脸图像url
    @NameInMap("holder_avatar")
    @Validation(maxLength = 256)
    public String holderAvatar;

    // 证书持有人姓名
    @NameInMap("holder_name")
    @Validation(maxLength = 64)
    public String holderName;

    // 证书等级类型：
    // 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
    @NameInMap("level")
    @Validation(maxLength = 32)
    public String level;

    // 企业did
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 企业名称
    @NameInMap("org_name")
    @Validation(maxLength = 64)
    public String orgName;

    // 证书持有人id
    @NameInMap("org_user_id")
    @Validation(maxLength = 128)
    public String orgUserId;

    // 持有人主证件编号，无身份证的个人使用0000000000000000
    @NameInMap("primary_id_no")
    @Validation(maxLength = 64)
    public String primaryIdNo;

    // 持有人辅助证件编号-1
    @NameInMap("second_id_no_1")
    @Validation(maxLength = 64)
    public String secondIdNo1;

    // 持有人辅助证件编号-2
    @NameInMap("second_id_no_2")
    @Validation(maxLength = 64)
    public String secondIdNo2;

    // 持有人辅助证件编号-3
    @NameInMap("second_id_no_3")
    @Validation(maxLength = 64)
    public String secondIdNo3;

    // -数字码类型为156时可使用如下类目：
    // --学历证书-XLZ
    // --职业证书--ZYZ
    // -其他国家传入--QT
    @NameInMap("type")
    public String type;

    public static Cert build(java.util.Map<String, ?> map) throws Exception {
        Cert self = new Cert();
        return TeaModel.build(map, self);
    }

    public Cert setCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }
    public String getCertCode() {
        return this.certCode;
    }

    public Cert setCertEndTime(String certEndTime) {
        this.certEndTime = certEndTime;
        return this;
    }
    public String getCertEndTime() {
        return this.certEndTime;
    }

    public Cert setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public Cert setCertNameCn(String certNameCn) {
        this.certNameCn = certNameCn;
        return this;
    }
    public String getCertNameCn() {
        return this.certNameCn;
    }

    public Cert setCertNameEn(String certNameEn) {
        this.certNameEn = certNameEn;
        return this;
    }
    public String getCertNameEn() {
        return this.certNameEn;
    }

    public Cert setCertPublishTime(String certPublishTime) {
        this.certPublishTime = certPublishTime;
        return this;
    }
    public String getCertPublishTime() {
        return this.certPublishTime;
    }

    public Cert setCertStartTime(String certStartTime) {
        this.certStartTime = certStartTime;
        return this;
    }
    public String getCertStartTime() {
        return this.certStartTime;
    }

    public Cert setCertStatus(Long certStatus) {
        this.certStatus = certStatus;
        return this;
    }
    public Long getCertStatus() {
        return this.certStatus;
    }

    public Cert setCertUrl(String certUrl) {
        this.certUrl = certUrl;
        return this;
    }
    public String getCertUrl() {
        return this.certUrl;
    }

    public Cert setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public Cert setExpireType(Long expireType) {
        this.expireType = expireType;
        return this;
    }
    public Long getExpireType() {
        return this.expireType;
    }

    public Cert setFeatureUrl(String featureUrl) {
        this.featureUrl = featureUrl;
        return this;
    }
    public String getFeatureUrl() {
        return this.featureUrl;
    }

    public Cert setHolderAvatar(String holderAvatar) {
        this.holderAvatar = holderAvatar;
        return this;
    }
    public String getHolderAvatar() {
        return this.holderAvatar;
    }

    public Cert setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }
    public String getHolderName() {
        return this.holderName;
    }

    public Cert setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public Cert setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public Cert setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public Cert setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId;
        return this;
    }
    public String getOrgUserId() {
        return this.orgUserId;
    }

    public Cert setPrimaryIdNo(String primaryIdNo) {
        this.primaryIdNo = primaryIdNo;
        return this;
    }
    public String getPrimaryIdNo() {
        return this.primaryIdNo;
    }

    public Cert setSecondIdNo1(String secondIdNo1) {
        this.secondIdNo1 = secondIdNo1;
        return this;
    }
    public String getSecondIdNo1() {
        return this.secondIdNo1;
    }

    public Cert setSecondIdNo2(String secondIdNo2) {
        this.secondIdNo2 = secondIdNo2;
        return this;
    }
    public String getSecondIdNo2() {
        return this.secondIdNo2;
    }

    public Cert setSecondIdNo3(String secondIdNo3) {
        this.secondIdNo3 = secondIdNo3;
        return this;
    }
    public String getSecondIdNo3() {
        return this.secondIdNo3;
    }

    public Cert setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

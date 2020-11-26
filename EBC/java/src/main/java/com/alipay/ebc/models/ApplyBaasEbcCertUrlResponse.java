// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class ApplyBaasEbcCertUrlResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 实体证书图片上传url，文件最大5M
    @NameInMap("cert_upload_url")
    public String certUploadUrl;

    // 其他信息文件上传url，文件最大5M
    // 
    @NameInMap("feature_upload_url")
    public String featureUploadUrl;

    // 持有人的人脸图像上传url，文件最大5M
    @NameInMap("holder_avatar_upload_url")
    public String holderAvatarUploadUrl;

    public static ApplyBaasEbcCertUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyBaasEbcCertUrlResponse self = new ApplyBaasEbcCertUrlResponse();
        return TeaModel.build(map, self);
    }

    public ApplyBaasEbcCertUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyBaasEbcCertUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyBaasEbcCertUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyBaasEbcCertUrlResponse setCertUploadUrl(String certUploadUrl) {
        this.certUploadUrl = certUploadUrl;
        return this;
    }
    public String getCertUploadUrl() {
        return this.certUploadUrl;
    }

    public ApplyBaasEbcCertUrlResponse setFeatureUploadUrl(String featureUploadUrl) {
        this.featureUploadUrl = featureUploadUrl;
        return this;
    }
    public String getFeatureUploadUrl() {
        return this.featureUploadUrl;
    }

    public ApplyBaasEbcCertUrlResponse setHolderAvatarUploadUrl(String holderAvatarUploadUrl) {
        this.holderAvatarUploadUrl = holderAvatarUploadUrl;
        return this;
    }
    public String getHolderAvatarUploadUrl() {
        return this.holderAvatarUploadUrl;
    }

}

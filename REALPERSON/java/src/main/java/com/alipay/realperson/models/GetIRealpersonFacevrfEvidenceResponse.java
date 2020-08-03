// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson.models;

import com.aliyun.tea.*;

public class GetIRealpersonFacevrfEvidenceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 刷脸的certifyId，原样返回
    @NameInMap("certify_id")
    public String certifyId;

    // 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
    @NameInMap("onchain_id")
    public String onchainId;

    // 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
    @NameInMap("onchain_status")
    public String onchainStatus;

    // 存证pdf文件内容的base64
    @NameInMap("pdf_content")
    public String pdfContent;

    // pdf存证是否已经过期，不支持超过6个月的存证获取
    @NameInMap("pdf_expired")
    public Boolean pdfExpired;

    public static GetIRealpersonFacevrfEvidenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIRealpersonFacevrfEvidenceResponse self = new GetIRealpersonFacevrfEvidenceResponse();
        return TeaModel.build(map, self);
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class QueryBaasEbcUserCertResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 证书id列表
    @NameInMap("cert_id_list")
    public java.util.List<String> certIdList;

    public static QueryBaasEbcUserCertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasEbcUserCertResponse self = new QueryBaasEbcUserCertResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasEbcUserCertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasEbcUserCertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasEbcUserCertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasEbcUserCertResponse setCertIdList(java.util.List<String> certIdList) {
        this.certIdList = certIdList;
        return this;
    }
    public java.util.List<String> getCertIdList() {
        return this.certIdList;
    }

}

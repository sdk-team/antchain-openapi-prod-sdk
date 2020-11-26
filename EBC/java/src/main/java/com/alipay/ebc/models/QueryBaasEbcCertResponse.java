// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class QueryBaasEbcCertResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 证书明细
    @NameInMap("cert")
    public Cert cert;

    public static QueryBaasEbcCertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasEbcCertResponse self = new QueryBaasEbcCertResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasEbcCertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasEbcCertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasEbcCertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasEbcCertResponse setCert(Cert cert) {
        this.cert = cert;
        return this;
    }
    public Cert getCert() {
        return this.cert;
    }

}

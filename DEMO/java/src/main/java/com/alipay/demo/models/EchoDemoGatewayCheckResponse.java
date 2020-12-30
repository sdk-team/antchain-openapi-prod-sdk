// This file is auto-generated, don't edit it. Thanks.
package com.alipay.demo.models;

import com.aliyun.tea.*;

public class EchoDemoGatewayCheckResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // aaa
    @NameInMap("ddd")
    public Long ddd;

    public static EchoDemoGatewayCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        EchoDemoGatewayCheckResponse self = new EchoDemoGatewayCheckResponse();
        return TeaModel.build(map, self);
    }

    public EchoDemoGatewayCheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EchoDemoGatewayCheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EchoDemoGatewayCheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EchoDemoGatewayCheckResponse setDdd(Long ddd) {
        this.ddd = ddd;
        return this;
    }
    public Long getDdd() {
        return this.ddd;
    }

}

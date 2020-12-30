// This file is auto-generated, don't edit it. Thanks.
package com.alipay.demo.models;

import com.aliyun.tea.*;

public class StatusDemoGatewayCheckResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    public static StatusDemoGatewayCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        StatusDemoGatewayCheckResponse self = new StatusDemoGatewayCheckResponse();
        return TeaModel.build(map, self);
    }

    public StatusDemoGatewayCheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StatusDemoGatewayCheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StatusDemoGatewayCheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}

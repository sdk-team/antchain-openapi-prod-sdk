// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class UpdateBaasEbcAuthStatusResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    public static UpdateBaasEbcAuthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasEbcAuthStatusResponse self = new UpdateBaasEbcAuthStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBaasEbcAuthStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBaasEbcAuthStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBaasEbcAuthStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}

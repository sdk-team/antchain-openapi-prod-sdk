// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class UpdateBaasEbcDataPriceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 更新失败的id列表
    @NameInMap("fail_list")
    public java.util.List<String> failList;

    public static UpdateBaasEbcDataPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasEbcDataPriceResponse self = new UpdateBaasEbcDataPriceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBaasEbcDataPriceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBaasEbcDataPriceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBaasEbcDataPriceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBaasEbcDataPriceResponse setFailList(java.util.List<String> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<String> getFailList() {
        return this.failList;
    }

}

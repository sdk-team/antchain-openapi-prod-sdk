// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class QueryBaasEbcConsumptionAmountResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 区间内的累计消费金额
    @NameInMap("amount")
    public Long amount;

    public static QueryBaasEbcConsumptionAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasEbcConsumptionAmountResponse self = new QueryBaasEbcConsumptionAmountResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasEbcConsumptionAmountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasEbcConsumptionAmountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasEbcConsumptionAmountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasEbcConsumptionAmountResponse setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

}

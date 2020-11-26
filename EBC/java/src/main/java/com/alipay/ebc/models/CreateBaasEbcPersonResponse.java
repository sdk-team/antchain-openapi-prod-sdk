// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcPersonResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 个人id
    @NameInMap("person_did")
    public String personDid;

    public static CreateBaasEbcPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcPersonResponse self = new CreateBaasEbcPersonResponse();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcPersonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBaasEbcPersonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBaasEbcPersonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBaasEbcPersonResponse setPersonDid(String personDid) {
        this.personDid = personDid;
        return this;
    }
    public String getPersonDid() {
        return this.personDid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class AddBaasEbcClassUserResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 加入失败的用户列表
    @NameInMap("fail_list")
    public java.util.List<OrgUser> failList;

    public static AddBaasEbcClassUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBaasEbcClassUserResponse self = new AddBaasEbcClassUserResponse();
        return TeaModel.build(map, self);
    }

    public AddBaasEbcClassUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddBaasEbcClassUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddBaasEbcClassUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddBaasEbcClassUserResponse setFailList(java.util.List<OrgUser> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<OrgUser> getFailList() {
        return this.failList;
    }

}

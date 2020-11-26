// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class DeleteBaasEbcClassUserResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 删除失败的用户列表
    @NameInMap("fail_list")
    public java.util.List<OrgUser> failList;

    public static DeleteBaasEbcClassUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaasEbcClassUserResponse self = new DeleteBaasEbcClassUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBaasEbcClassUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteBaasEbcClassUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteBaasEbcClassUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteBaasEbcClassUserResponse setFailList(java.util.List<OrgUser> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<OrgUser> getFailList() {
        return this.failList;
    }

}

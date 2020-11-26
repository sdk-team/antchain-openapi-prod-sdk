// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class DeleteBaasEbcCourseClassResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 删除失败的班级列表
    @NameInMap("fail_list")
    public java.util.List<Class> failList;

    public static DeleteBaasEbcCourseClassResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaasEbcCourseClassResponse self = new DeleteBaasEbcCourseClassResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBaasEbcCourseClassResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteBaasEbcCourseClassResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteBaasEbcCourseClassResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteBaasEbcCourseClassResponse setFailList(java.util.List<Class> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<Class> getFailList() {
        return this.failList;
    }

}

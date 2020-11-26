// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class AddBaasEbcCourseClassResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 添加失败的班级列表
    @NameInMap("fail_list")
    public java.util.List<Class> failList;

    public static AddBaasEbcCourseClassResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBaasEbcCourseClassResponse self = new AddBaasEbcCourseClassResponse();
        return TeaModel.build(map, self);
    }

    public AddBaasEbcCourseClassResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddBaasEbcCourseClassResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddBaasEbcCourseClassResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddBaasEbcCourseClassResponse setFailList(java.util.List<Class> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<Class> getFailList() {
        return this.failList;
    }

}

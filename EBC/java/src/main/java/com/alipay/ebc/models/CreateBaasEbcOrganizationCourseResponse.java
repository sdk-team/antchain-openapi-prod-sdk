// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcOrganizationCourseResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 课程did
    @NameInMap("course_id")
    public String courseId;

    public static CreateBaasEbcOrganizationCourseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcOrganizationCourseResponse self = new CreateBaasEbcOrganizationCourseResponse();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcOrganizationCourseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBaasEbcOrganizationCourseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBaasEbcOrganizationCourseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBaasEbcOrganizationCourseResponse setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }
    public String getCourseId() {
        return this.courseId;
    }

}

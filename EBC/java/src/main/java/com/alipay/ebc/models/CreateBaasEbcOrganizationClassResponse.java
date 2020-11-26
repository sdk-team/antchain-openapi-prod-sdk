// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcOrganizationClassResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 班级id
    @NameInMap("class_id")
    public String classId;

    public static CreateBaasEbcOrganizationClassResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcOrganizationClassResponse self = new CreateBaasEbcOrganizationClassResponse();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcOrganizationClassResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBaasEbcOrganizationClassResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBaasEbcOrganizationClassResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBaasEbcOrganizationClassResponse setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

}

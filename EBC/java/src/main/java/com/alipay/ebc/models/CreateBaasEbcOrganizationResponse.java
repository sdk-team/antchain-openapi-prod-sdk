// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcOrganizationResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 企业did
    @NameInMap("org_did")
    public String orgDid;

    public static CreateBaasEbcOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcOrganizationResponse self = new CreateBaasEbcOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcOrganizationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBaasEbcOrganizationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBaasEbcOrganizationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBaasEbcOrganizationResponse setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

}

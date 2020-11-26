// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class QueryBaasEbcClassUserResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 班级名称
    @NameInMap("class_name")
    public String className;

    // 企业用户id列表
    @NameInMap("org_user_id_list")
    public java.util.List<String> orgUserIdList;

    // 学员数量
    @NameInMap("user_num")
    public Long userNum;

    public static QueryBaasEbcClassUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasEbcClassUserResponse self = new QueryBaasEbcClassUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasEbcClassUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasEbcClassUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasEbcClassUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasEbcClassUserResponse setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public QueryBaasEbcClassUserResponse setOrgUserIdList(java.util.List<String> orgUserIdList) {
        this.orgUserIdList = orgUserIdList;
        return this;
    }
    public java.util.List<String> getOrgUserIdList() {
        return this.orgUserIdList;
    }

    public QueryBaasEbcClassUserResponse setUserNum(Long userNum) {
        this.userNum = userNum;
        return this;
    }
    public Long getUserNum() {
        return this.userNum;
    }

}

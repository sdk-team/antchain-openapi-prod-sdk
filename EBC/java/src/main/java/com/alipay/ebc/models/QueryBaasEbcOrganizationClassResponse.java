// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class QueryBaasEbcOrganizationClassResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 班级名称
    @NameInMap("class_name")
    public String className;

    // 1:有效、2:暂停、3:失效
    @NameInMap("class_status")
    public Long classStatus;

    // 创建时间
    @NameInMap("create_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createTime;

    // 修改时间
    @NameInMap("modify_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modifyTime;

    // 累计时长
    @NameInMap("period")
    public Long period;

    // 班级类型：线上、线下、混合
    @NameInMap("type")
    public String type;

    // 学员数量
    @NameInMap("user_num")
    public Long userNum;

    public static QueryBaasEbcOrganizationClassResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasEbcOrganizationClassResponse self = new QueryBaasEbcOrganizationClassResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasEbcOrganizationClassResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasEbcOrganizationClassResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasEbcOrganizationClassResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasEbcOrganizationClassResponse setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public QueryBaasEbcOrganizationClassResponse setClassStatus(Long classStatus) {
        this.classStatus = classStatus;
        return this;
    }
    public Long getClassStatus() {
        return this.classStatus;
    }

    public QueryBaasEbcOrganizationClassResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryBaasEbcOrganizationClassResponse setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public QueryBaasEbcOrganizationClassResponse setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public QueryBaasEbcOrganizationClassResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryBaasEbcOrganizationClassResponse setUserNum(Long userNum) {
        this.userNum = userNum;
        return this;
    }
    public Long getUserNum() {
        return this.userNum;
    }

}

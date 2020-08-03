// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson.models;

import com.aliyun.tea.*;

public class QueryIRealpersonFacevrfServerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 认证的主体信息，一般的认证场景返回为空
    @NameInMap("identity_info")
    public String identityInfo;

    // 认证主体附件信息，一般的认证场景都是返回空
    @NameInMap("material_info")
    public String materialInfo;

    // 认证材料哈希是否匹配
    @NameInMap("material_matched")
    public String materialMatched;

    // 是否通过，通过为T，不通过为F
    @NameInMap("passed")
    public String passed;

    // 业务失败原因
    @NameInMap("reason")
    public String reason;

    public static QueryIRealpersonFacevrfServerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIRealpersonFacevrfServerResponse self = new QueryIRealpersonFacevrfServerResponse();
        return TeaModel.build(map, self);
    }

}

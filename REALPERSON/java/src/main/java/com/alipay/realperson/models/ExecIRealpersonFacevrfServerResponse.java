// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson.models;

import com.aliyun.tea.*;

public class ExecIRealpersonFacevrfServerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 认证ID
    @NameInMap("certify_id")
    public String certifyId;

    // 是否通过，通过为T，不通过为F
    @NameInMap("passed")
    public String passed;

    // 业务失败原因
    @NameInMap("reason")
    public String reason;

    public static ExecIRealpersonFacevrfServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecIRealpersonFacevrfServerResponse self = new ExecIRealpersonFacevrfServerResponse();
        return TeaModel.build(map, self);
    }

}

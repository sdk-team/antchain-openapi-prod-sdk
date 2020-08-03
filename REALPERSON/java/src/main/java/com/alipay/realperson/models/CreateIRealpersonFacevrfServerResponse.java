// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson.models;

import com.aliyun.tea.*;

public class CreateIRealpersonFacevrfServerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 实人认证唯一标识
    @NameInMap("certify_id")
    public String certifyId;

    // 认证地址。只在特定场景返回。
    @NameInMap("certify_url")
    public String certifyUrl;

    public static CreateIRealpersonFacevrfServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIRealpersonFacevrfServerResponse self = new CreateIRealpersonFacevrfServerResponse();
        return TeaModel.build(map, self);
    }

}

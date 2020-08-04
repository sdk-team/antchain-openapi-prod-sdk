// This file is auto-generated, don't edit it. Thanks.
package com.alipay.gatewayx.models;

import com.aliyun.tea.*;

public class CreateNtcloudGatewayxBizeventMessageResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    public static CreateNtcloudGatewayxBizeventMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNtcloudGatewayxBizeventMessageResponse self = new CreateNtcloudGatewayxBizeventMessageResponse();
        return TeaModel.build(map, self);
    }

}

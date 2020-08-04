// This file is auto-generated, don't edit it. Thanks.
package com.alipay.gatewayx.models;

import com.aliyun.tea.*;

public class InvokerInfo extends TeaModel {
    // 调用渠道
    @NameInMap("invoke_channel")
    public String invokeChannel;

    // 渠道的用户id
    @NameInMap("invoke_channel_uid")
    public String invokeChannelUid;

    // 8位金融云租户ID
    @NameInMap("invoke_tenant")
    public String invokeTenant;

    // 调用者用户金融云id
    @NameInMap("invoke_user_id")
    public String invokeUserId;

    public static InvokerInfo build(java.util.Map<String, ?> map) throws Exception {
        InvokerInfo self = new InvokerInfo();
        return TeaModel.build(map, self);
    }

}

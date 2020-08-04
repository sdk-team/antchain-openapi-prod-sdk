// This file is auto-generated, don't edit it. Thanks.
package com.alipay.gatewayx.models;

import com.aliyun.tea.*;

public class CreateNtcloudGatewayxBizeventMessageRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 业务消息内容，json格式
    @NameInMap("biz_content")
    public String bizContent;

    // 消费方id，例如appId，tenantId，可以多个，多个之间使用","分割
    @NameInMap("consumer_id")
    public String consumerId;

    // 消费者类型，例如TENANT, APP
    @NameInMap("consumer_type")
    public String consumerType;

    // 消息发送过程中的唯一ID
    @NameInMap("msg_id")
    public String msgId;

    // 消息事件编码
    @NameInMap("msg_key")
    public String msgKey;

    // 消息类型，1：点对点，2: 广播消息
    @NameInMap("msg_type")
    public String msgType;

    // 二级消息主题,订阅方可以过滤消息
    @NameInMap("tags")
    public String tags;

    // 日期对应的timestamp
    @NameInMap("utc_timestamp")
    public Long utcTimestamp;

    public static CreateNtcloudGatewayxBizeventMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNtcloudGatewayxBizeventMessageRequest self = new CreateNtcloudGatewayxBizeventMessageRequest();
        return TeaModel.build(map, self);
    }

}

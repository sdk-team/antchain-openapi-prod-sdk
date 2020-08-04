// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GATEWAYX.Models
{
    public class CreateNtcloudGatewayxBizeventMessageRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("region_name")]
        [Validation(Required=false)]
        public string RegionName { get; set; }

        // 业务消息内容，json格式
        [NameInMap("biz_content")]
        [Validation(Required=false)]
        public string BizContent { get; set; }

        // 消费方id，例如appId，tenantId，可以多个，多个之间使用","分割
        [NameInMap("consumer_id")]
        [Validation(Required=false)]
        public string ConsumerId { get; set; }

        // 消费者类型，例如TENANT, APP
        [NameInMap("consumer_type")]
        [Validation(Required=false)]
        public string ConsumerType { get; set; }

        // 消息发送过程中的唯一ID
        [NameInMap("msg_id")]
        [Validation(Required=false)]
        public string MsgId { get; set; }

        // 消息事件编码
        [NameInMap("msg_key")]
        [Validation(Required=false)]
        public string MsgKey { get; set; }

        // 消息类型，1：点对点，2: 广播消息
        [NameInMap("msg_type")]
        [Validation(Required=false)]
        public string MsgType { get; set; }

        // 二级消息主题,订阅方可以过滤消息
        [NameInMap("tags")]
        [Validation(Required=false)]
        public string Tags { get; set; }

        // 日期对应的timestamp
        [NameInMap("utc_timestamp")]
        [Validation(Required=false)]
        public long UtcTimestamp { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class QueryRiskRequest : TeaModel {
        [NameInMap("biz_op")]
        [Validation(Required=false)]
        public string BizOp { get; set; }

        [NameInMap("biz_tag")]
        [Validation(Required=false)]
        public string BizTag { get; set; }

        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        [NameInMap("client_ip")]
        [Validation(Required=false)]
        public string ClientIp { get; set; }

        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public List<ExtraParamInfo> ExtParams { get; set; }

        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        [NameInMap("server_name")]
        [Validation(Required=false)]
        public string ServerName { get; set; }

        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        [NameInMap("token_id")]
        [Validation(Required=false)]
        public string TokenId { get; set; }

        [NameInMap("umid")]
        [Validation(Required=false)]
        public string Umid { get; set; }

    }

}

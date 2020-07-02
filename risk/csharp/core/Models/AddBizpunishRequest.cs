// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class AddBizpunishRequest : TeaModel {
        [NameInMap("action_code")]
        [Validation(Required=false)]
        public string ActionCode { get; set; }

        [NameInMap("action_type")]
        [Validation(Required=false)]
        public string ActionType { get; set; }

        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public string ExtParams { get; set; }

        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        [NameInMap("object_type")]
        [Validation(Required=false)]
        public string ObjectType { get; set; }

        [NameInMap("prod_code")]
        [Validation(Required=false)]
        public string ProdCode { get; set; }

        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        [NameInMap("risk_level")]
        [Validation(Required=false)]
        public string RiskLevel { get; set; }

        [NameInMap("src_request_id")]
        [Validation(Required=false)]
        public string SrcRequestId { get; set; }

        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}

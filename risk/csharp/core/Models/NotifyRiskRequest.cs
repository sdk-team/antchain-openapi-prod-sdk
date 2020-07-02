// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class NotifyRiskRequest : TeaModel {
        [NameInMap("biz_op")]
        [Validation(Required=false)]
        public string BizOp { get; set; }

        [NameInMap("biz_result")]
        [Validation(Required=false)]
        public bool? BizResult { get; set; }

        [NameInMap("biz_tag")]
        [Validation(Required=false)]
        public string BizTag { get; set; }

        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public List<ExtraParamInfo> ExtParams { get; set; }

        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        [NameInMap("security_id")]
        [Validation(Required=false)]
        public string SecurityId { get; set; }

        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

    }

}

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class RiskSwitchInfo : TeaModel {
        [NameInMap("biz_op")]
        [Validation(Required=false)]
        public string BizOp { get; set; }

        [NameInMap("biz_tag")]
        [Validation(Required=false)]
        public string BizTag { get; set; }

        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        [NameInMap("group")]
        [Validation(Required=false)]
        public string Group { get; set; }

        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        [NameInMap("sec_request_url")]
        [Validation(Required=false)]
        public string SecRequestUrl { get; set; }

        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}

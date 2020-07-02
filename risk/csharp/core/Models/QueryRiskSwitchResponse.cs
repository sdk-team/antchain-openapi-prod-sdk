// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class QueryRiskSwitchResponse : TeaModel {
        [NameInMap("risk_switch_info")]
        [Validation(Required=false)]
        public List<RiskSwitchInfo> RiskSwitchInfo { get; set; }

    }

}

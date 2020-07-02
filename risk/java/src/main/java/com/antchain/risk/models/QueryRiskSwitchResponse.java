// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class QueryRiskSwitchResponse extends TeaModel {
    @NameInMap("risk_switch_info")
    public java.util.List<RiskSwitchInfo> riskSwitchInfo;

    public static QueryRiskSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskSwitchResponse self = new QueryRiskSwitchResponse();
        return TeaModel.build(map, self);
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class QueryRiskSwitchRequest extends TeaModel {
    @NameInMap("biz_op")
    public String bizOp;

    @NameInMap("biz_tag")
    public String bizTag;

    @NameInMap("group")
    public String group;

    @NameInMap("sec_request_url")
    public String secRequestUrl;

    public static QueryRiskSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskSwitchRequest self = new QueryRiskSwitchRequest();
        return TeaModel.build(map, self);
    }

}

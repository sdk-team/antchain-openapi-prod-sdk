// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class RiskSwitchInfo extends TeaModel {
    @NameInMap("biz_op")
    public String bizOp;

    @NameInMap("biz_tag")
    public String bizTag;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("group")
    public String group;

    @NameInMap("id")
    public String id;

    @NameInMap("sec_request_url")
    public String secRequestUrl;

    @NameInMap("value")
    public String value;

    public static RiskSwitchInfo build(java.util.Map<String, ?> map) throws Exception {
        RiskSwitchInfo self = new RiskSwitchInfo();
        return TeaModel.build(map, self);
    }

}

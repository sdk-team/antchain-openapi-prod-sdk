// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class AddBizpunishRequest extends TeaModel {
    @NameInMap("action_code")
    public String actionCode;

    @NameInMap("action_type")
    public String actionType;

    @NameInMap("ext_params")
    public String extParams;

    @NameInMap("instance_id")
    public String instanceId;

    @NameInMap("object_type")
    public String objectType;

    @NameInMap("prod_code")
    public String prodCode;

    @NameInMap("reason")
    public String reason;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("risk_level")
    public String riskLevel;

    @NameInMap("src_request_id")
    public String srcRequestId;

    @NameInMap("tenant_id")
    public String tenantId;

    public static AddBizpunishRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBizpunishRequest self = new AddBizpunishRequest();
        return TeaModel.build(map, self);
    }

}

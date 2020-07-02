// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class NotifyRiskRequest extends TeaModel {
    @NameInMap("biz_op")
    public String bizOp;

    @NameInMap("biz_result")
    public Boolean bizResult;

    @NameInMap("biz_tag")
    public String bizTag;

    @NameInMap("ext_params")
    public java.util.List<ExtraParamInfo> extParams;

    @NameInMap("operator_id")
    public String operatorId;

    @NameInMap("security_id")
    public String securityId;

    @NameInMap("tenant")
    public String tenant;

    public static NotifyRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyRiskRequest self = new NotifyRiskRequest();
        return TeaModel.build(map, self);
    }

}

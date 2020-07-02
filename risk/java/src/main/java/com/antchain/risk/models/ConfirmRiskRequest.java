// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class ConfirmRiskRequest extends TeaModel {
    @NameInMap("biz_op")
    public String bizOp;

    @NameInMap("biz_tag")
    public String bizTag;

    @NameInMap("ext_params")
    public java.util.List<ExtraParamInfo> extParams;

    @NameInMap("operator_id")
    public String operatorId;

    @NameInMap("security_id")
    public String securityId;

    public static ConfirmRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRiskRequest self = new ConfirmRiskRequest();
        return TeaModel.build(map, self);
    }

}

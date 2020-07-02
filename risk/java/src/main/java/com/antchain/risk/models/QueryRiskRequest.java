// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class QueryRiskRequest extends TeaModel {
    @NameInMap("biz_op")
    public String bizOp;

    @NameInMap("biz_tag")
    public String bizTag;

    @NameInMap("callback_url")
    public String callbackUrl;

    @NameInMap("client_ip")
    public String clientIp;

    @NameInMap("ext_params")
    public java.util.List<ExtraParamInfo> extParams;

    @NameInMap("login_name")
    public String loginName;

    @NameInMap("operator_id")
    public String operatorId;

    @NameInMap("server_name")
    public String serverName;

    @NameInMap("tenant")
    public String tenant;

    @NameInMap("token_id")
    public String tokenId;

    @NameInMap("umid")
    public String umid;

    public static QueryRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskRequest self = new QueryRiskRequest();
        return TeaModel.build(map, self);
    }

}

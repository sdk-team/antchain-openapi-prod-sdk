// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class QueryRiskResponse extends TeaModel {
    @NameInMap("security_id")
    public String securityId;

    @NameInMap("sec_result")
    public String secResult;

    @NameInMap("template_code")
    public String templateCode;

    @NameInMap("template_desc")
    public String templateDesc;

    @NameInMap("verify_id")
    public String verifyId;

    @NameInMap("verify_url")
    public String verifyUrl;

    public static QueryRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskResponse self = new QueryRiskResponse();
        return TeaModel.build(map, self);
    }

}

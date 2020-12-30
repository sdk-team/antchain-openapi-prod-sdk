// This file is auto-generated, don't edit it. Thanks.
package com.alipay.demo.models;

import com.aliyun.tea.*;

public class EchoDemoGatewayCheckRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    public static EchoDemoGatewayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        EchoDemoGatewayCheckRequest self = new EchoDemoGatewayCheckRequest();
        return TeaModel.build(map, self);
    }

    public EchoDemoGatewayCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EchoDemoGatewayCheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EchoDemoGatewayCheckRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

}

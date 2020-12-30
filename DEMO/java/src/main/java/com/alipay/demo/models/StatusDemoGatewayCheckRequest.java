// This file is auto-generated, don't edit it. Thanks.
package com.alipay.demo.models;

import com.aliyun.tea.*;

public class StatusDemoGatewayCheckRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // ffff
    @NameInMap("aaaa")
    public Long aaaa;

    // ddddd
    @NameInMap("same")
    public java.util.List<DemoClass> same;

    public static StatusDemoGatewayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        StatusDemoGatewayCheckRequest self = new StatusDemoGatewayCheckRequest();
        return TeaModel.build(map, self);
    }

    public StatusDemoGatewayCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StatusDemoGatewayCheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StatusDemoGatewayCheckRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public StatusDemoGatewayCheckRequest setAaaa(Long aaaa) {
        this.aaaa = aaaa;
        return this;
    }
    public Long getAaaa() {
        return this.aaaa;
    }

    public StatusDemoGatewayCheckRequest setSame(java.util.List<DemoClass> same) {
        this.same = same;
        return this;
    }
    public java.util.List<DemoClass> getSame() {
        return this.same;
    }

}

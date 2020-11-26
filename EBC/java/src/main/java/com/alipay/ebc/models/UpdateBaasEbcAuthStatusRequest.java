// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class UpdateBaasEbcAuthStatusRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 授权关系id
    // 
    @NameInMap("auth_id")
    @Validation(maxLength = 256)
    public String authId;

    // 1:启用，2：禁用，3：停用
    @NameInMap("status")
    public Long status;

    // 消费方租户id
    // 
    @NameInMap("tenant_name")
    @Validation(maxLength = 64)
    public String tenantName;

    public static UpdateBaasEbcAuthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasEbcAuthStatusRequest self = new UpdateBaasEbcAuthStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaasEbcAuthStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBaasEbcAuthStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBaasEbcAuthStatusRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public UpdateBaasEbcAuthStatusRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public UpdateBaasEbcAuthStatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateBaasEbcAuthStatusRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}

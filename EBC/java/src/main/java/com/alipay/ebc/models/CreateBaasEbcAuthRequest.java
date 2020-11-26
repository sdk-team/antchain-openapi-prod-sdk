// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcAuthRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 授权关系结束时间
    @NameInMap("auth_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String authEndTime;

    // 授权关系开始时间
    @NameInMap("auth_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String authStartTime;

    // 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
    @NameInMap("data_type")
    public Long dataType;

    // 授权目标数据id列表，最多20个
    @NameInMap("target_id_list")
    public java.util.List<String> targetIdList;

    // 1.数据,2.机构,3.认证方,4.ALL
    @NameInMap("target_type")
    public Long targetType;

    // 消费方租户id
    @NameInMap("tenant_name")
    @Validation(maxLength = 64)
    public String tenantName;

    public static CreateBaasEbcAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcAuthRequest self = new CreateBaasEbcAuthRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasEbcAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasEbcAuthRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateBaasEbcAuthRequest setAuthEndTime(String authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public String getAuthEndTime() {
        return this.authEndTime;
    }

    public CreateBaasEbcAuthRequest setAuthStartTime(String authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public String getAuthStartTime() {
        return this.authStartTime;
    }

    public CreateBaasEbcAuthRequest setDataType(Long dataType) {
        this.dataType = dataType;
        return this;
    }
    public Long getDataType() {
        return this.dataType;
    }

    public CreateBaasEbcAuthRequest setTargetIdList(java.util.List<String> targetIdList) {
        this.targetIdList = targetIdList;
        return this;
    }
    public java.util.List<String> getTargetIdList() {
        return this.targetIdList;
    }

    public CreateBaasEbcAuthRequest setTargetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }
    public Long getTargetType() {
        return this.targetType;
    }

    public CreateBaasEbcAuthRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}

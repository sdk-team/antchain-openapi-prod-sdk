// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class UpdateBaasEbcDataPriceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 目标数据id列表，最多20个
    @NameInMap("data_id_list")
    public java.util.List<String> dataIdList;

    // 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
    @NameInMap("data_type")
    public Long dataType;

    // 数据价值
    @NameInMap("price")
    public Long price;

    public static UpdateBaasEbcDataPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasEbcDataPriceRequest self = new UpdateBaasEbcDataPriceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaasEbcDataPriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBaasEbcDataPriceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBaasEbcDataPriceRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public UpdateBaasEbcDataPriceRequest setDataIdList(java.util.List<String> dataIdList) {
        this.dataIdList = dataIdList;
        return this;
    }
    public java.util.List<String> getDataIdList() {
        return this.dataIdList;
    }

    public UpdateBaasEbcDataPriceRequest setDataType(Long dataType) {
        this.dataType = dataType;
        return this;
    }
    public Long getDataType() {
        return this.dataType;
    }

    public UpdateBaasEbcDataPriceRequest setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

}

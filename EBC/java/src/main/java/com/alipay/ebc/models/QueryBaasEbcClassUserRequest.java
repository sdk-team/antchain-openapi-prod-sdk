// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class QueryBaasEbcClassUserRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 班级id
    @NameInMap("class_id")
    @Validation(maxLength = 128)
    public String classId;

    // 企业did
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    public static QueryBaasEbcClassUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasEbcClassUserRequest self = new QueryBaasEbcClassUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasEbcClassUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasEbcClassUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasEbcClassUserRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public QueryBaasEbcClassUserRequest setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public QueryBaasEbcClassUserRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class AddBaasEbcClassUserRequest extends TeaModel {
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

    // 企业id
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 企业用户列表,最多一次传入50个
    @NameInMap("org_user_list")
    public java.util.List<OrgUser> orgUserList;

    public static AddBaasEbcClassUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBaasEbcClassUserRequest self = new AddBaasEbcClassUserRequest();
        return TeaModel.build(map, self);
    }

    public AddBaasEbcClassUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddBaasEbcClassUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddBaasEbcClassUserRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public AddBaasEbcClassUserRequest setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public AddBaasEbcClassUserRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public AddBaasEbcClassUserRequest setOrgUserList(java.util.List<OrgUser> orgUserList) {
        this.orgUserList = orgUserList;
        return this;
    }
    public java.util.List<OrgUser> getOrgUserList() {
        return this.orgUserList;
    }

}

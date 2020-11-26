// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class AddBaasEbcCourseUserRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 课程id
    @NameInMap("course_id")
    @Validation(maxLength = 128)
    public String courseId;

    // 企业id
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 企业用户列表,最多一次传入50个
    @NameInMap("org_user_list")
    public java.util.List<OrgUser> orgUserList;

    public static AddBaasEbcCourseUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBaasEbcCourseUserRequest self = new AddBaasEbcCourseUserRequest();
        return TeaModel.build(map, self);
    }

    public AddBaasEbcCourseUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddBaasEbcCourseUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddBaasEbcCourseUserRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public AddBaasEbcCourseUserRequest setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }
    public String getCourseId() {
        return this.courseId;
    }

    public AddBaasEbcCourseUserRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public AddBaasEbcCourseUserRequest setOrgUserList(java.util.List<OrgUser> orgUserList) {
        this.orgUserList = orgUserList;
        return this;
    }
    public java.util.List<OrgUser> getOrgUserList() {
        return this.orgUserList;
    }

}

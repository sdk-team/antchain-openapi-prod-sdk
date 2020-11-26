// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class DeleteBaasEbcCourseUserRequest extends TeaModel {
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

    public static DeleteBaasEbcCourseUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaasEbcCourseUserRequest self = new DeleteBaasEbcCourseUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBaasEbcCourseUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteBaasEbcCourseUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteBaasEbcCourseUserRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public DeleteBaasEbcCourseUserRequest setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }
    public String getCourseId() {
        return this.courseId;
    }

    public DeleteBaasEbcCourseUserRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public DeleteBaasEbcCourseUserRequest setOrgUserList(java.util.List<OrgUser> orgUserList) {
        this.orgUserList = orgUserList;
        return this;
    }
    public java.util.List<OrgUser> getOrgUserList() {
        return this.orgUserList;
    }

}

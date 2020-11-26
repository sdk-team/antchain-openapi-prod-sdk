// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class DeleteBaasEbcCourseClassRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 班级列表,最多一次传入50个
    @NameInMap("class_list")
    public java.util.List<Class> classList;

    // 课程id
    @NameInMap("course_id")
    @Validation(maxLength = 128)
    public String courseId;

    // 企业id
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    public static DeleteBaasEbcCourseClassRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaasEbcCourseClassRequest self = new DeleteBaasEbcCourseClassRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBaasEbcCourseClassRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteBaasEbcCourseClassRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteBaasEbcCourseClassRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public DeleteBaasEbcCourseClassRequest setClassList(java.util.List<Class> classList) {
        this.classList = classList;
        return this;
    }
    public java.util.List<Class> getClassList() {
        return this.classList;
    }

    public DeleteBaasEbcCourseClassRequest setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }
    public String getCourseId() {
        return this.courseId;
    }

    public DeleteBaasEbcCourseClassRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

}

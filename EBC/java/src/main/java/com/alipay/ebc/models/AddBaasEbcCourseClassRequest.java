// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class AddBaasEbcCourseClassRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 班级列表,最多一次传入50个
    @NameInMap("class_list")
    public java.util.List<Class> classList;

    // 班级id
    @NameInMap("course_id")
    @Validation(maxLength = 128)
    public String courseId;

    // 企业id
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    public static AddBaasEbcCourseClassRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBaasEbcCourseClassRequest self = new AddBaasEbcCourseClassRequest();
        return TeaModel.build(map, self);
    }

    public AddBaasEbcCourseClassRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddBaasEbcCourseClassRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddBaasEbcCourseClassRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public AddBaasEbcCourseClassRequest setClassList(java.util.List<Class> classList) {
        this.classList = classList;
        return this;
    }
    public java.util.List<Class> getClassList() {
        return this.classList;
    }

    public AddBaasEbcCourseClassRequest setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }
    public String getCourseId() {
        return this.courseId;
    }

    public AddBaasEbcCourseClassRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

}

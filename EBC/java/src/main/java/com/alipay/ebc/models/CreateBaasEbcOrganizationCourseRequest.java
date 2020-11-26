// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class CreateBaasEbcOrganizationCourseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 课程结束时间
    @NameInMap("course_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String courseEndTime;

    // 课程名称
    @NameInMap("course_name")
    @Validation(maxLength = 64)
    public String courseName;

    // 课程开始时间
    @NameInMap("course_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String courseStartTime;

    // 企业did
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 课程时长
    @NameInMap("period")
    public Long period;

    public static CreateBaasEbcOrganizationCourseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasEbcOrganizationCourseRequest self = new CreateBaasEbcOrganizationCourseRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasEbcOrganizationCourseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasEbcOrganizationCourseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasEbcOrganizationCourseRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateBaasEbcOrganizationCourseRequest setCourseEndTime(String courseEndTime) {
        this.courseEndTime = courseEndTime;
        return this;
    }
    public String getCourseEndTime() {
        return this.courseEndTime;
    }

    public CreateBaasEbcOrganizationCourseRequest setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }
    public String getCourseName() {
        return this.courseName;
    }

    public CreateBaasEbcOrganizationCourseRequest setCourseStartTime(String courseStartTime) {
        this.courseStartTime = courseStartTime;
        return this;
    }
    public String getCourseStartTime() {
        return this.courseStartTime;
    }

    public CreateBaasEbcOrganizationCourseRequest setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public CreateBaasEbcOrganizationCourseRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

}

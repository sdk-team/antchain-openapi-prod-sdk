// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson.models;

import com.aliyun.tea.*;

public class ExecIRealpersonFacevrfServerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 真实姓名
    @NameInMap("cert_name")
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型，如身份证
    @NameInMap("cert_type")
    public String certType;

    // 预留扩展参数
    @NameInMap("extern_param")
    public String externParam;

    // 待认证的人脸图像，base64编码格式
    @NameInMap("facial_picture_auth")
    public String facialPictureAuth;

    // 自定义比对源人脸图像，base64编码格式
    @NameInMap("facial_picture_ref")
    public String facialPictureRef;

    // 身份信息来源类型，如证件
    @NameInMap("identity_type")
    public String identityType;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    public String outerOrderNo;

    // 场景ID
    @NameInMap("scene_id")
    public String sceneId;

    // 商户自定义的用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户的IP
    @NameInMap("user_ip")
    public String userIp;

    // 用户的手机号（或其哈希值）
    @NameInMap("user_mobile")
    public String userMobile;

    public static ExecIRealpersonFacevrfServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecIRealpersonFacevrfServerRequest self = new ExecIRealpersonFacevrfServerRequest();
        return TeaModel.build(map, self);
    }

}
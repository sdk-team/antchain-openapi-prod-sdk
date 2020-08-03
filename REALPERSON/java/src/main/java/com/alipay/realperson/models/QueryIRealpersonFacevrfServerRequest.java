// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson.models;

import com.aliyun.tea.*;

public class QueryIRealpersonFacevrfServerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 实人认证唯一标识
    @NameInMap("certify_id")
    public String certifyId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    // 认证材料（如人脸图像）的哈希
    @NameInMap("material_hash")
    public String materialHash;

    // 外部唯一标识。用于定位。
    // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    public String outerOrderNo;

    // 场景ID
    @NameInMap("scene_id")
    public String sceneId;

    public static QueryIRealpersonFacevrfServerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIRealpersonFacevrfServerRequest self = new QueryIRealpersonFacevrfServerRequest();
        return TeaModel.build(map, self);
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.alipay.gatewayx.models;

import com.aliyun.tea.*;

public class CreateNtcloudGatewayxFileUploadResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 上传有效期
    @NameInMap("expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String expiredTime;

    // 32位文件唯一id
    @NameInMap("file_id")
    public String fileId;

    // 放入http请求头里
    @NameInMap("upload_headers")
    public java.util.List<NameValuePair> uploadHeaders;

    // 文件上传地址
    @NameInMap("upload_url")
    public String uploadUrl;

    public static CreateNtcloudGatewayxFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNtcloudGatewayxFileUploadResponse self = new CreateNtcloudGatewayxFileUploadResponse();
        return TeaModel.build(map, self);
    }

}

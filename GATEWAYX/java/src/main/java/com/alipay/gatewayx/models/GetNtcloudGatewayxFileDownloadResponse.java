// This file is auto-generated, don't edit it. Thanks.
package com.alipay.gatewayx.models;

import com.aliyun.tea.*;

public class GetNtcloudGatewayxFileDownloadResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 创建文件使用的apiCode
    @NameInMap("api_code")
    public String apiCode;

    // 文件下载地址
    @NameInMap("download_url")
    public String downloadUrl;

    // 下载超时时间
    @NameInMap("expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String expiredTime;

    // 文件标签
    @NameInMap("file_label")
    public String fileLabel;

    // 请求上传时的自定义元数据
    @NameInMap("file_metadata")
    public String fileMetadata;

    // 文件名
    @NameInMap("file_name")
    public String fileName;

    // 文件路径
    @NameInMap("file_path")
    public String filePath;

    // 文件大小
    @NameInMap("file_size")
    public Long fileSize;

    // 上传的调用者信息
    @NameInMap("upload_invoker")
    public InvokerInfo uploadInvoker;

    public static GetNtcloudGatewayxFileDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNtcloudGatewayxFileDownloadResponse self = new GetNtcloudGatewayxFileDownloadResponse();
        return TeaModel.build(map, self);
    }

}

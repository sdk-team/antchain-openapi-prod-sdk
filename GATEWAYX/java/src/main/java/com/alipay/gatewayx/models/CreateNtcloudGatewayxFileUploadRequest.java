// This file is auto-generated, don't edit it. Thanks.
package com.alipay.gatewayx.models;

import com.aliyun.tea.*;

public class CreateNtcloudGatewayxFileUploadRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 产品方的api归属集群，即productInstanceId
    @NameInMap("api_cluster")
    public String apiCluster;

    // 上传文件作用的openapi method
    @NameInMap("api_code")
    public String apiCode;

    // 文件标签，多个标签;分割
    @NameInMap("file_label")
    @Validation(maxLength = 100)
    public String fileLabel;

    // 自定义的文件元数据
    @NameInMap("file_metadata")
    @Validation(maxLength = 1000)
    public String fileMetadata;

    // 文件名，不传则随机生成文件名
    @NameInMap("file_name")
    @Validation(maxLength = 100)
    public String fileName;

    // 文件的多媒体类型
    @NameInMap("mime_type")
    public String mimeType;

    public static CreateNtcloudGatewayxFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNtcloudGatewayxFileUploadRequest self = new CreateNtcloudGatewayxFileUploadRequest();
        return TeaModel.build(map, self);
    }

}

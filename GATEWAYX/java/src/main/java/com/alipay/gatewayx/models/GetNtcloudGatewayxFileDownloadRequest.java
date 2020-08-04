// This file is auto-generated, don't edit it. Thanks.
package com.alipay.gatewayx.models;

import com.aliyun.tea.*;

public class GetNtcloudGatewayxFileDownloadRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("region_name")
    public String regionName;

    // 文件唯一id
    @NameInMap("file_id")
    public String fileId;

    public static GetNtcloudGatewayxFileDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNtcloudGatewayxFileDownloadRequest self = new GetNtcloudGatewayxFileDownloadRequest();
        return TeaModel.build(map, self);
    }

}

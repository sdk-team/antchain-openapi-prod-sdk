// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson.models;

import com.aliyun.tea.*;

public class GetIRealpersonFacevrfEvidenceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 某次刷脸的certifyId
    @NameInMap("certify_id")
    public String certifyId;

    public static GetIRealpersonFacevrfEvidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIRealpersonFacevrfEvidenceRequest self = new GetIRealpersonFacevrfEvidenceRequest();
        return TeaModel.build(map, self);
    }

}

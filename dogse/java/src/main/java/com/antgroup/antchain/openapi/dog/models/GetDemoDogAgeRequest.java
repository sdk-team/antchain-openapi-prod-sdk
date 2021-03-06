// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dog.models;

import com.aliyun.tea.*;

public class GetDemoDogAgeRequest extends TeaModel {
    @NameInMap("auth_token")
    @Validation(required = true)
    public String authToken;

    // 狗狗的id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static GetDemoDogAgeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDemoDogAgeRequest self = new GetDemoDogAgeRequest();
        return TeaModel.build(map, self);
    }

    public GetDemoDogAgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDemoDogAgeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

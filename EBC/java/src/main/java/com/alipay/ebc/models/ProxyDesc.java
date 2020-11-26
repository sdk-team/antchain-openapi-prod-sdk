// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class ProxyDesc extends TeaModel {
    // 属性名称
    @NameInMap("attribute_name")
    @Validation(maxLength = 64)
    public String attributeName;

    // 是否托管
    @NameInMap("is_proxy")
    public Boolean isProxy;

    public static ProxyDesc build(java.util.Map<String, ?> map) throws Exception {
        ProxyDesc self = new ProxyDesc();
        return TeaModel.build(map, self);
    }

    public ProxyDesc setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public ProxyDesc setIsProxy(Boolean isProxy) {
        this.isProxy = isProxy;
        return this;
    }
    public Boolean getIsProxy() {
        return this.isProxy;
    }

}

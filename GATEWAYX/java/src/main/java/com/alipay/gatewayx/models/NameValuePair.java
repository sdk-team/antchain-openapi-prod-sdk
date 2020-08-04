// This file is auto-generated, don't edit it. Thanks.
package com.alipay.gatewayx.models;

import com.aliyun.tea.*;

public class NameValuePair extends TeaModel {
    // 键名
    @NameInMap("name")
    public String name;

    // 键值
    @NameInMap("value")
    public String value;

    public static NameValuePair build(java.util.Map<String, ?> map) throws Exception {
        NameValuePair self = new NameValuePair();
        return TeaModel.build(map, self);
    }

}

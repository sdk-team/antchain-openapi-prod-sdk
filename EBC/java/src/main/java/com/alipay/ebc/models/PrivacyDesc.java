// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class PrivacyDesc extends TeaModel {
    // 属性名称
    // 
    @NameInMap("attribute_name")
    @Validation(maxLength = 64)
    public String attributeName;

    // 隐私等级：
    // 1：数据可以全量明文查询
    // 2：数据仅可以通过数据比较查询
    @NameInMap("privacy_level")
    public Long privacyLevel;

    public static PrivacyDesc build(java.util.Map<String, ?> map) throws Exception {
        PrivacyDesc self = new PrivacyDesc();
        return TeaModel.build(map, self);
    }

    public PrivacyDesc setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public PrivacyDesc setPrivacyLevel(Long privacyLevel) {
        this.privacyLevel = privacyLevel;
        return this;
    }
    public Long getPrivacyLevel() {
        return this.privacyLevel;
    }

}

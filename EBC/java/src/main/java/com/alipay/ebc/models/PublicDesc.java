// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class PublicDesc extends TeaModel {
    // 属性名称
    @NameInMap("attribute_name")
    @Validation(maxLength = 64)
    public String attributeName;

    // 是否公开
    @NameInMap("is_public")
    public Boolean isPublic;

    public static PublicDesc build(java.util.Map<String, ?> map) throws Exception {
        PublicDesc self = new PublicDesc();
        return TeaModel.build(map, self);
    }

    public PublicDesc setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public PublicDesc setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

}

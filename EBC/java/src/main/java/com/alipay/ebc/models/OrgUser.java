// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc.models;

import com.aliyun.tea.*;

public class OrgUser extends TeaModel {
    // 企业did
    @NameInMap("org_did")
    @Validation(maxLength = 128)
    public String orgDid;

    // 企业用户id
    @NameInMap("org_user_id")
    @Validation(maxLength = 128)
    public String orgUserId;

    public static OrgUser build(java.util.Map<String, ?> map) throws Exception {
        OrgUser self = new OrgUser();
        return TeaModel.build(map, self);
    }

    public OrgUser setOrgDid(String orgDid) {
        this.orgDid = orgDid;
        return this;
    }
    public String getOrgDid() {
        return this.orgDid;
    }

    public OrgUser setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId;
        return this;
    }
    public String getOrgUserId() {
        return this.orgUserId;
    }

}

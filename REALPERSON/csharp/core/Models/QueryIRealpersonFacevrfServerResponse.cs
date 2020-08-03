// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryIRealpersonFacevrfServerResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 认证的主体信息，一般的认证场景返回为空
        [NameInMap("identity_info")]
        [Validation(Required=false)]
        public string IdentityInfo { get; set; }

        // 认证主体附件信息，一般的认证场景都是返回空
        [NameInMap("material_info")]
        [Validation(Required=false)]
        public string MaterialInfo { get; set; }

        // 认证材料哈希是否匹配
        [NameInMap("material_matched")]
        [Validation(Required=false)]
        public string MaterialMatched { get; set; }

        // 是否通过，通过为T，不通过为F
        [NameInMap("passed")]
        [Validation(Required=false)]
        public string Passed { get; set; }

        // 业务失败原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

    }

}

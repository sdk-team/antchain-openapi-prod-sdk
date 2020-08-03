// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CreateIRealpersonFacevrfServerResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 实人认证唯一标识
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

        // 认证地址。只在特定场景返回。
        [NameInMap("certify_url")]
        [Validation(Required=false)]
        public string CertifyUrl { get; set; }

    }

}

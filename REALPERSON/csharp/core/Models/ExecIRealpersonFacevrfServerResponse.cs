// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class ExecIRealpersonFacevrfServerResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 认证ID
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

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

// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class GetIRealpersonFacevrfEvidenceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 某次刷脸的certifyId
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

    }

}

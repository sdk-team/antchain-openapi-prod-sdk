// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class QueryRiskResponse : TeaModel {
        [NameInMap("security_id")]
        [Validation(Required=false)]
        public string SecurityId { get; set; }

        [NameInMap("sec_result")]
        [Validation(Required=false)]
        public string SecResult { get; set; }

        [NameInMap("template_code")]
        [Validation(Required=false)]
        public string TemplateCode { get; set; }

        [NameInMap("template_desc")]
        [Validation(Required=false)]
        public string TemplateDesc { get; set; }

        [NameInMap("verify_id")]
        [Validation(Required=false)]
        public string VerifyId { get; set; }

        [NameInMap("verify_url")]
        [Validation(Required=false)]
        public string VerifyUrl { get; set; }

    }

}

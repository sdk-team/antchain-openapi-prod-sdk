// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DOG.Models
{
    public class GetDemoDogAgeRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=true)]
        public string AuthToken { get; set; }

        // 狗狗的id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}

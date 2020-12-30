// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class StatusDemoGatewayCheckRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("region_name")]
        [Validation(Required=false)]
        public string RegionName { get; set; }

        // ffff
        [NameInMap("aaaa")]
        [Validation(Required=false)]
        public long? Aaaa { get; set; }

        // ddddd
        [NameInMap("same")]
        [Validation(Required=false)]
        public List<DemoClass> Same { get; set; }

    }

}

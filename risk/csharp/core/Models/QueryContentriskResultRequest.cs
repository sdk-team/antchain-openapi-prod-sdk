// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class QueryContentriskResultRequest : TeaModel {
        [NameInMap("app_scene")]
        [Validation(Required=false)]
        public string AppScene { get; set; }

        [NameInMap("app_scene_data_id")]
        [Validation(Required=false)]
        public string AppSceneDataId { get; set; }

        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

    }

}

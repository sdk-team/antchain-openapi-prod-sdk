// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class AnalyzeContentriskResponse : TeaModel {
        [NameInMap("app_scene_data_id")]
        [Validation(Required=false, MaxLength=0)]
        public string AppSceneDataId { get; set; }

        [NameInMap("event_id")]
        [Validation(Required=false, MaxLength=0)]
        public string EventId { get; set; }

        [NameInMap("need_query")]
        [Validation(Required=false, MaxLength=0)]
        public string NeedQuery { get; set; }

        [NameInMap("reason")]
        [Validation(Required=false, MaxLength=0)]
        public string Reason { get; set; }

        [NameInMap("result_action")]
        [Validation(Required=false, MaxLength=0)]
        public string ResultAction { get; set; }

    }

}

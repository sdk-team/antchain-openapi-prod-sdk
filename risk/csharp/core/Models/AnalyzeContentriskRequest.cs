// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Risk.Models
{
    public class AnalyzeContentriskRequest : TeaModel {
        [NameInMap("app_main_scene")]
        [Validation(Required=false, MaxLength=0)]
        public string AppMainScene { get; set; }

        [NameInMap("app_main_scene_id")]
        [Validation(Required=false, MaxLength=0)]
        public string AppMainSceneId { get; set; }

        [NameInMap("app_name")]
        [Validation(Required=false, MaxLength=0)]
        public string AppName { get; set; }

        [NameInMap("app_scene")]
        [Validation(Required=false, MaxLength=0)]
        public string AppScene { get; set; }

        [NameInMap("app_scene_data_id")]
        [Validation(Required=false, MaxLength=0)]
        public string AppSceneDataId { get; set; }

        [NameInMap("audio_urls")]
        [Validation(Required=false, MaxLength=0)]
        public List<string> AudioUrls { get; set; }

        [NameInMap("link_urls")]
        [Validation(Required=false, MaxLength=0)]
        public List<string> LinkUrls { get; set; }

        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        [NameInMap("picture_urls")]
        [Validation(Required=false, MaxLength=0)]
        public List<string> PictureUrls { get; set; }

        [NameInMap("publish_date")]
        [Validation(Required=false, MaxLength=0, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")]
        public string PublishDate { get; set; }

        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        [NameInMap("text")]
        [Validation(Required=false, MaxLength=0)]
        public string Text { get; set; }

        [NameInMap("video_urls")]
        [Validation(Required=false, MaxLength=0)]
        public List<string> VideoUrls { get; set; }

    }

}

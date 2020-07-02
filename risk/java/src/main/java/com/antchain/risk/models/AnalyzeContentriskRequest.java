// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class AnalyzeContentriskRequest extends TeaModel {
    @NameInMap("app_main_scene")
    public String appMainScene;

    @NameInMap("app_main_scene_id")
    public String appMainSceneId;

    @NameInMap("app_name")
    public String appName;

    @NameInMap("app_scene")
    public String appScene;

    @NameInMap("app_scene_data_id")
    public String appSceneDataId;

    @NameInMap("audio_urls")
    public java.util.List<String> audioUrls;

    @NameInMap("link_urls")
    public java.util.List<String> linkUrls;

    @NameInMap("operator_id")
    public String operatorId;

    @NameInMap("picture_urls")
    public java.util.List<String> pictureUrls;

    @NameInMap("publish_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?")
    public String publishDate;

    @NameInMap("tenant")
    public String tenant;

    @NameInMap("text")
    public String text;

    @NameInMap("video_urls")
    public java.util.List<String> videoUrls;

    public static AnalyzeContentriskRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeContentriskRequest self = new AnalyzeContentriskRequest();
        return TeaModel.build(map, self);
    }

}

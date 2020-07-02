// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class AnalyzeContentriskResponse extends TeaModel {
    @NameInMap("app_scene_data_id")
    public String appSceneDataId;

    @NameInMap("event_id")
    public String eventId;

    @NameInMap("need_query")
    public String needQuery;

    @NameInMap("reason")
    public String reason;

    @NameInMap("result_action")
    public String resultAction;

    public static AnalyzeContentriskResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeContentriskResponse self = new AnalyzeContentriskResponse();
        return TeaModel.build(map, self);
    }

}

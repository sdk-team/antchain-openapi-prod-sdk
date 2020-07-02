// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

public class QueryContentriskResultRequest extends TeaModel {
    @NameInMap("app_scene")
    public String appScene;

    @NameInMap("app_scene_data_id")
    public String appSceneDataId;

    @NameInMap("event_id")
    public String eventId;

    public static QueryContentriskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentriskResultRequest self = new QueryContentriskResultRequest();
        return TeaModel.build(map, self);
    }

}

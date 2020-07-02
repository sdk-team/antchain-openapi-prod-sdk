// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk.models;

import com.aliyun.tea.*;

/**
 * Model for initing client
 */
public class Config extends TeaModel {
    @NameInMap("accessKeyId")
    public String accessKeyId;

    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    @NameInMap("authToken")
    public String authToken;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("readTimeout")
    public Integer readTimeout;

    @NameInMap("connectTimeout")
    public Integer connectTimeout;

    @NameInMap("httpProxy")
    public String httpProxy;

    @NameInMap("httpsProxy")
    public String httpsProxy;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("noProxy")
    public String noProxy;

    @NameInMap("maxIdleConns")
    public Integer maxIdleConns;

    @NameInMap("userAgent")
    public String userAgent;

    @NameInMap("socks5Proxy")
    public String socks5Proxy;

    @NameInMap("socks5NetWork")
    public String socks5NetWork;

    @NameInMap("tenant")
    public String tenant;

    @NameInMap("workspace")
    public String workspace;

    public static Config build(java.util.Map<String, ?> map) throws Exception {
        Config self = new Config();
        return TeaModel.build(map, self);
    }

}

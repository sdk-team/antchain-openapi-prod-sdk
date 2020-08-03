// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson.models;

import com.aliyun.tea.*;

/**
 * Model for initing client
 */
public class Config extends TeaModel {
    // accesskey id
    @NameInMap("accessKeyId")
    public String accessKeyId;

    // accesskey secret
    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    // security token
    @NameInMap("securityToken")
    public String securityToken;

    // http protocol
    @NameInMap("protocol")
    public String protocol;

    // read timeout
    @NameInMap("readTimeout")
    public Integer readTimeout;

    // connect timeout
    @NameInMap("connectTimeout")
    public Integer connectTimeout;

    // http proxy
    @NameInMap("httpProxy")
    public String httpProxy;

    // https proxy
    @NameInMap("httpsProxy")
    public String httpsProxy;

    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    // proxy white list
    @NameInMap("noProxy")
    public String noProxy;

    // max idle conns
    @NameInMap("maxIdleConns")
    public Integer maxIdleConns;

    // user agent
    @NameInMap("userAgent")
    public String userAgent;

    // socks5 proxy
    @NameInMap("socks5Proxy")
    public String socks5Proxy;

    // socks5 network
    @NameInMap("socks5NetWork")
    public String socks5NetWork;

    public static Config build(java.util.Map<String, ?> map) throws Exception {
        Config self = new Config();
        return TeaModel.build(map, self);
    }

}

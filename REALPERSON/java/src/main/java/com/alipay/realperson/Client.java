// This file is auto-generated, don't edit it. Thanks.
package com.alipay.realperson;

import com.aliyun.tea.*;
import com.alipay.realperson.models.*;

public class Client {

    public String _endpoint;
    public String _regionId;
    public String _accessKeyId;
    public String _accessKeySecret;
    public String _protocol;
    public String _userAgent;
    public Integer _readTimeout;
    public Integer _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Integer _maxIdleConns;
    public String _securityToken;
    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "ParameterMissing"),
                new TeaPair("message", "'config' can not be unset")
            ));
        }

        this._accessKeyId = config.accessKeyId;
        this._accessKeySecret = config.accessKeySecret;
        this._securityToken = config.securityToken;
        this._endpoint = config.endpoint;
        this._protocol = config.protocol;
        this._userAgent = config.userAgent;
        this._readTimeout = config.readTimeout;
        this._connectTimeout = config.connectTimeout;
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = config.maxIdleConns;
    }

    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

        TeaRequest _lastRequest = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = com.aliyun.teautil.Common.defaultString(_protocol, protocol);
                request_.method = method;
                request_.pathname = pathname;
                request_.query = TeaConverter.buildMap(
                    new TeaPair("method", action),
                    new TeaPair("version", version),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.antchain.alipayutil.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.aliyun.teautil.Common.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("charset", "UTF-8"),
                    new TeaPair("baseSdkVersion", "Tea-SDK"),
                    new TeaPair("sdkVersion", "Tea-SDK-20200804")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", _endpoint),
                    new TeaPair("user-agent", this.getUserAgent())
                );
                java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.anyifyMapValue(com.aliyun.common.Common.query(request));
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toFormString(tmp));
                request_.headers.put("content-type", "application/x-www-form-urlencoded");
                java.util.Map<String, String> signedParam = TeaConverter.merge(String.class,
                    request_.query,
                    com.aliyun.common.Common.query(request)
                );
                request_.query.put("sign", com.antchain.alipayutil.Client.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                Object obj = com.aliyun.teautil.Common.readAsJSON(response_.body);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antchain.alipayutil.Client.hasError(res)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    continue;
                }
                throw e;
            }
        }

        throw new TeaUnretryableException(_lastRequest);
    }

    /**
     * Get user agent
     * @return user agent
     */
    public String getUserAgent() throws Exception {
        String userAgent = "TeaClient/1.0.0";
        return com.aliyun.teautil.Common.getUserAgent(userAgent);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询
     */
    public QueryIRealpersonFacevrfServerResponse queryIRealpersonFacevrfServer(QueryIRealpersonFacevrfServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryIRealpersonFacevrfServerEx(request, runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询
     */
    public QueryIRealpersonFacevrfServerResponse queryIRealpersonFacevrfServerEx(QueryIRealpersonFacevrfServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryIRealpersonFacevrfServerResponse());
    }

    /**
     * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建
     */
    public CreateIRealpersonFacevrfServerResponse createIRealpersonFacevrfServer(CreateIRealpersonFacevrfServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIRealpersonFacevrfServerEx(request, runtime);
    }

    /**
     * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建
     */
    public CreateIRealpersonFacevrfServerResponse createIRealpersonFacevrfServerEx(CreateIRealpersonFacevrfServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateIRealpersonFacevrfServerResponse());
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对
     */
    public ExecIRealpersonFacevrfServerResponse execIRealpersonFacevrfServer(ExecIRealpersonFacevrfServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.execIRealpersonFacevrfServerEx(request, runtime);
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对
     */
    public ExecIRealpersonFacevrfServerResponse execIRealpersonFacevrfServerEx(ExecIRealpersonFacevrfServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new ExecIRealpersonFacevrfServerResponse());
    }

    /**
     * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID
     */
    public GetIRealpersonFacevrfEvidenceResponse getIRealpersonFacevrfEvidence(GetIRealpersonFacevrfEvidenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIRealpersonFacevrfEvidenceEx(request, runtime);
    }

    /**
     * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID
     */
    public GetIRealpersonFacevrfEvidenceResponse getIRealpersonFacevrfEvidenceEx(GetIRealpersonFacevrfEvidenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new GetIRealpersonFacevrfEvidenceResponse());
    }
}

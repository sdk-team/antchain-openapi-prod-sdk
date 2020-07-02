// This file is auto-generated, don't edit it. Thanks.
package com.antchain.risk;

import com.aliyun.tea.*;
import com.antchain.risk.models.*;

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
    public String _authToken;
    public String _tenant;
    public String _workspace;
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
        this._tenant = config.tenant;
        this._workspace = config.workspace;
        this._endpoint = config.endpoint;
        this._authToken = config.authToken;
        this._protocol = config.protocol;
        this._regionId = config.regionId;
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

    public java.util.Map<String, ?> doRequest(String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
                    new TeaPair("version", "1.0"),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.antchain.alipayutil.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.aliyun.teautil.Common.getNonce())
                );
                if (!com.aliyun.teautil.Common.empty(_tenant)) {
                    request_.query.put("tenant", _tenant);
                }

                if (!com.aliyun.teautil.Common.empty(_workspace)) {
                    request_.query.put("workspace", _workspace);
                }

                if (!com.aliyun.teautil.Common.empty(_authToken)) {
                    request_.query.put("auth_token", _authToken);
                } else {
                    request_.query.put("access_key", _accessKeyId);
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
        String userAgent = com.aliyun.teautil.Common.getUserAgent(_userAgent);
        return userAgent;
    }

    /**
     * Description: 风控新增业务处罚API，用于新增业务处罚信息
     * Summary: 风控新增业务处罚API
     */
    public AddBizpunishResponse addBizpunish(AddBizpunishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBizpunishEx(request, runtime);
    }

    /**
     * Description: 风控新增业务处罚API，用于新增业务处罚信息
     * Summary: 风控新增业务处罚API
     */
    public AddBizpunishResponse addBizpunishEx(AddBizpunishRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("antcloud.riskcontrol.bizpunish.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new AddBizpunishResponse());
    }

    /**
     * Description: 风险结果确认（后端进行doublecheck），用于业务执行前，业务方发起风险确认，判定对应的操作是否确实安全
     * Summary: 风险结果确认
     */
    public ConfirmRiskResponse confirmRisk(ConfirmRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmRiskEx(request, runtime);
    }

    /**
     * Description: 风险结果确认（后端进行doublecheck），用于业务执行前，业务方发起风险确认，判定对应的操作是否确实安全
     * Summary: 风险结果确认
     */
    public ConfirmRiskResponse confirmRiskEx(ConfirmRiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("antcloud.riskcontrol.risk.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new ConfirmRiskResponse());
    }

    /**
     * Description: 查询风险事件的开关信息
     * Summary: 查询风险事件的开关信息
     */
    public QueryRiskSwitchResponse queryRiskSwitch(QueryRiskSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRiskSwitchEx(request, runtime);
    }

    /**
     * Description: 查询风险事件的开关信息
     * Summary: 查询风险事件的开关信息
     */
    public QueryRiskSwitchResponse queryRiskSwitchEx(QueryRiskSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("antcloud.riskcontrol.risk.switch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryRiskSwitchResponse());
    }

    /**
     * Description: 风险事件查询API，用于查询当前业务是否存在风险
     * Summary: 风险事件查询API
     */
    public QueryRiskResponse queryRisk(QueryRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRiskEx(request, runtime);
    }

    /**
     * Description: 风险事件查询API，用于查询当前业务是否存在风险
     * Summary: 风险事件查询API
     */
    public QueryRiskResponse queryRiskEx(QueryRiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("antcloud.riskcontrol.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryRiskResponse());
    }

    /**
     * Description: 内容风险分析API，用于分析当前内容是否存在风险
     * Summary: 内容风险分析API
     */
    public AnalyzeContentriskResponse analyzeContentrisk(AnalyzeContentriskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.analyzeContentriskEx(request, runtime);
    }

    /**
     * Description: 内容风险分析API，用于分析当前内容是否存在风险
     * Summary: 内容风险分析API
     */
    public AnalyzeContentriskResponse analyzeContentriskEx(AnalyzeContentriskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("antcloud.riskcontrol.contentrisk.analyze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new AnalyzeContentriskResponse());
    }

    /**
     * Description: 业务处理完成后，将结果通知给风险
     * Summary: 业务结果通知
     */
    public NotifyRiskResponse notifyRisk(NotifyRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.notifyRiskEx(request, runtime);
    }

    /**
     * Description: 业务处理完成后，将结果通知给风险
     * Summary: 业务结果通知
     */
    public NotifyRiskResponse notifyRiskEx(NotifyRiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("antcloud.riskcontrol.risk.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new NotifyRiskResponse());
    }

    /**
     * Description: 内容风险分析结果查询API，用于风险分析结果的异步查询
     * Summary: 内容风险分析结果查询API
     */
    public QueryContentriskResultResponse queryContentriskResult(QueryContentriskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryContentriskResultEx(request, runtime);
    }

    /**
     * Description: 内容风险分析结果查询API，用于风险分析结果的异步查询
     * Summary: 内容风险分析结果查询API
     */
    public QueryContentriskResultResponse queryContentriskResultEx(QueryContentriskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("antcloud.riskcontrol.contentrisk.result.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryContentriskResultResponse());
    }
}

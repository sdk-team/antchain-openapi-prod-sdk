// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Risk.Models;

namespace AntChain.SDK.Risk
{
    public class Client 
    {
        protected string _endpoint;
        protected string _regionId;
        protected string _accessKeyId;
        protected string _accessKeySecret;
        protected string _protocol;
        protected string _userAgent;
        protected int? _readTimeout;
        protected int? _connectTimeout;
        protected string _httpProxy;
        protected string _httpsProxy;
        protected string _socks5Proxy;
        protected string _socks5NetWork;
        protected string _noProxy;
        protected int? _maxIdleConns;
        protected string _authToken;
        protected string _tenant;
        protected string _workspace;

        /**
         * Init client with Config
         * @param config config contains the necessary information to create a client
         */
        public Client(Config config)
        {
            if (AlibabaCloud.TeaUtil.Common.IsUnset(config.ToMap()))
            {
                throw new TeaException(new Dictionary<string, string>
                {
                    {"code", "ParameterMissing"},
                    {"message", "'config' can not be unset"},
                });
            }
            this._accessKeyId = config.AccessKeyId;
            this._accessKeySecret = config.AccessKeySecret;
            this._tenant = config.Tenant;
            this._workspace = config.Workspace;
            this._endpoint = config.Endpoint;
            this._authToken = config.AuthToken;
            this._protocol = config.Protocol;
            this._regionId = config.RegionId;
            this._userAgent = config.UserAgent;
            this._readTimeout = config.ReadTimeout;
            this._connectTimeout = config.ConnectTimeout;
            this._httpProxy = config.HttpProxy;
            this._httpsProxy = config.HttpsProxy;
            this._noProxy = config.NoProxy;
            this._socks5Proxy = config.Socks5Proxy;
            this._socks5NetWork = config.Socks5NetWork;
            this._maxIdleConns = config.MaxIdleConns;
        }

        /**
         * Encapsulate the request and invoke the network
         * @param action api name
         * @param protocol http or https
         * @param method e.g. GET
         * @param pathname pathname of every api
         * @param request which contains request params
         * @param runtime which controls some details of call api, such as retry times
         * @return the response
         */
        public Dictionary<string, object> DoRequest(string action, string protocol, string method, string pathname, Dictionary<string, object> request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"timeouted", "retry"},
                {"readTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ReadTimeout, _readTimeout)},
                {"connectTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ConnectTimeout, _connectTimeout)},
                {"httpProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpProxy, _httpProxy)},
                {"httpsProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpsProxy, _httpsProxy)},
                {"noProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.NoProxy, _noProxy)},
                {"maxIdleConns", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxIdleConns, _maxIdleConns)},
                {"retry", new Dictionary<string, object>
                {
                    {"retryable", runtime.Autoretry},
                    {"maxAttempts", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxAttempts, 3)},
                }},
                {"backoff", new Dictionary<string, object>
                {
                    {"policy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.BackoffPolicy, "no")},
                    {"period", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.BackoffPeriod, 1)},
                }},
                {"ignoreSSL", runtime.IgnoreSSL},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Protocol = AlibabaCloud.TeaUtil.Common.DefaultString(_protocol, protocol);
                    request_.Method = method;
                    request_.Pathname = pathname;
                    request_.Query = new Dictionary<string, string>
                    {
                        {"method", action},
                        {"version", "1.0"},
                        {"sign_type", "HmacSHA1"},
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AlibabaCloud.TeaUtil.Common.GetNonce()},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_tenant))
                    {
                        request_.Query["tenant"] = _tenant;
                    }
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_workspace))
                    {
                        request_.Query["workspace"] = _workspace;
                    }
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_authToken))
                    {
                        request_.Query["auth_token"] = _authToken;
                    }
                    else
                    {
                        request_.Query["access_key"] = _accessKeyId;
                    }
                    request_.Headers = new Dictionary<string, string>
                    {
                        {"host", _endpoint},
                        {"user-agent", GetUserAgent()},
                    };
                    Dictionary<string, object> tmp = AlibabaCloud.TeaUtil.Common.AnyifyMapValue(AlibabaCloud.Commons.Common.Query(request));
                    request_.Body = TeaCore.BytesReadable(AlibabaCloud.TeaUtil.Common.ToFormString(tmp));
                    request_.Headers["content-type"] = "application/x-www-form-urlencoded";
                    Dictionary<string, string> signedParam = TeaConverter.merge<string>
                    (
                        request_.Query,
                        AlibabaCloud.Commons.Common.Query(request)
                    );
                    request_.Query["sign"] = AntChain.AlipayUtil.Client.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = TeaCore.DoAction(request_, runtime_);

                    object obj = AlibabaCloud.TeaUtil.Common.ReadAsJSON(response_.Body);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.Client.HasError(res))
                    {
                        throw new TeaException(new Dictionary<string, object>
                        {
                            {"message", resp.Get("result_msg")},
                            {"data", resp},
                            {"code", resp.Get("result_code")},
                        });
                    }
                    return resp;
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
        }

        /**
         * Encapsulate the request and invoke the network
         * @param action api name
         * @param protocol http or https
         * @param method e.g. GET
         * @param pathname pathname of every api
         * @param request which contains request params
         * @param runtime which controls some details of call api, such as retry times
         * @return the response
         */
        public async Task<Dictionary<string, object>> DoRequestAsync(string action, string protocol, string method, string pathname, Dictionary<string, object> request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"timeouted", "retry"},
                {"readTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ReadTimeout, _readTimeout)},
                {"connectTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ConnectTimeout, _connectTimeout)},
                {"httpProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpProxy, _httpProxy)},
                {"httpsProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpsProxy, _httpsProxy)},
                {"noProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.NoProxy, _noProxy)},
                {"maxIdleConns", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxIdleConns, _maxIdleConns)},
                {"retry", new Dictionary<string, object>
                {
                    {"retryable", runtime.Autoretry},
                    {"maxAttempts", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxAttempts, 3)},
                }},
                {"backoff", new Dictionary<string, object>
                {
                    {"policy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.BackoffPolicy, "no")},
                    {"period", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.BackoffPeriod, 1)},
                }},
                {"ignoreSSL", runtime.IgnoreSSL},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Protocol = AlibabaCloud.TeaUtil.Common.DefaultString(_protocol, protocol);
                    request_.Method = method;
                    request_.Pathname = pathname;
                    request_.Query = new Dictionary<string, string>
                    {
                        {"method", action},
                        {"version", "1.0"},
                        {"sign_type", "HmacSHA1"},
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AlibabaCloud.TeaUtil.Common.GetNonce()},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_tenant))
                    {
                        request_.Query["tenant"] = _tenant;
                    }
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_workspace))
                    {
                        request_.Query["workspace"] = _workspace;
                    }
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_authToken))
                    {
                        request_.Query["auth_token"] = _authToken;
                    }
                    else
                    {
                        request_.Query["access_key"] = _accessKeyId;
                    }
                    request_.Headers = new Dictionary<string, string>
                    {
                        {"host", _endpoint},
                        {"user-agent", GetUserAgent()},
                    };
                    Dictionary<string, object> tmp = AlibabaCloud.TeaUtil.Common.AnyifyMapValue(AlibabaCloud.Commons.Common.Query(request));
                    request_.Body = TeaCore.BytesReadable(AlibabaCloud.TeaUtil.Common.ToFormString(tmp));
                    request_.Headers["content-type"] = "application/x-www-form-urlencoded";
                    Dictionary<string, string> signedParam = TeaConverter.merge<string>
                    (
                        request_.Query,
                        AlibabaCloud.Commons.Common.Query(request)
                    );
                    request_.Query["sign"] = AntChain.AlipayUtil.Client.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = await TeaCore.DoActionAsync(request_, runtime_);

                    object obj = AlibabaCloud.TeaUtil.Common.ReadAsJSON(response_.Body);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.Client.HasError(res))
                    {
                        throw new TeaException(new Dictionary<string, object>
                        {
                            {"message", resp.Get("result_msg")},
                            {"data", resp},
                            {"code", resp.Get("result_code")},
                        });
                    }
                    return resp;
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
        }

        /**
         * Get user agent
         * @return user agent
         */
        public string GetUserAgent()
        {
            string userAgent = AlibabaCloud.TeaUtil.Common.GetUserAgent(_userAgent);
            return userAgent;
        }

        /**
         * Description: 风控新增业务处罚API，用于新增业务处罚信息
         * Summary: 风控新增业务处罚API
         */
        public AddBizpunishResponse AddBizpunish(AddBizpunishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AddBizpunishEx(request, runtime);
        }

        /**
         * Description: 风控新增业务处罚API，用于新增业务处罚信息
         * Summary: 风控新增业务处罚API
         */
        public async Task<AddBizpunishResponse> AddBizpunishAsync(AddBizpunishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AddBizpunishExAsync(request, runtime);
        }

        /**
         * Description: 风控新增业务处罚API，用于新增业务处罚信息
         * Summary: 风控新增业务处罚API
         */
        public AddBizpunishResponse AddBizpunishEx(AddBizpunishRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBizpunishResponse>(DoRequest("antcloud.riskcontrol.bizpunish.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 风控新增业务处罚API，用于新增业务处罚信息
         * Summary: 风控新增业务处罚API
         */
        public async Task<AddBizpunishResponse> AddBizpunishExAsync(AddBizpunishRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBizpunishResponse>(await DoRequestAsync("antcloud.riskcontrol.bizpunish.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 风险结果确认（后端进行doublecheck），用于业务执行前，业务方发起风险确认，判定对应的操作是否确实安全
         * Summary: 风险结果确认
         */
        public ConfirmRiskResponse ConfirmRisk(ConfirmRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ConfirmRiskEx(request, runtime);
        }

        /**
         * Description: 风险结果确认（后端进行doublecheck），用于业务执行前，业务方发起风险确认，判定对应的操作是否确实安全
         * Summary: 风险结果确认
         */
        public async Task<ConfirmRiskResponse> ConfirmRiskAsync(ConfirmRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ConfirmRiskExAsync(request, runtime);
        }

        /**
         * Description: 风险结果确认（后端进行doublecheck），用于业务执行前，业务方发起风险确认，判定对应的操作是否确实安全
         * Summary: 风险结果确认
         */
        public ConfirmRiskResponse ConfirmRiskEx(ConfirmRiskRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRiskResponse>(DoRequest("antcloud.riskcontrol.risk.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 风险结果确认（后端进行doublecheck），用于业务执行前，业务方发起风险确认，判定对应的操作是否确实安全
         * Summary: 风险结果确认
         */
        public async Task<ConfirmRiskResponse> ConfirmRiskExAsync(ConfirmRiskRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRiskResponse>(await DoRequestAsync("antcloud.riskcontrol.risk.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 查询风险事件的开关信息
         * Summary: 查询风险事件的开关信息
         */
        public QueryRiskSwitchResponse QueryRiskSwitch(QueryRiskSwitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryRiskSwitchEx(request, runtime);
        }

        /**
         * Description: 查询风险事件的开关信息
         * Summary: 查询风险事件的开关信息
         */
        public async Task<QueryRiskSwitchResponse> QueryRiskSwitchAsync(QueryRiskSwitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryRiskSwitchExAsync(request, runtime);
        }

        /**
         * Description: 查询风险事件的开关信息
         * Summary: 查询风险事件的开关信息
         */
        public QueryRiskSwitchResponse QueryRiskSwitchEx(QueryRiskSwitchRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskSwitchResponse>(DoRequest("antcloud.riskcontrol.risk.switch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 查询风险事件的开关信息
         * Summary: 查询风险事件的开关信息
         */
        public async Task<QueryRiskSwitchResponse> QueryRiskSwitchExAsync(QueryRiskSwitchRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskSwitchResponse>(await DoRequestAsync("antcloud.riskcontrol.risk.switch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 风险事件查询API，用于查询当前业务是否存在风险
         * Summary: 风险事件查询API
         */
        public QueryRiskResponse QueryRisk(QueryRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryRiskEx(request, runtime);
        }

        /**
         * Description: 风险事件查询API，用于查询当前业务是否存在风险
         * Summary: 风险事件查询API
         */
        public async Task<QueryRiskResponse> QueryRiskAsync(QueryRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryRiskExAsync(request, runtime);
        }

        /**
         * Description: 风险事件查询API，用于查询当前业务是否存在风险
         * Summary: 风险事件查询API
         */
        public QueryRiskResponse QueryRiskEx(QueryRiskRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskResponse>(DoRequest("antcloud.riskcontrol.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 风险事件查询API，用于查询当前业务是否存在风险
         * Summary: 风险事件查询API
         */
        public async Task<QueryRiskResponse> QueryRiskExAsync(QueryRiskRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskResponse>(await DoRequestAsync("antcloud.riskcontrol.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 内容风险分析API，用于分析当前内容是否存在风险
         * Summary: 内容风险分析API
         */
        public AnalyzeContentriskResponse AnalyzeContentrisk(AnalyzeContentriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return AnalyzeContentriskEx(request, runtime);
        }

        /**
         * Description: 内容风险分析API，用于分析当前内容是否存在风险
         * Summary: 内容风险分析API
         */
        public async Task<AnalyzeContentriskResponse> AnalyzeContentriskAsync(AnalyzeContentriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await AnalyzeContentriskExAsync(request, runtime);
        }

        /**
         * Description: 内容风险分析API，用于分析当前内容是否存在风险
         * Summary: 内容风险分析API
         */
        public AnalyzeContentriskResponse AnalyzeContentriskEx(AnalyzeContentriskRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AnalyzeContentriskResponse>(DoRequest("antcloud.riskcontrol.contentrisk.analyze", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 内容风险分析API，用于分析当前内容是否存在风险
         * Summary: 内容风险分析API
         */
        public async Task<AnalyzeContentriskResponse> AnalyzeContentriskExAsync(AnalyzeContentriskRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AnalyzeContentriskResponse>(await DoRequestAsync("antcloud.riskcontrol.contentrisk.analyze", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 业务处理完成后，将结果通知给风险
         * Summary: 业务结果通知
         */
        public NotifyRiskResponse NotifyRisk(NotifyRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return NotifyRiskEx(request, runtime);
        }

        /**
         * Description: 业务处理完成后，将结果通知给风险
         * Summary: 业务结果通知
         */
        public async Task<NotifyRiskResponse> NotifyRiskAsync(NotifyRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await NotifyRiskExAsync(request, runtime);
        }

        /**
         * Description: 业务处理完成后，将结果通知给风险
         * Summary: 业务结果通知
         */
        public NotifyRiskResponse NotifyRiskEx(NotifyRiskRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyRiskResponse>(DoRequest("antcloud.riskcontrol.risk.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 业务处理完成后，将结果通知给风险
         * Summary: 业务结果通知
         */
        public async Task<NotifyRiskResponse> NotifyRiskExAsync(NotifyRiskRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyRiskResponse>(await DoRequestAsync("antcloud.riskcontrol.risk.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 内容风险分析结果查询API，用于风险分析结果的异步查询
         * Summary: 内容风险分析结果查询API
         */
        public QueryContentriskResultResponse QueryContentriskResult(QueryContentriskResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryContentriskResultEx(request, runtime);
        }

        /**
         * Description: 内容风险分析结果查询API，用于风险分析结果的异步查询
         * Summary: 内容风险分析结果查询API
         */
        public async Task<QueryContentriskResultResponse> QueryContentriskResultAsync(QueryContentriskResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryContentriskResultExAsync(request, runtime);
        }

        /**
         * Description: 内容风险分析结果查询API，用于风险分析结果的异步查询
         * Summary: 内容风险分析结果查询API
         */
        public QueryContentriskResultResponse QueryContentriskResultEx(QueryContentriskResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentriskResultResponse>(DoRequest("antcloud.riskcontrol.contentrisk.result.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 内容风险分析结果查询API，用于风险分析结果的异步查询
         * Summary: 内容风险分析结果查询API
         */
        public async Task<QueryContentriskResultResponse> QueryContentriskResultExAsync(QueryContentriskResultRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentriskResultResponse>(await DoRequestAsync("antcloud.riskcontrol.contentrisk.result.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

    }
}

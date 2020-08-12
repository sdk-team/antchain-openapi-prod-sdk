// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.REALPERSON.Models;

namespace AntChain.SDK.REALPERSON
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
        protected string _securityToken;

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
            this._securityToken = config.SecurityToken;
            this._endpoint = config.Endpoint;
            this._protocol = config.Protocol;
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
        public Dictionary<string, object> DoRequest(string version, string action, string protocol, string method, string pathname, Dictionary<string, object> request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
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
                        {"version", version},
                        {"sign_type", "HmacSHA1"},
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AlibabaCloud.TeaUtil.Common.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"charset", "UTF-8"},
                        {"baseSdkVersion", "Tea-SDK"},
                        {"sdkVersion", "Tea-SDK-20200812"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
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
        public async Task<Dictionary<string, object>> DoRequestAsync(string version, string action, string protocol, string method, string pathname, Dictionary<string, object> request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
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
                        {"version", version},
                        {"sign_type", "HmacSHA1"},
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AlibabaCloud.TeaUtil.Common.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"charset", "UTF-8"},
                        {"baseSdkVersion", "Tea-SDK"},
                        {"sdkVersion", "Tea-SDK-20200812"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
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
            string userAgent = "TeaClient/1.0.0";
            return AlibabaCloud.TeaUtil.Common.GetUserAgent(userAgent);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public QueryIRealpersonFacevrfServerResponse QueryIRealpersonFacevrfServer(QueryIRealpersonFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return QueryIRealpersonFacevrfServerEx(request, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public async Task<QueryIRealpersonFacevrfServerResponse> QueryIRealpersonFacevrfServerAsync(QueryIRealpersonFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await QueryIRealpersonFacevrfServerExAsync(request, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public QueryIRealpersonFacevrfServerResponse QueryIRealpersonFacevrfServerEx(QueryIRealpersonFacevrfServerRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIRealpersonFacevrfServerResponse>(DoRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 认证查询
         */
        public async Task<QueryIRealpersonFacevrfServerResponse> QueryIRealpersonFacevrfServerExAsync(QueryIRealpersonFacevrfServerRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIRealpersonFacevrfServerResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
         * Summary: 认证创建
         */
        public CreateIRealpersonFacevrfServerResponse CreateIRealpersonFacevrfServer(CreateIRealpersonFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return CreateIRealpersonFacevrfServerEx(request, runtime);
        }

        /**
         * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
         * Summary: 认证创建
         */
        public async Task<CreateIRealpersonFacevrfServerResponse> CreateIRealpersonFacevrfServerAsync(CreateIRealpersonFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await CreateIRealpersonFacevrfServerExAsync(request, runtime);
        }

        /**
         * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
         * Summary: 认证创建
         */
        public CreateIRealpersonFacevrfServerResponse CreateIRealpersonFacevrfServerEx(CreateIRealpersonFacevrfServerRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIRealpersonFacevrfServerResponse>(DoRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
         * Summary: 认证创建
         */
        public async Task<CreateIRealpersonFacevrfServerResponse> CreateIRealpersonFacevrfServerExAsync(CreateIRealpersonFacevrfServerRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIRealpersonFacevrfServerResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对
         */
        public ExecIRealpersonFacevrfServerResponse ExecIRealpersonFacevrfServer(ExecIRealpersonFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return ExecIRealpersonFacevrfServerEx(request, runtime);
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对
         */
        public async Task<ExecIRealpersonFacevrfServerResponse> ExecIRealpersonFacevrfServerAsync(ExecIRealpersonFacevrfServerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await ExecIRealpersonFacevrfServerExAsync(request, runtime);
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对
         */
        public ExecIRealpersonFacevrfServerResponse ExecIRealpersonFacevrfServerEx(ExecIRealpersonFacevrfServerRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIRealpersonFacevrfServerResponse>(DoRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
         * Summary: 纯服务端比对
         */
        public async Task<ExecIRealpersonFacevrfServerResponse> ExecIRealpersonFacevrfServerExAsync(ExecIRealpersonFacevrfServerRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIRealpersonFacevrfServerResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
         * Summary: 商户获取司法链上刷脸存证和统一证据ID
         */
        public GetIRealpersonFacevrfEvidenceResponse GetIRealpersonFacevrfEvidence(GetIRealpersonFacevrfEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return GetIRealpersonFacevrfEvidenceEx(request, runtime);
        }

        /**
         * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
         * Summary: 商户获取司法链上刷脸存证和统一证据ID
         */
        public async Task<GetIRealpersonFacevrfEvidenceResponse> GetIRealpersonFacevrfEvidenceAsync(GetIRealpersonFacevrfEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            return await GetIRealpersonFacevrfEvidenceExAsync(request, runtime);
        }

        /**
         * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
         * Summary: 商户获取司法链上刷脸存证和统一证据ID
         */
        public GetIRealpersonFacevrfEvidenceResponse GetIRealpersonFacevrfEvidenceEx(GetIRealpersonFacevrfEvidenceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIRealpersonFacevrfEvidenceResponse>(DoRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

        /**
         * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
         * Summary: 商户获取司法链上刷脸存证和统一证据ID
         */
        public async Task<GetIRealpersonFacevrfEvidenceResponse> GetIRealpersonFacevrfEvidenceExAsync(GetIRealpersonFacevrfEvidenceRequest request, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIRealpersonFacevrfEvidenceResponse>(await DoRequestAsync("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), runtime));
        }

    }
}

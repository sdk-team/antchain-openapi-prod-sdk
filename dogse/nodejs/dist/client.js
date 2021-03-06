"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
    result["default"] = mod;
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
// This file is auto-generated, don't edit it
const alipay_util_1 = __importDefault(require("@antchain/alipay-util"));
const tea_util_1 = __importStar(require("@alicloud/tea-util")), $Util = tea_util_1;
const rpc_util_1 = __importDefault(require("@alicloud/rpc-util"));
const $tea = __importStar(require("@alicloud/tea-typescript"));
/**
 * Model for initing client
 */
class Config extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            accessKeyId: 'accessKeyId',
            accessKeySecret: 'accessKeySecret',
            securityToken: 'securityToken',
            protocol: 'protocol',
            readTimeout: 'readTimeout',
            connectTimeout: 'connectTimeout',
            httpProxy: 'httpProxy',
            httpsProxy: 'httpsProxy',
            endpoint: 'endpoint',
            noProxy: 'noProxy',
            maxIdleConns: 'maxIdleConns',
            userAgent: 'userAgent',
            socks5Proxy: 'socks5Proxy',
            socks5NetWork: 'socks5NetWork',
            maxIdleTimeMillis: 'maxIdleTimeMillis',
            keepAliveDurationMillis: 'keepAliveDurationMillis',
            maxRequests: 'maxRequests',
            maxRequestsPerHost: 'maxRequestsPerHost',
        };
    }
    static types() {
        return {
            accessKeyId: 'string',
            accessKeySecret: 'string',
            securityToken: 'string',
            protocol: 'string',
            readTimeout: 'number',
            connectTimeout: 'number',
            httpProxy: 'string',
            httpsProxy: 'string',
            endpoint: 'string',
            noProxy: 'string',
            maxIdleConns: 'number',
            userAgent: 'string',
            socks5Proxy: 'string',
            socks5NetWork: 'string',
            maxIdleTimeMillis: 'number',
            keepAliveDurationMillis: 'number',
            maxRequests: 'number',
            maxRequestsPerHost: 'number',
        };
    }
}
exports.Config = Config;
class GetDemoDogAgeRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            authToken: 'auth_token',
            id: 'id',
        };
    }
    static types() {
        return {
            authToken: 'string',
            id: 'string',
        };
    }
}
exports.GetDemoDogAgeRequest = GetDemoDogAgeRequest;
class GetDemoDogAgeResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            reqMsgId: 'req_msg_id',
            resultCode: 'result_code',
            resultMsg: 'result_msg',
            age: 'age',
        };
    }
    static types() {
        return {
            reqMsgId: 'string',
            resultCode: 'string',
            resultMsg: 'string',
            age: 'number',
        };
    }
}
exports.GetDemoDogAgeResponse = GetDemoDogAgeResponse;
class Client {
    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    constructor(config) {
        if (tea_util_1.default.isUnset($tea.toMap(config))) {
            throw $tea.newError({
                code: "ParameterMissing",
                message: "'config' can not be unset",
            });
        }
        this._accessKeyId = config.accessKeyId;
        this._accessKeySecret = config.accessKeySecret;
        this._securityToken = config.securityToken;
        this._endpoint = config.endpoint;
        this._protocol = config.protocol;
        this._userAgent = config.userAgent;
        this._readTimeout = tea_util_1.default.defaultNumber(config.readTimeout, 20000);
        this._connectTimeout = tea_util_1.default.defaultNumber(config.connectTimeout, 20000);
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = tea_util_1.default.defaultNumber(config.maxIdleConns, 60000);
        this._maxIdleTimeMillis = tea_util_1.default.defaultNumber(config.maxIdleTimeMillis, 5);
        this._keepAliveDurationMillis = tea_util_1.default.defaultNumber(config.keepAliveDurationMillis, 5000);
        this._maxRequests = tea_util_1.default.defaultNumber(config.maxRequests, 100);
        this._maxRequestsPerHost = tea_util_1.default.defaultNumber(config.maxRequestsPerHost, 100);
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
    async doRequest(version, action, protocol, method, pathname, request, headers, runtime) {
        let _runtime = {
            timeouted: "retry",
            readTimeout: tea_util_1.default.defaultNumber(runtime.readTimeout, this._readTimeout),
            connectTimeout: tea_util_1.default.defaultNumber(runtime.connectTimeout, this._connectTimeout),
            httpProxy: tea_util_1.default.defaultString(runtime.httpProxy, this._httpProxy),
            httpsProxy: tea_util_1.default.defaultString(runtime.httpsProxy, this._httpsProxy),
            noProxy: tea_util_1.default.defaultString(runtime.noProxy, this._noProxy),
            maxIdleConns: tea_util_1.default.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
            maxIdleTimeMillis: this._maxIdleTimeMillis,
            keepAliveDurationMillis: this._keepAliveDurationMillis,
            maxRequests: this._maxRequests,
            maxRequestsPerHost: this._maxRequestsPerHost,
            retry: {
                retryable: runtime.autoretry,
                maxAttempts: tea_util_1.default.defaultNumber(runtime.maxAttempts, 3),
            },
            backoff: {
                policy: tea_util_1.default.defaultString(runtime.backoffPolicy, "no"),
                period: tea_util_1.default.defaultNumber(runtime.backoffPeriod, 1),
            },
            ignoreSSL: runtime.ignoreSSL,
        };
        let _lastRequest = null;
        let _now = Date.now();
        let _retryTimes = 0;
        while ($tea.allowRetry(_runtime['retry'], _retryTimes, _now)) {
            if (_retryTimes > 0) {
                let _backoffTime = $tea.getBackoffTime(_runtime['backoff'], _retryTimes);
                if (_backoffTime > 0) {
                    await $tea.sleep(_backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                let request_ = new $tea.Request();
                request_.protocol = tea_util_1.default.defaultString(this._protocol, protocol);
                request_.method = method;
                request_.pathname = pathname;
                request_.query = {
                    method: action,
                    version: version,
                    sign_type: "HmacSHA1",
                    req_time: alipay_util_1.default.getTimestamp(),
                    req_msg_id: alipay_util_1.default.getNonce(),
                    access_key: this._accessKeyId,
                    base_sdk_version: "Tea-SDK",
                    sdk_version: "Tea-SDK-20200814",
                };
                if (!tea_util_1.default.empty(this._securityToken)) {
                    request_.query["security_token"] = this._securityToken;
                }
                request_.headers = Object.assign({ host: tea_util_1.default.defaultString(this._endpoint, "undefined"), 'user-agent': tea_util_1.default.getUserAgent(this._userAgent) }, headers);
                let tmp = tea_util_1.default.anyifyMapValue(rpc_util_1.default.query(request));
                request_.body = new $tea.BytesReadable(tea_util_1.default.toFormString(tmp));
                request_.headers["content-type"] = "application/x-www-form-urlencoded";
                let signedParam = Object.assign(Object.assign({}, request_.query), rpc_util_1.default.query(request));
                request_.query["sign"] = alipay_util_1.default.getSignature(signedParam, this._accessKeySecret);
                _lastRequest = request_;
                let response_ = await $tea.doAction(request_, _runtime);
                let raw = await tea_util_1.default.readAsString(response_.body);
                let obj = tea_util_1.default.parseJSON(raw);
                let res = tea_util_1.default.assertAsMap(obj);
                let resp = tea_util_1.default.assertAsMap(res["response"]);
                if (alipay_util_1.default.hasError(raw, this._accessKeySecret)) {
                    throw $tea.newError({
                        message: resp["result_msg"],
                        data: resp,
                        code: resp["result_code"],
                    });
                }
                return resp;
            }
            catch (ex) {
                if ($tea.isRetryable(ex)) {
                    continue;
                }
                throw ex;
            }
        }
        throw $tea.newUnretryableError(_lastRequest);
    }
    /**
     * Description: 该接口用于获取狗狗的年龄
     * Summary: 获取狗狗的年龄
     */
    async getDemoDogAge(request) {
        let runtime = new $Util.RuntimeOptions({});
        let headers = {};
        return await this.getDemoDogAgeEx(request, headers, runtime);
    }
    /**
     * Description: 该接口用于获取狗狗的年龄
     * Summary: 获取狗狗的年龄
     */
    async getDemoDogAgeEx(request, headers, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("1.0", "demo.dog.age.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDemoDogAgeResponse({}));
    }
}
exports.default = Client;
//# sourceMappingURL=client.js.map
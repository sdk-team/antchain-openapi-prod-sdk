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
        };
    }
}
exports.Config = Config;
// Demo类
class DemoClass extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            someString: 'someString',
            someDate: 'someDate',
            someBoolean: 'someBoolean',
            someInt: 'someInt',
            someList: 'someList',
        };
    }
    static types() {
        return {
            someString: 'string',
            someDate: 'string',
            someBoolean: 'boolean',
            someInt: 'number',
            someList: { 'type': 'array', 'itemType': 'string' },
        };
    }
}
exports.DemoClass = DemoClass;
// 另一个Demo类
class AnotherClass extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            bar: 'bar',
            ref: 'ref',
            refList: 'refList',
        };
    }
    static types() {
        return {
            bar: 'string',
            ref: DemoClass,
            refList: { 'type': 'array', 'itemType': DemoClass },
        };
    }
}
exports.AnotherClass = AnotherClass;
class StatusDemoGatewayCheckRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            authToken: 'auth_token',
            productInstanceId: 'product_instance_id',
            regionName: 'region_name',
            aaaa: 'aaaa',
            same: 'same',
        };
    }
    static types() {
        return {
            authToken: 'string',
            productInstanceId: 'string',
            regionName: 'string',
            aaaa: 'number',
            same: { 'type': 'array', 'itemType': DemoClass },
        };
    }
}
exports.StatusDemoGatewayCheckRequest = StatusDemoGatewayCheckRequest;
class StatusDemoGatewayCheckResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            reqMsgId: 'req_msg_id',
            resultCode: 'result_code',
            resultMsg: 'result_msg',
        };
    }
    static types() {
        return {
            reqMsgId: 'string',
            resultCode: 'string',
            resultMsg: 'string',
        };
    }
}
exports.StatusDemoGatewayCheckResponse = StatusDemoGatewayCheckResponse;
class EchoDemoGatewayCheckRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            authToken: 'auth_token',
            productInstanceId: 'product_instance_id',
            regionName: 'region_name',
        };
    }
    static types() {
        return {
            authToken: 'string',
            productInstanceId: 'string',
            regionName: 'string',
        };
    }
}
exports.EchoDemoGatewayCheckRequest = EchoDemoGatewayCheckRequest;
class EchoDemoGatewayCheckResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            reqMsgId: 'req_msg_id',
            resultCode: 'result_code',
            resultMsg: 'result_msg',
            ddd: 'ddd',
        };
    }
    static types() {
        return {
            reqMsgId: 'string',
            resultCode: 'string',
            resultMsg: 'string',
            ddd: 'number',
        };
    }
}
exports.EchoDemoGatewayCheckResponse = EchoDemoGatewayCheckResponse;
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
        this._readTimeout = config.readTimeout;
        this._connectTimeout = config.connectTimeout;
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = config.maxIdleConns;
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
    async doRequest(version, action, protocol, method, pathname, request, runtime) {
        let _runtime = {
            timeouted: "retry",
            readTimeout: tea_util_1.default.defaultNumber(runtime.readTimeout, this._readTimeout),
            connectTimeout: tea_util_1.default.defaultNumber(runtime.connectTimeout, this._connectTimeout),
            httpProxy: tea_util_1.default.defaultString(runtime.httpProxy, this._httpProxy),
            httpsProxy: tea_util_1.default.defaultString(runtime.httpsProxy, this._httpsProxy),
            noProxy: tea_util_1.default.defaultString(runtime.noProxy, this._noProxy),
            maxIdleConns: tea_util_1.default.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
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
                    req_msg_id: tea_util_1.default.getNonce(),
                    access_key: this._accessKeyId,
                    charset: "UTF-8",
                    baseSdkVersion: "Tea-SDK",
                    sdkVersion: "Tea-SDK-20201229",
                };
                if (!tea_util_1.default.empty(this._securityToken)) {
                    request_.query["security_token"] = this._securityToken;
                }
                request_.headers = {
                    host: this._endpoint,
                    'user-agent': this.getUserAgent(),
                };
                let tmp = tea_util_1.default.anyifyMapValue(rpc_util_1.default.query(request));
                request_.body = new $tea.BytesReadable(tea_util_1.default.toFormString(tmp));
                request_.headers["content-type"] = "application/x-www-form-urlencoded";
                let signedParam = Object.assign(Object.assign({}, request_.query), rpc_util_1.default.query(request));
                request_.query["sign"] = alipay_util_1.default.getSignature(signedParam, this._accessKeySecret);
                _lastRequest = request_;
                let response_ = await $tea.doAction(request_, _runtime);
                let obj = await tea_util_1.default.readAsJSON(response_.body);
                let res = tea_util_1.default.assertAsMap(obj);
                let resp = tea_util_1.default.assertAsMap(res["response"]);
                if (alipay_util_1.default.hasError(res)) {
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
     * Get user agent
     * @return user agent
     */
    getUserAgent() {
        let userAgent = "TeaClient/1.0.0";
        return tea_util_1.default.getUserAgent(userAgent);
    }
    /**
     * Description: Demo接口，返回当前服务器当前状态
     * Summary: 检查服务状态
     */
    async statusDemoGatewayCheck(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.statusDemoGatewayCheckEx(request, runtime);
    }
    /**
     * Description: Demo接口，返回当前服务器当前状态
     * Summary: 检查服务状态
     */
    async statusDemoGatewayCheckEx(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new StatusDemoGatewayCheckResponse({}));
    }
    /**
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
     */
    async echoDemoGatewayCheck(request) {
        let runtime = new $Util.RuntimeOptions({});
        return await this.echoDemoGatewayCheckEx(request, runtime);
    }
    /**
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
     */
    async echoDemoGatewayCheckEx(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("1.0", "demo.gateway.check.echo", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new EchoDemoGatewayCheckResponse({}));
    }
}
exports.default = Client;
//# sourceMappingURL=client.js.map
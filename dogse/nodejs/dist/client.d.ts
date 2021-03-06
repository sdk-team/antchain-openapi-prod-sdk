import * as $Util from '@alicloud/tea-util';
import * as $tea from '@alicloud/tea-typescript';
/**
 * Model for initing client
 */
export declare class Config extends $tea.Model {
    accessKeyId?: string;
    accessKeySecret?: string;
    securityToken?: string;
    protocol?: string;
    readTimeout?: number;
    connectTimeout?: number;
    httpProxy?: string;
    httpsProxy?: string;
    endpoint?: string;
    noProxy?: string;
    maxIdleConns?: number;
    userAgent?: string;
    socks5Proxy?: string;
    socks5NetWork?: string;
    maxIdleTimeMillis?: number;
    keepAliveDurationMillis?: number;
    maxRequests?: number;
    maxRequestsPerHost?: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class GetDemoDogAgeRequest extends $tea.Model {
    authToken: string;
    id: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class GetDemoDogAgeResponse extends $tea.Model {
    reqMsgId?: string;
    resultCode?: string;
    resultMsg?: string;
    age?: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export default class Client {
    _endpoint: string;
    _regionId: string;
    _accessKeyId: string;
    _accessKeySecret: string;
    _protocol: string;
    _userAgent: string;
    _readTimeout: number;
    _connectTimeout: number;
    _httpProxy: string;
    _httpsProxy: string;
    _socks5Proxy: string;
    _socks5NetWork: string;
    _noProxy: string;
    _maxIdleConns: number;
    _securityToken: string;
    _maxIdleTimeMillis: number;
    _keepAliveDurationMillis: number;
    _maxRequests: number;
    _maxRequestsPerHost: number;
    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    constructor(config: Config);
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
    doRequest(version: string, action: string, protocol: string, method: string, pathname: string, request: {
        [key: string]: any;
    }, headers: {
        [key: string]: string;
    }, runtime: $Util.RuntimeOptions): Promise<{
        [key: string]: any;
    }>;
    /**
     * Description: 该接口用于获取狗狗的年龄
     * Summary: 获取狗狗的年龄
     */
    getDemoDogAge(request: GetDemoDogAgeRequest): Promise<GetDemoDogAgeResponse>;
    /**
     * Description: 该接口用于获取狗狗的年龄
     * Summary: 获取狗狗的年龄
     */
    getDemoDogAgeEx(request: GetDemoDogAgeRequest, headers: {
        [key: string]: string;
    }, runtime: $Util.RuntimeOptions): Promise<GetDemoDogAgeResponse>;
}

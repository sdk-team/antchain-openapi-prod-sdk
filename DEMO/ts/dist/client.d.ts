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
export declare class DemoClass extends $tea.Model {
    someString?: string;
    someDate?: string;
    someBoolean?: boolean;
    someInt?: number;
    someList?: string[];
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
export declare class AnotherClass extends $tea.Model {
    bar?: string;
    ref?: DemoClass;
    refList?: DemoClass[];
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
export declare class StatusDemoGatewayCheckRequest extends $tea.Model {
    authToken?: string;
    productInstanceId?: string;
    regionName?: string;
    aaaa?: number;
    same?: DemoClass[];
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
export declare class StatusDemoGatewayCheckResponse extends $tea.Model {
    reqMsgId?: string;
    resultCode?: string;
    resultMsg?: string;
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
export declare class EchoDemoGatewayCheckRequest extends $tea.Model {
    authToken?: string;
    productInstanceId?: string;
    regionName?: string;
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
export declare class EchoDemoGatewayCheckResponse extends $tea.Model {
    reqMsgId?: string;
    resultCode?: string;
    resultMsg?: string;
    ddd?: number;
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
    }, runtime: $Util.RuntimeOptions): Promise<{
        [key: string]: any;
    }>;
    /**
     * Get user agent
     * @return user agent
     */
    getUserAgent(): string;
    /**
     * Description: Demo接口，返回当前服务器当前状态
     * Summary: 检查服务状态
     */
    statusDemoGatewayCheck(request: StatusDemoGatewayCheckRequest): Promise<StatusDemoGatewayCheckResponse>;
    /**
     * Description: Demo接口，返回当前服务器当前状态
     * Summary: 检查服务状态
     */
    statusDemoGatewayCheckEx(request: StatusDemoGatewayCheckRequest, runtime: $Util.RuntimeOptions): Promise<StatusDemoGatewayCheckResponse>;
    /**
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
     */
    echoDemoGatewayCheck(request: EchoDemoGatewayCheckRequest): Promise<EchoDemoGatewayCheckResponse>;
    /**
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
     */
    echoDemoGatewayCheckEx(request: EchoDemoGatewayCheckRequest, runtime: $Util.RuntimeOptions): Promise<EchoDemoGatewayCheckResponse>;
}

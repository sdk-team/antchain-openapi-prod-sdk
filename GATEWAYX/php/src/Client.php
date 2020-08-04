<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GATEWAYX;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\GATEWAYX\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\GATEWAYX\Models\CreateNtcloudGatewayxBizeventMessageRequest;
use AntChain\GATEWAYX\Models\CreateNtcloudGatewayxBizeventMessageResponse;
use AntChain\GATEWAYX\Models\CreateNtcloudGatewayxFileUploadRequest;
use AntChain\GATEWAYX\Models\CreateNtcloudGatewayxFileUploadResponse;
use AntChain\GATEWAYX\Models\GetNtcloudGatewayxFileDownloadRequest;
use AntChain\GATEWAYX\Models\GetNtcloudGatewayxFileDownloadResponse;

class Client {
    protected $_endpoint;

    protected $_regionId;

    protected $_accessKeyId;

    protected $_accessKeySecret;

    protected $_protocol;

    protected $_userAgent;

    protected $_readTimeout;

    protected $_connectTimeout;

    protected $_httpProxy;

    protected $_httpsProxy;

    protected $_socks5Proxy;

    protected $_socks5NetWork;

    protected $_noProxy;

    protected $_maxIdleConns;

    protected $_securityToken;

    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public function __construct($config){
        if (Utils::isUnset($config)) {
            throw new TeaError([
                "code" => "ParameterMissing",
                "message" => "'config' can not be unset"
            ]);
        }
        $this->_accessKeyId = $config->accessKeyId;
        $this->_accessKeySecret = $config->accessKeySecret;
        $this->_securityToken = $config->securityToken;
        $this->_endpoint = $config->endpoint;
        $this->_protocol = $config->protocol;
        $this->_userAgent = $config->userAgent;
        $this->_readTimeout = $config->readTimeout;
        $this->_connectTimeout = $config->connectTimeout;
        $this->_httpProxy = $config->httpProxy;
        $this->_httpsProxy = $config->httpsProxy;
        $this->_noProxy = $config->noProxy;
        $this->_socks5Proxy = $config->socks5Proxy;
        $this->_socks5NetWork = $config->socks5NetWork;
        $this->_maxIdleConns = $config->maxIdleConns;
    }

    /**
     * Encapsulate the request and invoke the network
     * @param string $version
     * @param string $action api name
     * @param string $protocol http or https
     * @param string $method e.g. GET
     * @param string $pathname pathname of every api
     * @param array $request which contains request params
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return array the response
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $runtime){
        $runtime->validate();
        $_runtime = [
            "timeouted" => "retry",
            "readTimeout" => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            "connectTimeout" => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            "httpProxy" => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            "httpsProxy" => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            "noProxy" => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            "maxIdleConns" => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            "retry" => [
                "retryable" => $runtime->autoretry,
                "maxAttempts" => Utils::defaultNumber($runtime->maxAttempts, 3)
            ],
            "backoff" => [
                "policy" => Utils::defaultString($runtime->backoffPolicy, "no"),
                "period" => Utils::defaultNumber($runtime->backoffPeriod, 1)
            ],
            "ignoreSSL" => $runtime->ignoreSSL
        ];
        $_lastRequest = null;
        $_lastException = null;
        $_now = time();
        $_retryTimes = 0;
        while (Tea::allowRetry($_runtime["retry"], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime($_runtime["backoff"], $_retryTimes);
                if ($_backoffTime > 0) {
                    Tea::sleep($_backoffTime);
                }
            }
            $_retryTimes = $_retryTimes + 1;
            try {
                $_request = new Request();
                $_request->protocol = Utils::defaultString($this->_protocol, $protocol);
                $_request->method = $method;
                $_request->pathname = $pathname;
                $_request->query = [
                    "method" => $action,
                    "version" => $version,
                    "sign_type" => "HmacSHA1",
                    "req_time" => UtilClient::getTimestamp(),
                    "req_msg_id" => Utils::getNonce(),
                    "access_key" => $this->_accessKeyId,
                    "charset" => "UTF-8",
                    "baseSdkVersion" => "Tea-SDK",
                    "sdkVersion" => "Tea-SDK-20200804"
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = [
                    "host" => $this->_endpoint,
                    "user-agent" => $this->getUserAgent()
                ];
                $tmp = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body = Utils::toFormString($tmp);
                $_request->headers["content-type"] = "application/x-www-form-urlencoded";
                $signedParam = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query["sign"] = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $obj = Utils::readAsJSON($_response->body);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap($res["response"]);
                if (UtilClient::hasError($res)) {
                    throw new TeaError([
                        "message" => $resp["result_msg"],
                        "data" => $resp,
                        "code" => $resp["result_code"]
                    ]);
                }
                return $resp;
            }
            catch (Exception $e) {
                if (!($e instanceof TeaError)) {
                    $e = new TeaError([], $e->getMessage(), $e->getCode(), $e);
                }
                if (Tea::isRetryable($e)) {
                    $_lastException = $e;
                    continue;
                }
                throw $e;
            }
        }
        throw new TeaUnableRetryError($_lastRequest, $_lastException);
    }

    /**
     * Get user agent
     * @return string user agent
     */
    public function getUserAgent(){
        $userAgent = "TeaClient/1.0.0";
        return Utils::getUserAgent($userAgent);
    }

    /**
     * Description: 接收业务事件消息，并将相关消息投递给对应的接手方
     * Summary: 事件消息创建
     * @param CreateNtcloudGatewayxBizeventMessageRequest $request
     * @return CreateNtcloudGatewayxBizeventMessageResponse
     */
    public function createNtcloudGatewayxBizeventMessage($request){
        $runtime = new RuntimeOptions([]);
        return $this->createNtcloudGatewayxBizeventMessageEx($request, $runtime);
    }

    /**
     * Description: 接收业务事件消息，并将相关消息投递给对应的接手方
     * Summary: 事件消息创建
     * @param CreateNtcloudGatewayxBizeventMessageRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateNtcloudGatewayxBizeventMessageResponse
     */
    public function createNtcloudGatewayxBizeventMessageEx($request, $runtime){
        Utils::validateModel($request);
        return CreateNtcloudGatewayxBizeventMessageResponse::fromMap($this->doRequest("1.0", "antcloud.gatewayx.bizevent.message.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     * @param CreateNtcloudGatewayxFileUploadRequest $request
     * @return CreateNtcloudGatewayxFileUploadResponse
     */
    public function createNtcloudGatewayxFileUpload($request){
        $runtime = new RuntimeOptions([]);
        return $this->createNtcloudGatewayxFileUploadEx($request, $runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     * @param CreateNtcloudGatewayxFileUploadRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateNtcloudGatewayxFileUploadResponse
     */
    public function createNtcloudGatewayxFileUploadEx($request, $runtime){
        Utils::validateModel($request);
        return CreateNtcloudGatewayxFileUploadResponse::fromMap($this->doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建HTTP GET获取的文件下载
     * Summary: 下载地址获取
     * @param GetNtcloudGatewayxFileDownloadRequest $request
     * @return GetNtcloudGatewayxFileDownloadResponse
     */
    public function getNtcloudGatewayxFileDownload($request){
        $runtime = new RuntimeOptions([]);
        return $this->getNtcloudGatewayxFileDownloadEx($request, $runtime);
    }

    /**
     * Description: 创建HTTP GET获取的文件下载
     * Summary: 下载地址获取
     * @param GetNtcloudGatewayxFileDownloadRequest $request
     * @param RuntimeOptions $runtime
     * @return GetNtcloudGatewayxFileDownloadResponse
     */
    public function getNtcloudGatewayxFileDownloadEx($request, $runtime){
        Utils::validateModel($request);
        return GetNtcloudGatewayxFileDownloadResponse::fromMap($this->doRequest("1.0", "antcloud.gatewayx.file.download.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }
}

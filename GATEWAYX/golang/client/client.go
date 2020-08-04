// This file is auto-generated, don't edit it. Thanks.
package client

import (
	rpcutil "github.com/alibabacloud-go/tea-rpc-utils/service"
	util "github.com/alibabacloud-go/tea-utils/service"
	"github.com/alibabacloud-go/tea/tea"
	alipayutil "github.com/antchain-openapi-sdk-go/antchain-util/service"
)

/**
 * Model for initing client
 */
type Config struct {
	// accesskey id
	AccessKeyId *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	// accesskey secret
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	// security token
	SecurityToken *string `json:"securityToken,omitempty" xml:"securityToken,omitempty"`
	// http protocol
	Protocol *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	// read timeout
	ReadTimeout *int `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	// connect timeout
	ConnectTimeout *int `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	// http proxy
	HttpProxy *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	// https proxy
	HttpsProxy *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	// endpoint
	Endpoint *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	// proxy white list
	NoProxy *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	// max idle conns
	MaxIdleConns *int `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	// user agent
	UserAgent *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	// socks5 proxy
	Socks5Proxy *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	// socks5 network
	Socks5NetWork *string `json:"socks5NetWork,omitempty" xml:"socks5NetWork,omitempty"`
}

func (s Config) String() string {
	return tea.Prettify(s)
}

func (s Config) GoString() string {
	return s.String()
}

func (s *Config) SetAccessKeyId(v string) *Config {
	s.AccessKeyId = &v
	return s
}

func (s *Config) SetAccessKeySecret(v string) *Config {
	s.AccessKeySecret = &v
	return s
}

func (s *Config) SetSecurityToken(v string) *Config {
	s.SecurityToken = &v
	return s
}

func (s *Config) SetProtocol(v string) *Config {
	s.Protocol = &v
	return s
}

func (s *Config) SetReadTimeout(v int) *Config {
	s.ReadTimeout = &v
	return s
}

func (s *Config) SetConnectTimeout(v int) *Config {
	s.ConnectTimeout = &v
	return s
}

func (s *Config) SetHttpProxy(v string) *Config {
	s.HttpProxy = &v
	return s
}

func (s *Config) SetHttpsProxy(v string) *Config {
	s.HttpsProxy = &v
	return s
}

func (s *Config) SetEndpoint(v string) *Config {
	s.Endpoint = &v
	return s
}

func (s *Config) SetNoProxy(v string) *Config {
	s.NoProxy = &v
	return s
}

func (s *Config) SetMaxIdleConns(v int) *Config {
	s.MaxIdleConns = &v
	return s
}

func (s *Config) SetUserAgent(v string) *Config {
	s.UserAgent = &v
	return s
}

func (s *Config) SetSocks5Proxy(v string) *Config {
	s.Socks5Proxy = &v
	return s
}

func (s *Config) SetSocks5NetWork(v string) *Config {
	s.Socks5NetWork = &v
	return s
}

// 键值对
type NameValuePair struct {
	// 键名
	Name *string `json:"name,omitempty" xml:"name,omitempty"`
	// 键值
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s NameValuePair) String() string {
	return tea.Prettify(s)
}

func (s NameValuePair) GoString() string {
	return s.String()
}

func (s *NameValuePair) SetName(v string) *NameValuePair {
	s.Name = &v
	return s
}

func (s *NameValuePair) SetValue(v string) *NameValuePair {
	s.Value = &v
	return s
}

// 调用者信息
type InvokerInfo struct {
	// 调用渠道
	InvokeChannel *string `json:"invoke_channel,omitempty" xml:"invoke_channel,omitempty"`
	// 渠道的用户id
	InvokeChannelUid *string `json:"invoke_channel_uid,omitempty" xml:"invoke_channel_uid,omitempty"`
	// 8位金融云租户ID
	InvokeTenant *string `json:"invoke_tenant,omitempty" xml:"invoke_tenant,omitempty"`
	// 调用者用户金融云id
	InvokeUserId *string `json:"invoke_user_id,omitempty" xml:"invoke_user_id,omitempty"`
}

func (s InvokerInfo) String() string {
	return tea.Prettify(s)
}

func (s InvokerInfo) GoString() string {
	return s.String()
}

func (s *InvokerInfo) SetInvokeChannel(v string) *InvokerInfo {
	s.InvokeChannel = &v
	return s
}

func (s *InvokerInfo) SetInvokeChannelUid(v string) *InvokerInfo {
	s.InvokeChannelUid = &v
	return s
}

func (s *InvokerInfo) SetInvokeTenant(v string) *InvokerInfo {
	s.InvokeTenant = &v
	return s
}

func (s *InvokerInfo) SetInvokeUserId(v string) *InvokerInfo {
	s.InvokeUserId = &v
	return s
}

type CreateNtcloudGatewayxBizeventMessageRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 业务消息内容，json格式
	BizContent *string `json:"biz_content,omitempty" xml:"biz_content,omitempty"`
	// 消费方id，例如appId，tenantId，可以多个，多个之间使用","分割
	ConsumerId *string `json:"consumer_id,omitempty" xml:"consumer_id,omitempty"`
	// 消费者类型，例如TENANT, APP
	ConsumerType *string `json:"consumer_type,omitempty" xml:"consumer_type,omitempty"`
	// 消息发送过程中的唯一ID
	MsgId *string `json:"msg_id,omitempty" xml:"msg_id,omitempty"`
	// 消息事件编码
	MsgKey *string `json:"msg_key,omitempty" xml:"msg_key,omitempty"`
	// 消息类型，1：点对点，2: 广播消息
	MsgType *string `json:"msg_type,omitempty" xml:"msg_type,omitempty"`
	// 二级消息主题,订阅方可以过滤消息
	Tags *string `json:"tags,omitempty" xml:"tags,omitempty"`
	// 日期对应的timestamp
	UtcTimestamp *int64 `json:"utc_timestamp,omitempty" xml:"utc_timestamp,omitempty"`
}

func (s CreateNtcloudGatewayxBizeventMessageRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateNtcloudGatewayxBizeventMessageRequest) GoString() string {
	return s.String()
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetAuthToken(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetProductInstanceId(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetRegionName(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.RegionName = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetBizContent(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.BizContent = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetConsumerId(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.ConsumerId = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetConsumerType(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.ConsumerType = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetMsgId(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.MsgId = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetMsgKey(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.MsgKey = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetMsgType(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.MsgType = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetTags(v string) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.Tags = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageRequest) SetUtcTimestamp(v int64) *CreateNtcloudGatewayxBizeventMessageRequest {
	s.UtcTimestamp = &v
	return s
}

type CreateNtcloudGatewayxBizeventMessageResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
}

func (s CreateNtcloudGatewayxBizeventMessageResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateNtcloudGatewayxBizeventMessageResponse) GoString() string {
	return s.String()
}

func (s *CreateNtcloudGatewayxBizeventMessageResponse) SetReqMsgId(v string) *CreateNtcloudGatewayxBizeventMessageResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageResponse) SetResultCode(v string) *CreateNtcloudGatewayxBizeventMessageResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateNtcloudGatewayxBizeventMessageResponse) SetResultMsg(v string) *CreateNtcloudGatewayxBizeventMessageResponse {
	s.ResultMsg = &v
	return s
}

type CreateNtcloudGatewayxFileUploadRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 产品方的api归属集群，即productInstanceId
	ApiCluster *string `json:"api_cluster,omitempty" xml:"api_cluster,omitempty"`
	// 上传文件作用的openapi method
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty"`
	// 文件标签，多个标签;分割
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty" maxLength:"100"`
	// 自定义的文件元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty" maxLength:"1000"`
	// 文件名，不传则随机生成文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty" maxLength:"100"`
	// 文件的多媒体类型
	MimeType *string `json:"mime_type,omitempty" xml:"mime_type,omitempty"`
}

func (s CreateNtcloudGatewayxFileUploadRequest) String() string {
	return tea.Prettify(s)
}

func (s CreateNtcloudGatewayxFileUploadRequest) GoString() string {
	return s.String()
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetAuthToken(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.AuthToken = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetProductInstanceId(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetRegionName(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.RegionName = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetApiCluster(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.ApiCluster = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetApiCode(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.ApiCode = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetFileLabel(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.FileLabel = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetFileMetadata(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.FileMetadata = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetFileName(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.FileName = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadRequest) SetMimeType(v string) *CreateNtcloudGatewayxFileUploadRequest {
	s.MimeType = &v
	return s
}

type CreateNtcloudGatewayxFileUploadResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 上传有效期
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 32位文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
	// 放入http请求头里
	UploadHeaders []*NameValuePair `json:"upload_headers,omitempty" xml:"upload_headers,omitempty" type:"Repeated"`
	// 文件上传地址
	UploadUrl *string `json:"upload_url,omitempty" xml:"upload_url,omitempty"`
}

func (s CreateNtcloudGatewayxFileUploadResponse) String() string {
	return tea.Prettify(s)
}

func (s CreateNtcloudGatewayxFileUploadResponse) GoString() string {
	return s.String()
}

func (s *CreateNtcloudGatewayxFileUploadResponse) SetReqMsgId(v string) *CreateNtcloudGatewayxFileUploadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadResponse) SetResultCode(v string) *CreateNtcloudGatewayxFileUploadResponse {
	s.ResultCode = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadResponse) SetResultMsg(v string) *CreateNtcloudGatewayxFileUploadResponse {
	s.ResultMsg = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadResponse) SetExpiredTime(v string) *CreateNtcloudGatewayxFileUploadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadResponse) SetFileId(v string) *CreateNtcloudGatewayxFileUploadResponse {
	s.FileId = &v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadResponse) SetUploadHeaders(v []*NameValuePair) *CreateNtcloudGatewayxFileUploadResponse {
	s.UploadHeaders = v
	return s
}

func (s *CreateNtcloudGatewayxFileUploadResponse) SetUploadUrl(v string) *CreateNtcloudGatewayxFileUploadResponse {
	s.UploadUrl = &v
	return s
}

type GetNtcloudGatewayxFileDownloadRequest struct {
	AuthToken         *string `json:"auth_token,omitempty" xml:"auth_token,omitempty"`
	ProductInstanceId *string `json:"product_instance_id,omitempty" xml:"product_instance_id,omitempty"`
	RegionName        *string `json:"region_name,omitempty" xml:"region_name,omitempty"`
	// 文件唯一id
	FileId *string `json:"file_id,omitempty" xml:"file_id,omitempty"`
}

func (s GetNtcloudGatewayxFileDownloadRequest) String() string {
	return tea.Prettify(s)
}

func (s GetNtcloudGatewayxFileDownloadRequest) GoString() string {
	return s.String()
}

func (s *GetNtcloudGatewayxFileDownloadRequest) SetAuthToken(v string) *GetNtcloudGatewayxFileDownloadRequest {
	s.AuthToken = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadRequest) SetProductInstanceId(v string) *GetNtcloudGatewayxFileDownloadRequest {
	s.ProductInstanceId = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadRequest) SetRegionName(v string) *GetNtcloudGatewayxFileDownloadRequest {
	s.RegionName = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadRequest) SetFileId(v string) *GetNtcloudGatewayxFileDownloadRequest {
	s.FileId = &v
	return s
}

type GetNtcloudGatewayxFileDownloadResponse struct {
	ReqMsgId   *string `json:"req_msg_id,omitempty" xml:"req_msg_id,omitempty"`
	ResultCode *string `json:"result_code,omitempty" xml:"result_code,omitempty"`
	ResultMsg  *string `json:"result_msg,omitempty" xml:"result_msg,omitempty"`
	// 创建文件使用的apiCode
	ApiCode *string `json:"api_code,omitempty" xml:"api_code,omitempty"`
	// 文件下载地址
	DownloadUrl *string `json:"download_url,omitempty" xml:"download_url,omitempty"`
	// 下载超时时间
	ExpiredTime *string `json:"expired_time,omitempty" xml:"expired_time,omitempty" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]"`
	// 文件标签
	FileLabel *string `json:"file_label,omitempty" xml:"file_label,omitempty"`
	// 请求上传时的自定义元数据
	FileMetadata *string `json:"file_metadata,omitempty" xml:"file_metadata,omitempty"`
	// 文件名
	FileName *string `json:"file_name,omitempty" xml:"file_name,omitempty"`
	// 文件路径
	FilePath *string `json:"file_path,omitempty" xml:"file_path,omitempty"`
	// 文件大小
	FileSize *int64 `json:"file_size,omitempty" xml:"file_size,omitempty"`
	// 上传的调用者信息
	UploadInvoker *InvokerInfo `json:"upload_invoker,omitempty" xml:"upload_invoker,omitempty"`
}

func (s GetNtcloudGatewayxFileDownloadResponse) String() string {
	return tea.Prettify(s)
}

func (s GetNtcloudGatewayxFileDownloadResponse) GoString() string {
	return s.String()
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetReqMsgId(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.ReqMsgId = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetResultCode(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.ResultCode = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetResultMsg(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.ResultMsg = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetApiCode(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.ApiCode = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetDownloadUrl(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.DownloadUrl = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetExpiredTime(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.ExpiredTime = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetFileLabel(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.FileLabel = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetFileMetadata(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.FileMetadata = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetFileName(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.FileName = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetFilePath(v string) *GetNtcloudGatewayxFileDownloadResponse {
	s.FilePath = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetFileSize(v int64) *GetNtcloudGatewayxFileDownloadResponse {
	s.FileSize = &v
	return s
}

func (s *GetNtcloudGatewayxFileDownloadResponse) SetUploadInvoker(v *InvokerInfo) *GetNtcloudGatewayxFileDownloadResponse {
	s.UploadInvoker = v
	return s
}

type Client struct {
	Endpoint        *string
	RegionId        *string
	AccessKeyId     *string
	AccessKeySecret *string
	Protocol        *string
	UserAgent       *string
	ReadTimeout     *int
	ConnectTimeout  *int
	HttpProxy       *string
	HttpsProxy      *string
	Socks5Proxy     *string
	Socks5NetWork   *string
	NoProxy         *string
	MaxIdleConns    *int
	SecurityToken   *string
}

/**
 * Init client with Config
 * @param config config contains the necessary information to create a client
 */
func NewClient(config *Config) (*Client, error) {
	client := new(Client)
	err := client.Init(config)
	return client, err
}

func (client *Client) Init(config *Config) (_err error) {
	if tea.BoolValue(util.IsUnset(tea.ToMap(config))) {
		_err = tea.NewSDKError(map[string]interface{}{
			"code":    "ParameterMissing",
			"message": "'config' can not be unset",
		})
		return _err
	}

	client.AccessKeyId = config.AccessKeyId
	client.AccessKeySecret = config.AccessKeySecret
	client.SecurityToken = config.SecurityToken
	client.Endpoint = config.Endpoint
	client.Protocol = config.Protocol
	client.UserAgent = config.UserAgent
	client.ReadTimeout = config.ReadTimeout
	client.ConnectTimeout = config.ConnectTimeout
	client.HttpProxy = config.HttpProxy
	client.HttpsProxy = config.HttpsProxy
	client.NoProxy = config.NoProxy
	client.Socks5Proxy = config.Socks5Proxy
	client.Socks5NetWork = config.Socks5NetWork
	client.MaxIdleConns = config.MaxIdleConns
	return nil
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
func (client *Client) DoRequest(version *string, action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
	_err = tea.Validate(runtime)
	if _err != nil {
		return _result, _err
	}
	_runtime := map[string]interface{}{
		"timeouted":      "retry",
		"readTimeout":    tea.IntValue(util.DefaultNumber(runtime.ReadTimeout, client.ReadTimeout)),
		"connectTimeout": tea.IntValue(util.DefaultNumber(runtime.ConnectTimeout, client.ConnectTimeout)),
		"httpProxy":      tea.StringValue(util.DefaultString(runtime.HttpProxy, client.HttpProxy)),
		"httpsProxy":     tea.StringValue(util.DefaultString(runtime.HttpsProxy, client.HttpsProxy)),
		"noProxy":        tea.StringValue(util.DefaultString(runtime.NoProxy, client.NoProxy)),
		"maxIdleConns":   tea.IntValue(util.DefaultNumber(runtime.MaxIdleConns, client.MaxIdleConns)),
		"retry": map[string]interface{}{
			"retryable":   tea.BoolValue(runtime.Autoretry),
			"maxAttempts": tea.IntValue(util.DefaultNumber(runtime.MaxAttempts, tea.Int(3))),
		},
		"backoff": map[string]interface{}{
			"policy": tea.StringValue(util.DefaultString(runtime.BackoffPolicy, tea.String("no"))),
			"period": tea.IntValue(util.DefaultNumber(runtime.BackoffPeriod, tea.Int(1))),
		},
		"ignoreSSL": tea.BoolValue(runtime.IgnoreSSL),
	}

	_resp := make(map[string]interface{})
	for _retryTimes := 0; tea.BoolValue(tea.AllowRetry(_runtime["retry"], tea.Int(_retryTimes))); _retryTimes++ {
		if _retryTimes > 0 {
			_backoffTime := tea.GetBackoffTime(_runtime["backoff"], tea.Int(_retryTimes))
			if tea.IntValue(_backoffTime) > 0 {
				tea.Sleep(_backoffTime)
			}
		}

		_resp, _err = func() (map[string]interface{}, error) {
			request_ := tea.NewRequest()
			request_.Protocol = util.DefaultString(client.Protocol, protocol)
			request_.Method = method
			request_.Pathname = pathname
			request_.Query = map[string]*string{
				"method":         action,
				"version":        version,
				"sign_type":      tea.String("HmacSHA1"),
				"req_time":       alipayutil.GetTimestamp(),
				"req_msg_id":     util.GetNonce(),
				"access_key":     client.AccessKeyId,
				"charset":        tea.String("UTF-8"),
				"baseSdkVersion": tea.String("Tea-SDK"),
				"sdkVersion":     tea.String("Tea-SDK-20200804"),
			}
			if !tea.BoolValue(util.Empty(client.SecurityToken)) {
				request_.Query["security_token"] = client.SecurityToken
			}

			request_.Headers = map[string]*string{
				"host":       client.Endpoint,
				"user-agent": client.GetUserAgent(),
			}
			tmp := util.AnyifyMapValue(rpcutil.Query(request))
			request_.Body = tea.ToReader(util.ToFormString(tmp))
			request_.Headers["content-type"] = tea.String("application/x-www-form-urlencoded")
			signedParam := tea.Merge(request_.Query,
				rpcutil.Query(request))
			request_.Query["sign"] = alipayutil.GetSignature(signedParam, client.AccessKeySecret)
			response_, _err := tea.DoRequest(request_, _runtime)
			if _err != nil {
				return _result, _err
			}
			obj, _err := util.ReadAsJSON(response_.Body)
			if _err != nil {
				return _result, _err
			}

			res := util.AssertAsMap(obj)
			resp := util.AssertAsMap(res["response"])
			if tea.BoolValue(alipayutil.HasError(res)) {
				_err = tea.NewSDKError(map[string]interface{}{
					"message": resp["result_msg"],
					"data":    resp,
					"code":    resp["result_code"],
				})
				return _result, _err
			}

			_result = resp
			return _result, _err
		}()
		if !tea.BoolValue(tea.Retryable(_err)) {
			break
		}
	}

	return _resp, _err
}

/**
 * Get user agent
 * @return user agent
 */
func (client *Client) GetUserAgent() (_result *string) {
	userAgent := tea.String("TeaClient/1.0.0")
	_body := util.GetUserAgent(userAgent)
	_result = _body
	return _result
}

/**
 * Description: 接收业务事件消息，并将相关消息投递给对应的接手方
 * Summary: 事件消息创建
 */
func (client *Client) CreateNtcloudGatewayxBizeventMessage(request *CreateNtcloudGatewayxBizeventMessageRequest) (_result *CreateNtcloudGatewayxBizeventMessageResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateNtcloudGatewayxBizeventMessageResponse{}
	_body, _err := client.CreateNtcloudGatewayxBizeventMessageEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 接收业务事件消息，并将相关消息投递给对应的接手方
 * Summary: 事件消息创建
 */
func (client *Client) CreateNtcloudGatewayxBizeventMessageEx(request *CreateNtcloudGatewayxBizeventMessageRequest, runtime *util.RuntimeOptions) (_result *CreateNtcloudGatewayxBizeventMessageResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateNtcloudGatewayxBizeventMessageResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.bizevent.message.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateNtcloudGatewayxFileUpload(request *CreateNtcloudGatewayxFileUploadRequest) (_result *CreateNtcloudGatewayxFileUploadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &CreateNtcloudGatewayxFileUploadResponse{}
	_body, _err := client.CreateNtcloudGatewayxFileUploadEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建HTTP PUT提交的文件上传
 * Summary: 文件上传创建
 */
func (client *Client) CreateNtcloudGatewayxFileUploadEx(request *CreateNtcloudGatewayxFileUploadRequest, runtime *util.RuntimeOptions) (_result *CreateNtcloudGatewayxFileUploadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &CreateNtcloudGatewayxFileUploadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.upload.create"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 创建HTTP GET获取的文件下载
 * Summary: 下载地址获取
 */
func (client *Client) GetNtcloudGatewayxFileDownload(request *GetNtcloudGatewayxFileDownloadRequest) (_result *GetNtcloudGatewayxFileDownloadResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &GetNtcloudGatewayxFileDownloadResponse{}
	_body, _err := client.GetNtcloudGatewayxFileDownloadEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 创建HTTP GET获取的文件下载
 * Summary: 下载地址获取
 */
func (client *Client) GetNtcloudGatewayxFileDownloadEx(request *GetNtcloudGatewayxFileDownloadRequest, runtime *util.RuntimeOptions) (_result *GetNtcloudGatewayxFileDownloadResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &GetNtcloudGatewayxFileDownloadResponse{}
	_body, _err := client.DoRequest(tea.String("1.0"), tea.String("antcloud.gatewayx.file.download.get"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

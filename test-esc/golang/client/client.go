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
	AccessKeyId     *string `json:"accessKeyId,omitempty" xml:"accessKeyId,omitempty"`
	AccessKeySecret *string `json:"accessKeySecret,omitempty" xml:"accessKeySecret,omitempty"`
	AuthToken       *string `json:"authToken,omitempty" xml:"authToken,omitempty"`
	Protocol        *string `json:"protocol,omitempty" xml:"protocol,omitempty"`
	RegionId        *string `json:"regionId,omitempty" xml:"regionId,omitempty"`
	ReadTimeout     *int    `json:"readTimeout,omitempty" xml:"readTimeout,omitempty"`
	ConnectTimeout  *int    `json:"connectTimeout,omitempty" xml:"connectTimeout,omitempty"`
	HttpProxy       *string `json:"httpProxy,omitempty" xml:"httpProxy,omitempty"`
	HttpsProxy      *string `json:"httpsProxy,omitempty" xml:"httpsProxy,omitempty"`
	Endpoint        *string `json:"endpoint,omitempty" xml:"endpoint,omitempty"`
	NoProxy         *string `json:"noProxy,omitempty" xml:"noProxy,omitempty"`
	MaxIdleConns    *int    `json:"maxIdleConns,omitempty" xml:"maxIdleConns,omitempty"`
	UserAgent       *string `json:"userAgent,omitempty" xml:"userAgent,omitempty"`
	Socks5Proxy     *string `json:"socks5Proxy,omitempty" xml:"socks5Proxy,omitempty"`
	Socks5NetWork   *string `json:"socks5NetWork,omitempty" xml:"socks5NetWork,omitempty"`
	Tenant          *string `json:"tenant,omitempty" xml:"tenant,omitempty"`
	Workspace       *string `json:"workspace,omitempty" xml:"workspace,omitempty"`
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

func (s *Config) SetAuthToken(v string) *Config {
	s.AuthToken = &v
	return s
}

func (s *Config) SetProtocol(v string) *Config {
	s.Protocol = &v
	return s
}

func (s *Config) SetRegionId(v string) *Config {
	s.RegionId = &v
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

func (s *Config) SetTenant(v string) *Config {
	s.Tenant = &v
	return s
}

func (s *Config) SetWorkspace(v string) *Config {
	s.Workspace = &v
	return s
}

type RiskSwitchInfo struct {
	BizOp         *string `json:"biz_op,omitempty" xml:"biz_op,omitempty"`
	BizTag        *string `json:"biz_tag,omitempty" xml:"biz_tag,omitempty"`
	ErrorMsg      *string `json:"error_msg,omitempty" xml:"error_msg,omitempty"`
	Group         *string `json:"group,omitempty" xml:"group,omitempty"`
	Id            *string `json:"id,omitempty" xml:"id,omitempty"`
	SecRequestUrl *string `json:"sec_request_url,omitempty" xml:"sec_request_url,omitempty"`
	Value         *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s RiskSwitchInfo) String() string {
	return tea.Prettify(s)
}

func (s RiskSwitchInfo) GoString() string {
	return s.String()
}

func (s *RiskSwitchInfo) SetBizOp(v string) *RiskSwitchInfo {
	s.BizOp = &v
	return s
}

func (s *RiskSwitchInfo) SetBizTag(v string) *RiskSwitchInfo {
	s.BizTag = &v
	return s
}

func (s *RiskSwitchInfo) SetErrorMsg(v string) *RiskSwitchInfo {
	s.ErrorMsg = &v
	return s
}

func (s *RiskSwitchInfo) SetGroup(v string) *RiskSwitchInfo {
	s.Group = &v
	return s
}

func (s *RiskSwitchInfo) SetId(v string) *RiskSwitchInfo {
	s.Id = &v
	return s
}

func (s *RiskSwitchInfo) SetSecRequestUrl(v string) *RiskSwitchInfo {
	s.SecRequestUrl = &v
	return s
}

func (s *RiskSwitchInfo) SetValue(v string) *RiskSwitchInfo {
	s.Value = &v
	return s
}

type ExtraParamInfo struct {
	Key   *string `json:"key,omitempty" xml:"key,omitempty"`
	Value *string `json:"value,omitempty" xml:"value,omitempty"`
}

func (s ExtraParamInfo) String() string {
	return tea.Prettify(s)
}

func (s ExtraParamInfo) GoString() string {
	return s.String()
}

func (s *ExtraParamInfo) SetKey(v string) *ExtraParamInfo {
	s.Key = &v
	return s
}

func (s *ExtraParamInfo) SetValue(v string) *ExtraParamInfo {
	s.Value = &v
	return s
}

type QueryRiskSwitchRequest struct {
	BizOp         *string `json:"biz_op,omitempty" xml:"biz_op,omitempty"`
	BizTag        *string `json:"biz_tag,omitempty" xml:"biz_tag,omitempty"`
	Group         *string `json:"group,omitempty" xml:"group,omitempty"`
	SecRequestUrl *string `json:"sec_request_url,omitempty" xml:"sec_request_url,omitempty"`
}

func (s QueryRiskSwitchRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskSwitchRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskSwitchRequest) SetBizOp(v string) *QueryRiskSwitchRequest {
	s.BizOp = &v
	return s
}

func (s *QueryRiskSwitchRequest) SetBizTag(v string) *QueryRiskSwitchRequest {
	s.BizTag = &v
	return s
}

func (s *QueryRiskSwitchRequest) SetGroup(v string) *QueryRiskSwitchRequest {
	s.Group = &v
	return s
}

func (s *QueryRiskSwitchRequest) SetSecRequestUrl(v string) *QueryRiskSwitchRequest {
	s.SecRequestUrl = &v
	return s
}

type QueryRiskSwitchResponse struct {
	RiskSwitchInfo []*RiskSwitchInfo `json:"risk_switch_info,omitempty" xml:"risk_switch_info,omitempty" type:"Repeated"`
}

func (s QueryRiskSwitchResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskSwitchResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskSwitchResponse) SetRiskSwitchInfo(v []*RiskSwitchInfo) *QueryRiskSwitchResponse {
	s.RiskSwitchInfo = v
	return s
}

type AddBizpunishRequest struct {
	ActionCode   *string `json:"action_code,omitempty" xml:"action_code,omitempty"`
	ActionType   *string `json:"action_type,omitempty" xml:"action_type,omitempty"`
	ExtParams    *string `json:"ext_params,omitempty" xml:"ext_params,omitempty"`
	InstanceId   *string `json:"instance_id,omitempty" xml:"instance_id,omitempty"`
	ObjectType   *string `json:"object_type,omitempty" xml:"object_type,omitempty"`
	ProdCode     *string `json:"prod_code,omitempty" xml:"prod_code,omitempty"`
	Reason       *string `json:"reason,omitempty" xml:"reason,omitempty"`
	RequestId    *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
	RiskLevel    *string `json:"risk_level,omitempty" xml:"risk_level,omitempty"`
	SrcRequestId *string `json:"src_request_id,omitempty" xml:"src_request_id,omitempty"`
	TenantId     *string `json:"tenant_id,omitempty" xml:"tenant_id,omitempty"`
}

func (s AddBizpunishRequest) String() string {
	return tea.Prettify(s)
}

func (s AddBizpunishRequest) GoString() string {
	return s.String()
}

func (s *AddBizpunishRequest) SetActionCode(v string) *AddBizpunishRequest {
	s.ActionCode = &v
	return s
}

func (s *AddBizpunishRequest) SetActionType(v string) *AddBizpunishRequest {
	s.ActionType = &v
	return s
}

func (s *AddBizpunishRequest) SetExtParams(v string) *AddBizpunishRequest {
	s.ExtParams = &v
	return s
}

func (s *AddBizpunishRequest) SetInstanceId(v string) *AddBizpunishRequest {
	s.InstanceId = &v
	return s
}

func (s *AddBizpunishRequest) SetObjectType(v string) *AddBizpunishRequest {
	s.ObjectType = &v
	return s
}

func (s *AddBizpunishRequest) SetProdCode(v string) *AddBizpunishRequest {
	s.ProdCode = &v
	return s
}

func (s *AddBizpunishRequest) SetReason(v string) *AddBizpunishRequest {
	s.Reason = &v
	return s
}

func (s *AddBizpunishRequest) SetRequestId(v string) *AddBizpunishRequest {
	s.RequestId = &v
	return s
}

func (s *AddBizpunishRequest) SetRiskLevel(v string) *AddBizpunishRequest {
	s.RiskLevel = &v
	return s
}

func (s *AddBizpunishRequest) SetSrcRequestId(v string) *AddBizpunishRequest {
	s.SrcRequestId = &v
	return s
}

func (s *AddBizpunishRequest) SetTenantId(v string) *AddBizpunishRequest {
	s.TenantId = &v
	return s
}

type AddBizpunishResponse struct {
	ActionResult *bool   `json:"action_result,omitempty" xml:"action_result,omitempty"`
	RequestId    *string `json:"request_id,omitempty" xml:"request_id,omitempty"`
}

func (s AddBizpunishResponse) String() string {
	return tea.Prettify(s)
}

func (s AddBizpunishResponse) GoString() string {
	return s.String()
}

func (s *AddBizpunishResponse) SetActionResult(v bool) *AddBizpunishResponse {
	s.ActionResult = &v
	return s
}

func (s *AddBizpunishResponse) SetRequestId(v string) *AddBizpunishResponse {
	s.RequestId = &v
	return s
}

type AnalyzeContentriskRequest struct {
	AppMainScene   *string   `json:"app_main_scene,omitempty" xml:"app_main_scene,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	AppMainSceneId *string   `json:"app_main_scene_id,omitempty" xml:"app_main_scene_id,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	AppName        *string   `json:"app_name,omitempty" xml:"app_name,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	AppScene       *string   `json:"app_scene,omitempty" xml:"app_scene,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	AppSceneDataId *string   `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	AudioUrls      []*string `json:"audio_urls,omitempty" xml:"audio_urls,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0" type:"Repeated"`
	LinkUrls       []*string `json:"link_urls,omitempty" xml:"link_urls,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0" type:"Repeated"`
	OperatorId     *string   `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
	PictureUrls    []*string `json:"picture_urls,omitempty" xml:"picture_urls,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0" type:"Repeated"`
	PublishDate    *string   `json:"publish_date,omitempty" xml:"publish_date,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0" pattern:"\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?"`
	Tenant         *string   `json:"tenant,omitempty" xml:"tenant,omitempty"`
	Text           *string   `json:"text,omitempty" xml:"text,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	VideoUrls      []*string `json:"video_urls,omitempty" xml:"video_urls,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0" type:"Repeated"`
}

func (s AnalyzeContentriskRequest) String() string {
	return tea.Prettify(s)
}

func (s AnalyzeContentriskRequest) GoString() string {
	return s.String()
}

func (s *AnalyzeContentriskRequest) SetAppMainScene(v string) *AnalyzeContentriskRequest {
	s.AppMainScene = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetAppMainSceneId(v string) *AnalyzeContentriskRequest {
	s.AppMainSceneId = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetAppName(v string) *AnalyzeContentriskRequest {
	s.AppName = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetAppScene(v string) *AnalyzeContentriskRequest {
	s.AppScene = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetAppSceneDataId(v string) *AnalyzeContentriskRequest {
	s.AppSceneDataId = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetAudioUrls(v []*string) *AnalyzeContentriskRequest {
	s.AudioUrls = v
	return s
}

func (s *AnalyzeContentriskRequest) SetLinkUrls(v []*string) *AnalyzeContentriskRequest {
	s.LinkUrls = v
	return s
}

func (s *AnalyzeContentriskRequest) SetOperatorId(v string) *AnalyzeContentriskRequest {
	s.OperatorId = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetPictureUrls(v []*string) *AnalyzeContentriskRequest {
	s.PictureUrls = v
	return s
}

func (s *AnalyzeContentriskRequest) SetPublishDate(v string) *AnalyzeContentriskRequest {
	s.PublishDate = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetTenant(v string) *AnalyzeContentriskRequest {
	s.Tenant = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetText(v string) *AnalyzeContentriskRequest {
	s.Text = &v
	return s
}

func (s *AnalyzeContentriskRequest) SetVideoUrls(v []*string) *AnalyzeContentriskRequest {
	s.VideoUrls = v
	return s
}

type AnalyzeContentriskResponse struct {
	AppSceneDataId *string `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	EventId        *string `json:"event_id,omitempty" xml:"event_id,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	NeedQuery      *string `json:"need_query,omitempty" xml:"need_query,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	Reason         *string `json:"reason,omitempty" xml:"reason,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
	ResultAction   *string `json:"result_action,omitempty" xml:"result_action,omitempty" maxLength:"0" maximum:"0" minLength:"0" minimum:"0"`
}

func (s AnalyzeContentriskResponse) String() string {
	return tea.Prettify(s)
}

func (s AnalyzeContentriskResponse) GoString() string {
	return s.String()
}

func (s *AnalyzeContentriskResponse) SetAppSceneDataId(v string) *AnalyzeContentriskResponse {
	s.AppSceneDataId = &v
	return s
}

func (s *AnalyzeContentriskResponse) SetEventId(v string) *AnalyzeContentriskResponse {
	s.EventId = &v
	return s
}

func (s *AnalyzeContentriskResponse) SetNeedQuery(v string) *AnalyzeContentriskResponse {
	s.NeedQuery = &v
	return s
}

func (s *AnalyzeContentriskResponse) SetReason(v string) *AnalyzeContentriskResponse {
	s.Reason = &v
	return s
}

func (s *AnalyzeContentriskResponse) SetResultAction(v string) *AnalyzeContentriskResponse {
	s.ResultAction = &v
	return s
}

type NotifyRiskRequest struct {
	BizOp      *string           `json:"biz_op,omitempty" xml:"biz_op,omitempty"`
	BizResult  *bool             `json:"biz_result,omitempty" xml:"biz_result,omitempty"`
	BizTag     *string           `json:"biz_tag,omitempty" xml:"biz_tag,omitempty"`
	ExtParams  []*ExtraParamInfo `json:"ext_params,omitempty" xml:"ext_params,omitempty" type:"Repeated"`
	OperatorId *string           `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
	SecurityId *string           `json:"security_id,omitempty" xml:"security_id,omitempty"`
	Tenant     *string           `json:"tenant,omitempty" xml:"tenant,omitempty"`
}

func (s NotifyRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s NotifyRiskRequest) GoString() string {
	return s.String()
}

func (s *NotifyRiskRequest) SetBizOp(v string) *NotifyRiskRequest {
	s.BizOp = &v
	return s
}

func (s *NotifyRiskRequest) SetBizResult(v bool) *NotifyRiskRequest {
	s.BizResult = &v
	return s
}

func (s *NotifyRiskRequest) SetBizTag(v string) *NotifyRiskRequest {
	s.BizTag = &v
	return s
}

func (s *NotifyRiskRequest) SetExtParams(v []*ExtraParamInfo) *NotifyRiskRequest {
	s.ExtParams = v
	return s
}

func (s *NotifyRiskRequest) SetOperatorId(v string) *NotifyRiskRequest {
	s.OperatorId = &v
	return s
}

func (s *NotifyRiskRequest) SetSecurityId(v string) *NotifyRiskRequest {
	s.SecurityId = &v
	return s
}

func (s *NotifyRiskRequest) SetTenant(v string) *NotifyRiskRequest {
	s.Tenant = &v
	return s
}

type NotifyRiskResponse struct {
}

func (s NotifyRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s NotifyRiskResponse) GoString() string {
	return s.String()
}

type QueryRiskRequest struct {
	BizOp       *string           `json:"biz_op,omitempty" xml:"biz_op,omitempty"`
	BizTag      *string           `json:"biz_tag,omitempty" xml:"biz_tag,omitempty"`
	CallbackUrl *string           `json:"callback_url,omitempty" xml:"callback_url,omitempty"`
	ClientIp    *string           `json:"client_ip,omitempty" xml:"client_ip,omitempty"`
	ExtParams   []*ExtraParamInfo `json:"ext_params,omitempty" xml:"ext_params,omitempty" type:"Repeated"`
	LoginName   *string           `json:"login_name,omitempty" xml:"login_name,omitempty"`
	OperatorId  *string           `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
	ServerName  *string           `json:"server_name,omitempty" xml:"server_name,omitempty"`
	Tenant      *string           `json:"tenant,omitempty" xml:"tenant,omitempty"`
	TokenId     *string           `json:"token_id,omitempty" xml:"token_id,omitempty"`
	Umid        *string           `json:"umid,omitempty" xml:"umid,omitempty"`
}

func (s QueryRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskRequest) GoString() string {
	return s.String()
}

func (s *QueryRiskRequest) SetBizOp(v string) *QueryRiskRequest {
	s.BizOp = &v
	return s
}

func (s *QueryRiskRequest) SetBizTag(v string) *QueryRiskRequest {
	s.BizTag = &v
	return s
}

func (s *QueryRiskRequest) SetCallbackUrl(v string) *QueryRiskRequest {
	s.CallbackUrl = &v
	return s
}

func (s *QueryRiskRequest) SetClientIp(v string) *QueryRiskRequest {
	s.ClientIp = &v
	return s
}

func (s *QueryRiskRequest) SetExtParams(v []*ExtraParamInfo) *QueryRiskRequest {
	s.ExtParams = v
	return s
}

func (s *QueryRiskRequest) SetLoginName(v string) *QueryRiskRequest {
	s.LoginName = &v
	return s
}

func (s *QueryRiskRequest) SetOperatorId(v string) *QueryRiskRequest {
	s.OperatorId = &v
	return s
}

func (s *QueryRiskRequest) SetServerName(v string) *QueryRiskRequest {
	s.ServerName = &v
	return s
}

func (s *QueryRiskRequest) SetTenant(v string) *QueryRiskRequest {
	s.Tenant = &v
	return s
}

func (s *QueryRiskRequest) SetTokenId(v string) *QueryRiskRequest {
	s.TokenId = &v
	return s
}

func (s *QueryRiskRequest) SetUmid(v string) *QueryRiskRequest {
	s.Umid = &v
	return s
}

type QueryRiskResponse struct {
	SecurityId   *string `json:"security_id,omitempty" xml:"security_id,omitempty"`
	SecResult    *string `json:"sec_result,omitempty" xml:"sec_result,omitempty"`
	TemplateCode *string `json:"template_code,omitempty" xml:"template_code,omitempty"`
	TemplateDesc *string `json:"template_desc,omitempty" xml:"template_desc,omitempty"`
	VerifyId     *string `json:"verify_id,omitempty" xml:"verify_id,omitempty"`
	VerifyUrl    *string `json:"verify_url,omitempty" xml:"verify_url,omitempty"`
}

func (s QueryRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryRiskResponse) GoString() string {
	return s.String()
}

func (s *QueryRiskResponse) SetSecurityId(v string) *QueryRiskResponse {
	s.SecurityId = &v
	return s
}

func (s *QueryRiskResponse) SetSecResult(v string) *QueryRiskResponse {
	s.SecResult = &v
	return s
}

func (s *QueryRiskResponse) SetTemplateCode(v string) *QueryRiskResponse {
	s.TemplateCode = &v
	return s
}

func (s *QueryRiskResponse) SetTemplateDesc(v string) *QueryRiskResponse {
	s.TemplateDesc = &v
	return s
}

func (s *QueryRiskResponse) SetVerifyId(v string) *QueryRiskResponse {
	s.VerifyId = &v
	return s
}

func (s *QueryRiskResponse) SetVerifyUrl(v string) *QueryRiskResponse {
	s.VerifyUrl = &v
	return s
}

type QueryContentriskResultRequest struct {
	AppScene       *string `json:"app_scene,omitempty" xml:"app_scene,omitempty"`
	AppSceneDataId *string `json:"app_scene_data_id,omitempty" xml:"app_scene_data_id,omitempty"`
	EventId        *string `json:"event_id,omitempty" xml:"event_id,omitempty"`
}

func (s QueryContentriskResultRequest) String() string {
	return tea.Prettify(s)
}

func (s QueryContentriskResultRequest) GoString() string {
	return s.String()
}

func (s *QueryContentriskResultRequest) SetAppScene(v string) *QueryContentriskResultRequest {
	s.AppScene = &v
	return s
}

func (s *QueryContentriskResultRequest) SetAppSceneDataId(v string) *QueryContentriskResultRequest {
	s.AppSceneDataId = &v
	return s
}

func (s *QueryContentriskResultRequest) SetEventId(v string) *QueryContentriskResultRequest {
	s.EventId = &v
	return s
}

type QueryContentriskResultResponse struct {
	Reason       *string `json:"reason,omitempty" xml:"reason,omitempty"`
	ResultAction *string `json:"result_action,omitempty" xml:"result_action,omitempty"`
}

func (s QueryContentriskResultResponse) String() string {
	return tea.Prettify(s)
}

func (s QueryContentriskResultResponse) GoString() string {
	return s.String()
}

func (s *QueryContentriskResultResponse) SetReason(v string) *QueryContentriskResultResponse {
	s.Reason = &v
	return s
}

func (s *QueryContentriskResultResponse) SetResultAction(v string) *QueryContentriskResultResponse {
	s.ResultAction = &v
	return s
}

type ConfirmRiskRequest struct {
	BizOp      *string           `json:"biz_op,omitempty" xml:"biz_op,omitempty"`
	BizTag     *string           `json:"biz_tag,omitempty" xml:"biz_tag,omitempty"`
	ExtParams  []*ExtraParamInfo `json:"ext_params,omitempty" xml:"ext_params,omitempty" type:"Repeated"`
	OperatorId *string           `json:"operator_id,omitempty" xml:"operator_id,omitempty"`
	SecurityId *string           `json:"security_id,omitempty" xml:"security_id,omitempty"`
}

func (s ConfirmRiskRequest) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRiskRequest) GoString() string {
	return s.String()
}

func (s *ConfirmRiskRequest) SetBizOp(v string) *ConfirmRiskRequest {
	s.BizOp = &v
	return s
}

func (s *ConfirmRiskRequest) SetBizTag(v string) *ConfirmRiskRequest {
	s.BizTag = &v
	return s
}

func (s *ConfirmRiskRequest) SetExtParams(v []*ExtraParamInfo) *ConfirmRiskRequest {
	s.ExtParams = v
	return s
}

func (s *ConfirmRiskRequest) SetOperatorId(v string) *ConfirmRiskRequest {
	s.OperatorId = &v
	return s
}

func (s *ConfirmRiskRequest) SetSecurityId(v string) *ConfirmRiskRequest {
	s.SecurityId = &v
	return s
}

type ConfirmRiskResponse struct {
	ConfirmSuccess *bool `json:"confirm_success,omitempty" xml:"confirm_success,omitempty"`
}

func (s ConfirmRiskResponse) String() string {
	return tea.Prettify(s)
}

func (s ConfirmRiskResponse) GoString() string {
	return s.String()
}

func (s *ConfirmRiskResponse) SetConfirmSuccess(v bool) *ConfirmRiskResponse {
	s.ConfirmSuccess = &v
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
	AuthToken       *string
	Tenant          *string
	Workspace       *string
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
	client.Tenant = config.Tenant
	client.Workspace = config.Workspace
	client.Endpoint = config.Endpoint
	client.AuthToken = config.AuthToken
	client.Protocol = config.Protocol
	client.RegionId = config.RegionId
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
func (client *Client) DoRequest(action *string, protocol *string, method *string, pathname *string, request map[string]interface{}, runtime *util.RuntimeOptions) (_result map[string]interface{}, _err error) {
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
				"method":     action,
				"version":    tea.String("1.0"),
				"sign_type":  tea.String("HmacSHA1"),
				"req_time":   alipayutil.GetTimestamp(),
				"req_msg_id": util.GetNonce(),
			}
			if !tea.BoolValue(util.Empty(client.Tenant)) {
				request_.Query["tenant"] = client.Tenant
			}

			if !tea.BoolValue(util.Empty(client.Workspace)) {
				request_.Query["workspace"] = client.Workspace
			}

			if !tea.BoolValue(util.Empty(client.AuthToken)) {
				request_.Query["auth_token"] = client.AuthToken
			} else {
				request_.Query["access_key"] = client.AccessKeyId
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
	userAgent := util.GetUserAgent(client.UserAgent)
	_result = userAgent
	return _result
}

/**
 * Description: 查询风险事件的开关信息
 * Summary: 查询风险事件的开关信息
 */
func (client *Client) QueryRiskSwitch(request *QueryRiskSwitchRequest) (_result *QueryRiskSwitchResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryRiskSwitchResponse{}
	_body, _err := client.QueryRiskSwitchEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 查询风险事件的开关信息
 * Summary: 查询风险事件的开关信息
 */
func (client *Client) QueryRiskSwitchEx(request *QueryRiskSwitchRequest, runtime *util.RuntimeOptions) (_result *QueryRiskSwitchResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskSwitchResponse{}
	_body, _err := client.DoRequest(tea.String("antcloud.riskcontrol.risk.switch.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风控新增业务处罚API，用于新增业务处罚信息
 * Summary: 风控新增业务处罚API
 */
func (client *Client) AddBizpunish(request *AddBizpunishRequest) (_result *AddBizpunishResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AddBizpunishResponse{}
	_body, _err := client.AddBizpunishEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风控新增业务处罚API，用于新增业务处罚信息
 * Summary: 风控新增业务处罚API
 */
func (client *Client) AddBizpunishEx(request *AddBizpunishRequest, runtime *util.RuntimeOptions) (_result *AddBizpunishResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AddBizpunishResponse{}
	_body, _err := client.DoRequest(tea.String("antcloud.riskcontrol.bizpunish.add"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内容风险分析API，用于分析当前内容是否存在风险
 * Summary: 内容风险分析API
 */
func (client *Client) AnalyzeContentrisk(request *AnalyzeContentriskRequest) (_result *AnalyzeContentriskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &AnalyzeContentriskResponse{}
	_body, _err := client.AnalyzeContentriskEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内容风险分析API，用于分析当前内容是否存在风险
 * Summary: 内容风险分析API
 */
func (client *Client) AnalyzeContentriskEx(request *AnalyzeContentriskRequest, runtime *util.RuntimeOptions) (_result *AnalyzeContentriskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &AnalyzeContentriskResponse{}
	_body, _err := client.DoRequest(tea.String("antcloud.riskcontrol.contentrisk.analyze"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 业务处理完成后，将结果通知给风险
 * Summary: 业务结果通知
 */
func (client *Client) NotifyRisk(request *NotifyRiskRequest) (_result *NotifyRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &NotifyRiskResponse{}
	_body, _err := client.NotifyRiskEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 业务处理完成后，将结果通知给风险
 * Summary: 业务结果通知
 */
func (client *Client) NotifyRiskEx(request *NotifyRiskRequest, runtime *util.RuntimeOptions) (_result *NotifyRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &NotifyRiskResponse{}
	_body, _err := client.DoRequest(tea.String("antcloud.riskcontrol.risk.notify"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险事件查询API，用于查询当前业务是否存在风险
 * Summary: 风险事件查询API
 */
func (client *Client) QueryRisk(request *QueryRiskRequest) (_result *QueryRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryRiskResponse{}
	_body, _err := client.QueryRiskEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险事件查询API，用于查询当前业务是否存在风险
 * Summary: 风险事件查询API
 */
func (client *Client) QueryRiskEx(request *QueryRiskRequest, runtime *util.RuntimeOptions) (_result *QueryRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryRiskResponse{}
	_body, _err := client.DoRequest(tea.String("antcloud.riskcontrol.risk.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 内容风险分析结果查询API，用于风险分析结果的异步查询
 * Summary: 内容风险分析结果查询API
 */
func (client *Client) QueryContentriskResult(request *QueryContentriskResultRequest) (_result *QueryContentriskResultResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &QueryContentriskResultResponse{}
	_body, _err := client.QueryContentriskResultEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 内容风险分析结果查询API，用于风险分析结果的异步查询
 * Summary: 内容风险分析结果查询API
 */
func (client *Client) QueryContentriskResultEx(request *QueryContentriskResultRequest, runtime *util.RuntimeOptions) (_result *QueryContentriskResultResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &QueryContentriskResultResponse{}
	_body, _err := client.DoRequest(tea.String("antcloud.riskcontrol.contentrisk.result.query"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

/**
 * Description: 风险结果确认（后端进行doublecheck），用于业务执行前，业务方发起风险确认，判定对应的操作是否确实安全
 * Summary: 风险结果确认
 */
func (client *Client) ConfirmRisk(request *ConfirmRiskRequest) (_result *ConfirmRiskResponse, _err error) {
	runtime := &util.RuntimeOptions{}
	_result = &ConfirmRiskResponse{}
	_body, _err := client.ConfirmRiskEx(request, runtime)
	if _err != nil {
		return _result, _err
	}
	_result = _body
	return _result, _err
}

/**
 * Description: 风险结果确认（后端进行doublecheck），用于业务执行前，业务方发起风险确认，判定对应的操作是否确实安全
 * Summary: 风险结果确认
 */
func (client *Client) ConfirmRiskEx(request *ConfirmRiskRequest, runtime *util.RuntimeOptions) (_result *ConfirmRiskResponse, _err error) {
	_err = util.ValidateModel(request)
	if _err != nil {
		return _result, _err
	}
	_result = &ConfirmRiskResponse{}
	_body, _err := client.DoRequest(tea.String("antcloud.riskcontrol.risk.confirm"), tea.String("HTTPS"), tea.String("POST"), tea.String("/gateway.do"), tea.ToMap(request), runtime)
	if _err != nil {
		return _result, _err
	}
	_err = tea.Convert(_body, &_result)
	return _result, _err
}

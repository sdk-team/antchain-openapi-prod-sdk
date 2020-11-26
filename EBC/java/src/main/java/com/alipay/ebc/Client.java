// This file is auto-generated, don't edit it. Thanks.
package com.alipay.ebc;

import com.aliyun.tea.*;
import com.alipay.ebc.models.*;

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
    public String _securityToken;
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

    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
                    new TeaPair("version", version),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.antchain.alipayutil.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.aliyun.teautil.Common.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("charset", "UTF-8"),
                    new TeaPair("baseSdkVersion", "Tea-SDK"),
                    new TeaPair("sdkVersion", "Tea-SDK-20201127")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
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
        String userAgent = "TeaClient/1.0.0";
        return com.aliyun.teautil.Common.getUserAgent(userAgent);
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业
     */
    public CreateBaasEbcOrganizationResponse createBaasEbcOrganization(CreateBaasEbcOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBaasEbcOrganizationEx(request, runtime);
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业
     */
    public CreateBaasEbcOrganizationResponse createBaasEbcOrganizationEx(CreateBaasEbcOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.organization.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateBaasEbcOrganizationResponse());
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人
     */
    public CreateBaasEbcPersonResponse createBaasEbcPerson(CreateBaasEbcPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBaasEbcPersonEx(request, runtime);
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人
     */
    public CreateBaasEbcPersonResponse createBaasEbcPersonEx(CreateBaasEbcPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.person.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateBaasEbcPersonResponse());
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册
     */
    public CreateBaasEbcOrganizationUserResponse createBaasEbcOrganizationUser(CreateBaasEbcOrganizationUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBaasEbcOrganizationUserEx(request, runtime);
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册
     */
    public CreateBaasEbcOrganizationUserResponse createBaasEbcOrganizationUserEx(CreateBaasEbcOrganizationUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.organization.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateBaasEbcOrganizationUserResponse());
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出
     */
    public CancelBaasEbcPersonResponse cancelBaasEbcPerson(CancelBaasEbcPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelBaasEbcPersonEx(request, runtime);
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出
     */
    public CancelBaasEbcPersonResponse cancelBaasEbcPersonEx(CancelBaasEbcPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.person.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CancelBaasEbcPersonResponse());
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入
     */
    public ResumeBaasEbcPersonResponse resumeBaasEbcPerson(ResumeBaasEbcPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeBaasEbcPersonEx(request, runtime);
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入
     */
    public ResumeBaasEbcPersonResponse resumeBaasEbcPersonEx(ResumeBaasEbcPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.person.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new ResumeBaasEbcPersonResponse());
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级
     */
    public CreateBaasEbcOrganizationClassResponse createBaasEbcOrganizationClass(CreateBaasEbcOrganizationClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBaasEbcOrganizationClassEx(request, runtime);
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级
     */
    public CreateBaasEbcOrganizationClassResponse createBaasEbcOrganizationClassEx(CreateBaasEbcOrganizationClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.organization.class.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateBaasEbcOrganizationClassResponse());
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级
     */
    public UpdateBaasEbcOrganizationClassResponse updateBaasEbcOrganizationClass(UpdateBaasEbcOrganizationClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBaasEbcOrganizationClassEx(request, runtime);
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级
     */
    public UpdateBaasEbcOrganizationClassResponse updateBaasEbcOrganizationClassEx(UpdateBaasEbcOrganizationClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.organization.class.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new UpdateBaasEbcOrganizationClassResponse());
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员
     */
    public AddBaasEbcClassUserResponse addBaasEbcClassUser(AddBaasEbcClassUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBaasEbcClassUserEx(request, runtime);
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员
     */
    public AddBaasEbcClassUserResponse addBaasEbcClassUserEx(AddBaasEbcClassUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.class.user.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new AddBaasEbcClassUserResponse());
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员
     */
    public DeleteBaasEbcClassUserResponse deleteBaasEbcClassUser(DeleteBaasEbcClassUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBaasEbcClassUserEx(request, runtime);
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员
     */
    public DeleteBaasEbcClassUserResponse deleteBaasEbcClassUserEx(DeleteBaasEbcClassUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.class.user.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new DeleteBaasEbcClassUserResponse());
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询
     */
    public QueryBaasEbcOrganizationClassResponse queryBaasEbcOrganizationClass(QueryBaasEbcOrganizationClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBaasEbcOrganizationClassEx(request, runtime);
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询
     */
    public QueryBaasEbcOrganizationClassResponse queryBaasEbcOrganizationClassEx(QueryBaasEbcOrganizationClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.organization.class.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryBaasEbcOrganizationClassResponse());
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询
     */
    public QueryBaasEbcClassUserResponse queryBaasEbcClassUser(QueryBaasEbcClassUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBaasEbcClassUserEx(request, runtime);
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询
     */
    public QueryBaasEbcClassUserResponse queryBaasEbcClassUserEx(QueryBaasEbcClassUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.class.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryBaasEbcClassUserResponse());
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程
     */
    public CreateBaasEbcOrganizationCourseResponse createBaasEbcOrganizationCourse(CreateBaasEbcOrganizationCourseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBaasEbcOrganizationCourseEx(request, runtime);
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程
     */
    public CreateBaasEbcOrganizationCourseResponse createBaasEbcOrganizationCourseEx(CreateBaasEbcOrganizationCourseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.organization.course.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateBaasEbcOrganizationCourseResponse());
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程
     */
    public UpdateBaasEbcOrganizationCourseResponse updateBaasEbcOrganizationCourse(UpdateBaasEbcOrganizationCourseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBaasEbcOrganizationCourseEx(request, runtime);
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程
     */
    public UpdateBaasEbcOrganizationCourseResponse updateBaasEbcOrganizationCourseEx(UpdateBaasEbcOrganizationCourseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.organization.course.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new UpdateBaasEbcOrganizationCourseResponse());
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级
     */
    public AddBaasEbcCourseClassResponse addBaasEbcCourseClass(AddBaasEbcCourseClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBaasEbcCourseClassEx(request, runtime);
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级
     */
    public AddBaasEbcCourseClassResponse addBaasEbcCourseClassEx(AddBaasEbcCourseClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.course.class.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new AddBaasEbcCourseClassResponse());
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员
     */
    public AddBaasEbcCourseUserResponse addBaasEbcCourseUser(AddBaasEbcCourseUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBaasEbcCourseUserEx(request, runtime);
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员
     */
    public AddBaasEbcCourseUserResponse addBaasEbcCourseUserEx(AddBaasEbcCourseUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.course.user.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new AddBaasEbcCourseUserResponse());
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级
     */
    public DeleteBaasEbcCourseClassResponse deleteBaasEbcCourseClass(DeleteBaasEbcCourseClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBaasEbcCourseClassEx(request, runtime);
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级
     */
    public DeleteBaasEbcCourseClassResponse deleteBaasEbcCourseClassEx(DeleteBaasEbcCourseClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.course.class.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new DeleteBaasEbcCourseClassResponse());
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员
     */
    public DeleteBaasEbcCourseUserResponse deleteBaasEbcCourseUser(DeleteBaasEbcCourseUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBaasEbcCourseUserEx(request, runtime);
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员
     */
    public DeleteBaasEbcCourseUserResponse deleteBaasEbcCourseUserEx(DeleteBaasEbcCourseUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.course.user.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new DeleteBaasEbcCourseUserResponse());
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书
     */
    public CreateBaasEbcUserCertResponse createBaasEbcUserCert(CreateBaasEbcUserCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBaasEbcUserCertEx(request, runtime);
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书
     */
    public CreateBaasEbcUserCertResponse createBaasEbcUserCertEx(CreateBaasEbcUserCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.user.cert.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateBaasEbcUserCertResponse());
    }

    /**
     * Description: 更新证书
     * Summary: 更新证书
     */
    public UpdateBaasEbcUserCertResponse updateBaasEbcUserCert(UpdateBaasEbcUserCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBaasEbcUserCertEx(request, runtime);
    }

    /**
     * Description: 更新证书
     * Summary: 更新证书
     */
    public UpdateBaasEbcUserCertResponse updateBaasEbcUserCertEx(UpdateBaasEbcUserCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.user.cert.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new UpdateBaasEbcUserCertResponse());
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书
     */
    public QueryBaasEbcOrganizationCertResponse queryBaasEbcOrganizationCert(QueryBaasEbcOrganizationCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBaasEbcOrganizationCertEx(request, runtime);
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书
     */
    public QueryBaasEbcOrganizationCertResponse queryBaasEbcOrganizationCertEx(QueryBaasEbcOrganizationCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.organization.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryBaasEbcOrganizationCertResponse());
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书
     */
    public QueryBaasEbcUserCertResponse queryBaasEbcUserCert(QueryBaasEbcUserCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBaasEbcUserCertEx(request, runtime);
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书
     */
    public QueryBaasEbcUserCertResponse queryBaasEbcUserCertEx(QueryBaasEbcUserCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.user.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryBaasEbcUserCertResponse());
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询
     */
    public QueryBaasEbcCertResponse queryBaasEbcCert(QueryBaasEbcCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBaasEbcCertEx(request, runtime);
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询
     */
    public QueryBaasEbcCertResponse queryBaasEbcCertEx(QueryBaasEbcCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryBaasEbcCertResponse());
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
    证书已发布则会返回证书图片、证书其他信息的文件上传url。
    文件最大5M
     * Summary: 申请证书信息上传url
     */
    public ApplyBaasEbcCertUrlResponse applyBaasEbcCertUrl(ApplyBaasEbcCertUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyBaasEbcCertUrlEx(request, runtime);
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
    证书已发布则会返回证书图片、证书其他信息的文件上传url。
    文件最大5M
     * Summary: 申请证书信息上传url
     */
    public ApplyBaasEbcCertUrlResponse applyBaasEbcCertUrlEx(ApplyBaasEbcCertUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.cert.url.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new ApplyBaasEbcCertUrlResponse());
    }

    /**
     * Description: 新增授权关系，仅限联盟管理员调用
     * Summary: 新增授权关系
     */
    public CreateBaasEbcAuthResponse createBaasEbcAuth(CreateBaasEbcAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBaasEbcAuthEx(request, runtime);
    }

    /**
     * Description: 新增授权关系，仅限联盟管理员调用
     * Summary: 新增授权关系
     */
    public CreateBaasEbcAuthResponse createBaasEbcAuthEx(CreateBaasEbcAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.auth.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new CreateBaasEbcAuthResponse());
    }

    /**
     * Description: 更新授权关系，仅限联盟管理员调用
     * Summary: 更新授权关系
     */
    public UpdateBaasEbcAuthResponse updateBaasEbcAuth(UpdateBaasEbcAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBaasEbcAuthEx(request, runtime);
    }

    /**
     * Description: 更新授权关系，仅限联盟管理员调用
     * Summary: 更新授权关系
     */
    public UpdateBaasEbcAuthResponse updateBaasEbcAuthEx(UpdateBaasEbcAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.auth.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new UpdateBaasEbcAuthResponse());
    }

    /**
     * Description: 更新授权关系状态，仅限联盟管理员调用
     * Summary: 更新授权关系状态
     */
    public UpdateBaasEbcAuthStatusResponse updateBaasEbcAuthStatus(UpdateBaasEbcAuthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBaasEbcAuthStatusEx(request, runtime);
    }

    /**
     * Description: 更新授权关系状态，仅限联盟管理员调用
     * Summary: 更新授权关系状态
     */
    public UpdateBaasEbcAuthStatusResponse updateBaasEbcAuthStatusEx(UpdateBaasEbcAuthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.auth.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new UpdateBaasEbcAuthStatusResponse());
    }

    /**
     * Description: 更新数据价值
     * Summary: 更新数据价值
     */
    public UpdateBaasEbcDataPriceResponse updateBaasEbcDataPrice(UpdateBaasEbcDataPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBaasEbcDataPriceEx(request, runtime);
    }

    /**
     * Description: 更新数据价值
     * Summary: 更新数据价值
     */
    public UpdateBaasEbcDataPriceResponse updateBaasEbcDataPriceEx(UpdateBaasEbcDataPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.data.price.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new UpdateBaasEbcDataPriceResponse());
    }

    /**
     * Description: 查询消费者消费金额
     * Summary: 查询消费者消费金额
     */
    public QueryBaasEbcConsumptionAmountResponse queryBaasEbcConsumptionAmount(QueryBaasEbcConsumptionAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBaasEbcConsumptionAmountEx(request, runtime);
    }

    /**
     * Description: 查询消费者消费金额
     * Summary: 查询消费者消费金额
     */
    public QueryBaasEbcConsumptionAmountResponse queryBaasEbcConsumptionAmountEx(QueryBaasEbcConsumptionAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.ebc.consumption.amount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), runtime), new QueryBaasEbcConsumptionAmountResponse());
    }
}

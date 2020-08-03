// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CreateIRealpersonFacevrfServerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 认证模式码
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 真实姓名
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件类型，如身份证
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 预留扩展参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // 自定义比对源人脸图像，base64编码格式
        [NameInMap("facial_picture_ref")]
        [Validation(Required=false)]
        public string FacialPictureRef { get; set; }

        // 身份信息来源类型，如证件
        [NameInMap("identity_type")]
        [Validation(Required=false)]
        public string IdentityType { get; set; }

        // metainfo 环境参数，需要通过客户端 SDK 获取
        [NameInMap("meta_info")]
        [Validation(Required=false)]
        public string MetaInfo { get; set; }

        // 外部唯一标识。用于定位。
        // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        [NameInMap("outer_order_no")]
        [Validation(Required=false)]
        public string OuterOrderNo { get; set; }

        // 回跳地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 场景ID
        [NameInMap("scene_id")]
        [Validation(Required=false)]
        public string SceneId { get; set; }

        // 商户自定义的用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户的IP
        [NameInMap("user_ip")]
        [Validation(Required=false)]
        public string UserIp { get; set; }

        // 用户的手机号
        [NameInMap("user_mobile")]
        [Validation(Required=false)]
        public string UserMobile { get; set; }

    }

}

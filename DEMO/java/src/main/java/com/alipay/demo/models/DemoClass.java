// This file is auto-generated, don't edit it. Thanks.
package com.alipay.demo.models;

import com.aliyun.tea.*;

public class DemoClass extends TeaModel {
    // 字符串测试
    @NameInMap("someString")
    public String someString;

    // 日期测试
    @NameInMap("someDate")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String someDate;

    // Boolean测试
    @NameInMap("someBoolean")
    public Boolean someBoolean;

    // 整数测试
    @NameInMap("someInt")
    public Integer someInt;

    // 列表测试
    @NameInMap("someList")
    public java.util.List<String> someList;

    public static DemoClass build(java.util.Map<String, ?> map) throws Exception {
        DemoClass self = new DemoClass();
        return TeaModel.build(map, self);
    }

    public DemoClass setSomeString(String someString) {
        this.someString = someString;
        return this;
    }
    public String getSomeString() {
        return this.someString;
    }

    public DemoClass setSomeDate(String someDate) {
        this.someDate = someDate;
        return this;
    }
    public String getSomeDate() {
        return this.someDate;
    }

    public DemoClass setSomeBoolean(Boolean someBoolean) {
        this.someBoolean = someBoolean;
        return this;
    }
    public Boolean getSomeBoolean() {
        return this.someBoolean;
    }

    public DemoClass setSomeInt(Integer someInt) {
        this.someInt = someInt;
        return this;
    }
    public Integer getSomeInt() {
        return this.someInt;
    }

    public DemoClass setSomeList(java.util.List<String> someList) {
        this.someList = someList;
        return this;
    }
    public java.util.List<String> getSomeList() {
        return this.someList;
    }

}

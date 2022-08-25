package com.yao0er4.biu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 保存配置信息
 */
@ConfigurationProperties(prefix = "yao0er4.biu.json")
public class MyJsonProperties {

    public static final String DEFAULT_NAME = "yao0er4";
    private String name = DEFAULT_NAME;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

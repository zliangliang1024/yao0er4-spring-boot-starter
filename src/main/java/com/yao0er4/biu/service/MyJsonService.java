package com.yao0er4.biu.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 提供的服务
 */
public class MyJsonService {

    private String name;

    public String toJSON(Object obj) {
        return getName() + JSON.toJSONString(obj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

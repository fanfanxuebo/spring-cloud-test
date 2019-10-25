package com.fanxuebo.springcloudeurekaclientone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 fanxuebo
 * @创建时间 2019-10-04 09:51:24 星期五
 * @描述
 */
@RestController
public class TestEurekaClientOneController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.application.name}")
    private String springApplicationName;

    @RequestMapping("hello")
    public String testHelloEureka(@RequestParam(value = "name", defaultValue = "fanxuebo") String name) {
        int errorInt = 1/0;
        return "Hello, " + name + "! My Name: " + springApplicationName + ", My Port:" + serverPort;
    }
}

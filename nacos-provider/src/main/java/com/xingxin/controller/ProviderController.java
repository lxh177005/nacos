package com.xingxin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
//    public static Log logger = LogFactory.getLog(ProviderController.class);
    @GetMapping("/hi")
    public String hi(String name){
//        logger.info("服务提供者开始提供服务*******************");
        return "hi:"+name;
    }
}

package com.xingxin.controller;

import com.xingxin.client.ProviderClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    private static Log logger = LogFactory.getLog(ConsumerController.class);
    @Autowired
    private ProviderClient providerClient;

    @GetMapping("hiFeign")
    public String hiFeign(){
        logger.info("调用provider服务中----{}");
        return providerClient.hi("feign");
    }
}

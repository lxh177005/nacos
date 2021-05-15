package com.xingxin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nacos-provider")
public interface ProviderClient{
    @GetMapping("/provider/hi")
    String hi(@RequestParam("name") String name);
}

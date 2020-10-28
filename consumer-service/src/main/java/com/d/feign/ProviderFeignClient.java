package com.d.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider-service")
public interface ProviderFeignClient {
    @GetMapping(path = "/index")
    String index();
}

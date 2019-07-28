package com.port.datauser.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "com-port",fallback = FeignFallBack.class)
public interface FeignService {

    @RequestMapping(value = "test/hello")
    String hello() ;
}

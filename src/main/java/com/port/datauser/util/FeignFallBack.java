package com.port.datauser.util;

import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements FeignService{

    @Override
    public String hello() {
        return "FeignFallBack:hello";
    }
}

package com.basic.auth.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumanaController {

    @GetMapping("/v1/unsecured")
    public String unsecuredApi() {
        return "ALLOWED_WITHOUT_SECURITY";
    }

    @GetMapping("/v1/secured")
    public String securedApi() {
        return "ALLOWED_WITH_SECURITY";
    }

}

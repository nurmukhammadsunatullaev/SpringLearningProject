package com.example.springlearningproject.controller;

import com.example.springlearningproject.scope.TenantBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private final TenantBean tenantBean;

    public IndexController(TenantBean tenantBean) {
        this.tenantBean = tenantBean;
    }

    @GetMapping
    public TenantBean indexAction(){
        return tenantBean;
    }
}

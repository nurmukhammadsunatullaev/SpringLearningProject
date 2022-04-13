package com.example.springlearningproject.controller;

import com.example.springlearningproject.factory.ReplaceBean;
import com.example.springlearningproject.scope.TenantBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private final TenantBean tenantBean;

    private final ReplaceBean replaceBean;

    public IndexController(TenantBean tenantBean, ReplaceBean replaceBean) {
        this.tenantBean = tenantBean;
        this.replaceBean = replaceBean;
    }

    @GetMapping
    public ReplaceBean indexAction(){
        return replaceBean;
    }
}

package com.example.springlearningproject.config;

import com.example.springlearningproject.factory.ReplaceBean;
import com.example.springlearningproject.scope.TenantBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class CustomConfiguration {

    @GenerateToken
    private String token;

    @Scope(scopeName = "tenant")
    @Bean
    public TenantBean foo() {
        return new TenantBean(token);
    }
}

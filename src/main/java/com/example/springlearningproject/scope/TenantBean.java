package com.example.springlearningproject.scope;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TenantBean {

    private final String name;

    public TenantBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Hello from %s of type %s",
                        this.name,
                        this.getClass().getName());
    }
}
package com.example.springlearningproject.factory;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ReplaceClass {
    Class replaceClass();
}

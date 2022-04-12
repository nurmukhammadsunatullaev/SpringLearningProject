package com.example.springlearningproject.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.UUID;

@Component
public class GenerateTokenPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields =bean.getClass().getDeclaredFields();
        for (Field field : fields){
            GenerateToken token=field.getAnnotation(GenerateToken.class);
            if(token != null){
                field.setAccessible(true);
                ReflectionUtils.setField(field,bean, UUID.randomUUID().toString());
            }
        }
        return bean;

    }
}

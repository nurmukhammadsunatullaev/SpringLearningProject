package com.example.springlearningproject.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReplaceClassBeanFactoryPostProcessing implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        String [] beanNames = factory.getBeanDefinitionNames();
        for (String beanName : beanNames){
            BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
            String beanClassName = beanDefinition.getBeanClassName();
            try {
                Class<?> beanClass = Class.forName(beanClassName);
                ReplaceClass replace = beanClass.getAnnotation(ReplaceClass.class);
                if(replace!=null){
                    beanDefinition.setBeanClassName(replace.replaceClass().getName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

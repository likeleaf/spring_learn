package com.oneflyingleaf.beans.factory.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private Map<String,BeanDefinition> beanFactory = Collections.synchronizedMap(new HashMap<>());

    public Object getBean(String name) {
        return beanFactory.get(name);
    }

    public void registBean(String name,BeanDefinition beanDefinition) {
        this.beanFactory.put(name,beanDefinition);
    }
}

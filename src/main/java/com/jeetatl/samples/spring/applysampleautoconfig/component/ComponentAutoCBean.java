package com.jeetatl.samples.spring.applysampleautoconfig.component;

import com.jeetatl.samples.spring.sampleautoconfig.bean.AutoCBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ComponentAutoCBean {

    @Autowired
    private AutoCBean autoCBean;

    @PostConstruct
    public void printAutoCBean() {
        System.out.println("printAutoCBean PostConstruct: " + this.autoCBean);
    }
}

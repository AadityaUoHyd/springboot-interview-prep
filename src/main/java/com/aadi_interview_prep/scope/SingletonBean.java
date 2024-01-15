package com.aadi_interview_prep.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

//    @Autowired
//    private ProtoTypeBean protoTypeBean;

//    @Autowired
//    ApplicationContext context;
    @Autowired
    private ObjectFactory<ProtoTypeBean> protoTypeBeanObjectFactory;

    public SingletonBean() {
        System.out.println("SingletonBean() instantiated !!");
    }

    public ProtoTypeBean getProtoTypeBean() {
        return getInstance();
    }

    @Lookup
    public ProtoTypeBean getInstance(){
        return null;
    }


}

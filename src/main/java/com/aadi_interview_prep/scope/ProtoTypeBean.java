package com.aadi_interview_prep.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ProtoTypeBean {

    public ProtoTypeBean() {
        System.out.println("ProtoTypeBean() instantiate");
    }
}

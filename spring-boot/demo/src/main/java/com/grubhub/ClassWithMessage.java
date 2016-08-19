package com.grubhub;

import org.springframework.stereotype.Component;

/**
 * Created by rene on 19/08/16.
 */
@Component
public class ClassWithMessage {

    public String greeting(String name) {
        return new TextInUpperCase("hello").text()+name;
    }
}

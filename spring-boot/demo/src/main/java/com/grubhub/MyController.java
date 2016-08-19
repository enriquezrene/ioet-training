package com.grubhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rene on 19/08/16.
 */
@RestController
public class MyController {

    @Autowired
    ClassWithMessage classWithMessage;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return classWithMessage.greeting("Rene");
    }
}

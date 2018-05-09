package com.cbl.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*@Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${context}")
    private String context;*/

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String sayHello(){
        return girlProperties.getAge().toString();
    }
}

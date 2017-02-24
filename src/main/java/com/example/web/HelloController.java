package com.example.web;

import com.example.dto.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Person index() {
        Person p = new Person("zhangsan", 18);
        return p;
    }
}

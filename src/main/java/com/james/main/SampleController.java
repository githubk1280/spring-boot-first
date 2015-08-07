package com.james.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/hi")
    @ResponseBody
    String sayHello() {
        return "hello world!";
    }

    public static void main(String args[]) {
        SpringApplication.run(SampleController.class, args);
    }
}

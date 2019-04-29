package com.southwind.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/baseType")
public class BaseTypeController {
    @RequestMapping("/baseTypeDo")
    @ResponseBody
    public String baseTypeDo(@RequestParam("xage") int age) {
        return "age:" + age;
    }
}

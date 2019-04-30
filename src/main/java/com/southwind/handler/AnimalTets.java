package com.southwind.handler;

import com.southwind.dao.Animal;
import com.southwind.dao.Animal1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("animal")
public class AnimalTets {

    @RequestMapping("animalTest")
    @ResponseBody
    public String animalTest(Animal animal) {
        return animal.toString();
    }

    @RequestMapping("animalTest1")
    @ResponseBody
    public String animalTest1(Animal animal, Animal1 animal1) {
        return animal.toString()+" "+animal1.toString();
    }

//    只有加了这俩个，才能单独对animal和animal1里的name进行赋值
//    InitBinder我觉得就像是过滤器，前端进行请求的时候，先经过这俩个方法，然后在进入与URL匹配的methods里
//    http://localhost:8089/mavenspringmvc_war/animal/animalTest1?animal.name=zb1&animal1.name=zb2&age=111
    @InitBinder("animal")
    public void initUser(WebDataBinder webDataBinder) {
        webDataBinder.setFieldDefaultPrefix("animal.");
    }

    @InitBinder("animal1")
    public void initAnimal(WebDataBinder webDataBinder) {
        webDataBinder.setFieldDefaultPrefix("animal1.");
    }
}

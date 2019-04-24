package com.southwind.handler;

import com.southwind.dao.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class PeopleHandle {

    @RequestMapping("/people")
    public String goPeople() {
        System.out.printf("进入people.jsp");
        return "people";
    }

    @RequestMapping(value = "/jsonType")
    @ResponseBody
    public People jsonType(@RequestBody People people) {
        //修改年龄
        people.setAge(people.getAge()+10);
        //返回前端
        return people;
    }
}

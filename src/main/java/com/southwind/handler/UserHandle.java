package com.southwind.handler;

import com.southwind.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class UserHandle {
    @RequestMapping(value = "/addUser")
    public String addUser(User user) {
        System.out.println(user);
        return "index";
    }
}

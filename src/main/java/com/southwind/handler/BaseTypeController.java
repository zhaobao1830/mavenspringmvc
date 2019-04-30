package com.southwind.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/baseType")
public class BaseTypeController {

    /**
     *  @ResponseBody表示把数据返回到response body中
     *  参数是int类型：参数不能为空，而且必须是int类型
     */

    @RequestMapping("/baseTypeDo")
    @ResponseBody
    public String baseTypeDo(@RequestParam("xage") int age) {
        return "age：" + age;
    }

    /**
     *
     * @param age 格式为Integer 前端传递的时候，可以为空
     * @return
     */
    @RequestMapping("baseTypeDo1")
    @ResponseBody
    public String baseTypeDo1(Integer age) {
        return "age：" + age;
    }


    /**
     *
     * @param age Integer（如果使用了@RequestParam,那么必须传这个参数，因为这里面的required属性默认为true）
     * @return
     */
    @RequestMapping("baseTYpeDo2")
    @ResponseBody
    public String baseTYpeDo2(@RequestParam(value = "xage", required = false) Integer age) {
        return "age：" + age;
    }
}

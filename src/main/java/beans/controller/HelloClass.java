package beans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloClass {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String sayHello() {
        return "index";
    }

    @RequestMapping(value = "/home2", method = RequestMethod.GET)
    public String sayHello2() {
        return "hello2";
    }

}

package org.thoughtworks.foo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItWorkController {
    @RequestMapping("/")
    @ResponseBody
    public String itWorks() {
        return "It Works!";
    }
}

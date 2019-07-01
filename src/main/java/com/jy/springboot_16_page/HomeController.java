package com.jy.springboot_16_page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index()
    {
        return "indexpage";
    }

    @RequestMapping("/2")
    public String page2()
    {
        return "aboutpage";
    }

    @RequestMapping("/3")
    public String page3()
    {
        return "contactuspage";
    }
}

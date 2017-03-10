package com.ulong.mvcminimal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ulong
 * DATE 2017/3/10
 */
@Controller
@RequestMapping("/simple")
public class SimpleController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String hello() {
        return "Hello Spring";
    }
}

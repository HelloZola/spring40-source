package com.cn.myspring.controller;

import bean.ArgBean;
import example.aspect.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/HelloworldController")
public class HelloworldController {

    @Autowired
    IUserService userService;

    /**
     * @return
     */
    @ResponseBody
    @RequestMapping("/helloworld")
    public String helloworld() {
        System.out.println("it is HelloworldController");
        return "hello world";
    }

    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "/helloworld21", method = RequestMethod.GET)
    public String helloworld21(@RequestParam(value = "name", required = false) String name) {
        System.out.println("it is HelloworldController");
        return "hello world";
    }

    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "/helloworld22", method = RequestMethod.POST)
    public String helloworld22(@RequestParam(value = "name", required = false) String name) {
        System.out.println("it is HelloworldController");
        return "hello world";
    }

    /**
     * 这种方式是错的，会报String转对象类型异常
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "/helloworld23", method = RequestMethod.POST)
    public String helloworld23(@RequestParam(value = "arg1", required = false) ArgBean argBean) {
        System.out.println("it is HelloworldController");
        return "hello world";
    }

    /**
     * 这种方式没问题，效果跟helloworld3一样
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "/helloworld24", method = RequestMethod.POST)
    public String helloworld24(ArgBean argBean) {
        System.out.println("it is HelloworldController");
        return "hello world";
    }

    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "/helloworld3", method = RequestMethod.POST)
    public String helloworld3(@RequestBody ArgBean argBean) {
        System.out.println("it is HelloworldController");
        return "hello world";
    }

}

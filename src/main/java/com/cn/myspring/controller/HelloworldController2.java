package com.cn.myspring.controller;

import bean.Person;
import com.alibaba.fastjson.JSONObject;
import example.aspect.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/HelloworldController2")
public class HelloworldController2 {

    @Autowired
    IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/helloworld2")
    public ModelAndView hello() {
        System.out.println("it is HelloworldController");
        System.out.println("it is HelloworldController");
        System.out.println("it is HelloworldController");
        userService.addUser();
        ModelAndView model = new ModelAndView();
        model.addObject("fsfsdfdsf");
        return model;
    }

    @ResponseBody
    @RequestMapping(value = "/helloworld3", method = RequestMethod.POST)
    public Map<String, Object> hello3(@RequestBody Person person) {
        System.out.println("it is HelloworldController");
        System.out.println("it is HelloworldController");
        System.out.println("it is HelloworldController");
        userService.addUser();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", "nonono");
        System.out.println("**************************");
        System.out.println(JSONObject.toJSONString(person));
        return map;
    }

    /**
     * 保留两位精度
     */
    private static String getTwoPrecision(String num, int precision) {
        try {
            if (StringUtils.isBlank(num)) {
                return num;
            }
            BigDecimal b = new BigDecimal(num);
            if (Double.parseDouble(num) > 1000000 || Double.parseDouble(num) < -1000000) {
                String[] arr = num.split("\\.");
                if (arr.length >= precision) {
                    return arr[0] + "." + makeupPostfix(arr[1], precision);
                } else {
                    return arr[0] + "." + makeupPostfix("", precision);
                }
            }
            double f1 = b.setScale(precision, RoundingMode.HALF_UP).doubleValue();
            return fillPostfix(f1 + "", precision);
        } catch (Exception e) {
            e.printStackTrace();
            return num;
        }
    }

    private static String fillPostfix(String num, int len) {
        String decimal = num.split("\\.")[1];
        if (decimal.length() < len) {
            return num.split("\\.")[0] + "." + makeupPostfix(decimal, len);
        }
        return num;
    }

    private static String makeupPostfix(String des, int len) {
        if (des.length() == len) {
            return des;
        }
        if (des.length() > len) {
            if (Integer.parseInt(des.substring(len, len + 1)) > BigDecimal.ROUND_HALF_UP) {
                return (Integer.parseInt(des.substring(0, len)) + 1) + "";
            } else {
                return Integer.parseInt(des.substring(0, len)) + "";
            }
        } else {
            des += "0";
            return makeupPostfix(des, len);
        }
    }

    public static void main(String[] args) {
        System.out.println(getTwoPrecision("-1.00501", 2));
        System.out.println(getTwoPrecision("0.12852522", 2));
        System.out.println(getTwoPrecision("5544.241455545", 2));
        System.out.println(getTwoPrecision("122", 2));
        System.out.println(getTwoPrecision("-88888888888888888888", 2));
        System.out.println(getTwoPrecision("000", 2));
        System.out.println(getTwoPrecision("5555555555.1255555555555555555555555555555555555555555555555555555", 2));
    }


}

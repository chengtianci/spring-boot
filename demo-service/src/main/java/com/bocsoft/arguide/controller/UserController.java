package com.bocsoft.arguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bocsoft.arguide.service.IDemoService;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IDemoService demoService;

    @ResponseBody
    @RequestMapping(value = "/getByid",method = RequestMethod.GET)
    public Object getUserById(@RequestParam Long id){
        return demoService.selectByPrimaryKey(id);
    }

//    @ResponseBody
//    @RequestMapping(value = "/getByExample",method = RequestMethod.POST)
//    public Object getUserByExample(@RequestBody RequestTestPO requestTestPO){
//        return demoService.selectByExample(requestTestPO);
//    }
}

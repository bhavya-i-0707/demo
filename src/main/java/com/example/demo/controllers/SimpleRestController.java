package com.example.demo.controllers;

import com.example.demo.model.Addition;
import com.example.demo.service.ServiceInterface;
import com.example.demo.service.impl.ServiceImpl;
import com.example.demo.utility.HelperClass;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("operation")
public class SimpleRestController {
    @Autowired ServiceImpl serviceImpl;

    @PostMapping(value = "addition/param/{a}/{b}", produces = "application/json")
    public Addition additionViaParam(@PathVariable int a, @PathVariable int b ){
       Addition addition1 = new Addition(a,b);
       return serviceImpl.processRequest(addition1);

    }

    @PostMapping(value = "/addition/requestbody", consumes = "application/json", produces = "application/json")
    public Addition additionViaRequestBody(@RequestBody Addition addition){
        return serviceImpl.processRequest(addition);
    }

}

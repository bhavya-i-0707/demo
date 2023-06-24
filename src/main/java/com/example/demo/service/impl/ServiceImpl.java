package com.example.demo.service.impl;

import com.example.demo.model.Addition;
import com.example.demo.service.ServiceInterface;
import com.example.demo.utility.HelperClass;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl implements ServiceInterface {
    @Autowired
    Addition addition;
    @Autowired
    HelperClass helperClass;

    public Addition processRequest(Addition addition){
        return  helperClass.additionCal(addition);
    }
}

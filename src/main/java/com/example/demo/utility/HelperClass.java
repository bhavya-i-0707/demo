package com.example.demo.utility;


import com.example.demo.model.Addition;

public class HelperClass {

    public Addition additionCal(Addition addObject){
         addObject.setResult(addObject.getOper1()+addObject.getOper2());
         return addObject;
    }
}

package com.example.demo.utility;

import com.example.demo.model.Addition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelperClassTest {

    @Test
    public void test_additionCal() {
        int oper1 =3;
        int oper2 = 4 ;
        int expectedResult = 7;
        Addition addition = new Addition(oper1,oper2);
        HelperClass helperClass = new HelperClass();
        addition= helperClass.additionCal(addition);
        Assertions.assertEquals(expectedResult,addition.getResult());

    }
}
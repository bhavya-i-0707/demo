package com.example.demo.model;

public class Addition {

    public Addition(int oper1, int oper2 ){
        this.oper1 = oper1;
        this.oper2 = oper2;
    }
    int oper1;

    public int getOper1() {
        return oper1;
    }

    public void setOper1(int oper1) {
        this.oper1 = oper1;
    }

    public int getOper2() {
        return oper2;
    }

    public void setOper2(int oper2) {
        this.oper2 = oper2;
    }

    public int getResult() {
        return Result;
    }

    public void setResult(int result) {
        Result = result;
    }

    int oper2;
    int Result;
}

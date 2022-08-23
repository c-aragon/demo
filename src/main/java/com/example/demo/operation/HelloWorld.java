package com.example.demo.operation;

import javax.inject.Named;

@Named
public class HelloWorld {

    private Integer sum1 = 0;
    private Integer sum2 = 0;

    public Integer getSum1() {
        return sum1;
    }

    public void setSum1(Integer sum1) {
        this.sum1 = sum1;
    }

    public Integer getSum2() {
        return sum2;
    }

    public void setSum2(Integer sum2) {
        this.sum2 = sum2;
    }

    public Integer showGreeting() {
        return sum1 + sum2;
    }

}

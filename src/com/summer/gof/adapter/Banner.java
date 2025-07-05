package com.summer.gof.adapter;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.printf("(%s)%n", string);
    }

    public void showWithAster() {
        System.out.printf("*%s*%n", string);
    }
}

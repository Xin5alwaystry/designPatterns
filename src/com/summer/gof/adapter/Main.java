package com.summer.gof.adapter;

public class Main {
    public static void main(String[] args) {
        // 用继承的方式实现适配器
        Print print = new PrintBanner("Hello World");
        print.printWeak();
        print.printStrong();

        // 用代理的方式实现适配器
        Print print2 = new PrintImpl(new Banner("Hello Summer"));
        print2.printWeak();
        print2.printStrong();
    }
}

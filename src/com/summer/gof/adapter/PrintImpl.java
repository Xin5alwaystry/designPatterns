package com.summer.gof.adapter;

public class PrintImpl implements Print {
    private Banner banner;

    public PrintImpl(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

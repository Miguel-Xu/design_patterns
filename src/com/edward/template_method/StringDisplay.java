package com.edward.template_method;

public class StringDisplay extends AbstractDisplay{
    private String str;
    private int length;

    public StringDisplay(String str) {
        this.str = str;
        length = str.getBytes().length;
    }

    @Override
    public void print() {
        System.out.println(this.str);
    }

    @Override
    public void open() {
        for(int i = 0; i < this.length; i++){
            if(i != this.length-1) System.out.print("*");
            else System.out.println("*");
        }

    }

    @Override
    public void close() {
        for(int i = 0; i < this.length; i++){
            System.out.print("*");
        }
    }
}

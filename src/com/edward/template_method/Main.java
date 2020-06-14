package com.edward.template_method;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay cd = new CharDisplay('k');
        AbstractDisplay sd = new StringDisplay("helloworld");
        cd.display();
        sd.display();
    }
}

package com.edward.abstract_factory.idCard;

import com.edward.abstract_factory.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    IDCard(String owner, int serial) {      //the classes that outside this package are not allowed to instantiate IDCard class by constructor
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("use " + "(" + this.serial + ")" + this.owner + "'s ID card.");
    }

    public String getOwner(){
        return this.owner;
    }

    public int getSerial() {
        return serial;
    }
}

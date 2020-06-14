package com.edward.singleton;

/**
 * pattern one
 * once the class is loaded into memory,
 * it instantiates the singleton of it.
 */

public class Singleton {
    private Singleton(){};

    private static final Singleton SINGLETON = new Singleton();

    public static Singleton getInstance(){
        return SINGLETON;
    }
}

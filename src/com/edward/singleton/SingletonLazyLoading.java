package com.edward.singleton;

/**
 * pattern two
 * use key word synchronized to solve the thread safety problem which caused by lazing loading
 */

public class SingletonLazyLoading {
    private SingletonLazyLoading(){};

    private static volatile SingletonLazyLoading INSTANCE;

    public static SingletonLazyLoading getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonLazyLoading.class){
                if(INSTANCE == null){       //double check
                    try {
                        Thread.sleep(10);       //simulate time delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new SingletonLazyLoading();
                }
            }
        }
        return INSTANCE;
    }

}



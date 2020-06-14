package com.edward.singleton;

/**
 * pattern one update
 * inner classes are not loaded when outer classes are loaded,
 * which allows lazy loading while ensuring thread safety.
 */
public class SingletonUpdate {
    private SingletonUpdate(){};

    private static class SingletonUpdateHolder{
        private static final SingletonUpdate INSTANCE = new SingletonUpdate();
    }

    public static SingletonUpdate getInstance(){
        return SingletonUpdateHolder.INSTANCE;
    }
}

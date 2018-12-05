package com.dym.interview.patterns;

public class Singleton {

    // 单例防止被外部创建
    private Singleton(){}

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static final class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}

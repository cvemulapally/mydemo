package com.boot;

import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
public interface FuncInterface {

    public void doWork();

    public default String defaultString(){
        return "";

    }
}

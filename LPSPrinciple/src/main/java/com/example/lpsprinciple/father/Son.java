package com.example.lpsprinciple.father;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {

    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行了");
        return map.values();
    }
}

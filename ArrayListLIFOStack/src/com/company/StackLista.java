package com.company;

import java.util.ArrayList;

public class StackLista {
    ArrayList<Object> objekti = new ArrayList<Object>();
    public void push(Object e){
        objekti.add(e);

    }
    public Object pop(){
        Object o = objekti.get(objekti.size() -1);
        objekti.remove(0);
        return o;
    }
}

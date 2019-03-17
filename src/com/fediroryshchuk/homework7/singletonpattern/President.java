package com.fediroryshchuk.homework7.singletonpattern;

public class President extends SeniorGovernmentOfficials{
    private static President instance;

    private President(){

    }

    public static synchronized President getInstance(){
        if(instance==null){
            instance = new President();
        }
        return instance;
    }
}

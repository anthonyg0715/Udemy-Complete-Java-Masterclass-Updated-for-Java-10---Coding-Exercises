package com.anthony._static;

public class SIBTest {

    public static final String owner;

    static{
        owner = "Anthony";
        System.out.println("SIBTest Static initialization block called");
    }

    public SIBTest(){
        System.out.println("SIBTest Constructor called");
    }

    static{
        System.out.println("2nd SIBTest static initialization called");
    }

    public void someMethod(){
        System.out.println("Some Method");
    }
}

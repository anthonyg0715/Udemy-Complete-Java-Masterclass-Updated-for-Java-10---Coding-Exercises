package com.anthony._static;

 class StaticTest {

    private static int numInstances=0;
    private String name;

    StaticTest(String name){
        this.name = name;
        numInstances++;
    }

    static int getNumInstances() {
        return numInstances;
    }

    String getName() {
        return name;
    }
}

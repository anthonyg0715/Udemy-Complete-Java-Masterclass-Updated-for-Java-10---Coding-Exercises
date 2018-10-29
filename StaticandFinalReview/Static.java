package com.anthony._static;

public class Static {

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//        SomeClass one = new SomeClass("One");
//        SomeClass two = new SomeClass("Two");
//        SomeClass three = new SomeClass("Three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());

        //one.instanceNumber=4;//error because it is final and cannot be changed even though it is public
//        int pw = 1234;
//        extendedPassword pw1 = new extendedPassword(pw);
//        pw1.storePassword();
//        pw1.letMeIn(1);
//        pw1.letMeIn(100);
//        pw1.letMeIn(300);
//        pw1.letMeIn(1235);
//        pw1.letMeIn(-1234);
//        pw1.letMeIn(1234);

        SIBTest sibTest = new SIBTest();
        sibTest.someMethod();
        System.out.println("SIBTest Owner is " + SIBTest.owner);

    }
}

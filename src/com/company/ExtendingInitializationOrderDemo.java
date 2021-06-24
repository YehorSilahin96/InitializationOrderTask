package com.company;

public class ExtendingInitializationOrderDemo extends InitializationOrderDemo {
    protected static String childStaticVar;
    protected String childNonStaticVar;

    static {
        childStaticVar = "Child. Static variable";
        System.out.println("Child. Static block");
    }

    {
        childNonStaticVar = "Child. Non-static variable";
        System.out.println("Child. Non-static block");
    }

    public ExtendingInitializationOrderDemo () {
        System.out.println("Child. Default constructor");
    }

    public static void staticAction() {
        System.out.println("Child. Static method ");
    }

    public static void nonStaticAction () {
        System.out.println("Child. Non-static method");
    }
}

package com.company;

public class InitializationOrderDemo {
    protected static String parentStaticVar;
    protected String parentNonStaticVar;

    static {
        parentStaticVar = "Parent. Static variable";
        System.out.println("Parent. Static block");
    }

    {
        parentNonStaticVar = "Parent. Non-static variable";
        System.out.println("Parent. Non-static block");
    }

    public InitializationOrderDemo () {
        System.out.println("Parent. Default constructor");
    }

    public static void staticAction() {
        System.out.println("Parent. Static method ");
    }

    public static void nonStaticAction () {
        System.out.println("Parent. Non-static method");
    }

}

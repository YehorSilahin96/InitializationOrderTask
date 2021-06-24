package com.company;

public class Main {

    public static void main(String[] args) {
        InitializationOrderDemo parentOrder = new InitializationOrderDemo();
        ExtendingInitializationOrderDemo childOrder = new ExtendingInitializationOrderDemo();

        System.out.println(InitializationOrderDemo.parentStaticVar);
        System.out.println(parentOrder.parentNonStaticVar);

        System.out.println(ExtendingInitializationOrderDemo.childStaticVar);
        System.out.println(childOrder.childNonStaticVar);

        InitializationOrderDemo.staticAction();
        InitializationOrderDemo.nonStaticAction();
        ExtendingInitializationOrderDemo.staticAction();
        ExtendingInitializationOrderDemo.nonStaticAction();

    }
}

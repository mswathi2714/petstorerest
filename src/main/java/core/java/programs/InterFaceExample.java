package core.java.programs;
@FunctionalInterface // default method is allowed in functional interface
// This is a functional interface - it has only one abstract method
interface MyFunctionalInterface {
    // This is a constant - static final variable
    static final int COUNT =11;
    void myMethod();
    default void myDefaultMethod() {
        System.out.println("Hello from default method from Functional Interface");
    }
    static void myStaticMethod() {
        System.out.println("Hello from static method from Functional Interface");
    }
}
// This is a marker interface - it has no methods
interface MyMarkerInterface {
    // This is a marker interface - it has no methods
    // It is used to mark a class as having a certain property
    // It is used to mark a class as having a certain property
    // It is used to mark a class as having a certain property
}

interface MyInterface1 {
    static final int MY_CONSTANT = 10;
    default void myDefaultMethod() {
        System.out.println("Hello from default method");
    }
    static void myStaticMethod() {
        System.out.println("Hello from static method");
    }
    void myMethod();
    void myMethod1();
}

public class InterFaceExample implements MyInterface1 {
    @Override
    public void myDefaultMethod() {
        MyInterface1.super.myDefaultMethod();
    }
    MyFunctionalInterface myFunctionalInterface = () -> {
        System.out.println("MyFunctionalInterface");
    };
    MyFunctionalInterface myFunctionalInterface2 = () -> {
        System.out.println("MyFunctionalInterface2");
    };

    @Override
    public void myMethod() {
        System.out.println("Hello from myMethod");
    }

    @Override
    public void myMethod1() {
        System.out.println("Hello from myMethod1");
    }

    public static void main(String[] args) {
        InterFaceExample myInterface = new InterFaceExample();
        myInterface.myMethod(); // Calling the default method
        myInterface.myMethod1();
        myInterface.myDefaultMethod();
        MyInterface1.myStaticMethod(); // Calling the static method
        System.out.println("MY_CONSTANT: " + MY_CONSTANT);
        myInterface.myFunctionalInterface.myMethod();
        myInterface.myFunctionalInterface2.myMethod();
        myInterface.myFunctionalInterface.myDefaultMethod();
        MyFunctionalInterface.myStaticMethod();
    }
}
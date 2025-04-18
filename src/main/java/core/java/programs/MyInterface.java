package core.java.programs;

public interface MyInterface {
    public static final int MY_CONSTANT = 10;
    default void myDefaultMethod() {
        System.out.println("Hello from default method");
    }
    static void myStaticMethod() {
        System.out.println("Hello from static method");
    }
    void myMethod();
    void myMethod1();
}

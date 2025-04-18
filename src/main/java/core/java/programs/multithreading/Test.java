package core.java.programs.multithreading;

public class Test {

}
interface MyInterface {
    void myMethod();
    void myMethod1();
}

class Hello implements MyInterface{
    public void myMethod() {
        System.out.println("Swathi");
    } public void myMethod1() {
        System.out.println("Swathi1");
    }
    public static void main(String[] args) {
        //MyInterface myInterface = () -> System.out.println("Hello from anonymous class");
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Swathi223");
            }

            @Override
            public void myMethod1() {
                System.out.println("Swathi2323");
            }
        };
        myInterface.myMethod();
        myInterface.myMethod1();

        Hello hello = new Hello();
        hello.myMethod();
        hello.myMethod1();
    }
}

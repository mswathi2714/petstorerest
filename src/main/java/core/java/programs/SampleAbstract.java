package core.java.programs;

public abstract class SampleAbstract {
    private String name;
    //  This is a concrete class - constructor to finalize the object
    public SampleAbstract() {
        this.name = "Naresh";
        System.out.println("Constructor of abstract class: " +name);
    }
    public SampleAbstract(String name) {
        this.name = name;
        System.out.println("Constructor of abstract class: "+name);
    }

    public void myMethod(){
       System.out.println("This is not an abstract method: "+name);
    }
    public abstract void myAbstractMethod(); // This is an abstract method
}

class SampleExtended extends SampleAbstract{

    public SampleExtended(String name) {
        super(name); // Calling the constructor of the abstract class
        System.out.println("Constructor of concrete class: "+name);
    }
    public SampleExtended() {
        super(); // Calling the constructor of the abstract class
        System.out.println("Constructor of concrete class: ");
    }

    @Override
    public void myAbstractMethod() {
        System.out.println("This is myAbstractMethod()"); // This is the implementation of the abstract method
    }

    public static void main(String[] args) {
        SampleExtended myAbstract = new SampleExtended(); // Creating an object of the concrete class
        myAbstract.myAbstractMethod();
        myAbstract.myMethod();

        SampleExtended sampleExtended = new SampleExtended("SWATHI");
        sampleExtended.myMethod();

        SampleAbstract sampleAbstract = new SampleExtended();
        sampleAbstract.myMethod();
        sampleAbstract.myAbstractMethod();
    }

}
package core.java.programs.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MyThread  extends  Thread {
    private static List<Integer> numbers = new ArrayList<>();
    ;

    public static void addIntToList() {
        for(int i=0; i<10; i++) {
            numbers.add(i);
            System.out.println("Adding to list "+i);
        }

    }
    public void removeIntFromList(int y) {
       // synchronized (numbers) {
        numbers.remove(y);
        //}

        System.out.println("Removing from list {} {} "+y+ " "+ numbers.get(y));
    }
    public void run() {
        addIntToList();
        removeIntFromList(10);
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();
        System.out.println(numbers);

    }
}

package com.company;


class AnimalThread extends Thread {
    public String Name;
    public int Priority;

    AnimalThread(String name, int priority) {
        this.Name = name;
        this.Priority = priority;
    }


    @Override
    public void run() {
        System.out.println("На старте " + getName());
        for (int i = 0; i <= 1000; i += 100) {
                System.out.println(getName() + ": " + i + " метров.");
        }
    }
}

class Main {

    public static void main(String[] args) {

        AnimalThread rabbit = new AnimalThread("Кролик", 1);
        rabbit.setName(rabbit.Name);
        rabbit.setPriority(rabbit.Priority);
        AnimalThread turtle = new AnimalThread("Черепаха", 10);
        turtle.setName(turtle.Name);
        turtle.setPriority(turtle.Priority);
        turtle.start();
        rabbit.start();

    }
}




/*
class TestMultiPriority1 extends Thread{
    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName());
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

    }
    public static void main(String args[]){
        TestMultiPriority1 m1=new TestMultiPriority1();
        TestMultiPriority1 m2=new TestMultiPriority1();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start(); }
}
*/



/*
class Main extends Thread {

    public void run() {
        System.out.println(getName());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            (new Main()).start();
        }
    }
}
*/




/*
class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());
        for(int i = 4; i > 0; i--) {
            System.out.println("Поток: " + getName() + ", " + i);
        }
    }
}


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }
    }
}
*/








/*
class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Создание " +  threadName );
    }

    public void run() {
        System.out.println("Выполнение " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Поток: " + threadName + ", " + i);
                // Пусть поток немного подождет.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток " +  threadName + " прерван.");
        }
        System.out.println("Поток " +  threadName + " завершается.");
    }

    public void start () {
        System.out.println("Запуск " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class TestThread {

    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo("Поток-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo(" Поток-2");
        R2.start();
    }
}
 */
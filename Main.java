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

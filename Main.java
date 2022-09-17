package com.company;

import java.util.Objects;

class AnimalThread extends Thread {
    public String Name;

    AnimalThread(String name) {
        this.Name = name;
    }


    @Override
    public void run() {
        System.out.println("На старте " + getName());
        for (int i = 0; i <= 1000; i += 100) {
            System.out.println(getName() + ": " + i + " метров.");
            if(i==400){
                try{
                    System.out.println(getName() + ": " + i + " метров.");
                    if(Objects.equals(getName(), "Кролик")){
                        System.out.println("КРОЛИК УСТАЛ");
                        join(1);
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Кролик");
        rabbit.setName(rabbit.Name);
        AnimalThread turtle = new AnimalThread("Черепаха");
        turtle.setName(turtle.Name);
        turtle.start();
        rabbit.start();
    }
}

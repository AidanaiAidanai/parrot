package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Parrot parrot = new Parrot();
        parrot.setName("lolo.");
        parrot.setColor("blue");
        parrot.setAge(13);
        parrot.setWeight(8);
        System.out.println("the parrot^s name is "+parrot.getName());
        System.out.println("her color is "+parrot.getColor());
        System.out.println("lolo is "+parrot.getAge());
        System.out.println("her weight is "+parrot.getWeight());
    }
}

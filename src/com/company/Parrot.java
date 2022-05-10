package com.company;

public class Parrot {
    private String name;
    private String color;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.contains(".")){
            System.out.println("write any simbols");
        }else{
        this.name = name;}
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>10){
            System.out.println("the parrots can^t live");
        }else{
        this.age = age;}
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

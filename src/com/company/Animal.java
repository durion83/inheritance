package com.company;

/**
 * Created by ahmad on 23-Oct-15.
 */
public class Animal {
    private String brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){


    }

    public void move(){


    }

    public String getBrain() {
        return brain;
    }

    public void setBrain(String brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

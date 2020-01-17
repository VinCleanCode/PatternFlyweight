package com.rp.pattern.flyweight.example.tree;

public class Tree {
    private String type;
    private String owner;

    public Tree(String type){
        this.type = type;
        System.out.println("Get new one: "+type);
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void display(){
        System.out.println(type+", Owner: "+owner);
    }
}

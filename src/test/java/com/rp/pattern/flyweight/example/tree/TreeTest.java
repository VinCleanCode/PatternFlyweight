package com.rp.pattern.flyweight.example.tree;

import org.junit.jupiter.api.Test;

public class TreeTest {
    @Test
    public void test(){
        System.out.println("==================Flyweight mode test=================");

        Tree rose = TreeManager.getTree("Rose");
        rose.setOwner("Rose");
        rose.display();
        System.out.println("Jacky bought a rose");

        Tree jRose = TreeManager.getTree("Rose");
        jRose.setOwner("Jacky");
        jRose.display();

        System.out.println();
        Tree oak = TreeManager.getTree("Taiwan Oak");
        oak.setOwner("GOV");
        oak.display();
    }
}
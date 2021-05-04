package com.tom.collection;

import test.Box;
import test.Box1;
import test.Box2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
//        nums[3] = "Hank";
//        nums[4] = true;

       ArrayList list = new ArrayList();
        list.add(4);
        list.add(new Box1());
        list.add("Hank");
        list.add(true);
        Integer n = 4;
        list.add(4);
        String name = (String)list.get(2);

        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
        Box b = boxes.get(0);
    }
}

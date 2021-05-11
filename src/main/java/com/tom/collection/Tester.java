package com.tom.collection;

import com.sun.source.tree.Tree;
import test.Box;
import test.Box1;
import test.Box2;

import java.util.ArrayList;
import java.util.TreeSet;

public class Tester {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
//        nums[3] = "Hank";
//        nums[4] = true;

        TreeSet<Integer> aa = new TreeSet<Integer>();
        System.out.println(aa.size());
        aa.add(3);
        aa.add(4);
        aa.add(6);
        aa.add(3);
        System.out.println(aa.size());
        System.out.println(aa);

        TreeSet<String> s = new TreeSet<>();
        s.add("Hank");
        s.add("Tom");
        s.add("June");
        s.add("Hank");
        for (String s1 : s) {

        }

       ArrayList list = new ArrayList();
        list.add(4);
        list.add(new Box1());
        list.add("Hank");
        list.add(true);
        Integer n = 4;
        list.add(n);
        String name = (String)list.get(2);

        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
        Box b = boxes.get(0);
    }
}

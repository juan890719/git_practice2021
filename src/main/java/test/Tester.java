package test;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = {new Box1(), new Box2(), new Box3(), new Box4(), new Box5()};
        int length = 10;
        int width = 5;
        int height= 5;
//        if (boxes[0].validate(length, width, height)) {
//            System.out.println("Box1 it is!");
//        } else if (boxes[1].validate(length, width, height)) {
//            System.out.println("Box2 it is!");
//        } else if (boxes[2].validate(length, width, height)) {
//            System.out.println("Box3 it is!");
//        } else if (boxes[3].validate(length, width, height)) {
//            System.out.println("Box4 it is!");
//        } else if (boxes[4].validate(length, width, height)) {
//            System.out.println("Box5 it is!");
//        }
        for (Box box: boxes) {
            if (box.validate(length, width, height)) {
                System.out.println(box.name + " it is!, " + box.price);
                break;
            }
        }
    }
}

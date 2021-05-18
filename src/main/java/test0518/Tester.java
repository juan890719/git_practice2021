package test0518;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length: ");
        int length =scanner.nextInt();
        System.out.println("Please enter width: ");
        int width =scanner.nextInt();
        System.out.println("Please enter height: ");
        int height =scanner.nextInt();
        Box[] boxes = {new Box1(), new Box2(), new Box3(), new Box4()};
        for (Box box: boxes) {
            if (box.validate(length, width, height)) {
                System.out.println(box.getName() + "\t" + box.getPrice());
                break;
            } else {
                System.out.println("No one box you can use.");
                break;
            }
        };
    }
}

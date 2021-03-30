package box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter object\'s length: ");
        int length = scan.nextInt();
        System.out.println("Please enter object\'s width: ");
        int width = scan.nextInt();
        System.out.println("Please enter object\'s height: ");
        int height = scan.nextInt();
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
        if (box3.validate(length, width, height)) {
            box3.getName();
            box3.getPrice();
        } else if (box5.validate(length, width, height)) {
            box5.getName();
            box5.getPrice();
        }
    }
}

package test0518;

public class Box3 extends Box {
    public Box3() {
        length = 15;
        width = 15;
        height = 10;
    }

    @Override
    public String getName() {
        return "Box3";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}

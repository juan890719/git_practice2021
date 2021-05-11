package Anon;

public class Tester {
    public static void main(String[] args) {
        //First version: New two class implements interface in addition
//        Reporter reporter1 = new WeatherReporter();
//        Reporter reporter2 = new HeheheReporter();
//        reporter1.print();
//        reporter2.print();

        //Second version: Direct new two object to implements interface
        Reporter reporter = new Reporter() {
            @Override
            public void print() {
                System.out.println("Ding Dong");
            }
        };
        Reporter reporter1 = new Reporter() {
            @Override
            public void print() {
                System.out.println("Hehehe");
            }
        };
        reporter.print();
        reporter1.print();
    }
}

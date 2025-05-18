package JavaLearning.Polymorphism;

public class Printer {

    public void print (String s) {
        System.out.println("Printing String : " + s);
    }

    public void print (int i) {
        System.out.println("printing Integer : " + i);
    }
}

class colorPrinter extends Printer {
    public void print (String s) {
        System.out.println("Printing in Colour : " + s);
    }

}

class MainPrinter {
    public static void main(String[] args) {

        Printer basePrinter = new Printer();
        basePrinter.print("Fuck");
        basePrinter.print(69);

        colorPrinter colorPrinter = new colorPrinter();
        colorPrinter.print("stfu");
        colorPrinter.print(420);

    }
}

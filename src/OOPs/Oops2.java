package OOPs;

public class Oops2 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "ballpoint";
        pen1.write();
        pen1.PrintColor();
        pen1.PrintType();
    }
}

class pen {
    String color;
    String type;

    void PrintColor() {

        System.out.println(this.color);
    }

    void PrintType() {
        System.out.println(this.type);
    }

    void write() {
        System.out.println("writing something");
    }
}

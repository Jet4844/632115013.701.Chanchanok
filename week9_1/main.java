package week9_1;

public class main {
    public static void main(String[] args) {
        Shape a;
        Rectangle b;
        Cube c;

        a = new Shape(5, 10);
        b = new Rectangle(5, 10);
        c = new Cube(5, 10, 15);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());


    }
}

package week13;

public class Runshape {
    public static void main(String[] args) {
        shape square = new square(4);
        System.out.println(square.getArea());

        shape rectangle = new rectangle(10, 20);
        System.out.println(rectangle.getArea());

        shape triangle = new triangle(5, 30);
        System.out.println(triangle.getArea());
    }
}

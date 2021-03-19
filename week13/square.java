package week13;

public class square extends shape {
    private double side;
    public square (double side){
        this.side=side;
    }

    public double getArea() {

        return side*side;
    }
}
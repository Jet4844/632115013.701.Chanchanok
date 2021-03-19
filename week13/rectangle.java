package week13;

public class rectangle extends shape {
    private double width;
    private double length;
public rectangle(double width,double length){
    this.width=width;
    this.length=length;
    System.out.println("This rectangle have width = "+width+" lenght "+length);
}
public double getArea(){
    return width*length;
}
}

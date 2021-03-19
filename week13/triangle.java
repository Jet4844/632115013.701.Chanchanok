package week13;

public class triangle extends shape{
    private double base;
    private double height;
public triangle(double base,double height){
    this.base=base;
    this.height=height;

    System.out.println("This is racatangle have base = "+base+" height "+height);
}
@Override
public double getArea() {
    // TODO Auto-generated method stub
    return 0.5*base*height;
}

}

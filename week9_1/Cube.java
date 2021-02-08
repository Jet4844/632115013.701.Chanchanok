package week9_1;

public class Cube {
    int lenght;
    int width;
    int height;
    public Cube(int width,int height,int lenght){
        this.width= width;
        this.height= height;
        this.lenght= lenght;
    
    }
    public String toString(){
        return "This is a cube with the side of " +lenght;
    }
}

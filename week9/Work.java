package week9;

class work extends Person{
    String workState;
    String work;
    public work(String name,int bornYear,String workState){
        super(name, bornYear);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and teach student in "+workState+".");

    }
    
}


package week9;

public class artist extends Person{
    String workState;
  
    public artist(String name,int bornYear,String workState){
       super(name, bornYear);
       this.workState = workState;
   }
   public void introduce(){
       super.introduce();
       System.out.println("I'm a kpop arist and work in "+workState+".");

   } 
}


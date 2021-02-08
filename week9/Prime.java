package week9;

public class Prime extends Person{
    String workState;
  
    public Prime(String name,int bornYear,String workState){
       super(name, bornYear);
       this.workState = workState;
   }
   public void introduce(){
       super.introduce();
       System.out.println("I'm a Prime minister and work in "+workState+".");

   } 
}

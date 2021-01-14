//Chanchanok Nantawan 632115013
package week6;

public class Actor extends Person{
    String genre;
    public Actor(String name, int age, char gender, String job) {
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.job=job;
    }
    public void perform(){
        System.out.println(name+" is performing "+genre+" series.");
    }
}

//Chanchanok Nantawan 632115013
package week6;

public class Chef extends Person{
    String genre;
    public Chef(String name, int age, char gender, String job) {
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.job=job;
    }
    public void Cooking(){
        System.out.println(name+" is cooking "+genre+" menu.");
    }
}

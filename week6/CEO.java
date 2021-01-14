//Chanchanok Nantawan 632115013
package week6;

public class CEO extends Person {
    String genre;
    public CEO(String name, int age, char gender, String job) {
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.job=job;
    }
public void working(){
    System.out.println(name+" is managing "+genre+" bussiness");
}


}

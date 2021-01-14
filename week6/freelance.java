//Chanchanok Nantawan 632115013
package week6;

public class freelance extends Person {
    String genre;
    public freelance(String name, int age, char gender, String job) {
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.job=job;
    }
    public void Design(){
        System.out.println(name+" is designing "+genre+" application.");
    }
}

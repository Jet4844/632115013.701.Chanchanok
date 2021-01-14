//Chanchanok Nantawan 632115013
package week6;
public class Person{
    String name;
    int age;
    char gender;
    String job;
    public Person(){

    }
    public Person(String name,int age,char gender,String job){
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.job=job;
    }
    public void introduce(){
        System.out.println("My name is "+name);
        System.out.println("Gender is "+gender);
        System.out.println("Job: "+job);
    }
}

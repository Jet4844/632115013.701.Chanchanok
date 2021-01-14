package week6;



public class Artist extends Person{
    String genre;
    public Artist(String name, int age, char gender, String job) {
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.job=job;
    }
    public void playMusic(){
        System.out.println(name+" is playing "+genre+" music.");
    }
    public void working(){
        System.out.println(name+" is managing "+genre+" bussiness");
    }
    public void Cooking(){
        System.out.println(name+" is cooking "+genre+" menu.");
    }
    public void Design(){
        System.out.println(name+" is designing "+genre+" application.");
    }
    public void perform(){
        System.out.println(name+" is performing "+genre+" series.");
    }

}

package week9;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Mark", 2001);
        person1.introduce();

        Sheriff person2;
        person2 = new Sheriff("Mateo", 1988, "California");
        person2.introduce();

        work person3;
        person3 = new work("Ball", 1977, "CMU");
        person3.introduce();

        Prime person4;
        person4 = new Prime("Tu", 1954, "Thailand");
        person4.introduce();

        Football person5;
        person5 = new Football("Messi", 1987, "Barcelona football club");
        person5.introduce();

        artist person6;
        person6 = new artist("Jun", 1996, "Pledis entertainment");
        person6.introduce();
    }
}

package week7;

public class pet {
    String name;
    String species;
    String color;
    int age;

    public pet() {

    }

    public pet(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void ShowPetData() {
        System.out.println("Name : " + name + " Species : " + species + " Color : " + color + " Age : " + age);
    }
}

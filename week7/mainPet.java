package week7;

public class mainPet {
    public static void main(String[] agrs) {
        dog dog = new dog("Lucky", "Podle", "Brown", 2);
        dog.size = "small";
        dog.hair = "Short";
        dog.ShowPetData();
        dog.Run();
        dog.Bark();
        dog.isShortHair();
        System.out.println("------------------------------------------------------------");
        
        fish fish = new fish("Kum","Nimo","Orange",5);
        fish.speed="900";
        fish.water="Salt water";
        fish.size="Small";
        fish.ShowPetData();
        fish.IsSwimToTheSea();
        fish.SwimFast();
        System.out.println("------------------------------------------------------------");

        bird bird = new bird("Buby","Sparrow","White",3);
        bird.country="Thailand";
        bird.fly="Chiangmai to Bangkok";
        bird.ShowPetData();
        bird.Speak();
        bird.CheckCountry();
        bird.IsCanFly();
        System.out.println("------------------------------------------------------------");
    }
}

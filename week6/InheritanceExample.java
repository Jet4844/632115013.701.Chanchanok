//Chanchanok Nantawan 632115013
package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Jet", 19, 'F', "Artist");
        art.genre = "Kpop";
        art.introduce();
        art.playMusic();
        System.out.println("---------------------------------------------");
       
        Artist art1 = new Artist("Hin", 19, 'M', "CEO");
        art1.genre = "IT";
        art1.introduce();
        art1.working();
        System.out.println("---------------------------------------------");
        Artist art2 = new Artist("prae", 18, 'F', "Chef");
        art2.genre = "Italian";
        art2.introduce();
        art2.Cooking();
        System.out.println("---------------------------------------------");
        Artist art3 = new Artist("Jame", 18, 'M', "Freelance");
        art3.genre = "delivery food";
        art3.introduce();
        art3.Design();
        System.out.println("---------------------------------------------");
        Artist art4 = new Artist("Lalit", 19, 'F', "Actor");
        art4.genre = "Drama";
        art4.introduce();
        art4.perform();
    }

}

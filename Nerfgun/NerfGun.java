//Chanchanok Nantawan 632115013
package Nerfgun;

public class NerfGun {
    private int bullet = 0;
    private static int gunID = 0;

    public NerfGun() {
        gunID++;
        this.bullet = 0;
    }

    public NerfGun(int num) {
        gunID++;
        this.bullet = num;
    }

    public void fire() {
        if (bullet == 0) {
            System.out.println("There is no ammunition");
        } else {
            this.bullet--;
            System.out.println("BANG !!!");
        }
    }

    public void displayNumOfAmmunition() {
        System.out.println(bullet + " bullet left");
    }

    public void reload(int num1) {
        if (bullet + num1 <= 15) {
            this.bullet = bullet + num1;
        } else {
            System.out.println("Error!! the ammunition is overload");
        }
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + gunID);
    }
}

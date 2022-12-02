package main.java;

public class LilDogsClass {
    
    public int height = 25;
    public int weight = 4;
    public String unbark = "quietly.";
    public String bark = "loudly.";
    public String name = "little dog";

    public void Profile1 (String name) {
        System.out.println("Your doggie is: " + name);
    }

    public void Bark (String bark) {
        System.out.println("Your doggie barking " + bark);
    }

    public void Unbark (String unbark) {
        System.out.println("Your doggie barking " + unbark);
    }

    public void Сharacteristic1 (int h, int w) {
        height = h;
        weight = w;
        System.out.println("Average height is: " + h + "сm");
        System.out.println("Average weight is: " + w + "kg");
    }

    public LilDogsClass () {}

    public LilDogsClass (int h, int w, String n) {
        height = h;
        weight = w;
        name = n;
    }
    
    public LilDogsClass (int h, int w) {
        height = h;
        weight = w;
    }

    public LilDogsClass (String n) {
        name = n;
    }

    public LilDogsClass (int w, String n) {
        weight = w;
        name = n;
    }
}

package main.java;

public class BigDogsClass {

        public int height = 65;
        public int weight = 30;
        public String unbark = "quietly.";
        public String bark = "loudly.";
        public String name = "big dog";
    
        public void Profile (String name) {
            System.out.println("Your doggie is: " + name);
        }

        public void Bark (String bark) {
            System.out.println("Your doggie barking " + bark);
        }

        public void Unbark (String unbark) {
            System.out.println("Your doggie barking " + unbark);
        }

        public void Сharacteristic (int h, int w) {
            height = h;
            weight = w;
            System.out.println("Average height is: " + h + "сm.");
            System.out.println("Average weight is: " + w + "kg.");
        }
    
        public BigDogsClass () {}

        public BigDogsClass (String n) {
            name = n;
        }

        public BigDogsClass (int h) {
            height = h;
        }

        public BigDogsClass (int h, int w, String n) {
            height = h;
            weight = w;
            name = n;
        }
        
        public BigDogsClass (int h, int w) {
            height = h;
            weight = w;
        }

        public BigDogsClass (int w, String n) {
            weight = w;
            name = n;
        }
    }
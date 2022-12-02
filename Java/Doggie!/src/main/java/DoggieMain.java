package main.java;

import java.util.Scanner;

public class DoggieMain {
    
    public static void main(String[] args) {
        
        // List of dogs.

        System.out.println("Enter number of your doggie!");
        System.out.println();
        System.out.println("[1] Alaskan malamute");
        System.out.println("[2] Australian terrier");
        System.out.println("[3] Beauceron");
        System.out.println("[4] Bernese Mountain Dog");
        System.out.println("[5] Bichon-frize");
        System.out.println("[6] Bolonka");
        System.out.println("[7] Chow-chow (wire-haired)");
        System.out.println("[8] Dachshund (long-haired)");
        System.out.println("[9] Dalmatian");
        System.out.println("[10] German small spitz");
        System.out.println("[11] Rough Collie");
        System.out.println("[12] Smooth-haired chihuahua");
        System.out.println();

        // Classes of dogs.

        BDLonghairedClass dog1 = new BDLonghairedClass (65, 45, "Alaskan malamute");
        BigDogsClass dog2 = new BigDogsClass("Beauceron");
        BDLonghairedClass dog3 = new BDLonghairedClass(65, 42, "Bernese Mountain Dog");
        BDLonghairedClass dog4 = new BDLonghairedClass(52, 30, "Chow-chow (wire-haired)");
        BigDogsClass dog5 = new BigDogsClass("Dalmatian");
        BDLonghairedClass dog6 = new BDLonghairedClass(56, 27, "Rough Collie");

        LDLonghairedClass sdog1 = new LDLonghairedClass("Australian terrier");
        LDLonghairedClass sdog2 = new LDLonghairedClass("Bichon-frize");
        LDLonghairedClass sdog3 = new LDLonghairedClass(3, "Bolonka");
        LDLonghairedClass sdog4 = new LDLonghairedClass("Dachshund (long-haired)");
        LDLonghairedClass sdog5 = new LDLonghairedClass(10, "German small spitz");
        LilDogsClass sdog6 = new LilDogsClass(2, "Smooth-haired chihuahua");

        // Selecting a dog from the list.

        int num;
        Scanner name = new Scanner(System.in);
        num = name.nextInt();

        System.out.println();

        // Checking the value for validity.

        if (num > 12 || num <= 0) {
            System.out.println(num + " is incorrect.");
            System.out.println("Try another number of dog!");
            System.exit(1);
        } 

        // Definition of value.

        switch (num) {
            case 1:
            dog1.Profile(dog1.name);
            dog1.Сharacteristic(dog1.height, dog1.weight);
            dog1.Bark(dog1.bark);
            dog1.Warning();
            break;
            case 2:
            sdog1.Profile1(sdog1.name);
            sdog1.Сharacteristic1(sdog1.height, sdog1.weight);
            sdog1.Unbark(sdog1.unbark);
            sdog1.Warning1();
            break;
            case 3:
            dog2.Profile(dog2.name);
            dog2.Сharacteristic(dog2.height, dog2.weight);
            dog2.Bark(dog2.bark);
            break;
            case 4:
            dog3.Profile(dog3.name);
            dog3.Сharacteristic(dog3.height, dog3.weight);
            dog3.Bark(dog3.bark);
            dog3.Warning();
            break;
            case 5:
            sdog2.Profile1(sdog2.name);
            sdog2.Сharacteristic1(sdog2.height, sdog2.weight);
            sdog2.Unbark(sdog2.unbark);
            sdog2.Warning1();
            break;
            case 6:
            sdog3.Profile1(sdog3.name);
            sdog3.Сharacteristic1(sdog3.height, sdog3.weight);
            sdog3.Unbark(sdog3.unbark);
            sdog3.Warning1();
            break;
            case 7:
            dog4.Profile(dog4.name);
            dog4.Сharacteristic(dog4.height, dog4.weight);
            dog4.Bark(dog4.bark);
            dog4.Warning();
            break;
            case 8:
            sdog4.Profile1(sdog4.name);
            sdog4.Сharacteristic1(sdog4.height, sdog4.weight);
            sdog4.Bark(sdog4.bark);
            sdog4.Warning1();
            break;
            case 9:
            dog5.Profile(dog5.name);
            dog5.Сharacteristic(dog5.height, dog5.weight);
            dog5.Bark(dog5.bark);
            break;
            case 10:
            sdog5.Profile1(sdog5.name);
            sdog5.Сharacteristic1(sdog5.height, sdog5.weight);
            sdog5.Bark(sdog5.bark);
            sdog5.Warning1();
            break;
            case 11:
            dog6.Profile(dog6.name);
            dog6.Сharacteristic(dog6.height, dog6.weight);
            dog6.Bark(dog6.bark);
            dog6.Warning();
            break;
            case 12:
            sdog6.Profile1(sdog6.name);
            sdog6.Сharacteristic1(sdog6.height, sdog6.weight);
            sdog6.Bark(sdog6.bark);
            break;
        }


        // Convert dog age to dog years.

        System.out.println();
        System.out.println("How old are your dog?");
        System.out.println();

        int num1;
        Scanner name1 = new Scanner(System.in);
        num1 = name1.nextInt();

        if (num1 < 0) {
            System.out.println(num + " is incorrect.");
            System.out.println("Try another number of years!");
        } else {
        System.out.println();
        System.out.println("Wow!");
        System.out.println("It's approximately " + num1 * 7 + " in dog's years!");
        }

}

}

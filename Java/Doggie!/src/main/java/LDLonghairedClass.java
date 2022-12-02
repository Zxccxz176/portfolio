package main.java;

public class LDLonghairedClass extends LilDogsClass {
    

    public LDLonghairedClass (int height, int weight, String name) {
        super(height, weight, name);
    }

    public LDLonghairedClass (int weight, String name) {
        super(weight, name);
    }

    public LDLonghairedClass (String name) {
        super(name);
    }

     public void Warning1 () {
        System.out.println();
        System.out.println("Warning! This type of dog has a long fur!");
        System.out.println("1. Brush your dog regularly.");
        System.out.println("2. Use a special shampoo (for long fur).");
        System.out.println("3. In case of fur loss, consult a vet.");
        System.out.println("4. Do not wash your little dog in a deep bath.");
    }
}
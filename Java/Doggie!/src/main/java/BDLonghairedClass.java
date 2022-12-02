package main.java;

public class BDLonghairedClass extends BigDogsClass {

    
    public BDLonghairedClass (int height, int weight, String name) {
        super(height, weight, name);
    }

    public BDLonghairedClass (String name) {
        super(name);
    }
    
    public void Warning () {
        System.out.println();
        System.out.println("Warning! This type of dog has a long fur!");
        System.out.println("1. Brush your dog regularly.");
        System.out.println("2. Use a special shampoo (for long fur).");
        System.out.println("3. In case of fur loss, consult a vet.");
    }
}

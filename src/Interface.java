// Declare an interface
interface Animal {
    void sound();  // abstract method
    void sleep();  // another abstract method
}

// Class implements the interface
class Dog implements Animal {

    // Implement the sound method
    public void sound() {
        System.out.println("The dog says: Woof Woof");
    }

    // Implement the sleep method
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // create object
        myDog.sound();         // call method
        myDog.sleep();         // call method
    }
}

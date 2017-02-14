package HW3;

public class Bird {
    static void sing(){
        System.out.println("I am singing");
    }

    static void birdName(){
        System.out.println("I am a Bird");
    }

    static void fly() {
        System.out.println("I am flying");
    }

    static void walk() {
        System.out.println("I am walking");
    }

    public static void main(String[] args) {
        Bird.walk();
        Bird.fly();
        Bird.sing();
        Bird.birdName();
    }
   }
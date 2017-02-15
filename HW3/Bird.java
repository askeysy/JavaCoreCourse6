package HW3;

public class Bird {
    static void sing(String text){
        System.out.println(text);
    }

    public static void main(String[] args) {
        Bird.sing("I am walking");
        Bird.sing("I am flying");
        Bird.sing("I am singing");
        Bird.sing("I am a Bird");
    }
   }
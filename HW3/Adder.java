package HW3;

public class Adder extends Arithmetic{
    private Integer arg1;
    private Integer arg2;
    public Adder(Integer arg1,Integer arg2) {
        this.arg1=arg1;
        this.arg2=arg2;
    }

    boolean check(Integer a, Integer b) {
        return a >= b;
    }
}
package HW2;

public class HW22 {
    static String withdrawBalance(double balance,double withdrawal){
        double percent=0.05;
        double commision,rest;
        commision=percent*withdrawal;
        rest=balance-commision;
        if (balance>=commision+withdrawal){
            return "OK "+commision+" "+rest;
        }
        else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        double balances,withdrawal;
        balances =  150;
        withdrawal= 145;
        System.out.println(withdrawBalance(balances,withdrawal));
        balances =  157;
        withdrawal= 145;
        System.out.println(withdrawBalance(balances,withdrawal));

    }
}

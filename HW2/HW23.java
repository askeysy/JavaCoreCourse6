package HW2;

public class HW23 {
    static int []balances={235,2400,780,3200,500};
    static String []ownerNames={"Olga","John","Alex","Vasya","Inna"};

    static  String result(String ownerName,double withdrawal,double commision){
        int i=0;
        int isElement=0;
        double rest;
        while (i<ownerNames.length){
            if (ownerNames[i].equals(ownerName)){
                isElement=1;
                break;
            }
            i++;
        }
        if (isElement==0){
            return "Wrong owner!";
        }
        else{
            rest=balances[i]-commision;
            if (balances[i]>=commision+withdrawal){
                return "OK "+commision+" "+rest;
            }
            else{
                return "NO";
            }
        }
    }

    static String withdrawBalance(String ownerName,double withdrawal){
        double percent=0.05;
        double commision,rest;
        if (withdrawal<0) return "Withdraw less null!";
        commision=percent*withdrawal;
        return result(ownerName,withdrawal,commision);
    }
    public static void main(String[] args) {

        System.out.println(withdrawBalance("Vasya",150));
        System.out.println(withdrawBalance("Kolia",700));
        System.out.println(withdrawBalance("Ivan",900));
        System.out.println(withdrawBalance("Olga",-230));
    }
}

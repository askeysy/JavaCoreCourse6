package HW2;

public class HW23 {
    static int []balances={235,2400,780,3200,500};
    static String []ownerNames={"Olga","John","Alex","Vasya","Inna"};

    static String withdrawBalance(String ownerName,double withdrawal){
        double percent=0.05;
        double commision,rest;
        commision=percent*withdrawal;
        int i=0;
        int isElement=0;
        while (i<ownerNames.length){
            if (ownerNames[i]==ownerName){
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
    public static void main(String[] args) {

        System.out.println(withdrawBalance("Vasya",150));
        System.out.println(withdrawBalance("Kolia",700));
        System.out.println(withdrawBalance("Ivan",900));
        System.out.println(withdrawBalance("Olga",230));
    }
}

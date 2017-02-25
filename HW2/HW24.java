package HW2;


public class HW24 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

     static String fundBalance(String ownerName,double fund){
        double balance;
        int i=0;
        int isElement=0;
        if (fund<0){
            return "Fund less 0!";
        }
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
            balance=balances[i]+fund;
            return ownerName+ " "+balance;
        }
    }
    public static void main(String[] args) {
        System.out.println(fundBalance("Oww",100));
     }
}

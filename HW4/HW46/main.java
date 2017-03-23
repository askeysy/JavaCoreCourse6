package HW4.HW46;

import HW4.Currency;
import HW4.HW41.USBank;
import HW4.HW41.EUBank;
import HW4.HW41.ChinaBank;
import HW4.HW44.User;
import HW4.HW41.Bank;
import HW4.HW45.BankSystemImpl;

public class main {
    public static void main(String[] args) {
        Currency currency;
        Bank USBank=new USBank(1,"USA",Currency.USD,15,1000,1,1000000);
        Bank EUBank=new EUBank(1,"Germany",Currency.EUR,2,800,2,50000);
        Bank ChinaBank=new ChinaBank(1,"China",Currency.USD,3,500,3,10000);

        User firstUser=new User();
        User secondUser=new User();
        User thirdUser=new User();
        User fourthUser=new User();
        User fifthUser=new User();
        User sixthUser=new User();

        BankSystemImpl BankSystem=new BankSystemImpl();
        BankSystem.withdrawOfUser(firstUser,1000);
        BankSystem.fundUser(secondUser,500);
        BankSystem.paySalary(thirdUser);
        BankSystem.transferMoney(fourthUser,fifthUser,1000);
        BankSystem.paySalary(sixthUser);

    }
}

package HW4.HW46;

import HW4.Currency;
import HW4.HW41.USBank;
import HW4.HW41.EUBank;
import HW4.HW41.ChinaBank;
import HW4.HW44.User;
import HW4.HW41.Bank;

public class main {
    public static void main(String[] args) {
        Currency currency;
        Bank USBank=new USBank(1,"USA",Currency.USD,15,1000,1,1000000);
        Bank EUBank=new EUBank(1,"Germany",Currency.EUR,2,800,2,50000);
        Bank ChinaBank=new ChinaBank(1,"China",Currency.USD,3,500,3,10000);
        User firstUser=new User();
        firstUser.setMonthsOfEmployment(6);
        firstUser.setId(1548);
        firstUser.setBalance(3500);
        firstUser.setBank(USBank);
        firstUser.setCompanyName("MicroLift");
        firstUser.setName("Ivan Petrov");
        firstUser.setSalary(2300);
        Bank bankFirstUser=firstUser.getBank();
        double balancefirstUser=firstUser.getBalance();
        int salaryFirst = firstUser.getSalary();
        String companyNameFirst = firstUser.getCompanyName();
        System.out.println(bankFirstUser.getBankCountry());
        System.out.println(balancefirstUser);
        System.out.println(salaryFirst);
        System.out.println(companyNameFirst);

        User secondUser=new User();
        secondUser.setMonthsOfEmployment(12);
        secondUser.setId(252);
        secondUser.setBalance(700);
        secondUser.setBank(USBank);
        secondUser.setCompanyName("SuperLift");
        secondUser.setName("John Stachman");
        secondUser.setSalary(5000);
        Bank banksecondUser=secondUser.getBank();
        double balancesecondUser=secondUser.getBalance();
        int salarySecond = secondUser.getSalary();
        String companyNameSecond = secondUser.getCompanyName();
        System.out.println(bankFirstUser.getBankCountry());
        System.out.println(balancefirstUser);
        System.out.println(salarySecond);
        System.out.println(companyNameSecond);

        User thirdUser=new User();
        thirdUser.setMonthsOfEmployment(3);
        thirdUser.setId(2354);
        thirdUser.setBalance(5000);
        thirdUser.setBank(EUBank);
        thirdUser.setCompanyName("Siemens");
        thirdUser.setName("Herr Semenov");
        thirdUser.setSalary(7000);
        Bank bankthirdUser=thirdUser.getBank();
        double balancethirdUser=thirdUser.getBalance();
        int salarythirdUser = thirdUser.getSalary();
        String companyNamethirdUser = thirdUser.getCompanyName();
        System.out.println(bankthirdUser.getBankCountry());
        System.out.println(balancethirdUser);
        System.out.println(salarythirdUser);
        System.out.println(salarythirdUser);

        User fourthUser=new User();
        fourthUser.setMonthsOfEmployment(12);
        fourthUser.setId(252);
        fourthUser.setBalance(700);
        fourthUser.setBank(EUBank);
        fourthUser.setCompanyName("Liebherr");
        fourthUser.setName("Frau Smith");
        fourthUser.setSalary(5000);
        Bank bankfourthUser=fourthUser.getBank();
        double balancefourthUser=fourthUser.getBalance();
        int salaryfourthUser = fourthUser.getSalary();
        String companyNamefourthUser= fourthUser.getCompanyName();
        System.out.println(bankfourthUser.getBankCountry());
        System.out.println(balancefourthUser);
        System.out.println(salaryfourthUser);
        System.out.println(companyNamefourthUser);

        User fifthUser=new User();
        fifthUser.setMonthsOfEmployment(12);
        fifthUser.setId(1);
        fifthUser.setBalance(500);
        fifthUser.setBank(ChinaBank);
        fifthUser.setCompanyName("Xuainxau");
        fifthUser.setName("Jiuy Xuia");
        fifthUser.setSalary(300);
        Bank bankfifthUser=fifthUser.getBank();
        double balancefifthUser=fifthUser.getBalance();
        int salaryfifthUser = fifthUser.getSalary();
        String namefifthUser = fifthUser.getName();
        System.out.println(bankfifthUser.getBankCountry());
        System.out.println(balancefifthUser);
        System.out.println(salaryfifthUser);
        System.out.println(namefifthUser);

        User sixthUser=new User();
        sixthUser.setMonthsOfEmployment(12);
        sixthUser.setId(2);
        sixthUser.setBalance(10000);
        sixthUser.setBank(ChinaBank);
        sixthUser.setCompanyName("Lenovo");
        sixthUser.setName("Xu");
        sixthUser.setSalary(3000);
        Bank banksixthUser=sixthUser.getBank();
        double balancesixthUser=sixthUser.getBalance();
        int salarysixthUser = sixthUser.getSalary();
        String nameSixthUser= sixthUser.getName();
        System.out.println(banksixthUser.getBankCountry());
        System.out.println(balancesixthUser);
        System.out.println(salarysixthUser);
        System.out.println(nameSixthUser);
    }
}

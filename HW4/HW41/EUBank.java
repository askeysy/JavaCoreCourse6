package HW4.HW41;


import java.util.Currency;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    public Enum Currency;

    @Override
    public int getLimitOfWithdrawal() {
        switch(Currency.name()){
            case "EUR": return 2200;
            case "USD": return 2000;
            default:
                return -1;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch(Currency.name()){
            case "EUR": return 20000;
            case "USD": return 10000;
            default:
                return -1;
        }
    }

    @Override
    public int getMonthlyRate() {
        switch(Currency.name()){
            case "EUR": return 1;
            case "USD": return 0;
            default:
                return -1;
        }
    }

    @Override
    public int getCommission(int summ) {
        switch(Currency.name()){
            case "EUR":
                if (summ<1000){ return 2;}
                else{return 4;}
            case "USD":
                if (summ<1000){ return 5;}
                else{return 7;}
            default:
                return -1;
        }
    }
}

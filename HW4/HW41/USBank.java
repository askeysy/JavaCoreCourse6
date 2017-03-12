package HW4.HW41;

import java.util.Currency;


class USBank extends Bank{
    public Enum Currency;
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch(Currency.name()){
            case "EUR": return 1200;
            case "USD": return 1000;
            default:
                return -1;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch(Currency.name()){
            case "EUR": return 10000;
            case "USD": return 2147483647;
            default:
                return -1;
        }
    }

    @Override
    public int getMonthlyRate() {
        switch(Currency.name()){
            case "EUR": return 2;
            case "USD": return 1;
            default:
                return -1;
        }
    }

    @Override
    public int getCommission(int summ) {
        switch(Currency.name()){
            case "EUR":
                if (summ<1000){ return 6;}
                else{return 8;}
            case "USD":
                if (summ<1000){ return 5;}
                else{return 7;}
            default:
                return -1;
        }
    }
}
package HW4.HW41;


import HW4.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch(getCurrency()){
            case EUR: return 150;
            case USD: return 100;
            default:
                return -1;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch(getCurrency()){
            case EUR: return 5000;
            case USD: return 10000;
            default:
                return -1;
        }
    }

    @Override
    public int getMonthlyRate() {
        switch(getCurrency()){
            case EUR: return 0;
            case USD: return 1;
            default:
                return -1;
        }
    }

    @Override
    public int getCommission(int summ) {
        switch(getCurrency()){
            case EUR:
                if (summ<1000){ return 10;}
                else{return 11;}
            case USD:
                if (summ<1000){ return 3;}
                else{return 5;}
            default:
                return -1;
        }
    }
}

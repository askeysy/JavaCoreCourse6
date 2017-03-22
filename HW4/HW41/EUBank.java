package HW4.HW41;


import HW4.Currency;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch(getCurrency()){
            case EUR: return 2200;
            case USD: return 2000;
            default:
                return -1;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch(getCurrency()){
            case EUR: return 20000;
            case USD: return 10000;
            default:
                return -1;
        }
    }

    @Override
    public int getMonthlyRate() {
        switch(getCurrency()){
            case EUR: return 1;
            case USD: return 0;
            default:
                return -1;
        }
    }

    @Override
    public int getCommission(int summ) {
        switch(getCurrency()){
            case EUR:
                if (summ<1000){ return 2;}
                else{return 4;}
            case USD:
                if (summ<1000){ return 5;}
                else{return 7;}
            default:
                return -1;
        }
    }
}

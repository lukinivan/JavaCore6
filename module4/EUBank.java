package HomeWork.module4;

/*
* EUBank
* module 4, task 1.1
* Lukin Ivan
 */

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.USD) {
            return 2000;
        }
        if(getCurrency() == Currency.EUR) {
            return 2200;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if(getCurrency() == Currency.USD) {
            return 20000;
        }
        if(getCurrency() == Currency.EUR) {
           return 10000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        if(getCurrency() == Currency.USD) {
            return 1;
        }
        if(getCurrency() == Currency.EUR) {
            return 2;
        }
        return 0;
    }

    @Override
    public int getCommission(int summ) {
        if(getCurrency() == Currency.USD) {
            if(summ < 1000 && summ > 0){
                return (int)(summ * 0.05);
            }
            if(summ > 1000 && summ > 0) {
                return (int) (summ * 0.07);
            }
        }
        if(getCurrency() == Currency.EUR) {
            if(summ < 1000 && summ > 0){
                return (int)(summ * 0.02);
            }
            if(summ > 1000 && summ > 0) {
                return (int) (summ * 0.04);
            }
        }
        System.out.println("Сумма не может быть отрицательной");
        return 0;
    }
}

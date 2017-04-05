package HomeWork.module4;

/*
* ChinaBank
* module 4, task 1.1
* Lukin Ivan
 */

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.USD) {
            return 100;
        }
        if(getCurrency() == Currency.EUR) {
            return 150;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if(getCurrency() == Currency.USD) {
            return 5000;
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
            return 0;
        }
        return 0;
    }

    @Override
    public int getCommission(int summ) {
        if(getCurrency() == Currency.USD) {
            if(summ < 1000 && summ > 0){
                return (int)(summ * 0.03);
            }
            if(summ > 1000 && summ > 0) {
                return (int) (summ * 0.05);
            }
        }
        if(getCurrency() == Currency.EUR) {
            if(summ < 1000 && summ > 0){
                return (int)(summ * 0.1);
            }
            if(summ > 1000 && summ > 0) {
                return (int) (summ * 0.11);
            }
        }
        System.out.println("Сумма не может быть отрицательной");
        return 0;
    }
}

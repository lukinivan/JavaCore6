package HomeWork.module4.task3;

import HomeWork.module4.task1.Bank;
import HomeWork.module4.task1.ChinaBank;
import HomeWork.module4.task1.EUBank;
import HomeWork.module4.task1.USBank;
import HomeWork.module4.task2.Currency;

public class User {
    public static void main(String[] args) {

        Bank user1 = new USBank(555431,"USA", Currency.EUR,111,
                                2000, 95,20000);
        Bank user2 = new EUBank(444487,"Holland", Currency.USD,222,
                                5000, 95,20000);
        Bank user3 = new ChinaBank(333520,"China", Currency.USD,333,
                                11000, 95,50000);

        System.out.println(user1.getLimitOfWithdrawal());
        System.out.println(user2.getLimitOfFunding());
        System.out.println(user3.getCommission(-566));

    }
}

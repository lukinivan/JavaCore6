/*
* Main
* Task 4.1
* Lukin Ivan
 */

package HomeWork.module2.Task_4;

public class Main {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        Bank_3 owner = new Bank_3(balances,ownerNames);

        System.out.println(owner.addMoney("Jane",200));
    }
}

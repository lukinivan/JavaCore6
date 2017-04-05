/*
* Main
* Task 3.1
* Lukin Ivan
 */
package HomeWork.module2.Task_3;

public class Main {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        Bank_2 Owner = new Bank_2(balances, ownerNames);

        System.out.println(Owner.outPut("Jane", 200));
        System.out.println(Owner.outPut("Jack", 2000));
        System.out.println(Owner.outPut("Ivan", 200));

        System.out.println(Owner.getBalances("Oww"));
    }
}

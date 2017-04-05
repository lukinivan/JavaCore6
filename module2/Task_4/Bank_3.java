/*
* Bank_3
* Task 4.1
* Lukin Ivan
 */

package HomeWork.module2.Task_4;

public class Bank_3 {
    private int[] balances;
    private String[] ownerNames;

    public Bank_3(int[] balances, String[] ownerNames) {
        this.balances = balances;
        this.ownerNames = ownerNames;
    }

    String addMoney(String name, int sum) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(name)) {
                balances[i] += sum;
                return ("Owner " + name + " add " + sum + " money. " + "Balance: " + balances[i]);
            }
        }
        return ("The user " + name + " is not found");
    }
}

/*
* Bank_2
* Task 3.1
* Lukin Ivan
 */

package HomeWork.module2.Task_3;

class Bank_2 {
    private int[] balances;
    private String[] ownerNames;

    Bank_2(int[] balances, String[] ownerNames) {
        this.balances = balances;
        this.ownerNames = ownerNames;
    }

    String outPut(String name, double sum) {
        double commission = 0.05;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(name)) {
                if ((commission * sum) + sum < balances[i]) {
                    balances[i] -= (commission * sum) + sum;
                    return (name + " - " + "Commission: " + (commission * sum) + ", " + "Balsnce: " + balances[i]);
                }
                return ("User " + name + " not enough money");
            }
        }
        return ("The user " + name + " is not found");
    }

    String getBalances(String name) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(name)) {
                return ("Owner " + name + " have - " + balances[i]);
            }
        }
        return "The user " + name + " is not found";
    }
}

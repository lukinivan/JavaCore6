/*
* Bank
* Task 2.1
* Lukin Ivan
 */

package HomeWork.Modul_2.Task_2;

class Bank {
    private double balance;

    Bank(int balance) {
        this.balance = balance;
    }

    String outPut(double withdrawal) {
        double commission = 0.05;
        if (((commission * withdrawal) + withdrawal) < balance) {
            balance -= ((commission * withdrawal) + withdrawal);
            return ("commission: " + (commission * withdrawal) + ", " + "balance: " + balance);
        }
        return "No enough money";
    }
}

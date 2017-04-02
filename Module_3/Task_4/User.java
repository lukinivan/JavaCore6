/*
* User
* Module 3, Task 4.1
* Lukin Ivan
 */

package HomeWork.Module_3.Task_4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary() {
        balance += salary;
    }

    String withdraw(int summ) {
        if (summ < 1000) {
            balance -= (int) ((0.05 * summ) + summ);
            return "Commission 5% = " + (0.05 * summ);
        }
        if (summ >= 1000) {
            balance -= (int) ((0.1 * summ) + summ);
            return "Commission 10% = " + (0.1 * summ);
        }
        return "";
    }

    int companyNameLenght() {
        return companyName.length();
    }

    void monthIncreaser(int addMonth) {
        this.monthsOfEmployment += addMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

/*
* Main
* Module 3, Task 4.1
* Lukin Ivan
 */

package HomeWork.module3.Task_4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", 5000, 5, "SuperCompany", 2000, "USD");

        user.paySalary();
        user.monthIncreaser(1);
        user.withdraw(300);

        System.out.println("Company name length - " + user.companyNameLenght() + " symbols");
        System.out.println("User have " + user.getBalance() + " " + user.getCurrency());
        System.out.println("The user is working in this company for " + user.getMonthsOfEmployment() + " month");
    }
}

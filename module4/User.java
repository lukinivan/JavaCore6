/*
* User
* module 4, task 4.1
* Lukin Ivan
 */

package HomeWork.module4;

public class User {
    long id;
    private String name;
    double balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    Bank bank ;

    @Override
    public String toString(){
        return this.name;
    }
}

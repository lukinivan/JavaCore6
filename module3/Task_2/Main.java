/*
* Main
* Module Task 2.1
* Lukin Ivan
 */

package HomeWork.module3.Task_2;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();

        if(adder.check(1,5)) System.out.println("A >= B");
        else System.out.println("A < B");

        System.out.println(arithmetic.add(5,10));

    }
}

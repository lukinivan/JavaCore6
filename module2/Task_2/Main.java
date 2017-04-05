/*
* Main
* Version 1.1
* Lukin Ivan
 */
package HomeWork.module2.Task_2;

public class Main {
    public static void main(String[] args) {
        Bank player_1 = new Bank(100);
        Bank player_2 = new Bank(100);

        System.out.println("Player 1 - " + player_1.outPut(20));

        System.out.println("Player 2 - " + player_2.outPut(95));
    }
}

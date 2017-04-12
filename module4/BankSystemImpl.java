package HomeWork.module4;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {

    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if(amount!=0) {
            fromUser.setBalance(fromUser.getBalance() - amount);
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}

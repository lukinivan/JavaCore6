package HomeWork.module4;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (amount != 0 && user != null) {
            user.setBalance(user.getBalance() - amount);
        }

    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount != 0 && user != null) {
            user.setBalance(user.getBalance() + amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (amount != 0 && fromUser != null && toUser != null) {
            fromUser.setBalance(fromUser.getBalance() - amount);
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        if (user != null) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
    }
}

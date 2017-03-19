package HW4.HW45;

import HW4.HW44.User;

interface BankSystem{
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}

public class BankSystemImpl implements BankSystem{

    @Override
    public void withdrawOfUser(User user, int amount) {

    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}

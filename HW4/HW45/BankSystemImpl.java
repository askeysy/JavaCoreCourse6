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
        double result=user.getBalance()-amount;
        user.setBalance(result);
    }

    @Override
    public void fundUser(User user, int amount) {
        double balance=user.getBalance();
        user.setBalance(balance+amount);
      }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double balanceUser1=fromUser.getBalance();
        fromUser.setBalance(balanceUser1-amount);
        double balaneUser2=toUser.getBalance();
        toUser.setBalance(balaneUser2+balanceUser1);
    }

    @Override
    public void paySalary(User user) {
        int salaryUSer=user.getSalary();
        user.setSalary(salaryUSer);
    }
}

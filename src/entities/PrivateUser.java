package entities;

import finance.Account;

import java.util.List;

public class PrivateUser extends Entity{

    public PrivateUser(int id, List<Account> accounts) {
        super(id, accounts);
    }

    @Override
    public Account getAccount(int id) {
        return null;
    }

    @Override
    public void openAccount() {

    }
}

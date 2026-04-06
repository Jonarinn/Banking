package finance;

import forex.Money;
import lib.enums.AccountType;

public abstract class Account {
    private int id;
    private AccountType accountType;
    private Money amount;
}

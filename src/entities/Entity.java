package entities;

import finance.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Entity {
    public Entity(int id, List<Account> accounts) {
        this.id = id;
        this.accounts = accounts;
    }
    private final int id;
    public int getId() {
        return id;
    }
    private String name;
    public String getName() {
        return name;
    }
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return Collections.unmodifiableList(accounts);
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }

    public abstract Account getAccount(int id);
    public abstract void openAccount();
}

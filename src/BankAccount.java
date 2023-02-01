import java.util.UUID;

public abstract class BankAccount {
    public double balance;
    Customer owner;

    UUID id;

    abstract void setOwner(Customer owner);

    abstract boolean withdraw(double amount);

    UUID getId(){

    if(id == null) {

    }
        return id;
    }

    public void deposit(double amount){

        this.balance += amount;
    }

    public double getBalance(){

        return balance;
    }

    Customer getOwner(){

        return owner;
    }


}

import java.util.ArrayList;

public class Customer {

    String name;
    Status status;
    int id;

    ArrayList<BankAccount> accounts;


    public void addAccount(BankAccount account) {
        if (accounts == null) {
            accounts = new ArrayList<>();
        }
        if (status == Status.CHILD && account.getClass() == PenguinAccount.class) {
            accounts.add(account);
            return;
        }
        if (status == Status.ADULT && account.getClass() == SalaryAccount.class) {
            accounts.add(account);
            return;
        }
        if (status == Status.VIP && account.getClass() == PremiumAccount.class) {
            accounts.add(account);
            return;
        }
        throw new IllegalArgumentException("The account status does not match the bank-type status.");
    }

    public void remove(BankAccount account) {
        accounts.remove(account);

    }

    public Status Customer(String status) {
        switch (status) {
            case "CHILD":
                return Status.CHILD;
            case "VIP":
                return Status.VIP;
            default:
                return Status.ADULT;
        }
    }

    public void setStatus(Status status) {
        this.status = status;


    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getId() {

        return id;
    }

    public Status getStatus() {
        return status;
    }
}
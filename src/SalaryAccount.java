public class SalaryAccount extends BankAccount {
    double creditLimit;

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    void setOwner(Customer owner) {

    }

    @Override
    boolean withdraw(double amount) {
        return false;
    }
}

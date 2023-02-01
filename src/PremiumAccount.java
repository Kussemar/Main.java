public class PremiumAccount extends BankAccount{

    @Override
    void setOwner(Customer owner) {

    }

    @Override
    boolean withdraw(double amount) {
        boolean returnValue = balance - amount >= -1000000;
        if(returnValue){
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("You can't withdraw more than 1.000.000,- kr.\n Withdrawal unsuccessful.");
        }
        return returnValue;

    }
}

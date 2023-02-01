public class PenguinAccount extends BankAccount {

    @Override
    void setOwner(Customer owner) {

    }

    @Override
  public  boolean withdraw(double amount) {
        boolean returnValue = balance - amount >= 0;
        if(returnValue){
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("You have a Penguin Account, therefore you can't withdraw money you don't have.\n Withdrawal unsuccessful.");
        }
        return returnValue;
    }
}

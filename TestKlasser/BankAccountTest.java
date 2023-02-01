import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    void testPenguinWithdraw() {
        Customer cust = new Customer();
        cust.setStatus(Status.CHILD);
        cust.addAccount(new PenguinAccount());
        BankAccount custAccount = cust.accounts.get(0);
        custAccount.deposit(100);
        assertEquals(true, custAccount.withdraw(100));
    }

    @Test
    void testPenguinWithdrawMore() {
        Customer cust = new Customer();
        cust.setStatus(Status.CHILD);
        cust.addAccount(new PenguinAccount());
        BankAccount custAccount = cust.accounts.get(0);
        custAccount.deposit(100);
        assertEquals(false, custAccount.withdraw(101));
    }

    @Test
    void testVIPWithdrawTrue() {
        Customer cust = new Customer();
        cust.setStatus(Status.VIP);
        cust.addAccount(new PremiumAccount());
        BankAccount custAccount = cust.accounts.get(0);
        custAccount.deposit(0);
        assertEquals(true, custAccount.withdraw(1000000));
    }

    @Test
    void testVIPWithdrawMore() {
        Customer cust = new Customer();
        cust.setStatus(Status.VIP);
        cust.addAccount(new PremiumAccount());
        BankAccount custAccount = cust.accounts.get(0);
        custAccount.deposit(0);
        assertEquals(false, custAccount.withdraw(1000001));
    }

    @Test
    void testVIPWithdrawFalse () {
        Customer cust = new Customer();
        cust.setStatus(Status.VIP);
        cust.addAccount(new PremiumAccount());
        BankAccount custAccount = cust.accounts.get(0);
        custAccount.deposit(0);
        assertEquals(false, custAccount.withdraw(1000001));
    }

    //Hvis man kobler status og accounts forkert sammen
    @Test
    void testVIPandPenguin() {
        Customer cust = new Customer();
        cust.setStatus(Status.VIP);
        cust.addAccount(new PenguinAccount());
        BankAccount custAccount = cust.accounts.get(0);
        custAccount.deposit(0);
        assertEquals(false, custAccount.withdraw(1000001));
    }
}
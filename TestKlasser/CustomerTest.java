import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class CustomerTest {

    @Test
    void testSetStatus() {
        Customer cust = new Customer();
        cust.setStatus(Status.ADULT);
        assertEquals(Status.ADULT, cust.getStatus());

    }

    @Test
    void testGetName() {
        Customer cust = new Customer();
        assertNotEquals("Deniz", cust.getName());
    }

    @Test
    void testSetName() {
        Customer cust = new Customer();
        cust.setName("Rasmus");
        assertEquals("Rasmus", cust.getName());


    }

    @Test
    void testAddAccountAdult() {
        Customer cust = new Customer();
        cust.setStatus(Status.ADULT);
        cust.addAccount(new SalaryAccount());
        assertEquals(SalaryAccount.class, cust.accounts.get(0).getClass());
    }

    @Test
    void testAddAccountChild() {
        Customer cust = new Customer();
        cust.setStatus(Status.CHILD);
        cust.addAccount(new PenguinAccount());
        assertEquals(PenguinAccount.class, cust.accounts.get(0).getClass());
    }

    @Test
    void testAddAccountChildButWrong() {
        Customer cust = new Customer();
        cust.setStatus(Status.CHILD);
        cust.addAccount(new SalaryAccount());
        assertEquals(PenguinAccount.class, cust.accounts.get(0).getClass());

    }
}

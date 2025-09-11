import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {
    private Account account;

    @BeforeEach
    void setup() {
        account = new Account();

    }

    @Test
    void deposit() {
        account.deposit(10.0);
        assertEquals(10.0, account.getBalance());
    }

    @Test
    void withdraw() {
        account.deposit(20.0);
        assertEquals(20.0, account.withdraw(20.0));
        assertEquals(0.0, account.withdraw(40));
    }

    @Test
    void getBalance() {
        account.deposit(10.0);
        assertEquals(10.0, account.getBalance());
    }
}
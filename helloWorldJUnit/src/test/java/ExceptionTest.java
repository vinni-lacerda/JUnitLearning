import org.example.Account;
import org.example.TransferBetweenAccounts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {
    @Test
    void exceptionValidationOnTransfer(){
        Account originAccount = new Account("123456", 0);
        Account destinyAccount = new Account("456789", 100);
        TransferBetweenAccounts transferBetweenAccounts = new TransferBetweenAccounts();
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferBetweenAccounts.transfer(originAccount, destinyAccount, -1));
    }
}

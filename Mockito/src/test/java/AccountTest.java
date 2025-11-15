import org.example.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountTest {
    @Spy
    private Account account = new Account(1000);

    @Test
    void validateCallOrder(){
        account.payBill(300);
        InOrder inOrder = Mockito.inOrder(account);
        inOrder.verify(account).payBill(300);
        inOrder.verify(account).validateBalance(300);
        inOrder.verify(account).debit(300);
        inOrder.verify(account).sendCreditToIssuer(300);
    }
    @Test
    void validateAmountCalls(){
        account.validateBalance(300);
        account.validateBalance(500);
        account.validateBalance(600);

        Mockito.verify(account, Mockito.times(3)).validateBalance(ArgumentMatchers.anyInt());
    }
}

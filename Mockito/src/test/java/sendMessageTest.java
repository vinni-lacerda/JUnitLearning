import org.example.Message;
import org.example.SendMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.example.Message;
@ExtendWith(MockitoExtension.class)
public class sendMessageTest {

    @Spy
    private SendMessage sendMessage;

    @Test
    void verifyClassBehavior() {
        Mockito.verifyNoInteractions(sendMessage);
        Message message = new Message("hello world");
        sendMessage.addMessage(message);
        Mockito.verify(sendMessage).addMessage(message);
        Assertions.assertFalse(sendMessage.getMessages().isEmpty());
    }
}

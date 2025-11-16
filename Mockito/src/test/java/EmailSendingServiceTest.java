import org.example.Email;
import org.example.EmailFormat;
import org.example.EmailSendingService;
import org.example.SendingPlatform;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmailSendingServiceTest {
    @Mock
    private SendingPlatform sendingPlatform;

    @InjectMocks
    private EmailSendingService service;

    @Captor
    ArgumentCaptor<Email> captor;
    @Test
    void validateSentDataToPlatform(){
        String email = "user@mail.com";
        String message = "Hello world";
        boolean isHtmlFormat = false;

        service.sendEmail(email, message, isHtmlFormat);
        Mockito.verify(sendingPlatform).sendEmail(captor.capture());

        Email capturedEmail = captor.getValue();

        Assertions.assertEquals(email, capturedEmail.getEmailAddress());
        Assertions.assertEquals(message, capturedEmail.getMessage());
        Assertions.assertEquals(EmailFormat.TEXT, capturedEmail.getFormat());
    }
}

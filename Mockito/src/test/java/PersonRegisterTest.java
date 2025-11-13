import org.example.LocalizationData;
import org.example.MailAPI;
import org.example.Person;
import org.example.PersonRegister;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PersonRegisterTest {
    @Mock
    private MailAPI mailAPI;

    @InjectMocks
    private PersonRegister personRegister;

    @Test
    void ValidatePersonRegisterData(){
        LocalizationData localizationData = new LocalizationData("ba", "salvador", "street 2", "flat", "IAPI");
        Mockito.when(mailAPI.searchDataWithCep("23920309")).thenReturn(localizationData);
        Person person = personRegister.personRegister("vinicius", "2500330", LocalDate.now(), "23920309");
        assertEquals("vinicius", person.getName());
        assertEquals("2500330", person.getDocument());
        assertEquals("ba", person.getAddress().getState());
        assertEquals("flat", person.getAddress().getComplement());
    }
}

import org.example.Database;
import org.example.Person;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultPersonDataTest {

    @BeforeAll
    static void connectionConfig(){
        Database.startConnection();
    }
    @BeforeEach
    void insertDataForTest(){
        Database.insertData(new Person("Deivene", LocalDate.of(2000, 02, 22)));
    }

    @AfterEach
    void dataTestRemover(){
        Database.deletData(new Person("Deivene", LocalDate.of(2000, 02, 22)));
    }

    @Test
    void validateReturnData(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void shutDownConnection(){
        Database.shutdownConnection();
    }
}

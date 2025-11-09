import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class PersonTest {
    @Test
    void validateAgeCalculation(){
        Person person = new Person("vini", LocalDate.of(1997, 10, 19));
        Assertions.assertEquals(28, person.getAge());
    }
}

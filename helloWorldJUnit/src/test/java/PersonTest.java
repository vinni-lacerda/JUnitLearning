import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class PersonTest {
    @Test
    void validateAgeCalculation(){
        Person person = new Person("vini", LocalDate.of(1997, 10, 19));
        Assertions.assertEquals(28, person.getAge());
    }
    @Test
    void shouldReturnIfIsAdult(){
       Person bruna = new Person("Bruna", LocalDate.of(2003, 04, 17));
       Assertions.assertTrue(bruna.isOver18());

       Person joao = new Person("joao", LocalDate.now());
       Assertions.assertFalse(joao.isOver18());
    }
}

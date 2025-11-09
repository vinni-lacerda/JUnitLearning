import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTest {
    @Test
    void shouldValidateLaunch(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validateIfObjectIsNull(){
        Person person = null;

        Assertions.assertNull(person);

        Person luciano = new Person("Luciano", LocalDate.now());
        Assertions.assertNotNull(luciano);
    }

    @Test
    void validateDiferentTypeOfNumbers(){
        double value = 5.0;
        double otherValue = 5.0;

        Assertions.assertEquals(value, otherValue);
    }
}

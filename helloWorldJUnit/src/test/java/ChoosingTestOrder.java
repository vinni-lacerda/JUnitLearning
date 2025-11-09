import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChoosingTestOrder {
    @Order(4)
    @Test
    void validateFlowA(){
        Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void validateFlowB(){
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void validateFlowC(){
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validateFlowD(){
        Assertions.assertTrue(true);
    }
}

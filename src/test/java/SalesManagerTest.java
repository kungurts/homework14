import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование SalesManager")
public class SalesManagerTest {

    private SalesManager salesManager;

    @BeforeEach
    void setUp() {
        salesManager = new SalesManager(new long[] {1, 100, 20, 36});
    }

    @Test
    @DisplayName("Тестирование функции нахождения максимума")
    void max() {
        Assertions.assertEquals(100, salesManager.max());
    }
}

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

@DisplayName("Тестирование TrimmedMean")
public class TrimmedMeanTest {

    private TrimmedMean trimmedMean;

    @DisplayName("Проверить нахождение обрезанного среднего")
    @ParameterizedTest
    @MethodSource("getArray")
    void trimmedMean(long[] sales, long expectedResult) {
        trimmedMean = new TrimmedMean(sales);
        Assertions.assertEquals(expectedResult, trimmedMean.trimmedMean());
    }

    @Test
    void trimmedMean_whenArrayIsShort() {
        trimmedMean = new TrimmedMean(new long[] {2, 4});
        Assertions.assertThrows(ArithmeticException.class, trimmedMean::trimmedMean);
    }

    private static Stream<Arguments> getArray() {
        return Stream.of(
                Arguments.of(new long[] {2, 6, 24, 10}, 8),
                Arguments.of(new long[] {1, 19, 104, 75, 14}, 36),
                Arguments.of(new long[] {2, 1900, 24, 21, 35_000, 867}, 703)
        );
    }
}

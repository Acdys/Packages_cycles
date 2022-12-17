package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200, 300, 3",
            "100, 200, 5",
            "300, 400, 3"
    })
    void shouldCalculateSquareInLimit(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(min, max);
        Assertions.assertEquals(expected, actual);
    }
}

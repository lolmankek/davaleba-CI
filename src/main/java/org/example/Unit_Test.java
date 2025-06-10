package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Unit_Test {
    private Calculator calc = new Calculator();

    @Test
    void testAdd() {
        double result = calc.add(2.5, 4.5);
        assertEquals(7.0, result, 1e-9, "Addition should correctly sum two numbers");
    }

    @Test
    void testDivideByZeroThrows() {
        // dividing by zero must throw ArithmeticException
        ArithmeticException ex = assertThrows(
                ArithmeticException.class,
                () -> calc.divide(10.0, 0.0),
                "Expected divide(10,0) to throw, but it didn't"
        );
        assertEquals("Cannot divide by zero", ex.getMessage());
    }
}

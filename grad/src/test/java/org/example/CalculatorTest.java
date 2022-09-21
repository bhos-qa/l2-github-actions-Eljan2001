package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Calculator {
        Calculator calculator;

        @BeforeEach
        void setUp() {
            calculator = new Calculator();
        }

        @Test
        @DisplayName("Simple multiplication should work")
        void testMultiply() {
            assertEquals(20, calculator.multiplicate(4, 5),
                    "Regular multiplication should work");
        }

        @RepeatedTest(5)
        @DisplayName("Ensure correct handling of zero")
        void testMultiplyWithZero() {
            assertEquals(0, calculator.multiplicate(0, 5), "Multiple with zero should be zero");
            assertEquals(0, calculator.multiplicate(5, 0), "Multiple with zero should be zero");
        }

}
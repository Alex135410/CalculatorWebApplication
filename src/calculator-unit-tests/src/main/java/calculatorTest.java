import org.example.calculatorengine.calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @AfterEach
    void tearDown() {
    }

    @Test
    void add_twoDoubles_returnsSum() {
        //preq-UNIT-TEST-2
        var cal = new calculator();
        //Arrange
        final double A = 5;
        final double B = 222;
        final double EXPECTED = 227;

        //Act
        var result = cal.Add(A, B);

        //Assert
        assertEquals(EXPECTED, result, 8);


    }

    @Test
    void subtract_twoDoubles_returnsDifference() {
        //preq-UNIT-TEST-3
        var cal = new calculator();
        //Arrange
        final double A = 27.94;
        final double B = 4;
        final double EXPECTED = 23.94;

        //Act
        var result = cal.subtract(A, B);

        //Assert
        assertEquals(EXPECTED, result, 8);

    }

    @Test
    void multiplication_twoDoubles_returnsMultiplicationSum() {
        //preq-UNIT-TEST-4
        var cal = new calculator();
        //Arrange
        final double A = 5;
        final double B = 7.1;
        final double EXPECTED = 35.5;

        //Act
        var result = cal.multiplication(A, B);

        //Assert
        assertEquals(EXPECTED, result);
    }

    @Test
    void divison_twoDoubles_returnsDivisonSum() {
        //preq-UNIT-TEST-5
        var cal = new calculator();
        //Arrange
        final double A = 10.0;
        final double B = 5.0;
        final double EXPECTED = 2.0;
        //Act
        var result = cal.divison(A, B);

        //Assert
        assertEquals(EXPECTED, result);
    }

    @Test
    void divison_twoDoubles_returnsError() {
        //preq-UNIT-TEST-6
        var cal = new calculator();
        // Arrange
        final double A = 3.0;
        final double B = 0.0;

        // Act
        try {
            var result = cal.divison(A, B);

            // Assert
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number cannot be 0", e.getMessage());
        }
    }


    @Test
    void testEquals() {
        //preq-UNIT-TEST-7
        var cal = new calculator();
        //Arrange
        final double A = 0.33333;
        final double B = 0.33333;
        final double EXPECTED = 1;

        //Act
        var result = cal.equals(A, B);

        //Assert
        assertEquals(EXPECTED, result);
    }

    @Test
    void raiseToPower() {
        //preq-UNIT-TEST-8
        var cal = new calculator();
        //Arrange
        final double A = 5;
        final double B = 7;
        final double EXPECTED = 78125;

        //Act
        var result = cal.raiseToPower(A, B);

        //Assert
        assertEquals(EXPECTED, result);

    }

    @Test
    void logarithmOfNumber_twoDouble_returnsLog() {
        //preq-UNIT-TEST-9
        var cal = new calculator();
        //Arrange
        final double A = 56;
        final double B = 8;
        final double EXPECTED = 1.93578497;

        //Act
        var result = cal.logarithmOfNumber(A, B);

        //Assert
        assertEquals(EXPECTED, result, 8);
    }

    @Test
    void logarithmOfNumber_twoDouble_returnsError() {
        //preq-UNIT-TEST-10
        var cal = new calculator();
        // Arrange
        final double A = 0;
        final double B = 2;

        // Act
        try {
            var result = cal.logarithmOfNumber(A, B);

            // Assert
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number must be greater than 0", e.getMessage());
        }

    }

    @Test
    void logarithmOfNumber_twoDouble_returnsError2() {
        //preq-UNIT-TEST-11
        var cal = new calculator();
        // Arrange
        final double A = 8;
        final double B = 0;

        // Act
        try {
            var result = cal.logarithmOfNumber(A, B);

            // Assert
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number cannot be 0", e.getMessage());
        }
    }

    @Test
    void rootOfPower_twoDoubles_returnsRootOfPower() {
        //preq-UNIT-TEST-12
        var cal = new calculator();
        // Arrange
        final double A = 8;
        final double B = 3;
        final double EXPECTED = 2;

        // Act
        var result = cal.rootOfPower(A, B);

        // Assert
        assertEquals(EXPECTED, result, 0.0001, "The Bth root of A should be equal to the expected result");
    }

    @Test
    void rootOfPower_twoDoubles_returnsError() {
        //preq-UNIT-TEST-13
        var cal = new calculator();
        // Arrange
        final double A = 8;
        final double B = 0;

        // Act
        try {
            var result = cal.rootOfPower(A, B);

            // Assert
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number cannot be 0", e.getMessage());
        }
    }

    @Test
    void factorialOfNumber_oneDouble_returnsFactorial() {
        //preq-UNIT-TEST-14
        var cal = new calculator();
        //Arrange
        final double A = 8;
        final double EXPECTED = 40320;

        //Act
        var result = cal.factorialOfNumber(A);

        //Assert
        assertEquals(EXPECTED, result);
    }


    @Test
    void factorialOfNumber_oneDouble_returns1() {
        //preq-UNIT-TEST-15
        var cal = new calculator();
        // Arrange
        final double A = 0;
        final double EXPECTED = 1;

        // Act
        var result = cal.factorialOfNumber(A);

        // Assert
        assertEquals(EXPECTED, result, "The factorial of 0 should be 1");
    }

    @Test
    void sineA_oneDouble_returnsSineOfThatNumber() {
        //preq-UNIT-TEST-16
        var cal = new calculator();
        //Arrange
        final double A = 1;
        final double EXPECTED = 0.0174524;

        //Act
        var result = cal.sineA(A);

        //Assert
        assertEquals(EXPECTED, result, 8);
    }

    @Test
    void cosineA_oneDouble_returnsCosineOfThatNumber() {
        //preq-UNIT-TEST-17
        var cal = new calculator();
        //Arrange
        final double A = -360;
        final double EXPECTED = 1;

        //Act
        var result = cal.cosineA(A);

        //Assert
        assertEquals(EXPECTED, result, 8);
    }

    @Test
    void tangentA_oneDouble_returnsTangentOfThatNumber() {
        //preq-UNIT-TEST-18
        var cal = new calculator();
        //Arrange
        final double A = 1;
        final double EXPECTED = 0.0174551;

        //Act
        var result = cal.tangentA(A);

        //Assert
        assertEquals(EXPECTED, result, 8);
    }

    @Test
    void reciprocalOfA_oneDouble_returnsReciprocal() {
        //preq-UNIT-TEST-19
        var cal = new calculator();
        // Arrange
        final double A = 8;
        final double EXPECTED = 0.125;

        // Act
        var result = cal.reciprocalOfA(A);

        // Assert
        assertEquals(EXPECTED, result, 0.0001, "The reciprocal of A should be equal to the expected result");
    }

    @Test
    void reciprocalOfA_oneDouble_returnsError() {
        //preq-UNIT-TEST-19
        var cal = new calculator();
        //Arrange
        final double A = 0;

        // Act
        try {
            var result = cal.reciprocalOfA(A);

            // Assert
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number cannot be 0", e.getMessage());
        }
    }


}
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(30, calc.add());
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calc = new Calculator();
        calc.setNumbers(40, 20);
        assertEquals(20, calc.subtract());
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(50, 20);
        assertEquals(1000, calc.multiply());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calc = new Calculator();
        calc.setNumbers(60, 20);
        assertEquals(3, calc.divide());
    }
}
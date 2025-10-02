public class Main {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();

        Calc.setNumbers(10,5);
        Calc.add();
        Calc.displayResult("+");

        Calc.setNumbers(3,2);
        Calc.subtract();
        Calc.displayResult("-");

        Calc.setNumbers(6,4);
        Calc.multiply();
        Calc.displayResult("*");

        Calc.setNumbers(8,2);
        Calc.divide();
        Calc.displayResult("/");


    }
}
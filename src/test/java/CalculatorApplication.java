public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 12));
        System.out.println(calc.subtract(5, 12));
        System.out.println(calc.multiply(5, 12));
        System.out.println(calc.divide(5, 12));
        System.out.println(calc.min(5, 12));
        System.out.println(calc.max(5, 12));
        System.out.println(calc.isOdd(5));
        System.out.println(calc.isPositive (12));
        System.out.println(calc.isNegative(5));
        System.out.println(calc.add(5, 12,15));
        System.out.println(calc.subtract(5, 12,2));
        System.out.println(calc.multiply(5, 12,8));
        System.out.println(calc.divide(5, 12,10));
        System.out.println(calc.max(5, 12,14));
        System.out.println(calc.min(5, 12,-1));
        System.out.println(calc.average(5, 12));
        System.out.println(calc.average(5, 10,15));
    }
}
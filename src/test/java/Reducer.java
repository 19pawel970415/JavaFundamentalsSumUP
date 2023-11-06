public class Reducer {

    public static void main(String[] args) {
        Reducer reducer = new Reducer();
        String numberToReduce = "123";
        int reducedValue = reducer.reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);
    }

    public int reduce(String number) {
        while (number.length() > 1) {
            int n = 1;
            for (int i = 0; i < number.length(); i++) {
                n *= Character.getNumericValue(number.charAt(i));
            }
            number = Integer.toString(n);
        }
        return Integer.parseInt(number);
    }
}


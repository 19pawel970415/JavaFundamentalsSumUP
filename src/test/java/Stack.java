import java.util.Arrays;

public class Stack {
    private Integer[] integers;

    public Stack(int count) {
        this.integers = new Integer[count];
    }

    public void push(Integer e) {
        boolean dodano = false;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == null) {
                integers[i] = e;
                dodano = true;
                break;
            }
        }
        if (!dodano) {
            System.out.println("Tablica jest już zajęta. Nie dodano elementu.");
        }
    }

    public Integer pop() {
        Integer result = null;
        boolean usunieto = false;
        for (int i = (integers.length - 1); i >= 0 ; i--) {
            if (integers[i] != null) {
                result = integers[i];
                integers[i] = null;
                break;
            }
        }
        if (!usunieto) {
            System.out.println("Tablica pusta. Nie usunieto elementu.");
        }
        return result;
    }

    public boolean isEmpty() {
        boolean isE = true;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] != null) {
                isE = false;
            }
        }
        return isE;
    }

    public boolean isFull() {
        boolean isF = false;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == null) {
                isF = true;
            }
        }
        return isF;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "integers=" + Arrays.toString(integers) +
                '}';
    }
}
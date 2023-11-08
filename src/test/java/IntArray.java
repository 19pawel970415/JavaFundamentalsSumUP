import java.util.ArrayList;

public class IntArray {

    private ArrayList<Integer> integers;

    public IntArray() {
        this.integers = new ArrayList<Integer>();
    }

    public void add(Integer value) {
        integers.add(value);
    }

    public void add(Integer value, int idx) {
        integers.add(idx, value);
    }

    public Integer get(int idx) {
        return integers.get(idx);
    }

    public void remove(int idx) {
        integers.remove(idx);
    }

    public void swap(int from, int to) {
        int temp = integers.get(from);
        int temp1 = integers.get(to);
        int inx = integers.indexOf(temp);
        int inx1 = integers.indexOf(temp1);
        integers.set(inx, temp1);
        integers.set(inx1, temp);
    }

    @Override
    public String toString() {
        return "IntArray{" +
                "integers=" + integers +
                '}';
    }
}
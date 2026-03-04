import java.util.Arrays;

public class MyArrayList {

    private int[] data;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.capacity = 10;
        this.size = 0;
        this.data = new int[capacity];
    }

    private void resize() {
        capacity = capacity * 3 / 2;
        data = Arrays.copyOf(data, capacity);
    }


    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        data[size] = value;
        size++;
    }


    public int get(int index) {
        return data[index];
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
    }
        return false;
    }


    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains(10));
        System.out.println(list.contains(99));
    }
}









package lesson8.app;

import java.util.LinkedList;
import java.util.Queue;

public class Memory {

    public static final int MAX_SIZE = 5;

    private final Queue<String> data = new LinkedList<>();

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean isFull() {
        return data.size() >= MAX_SIZE;
    }

    public void add(String value) {
        data.add(value);
    }

    public String poll() {
        return data.poll();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

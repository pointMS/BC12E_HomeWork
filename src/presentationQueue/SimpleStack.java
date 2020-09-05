package presentationQueue;

import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T> {
    private ArrayList<T> list = new ArrayList<>();
    @Override
    public void push(T item) {
        list.add(0, item); //добавить элемент на вершину стека
    }

    @Override
    public T pop() {
        return list.remove(0); //взять элемент с вершины стека и удалить его
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

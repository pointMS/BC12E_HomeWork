package presentationQueue;

import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T> {
    private ArrayList<T> list = new ArrayList<>();
    @Override
    public void add(T item) {   //метод добавляет элемент в конец очереди
        list.add(item);
    }

    @Override
    public T remove() {         //берет элемент из начала очереди, а удаляет его
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {  //проверка, не пустая ли очередь
        return list.isEmpty();
    }
}

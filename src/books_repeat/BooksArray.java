package books_repeat;

/**
 * B12E_Repeat 28.06.2020
 */
public class BooksArray {
    private int size = 0;
    private int capacity;
    private Book[] books;

    public BooksArray(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
    }

    public BooksArray(Book[] books) {
        this.books = books;
    }

    public void add(Book book) {
        if (size < capacity) {
            books[size] = book;
            size++;
        }
    }

    public void print() {
        System.out.println(this.toString());
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += books[i].toString();
        }
        return res;
    }

}

package booking;

/**
 * Booking 04.08.2020
 */
public class ArrayBookingList implements BookingList {
    private Booking[] bookings;
    private int size = 0; //количество элементов, которое есть сейчас в массиве
    private int capacity = 3; //размер массива на данный момент
    private int index;

    public ArrayBookingList(int capacity) {
        this.capacity = capacity;
        bookings = new Booking[this.capacity];
    }

    @Override
    public void add(Booking booking) {
        if (size < capacity) {
            bookings[size++] = booking; // добавление элементов в массив
        } else {
            capacity *= 2; //увеличение размера массива, если в нем уже накопилось минимальное количество
            Booking[] temp = new Booking[capacity]; //создание нового массива размера *2
            for (int i = 0; i < bookings.length; i++) { //переброска в него элементов из старого массива
                temp[i] = bookings[i];
            }
            bookings = temp;
            bookings[size++] = booking; // добавление элементов в расширенный массив
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(bookings[i]);
        }
    }

    @Override
    public Booking getBookingByIndex(int index, Booking[] bookings) {
        Booking n = bookings[index];
        return n;
    }

    @Override
    public Booking findBooking(Booking booking, Booking[] bookings) {
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i].equals(booking)) {
                System.out.println("The booking is confirmed");
                return bookings[i];
            }
        }
        System.out.println("Booking is not found");
        return null;
    }
}

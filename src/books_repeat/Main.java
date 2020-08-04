package books_repeat;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(new Author("Aaaa Nnnn"), "Name1", "qwerty", 123);
        Book book2 = new Book(new Author("Bbbb Mnnn"), "Name2", "qwerty", 456);
        Book book3 = new Book(new Author("Cccc Gggg"), "Name3", "oiuoi", 789);
        Book book4 = new Book(new Author("Dddd Hhh and Ffff Mmmm"), "Name4", "nbvfjh", 328);

        Author author1 = new Author("Lalala", "Nanana");
        Author author2 = new Author("Ttttt Zzzz");
        Author[] authors = new Author[]{author1, author2}; //создали массив из авторов
        Book book5 = new Book(authors, "Name5", "xxxx", 954);// книга с массивом из авторов
        Book[] books = new Book[]{book1, book2, book3, book4, book5};

        BooksArray booksArray = new BooksArray(books);
        booksArray.print();

        System.out.println("- * - - - -");
        BooksArray booksArray1 = new BooksArray(100);
        booksArray1.add(book1);
        booksArray1.print();

//        books_repeat.Book[] books = new books_repeat.Book[]{book1, book2, book3, book4,
//                new books_repeat.Book(new books_repeat.Author[]{
//                        new books_repeat.Author("PPPPP Frrrr"),
//                        new books_repeat.Author("Snnnn Lhhhh")
//                }, "Name5", "mmmm", 985)
//        };

//        books_repeat.Author author1 = new books_repeat.Author("Lalala", "Nanana");
//        books_repeat.Author author2 = new books_repeat.Author("Lalala Nanana");
//        System.out.println(author1);
//        System.out.println(author2);

        //printBooks(books);
//        System.out.println("- - - - - - -");
//        printTitleBooks(books);

    }

    //ссылается на toString в books_repeat.Book
    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
//варианты распечатки. Если такой вывод на печать требуется постоянно, создается метод в самом классе
    //
    public static void printTitleBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].titleAndAuthorsToString());
        }
    }
}

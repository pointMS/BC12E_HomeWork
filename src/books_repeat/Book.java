package books_repeat;

/**
 * B12E_Repeat 27.06.2020
 */
public class Book { //эти поля по определению доступны всем методам данного класса
    private Author[] authors; //ссылается на класс books_repeat.Author
    private String title;
    private String genre;
    private int id;

//два конструктора, ведут себя по разному в зависимости от того, пришел к ним один автор или массив
    public Book(Author author, String title, String genre, int id) {
        this.authors = new Author[]{author}; //обернули в массив
        this.title = title;
        this.genre = genre;
        this.id = id;
    }

    public Book(Author[] authors, String title, String genre, int id) {
        this.authors = authors; //присваивается адрес в памяти, копирования не происходит!
        this.title = title;
        this.genre = genre;
        this.id = id;
    }

//метод помогает сделать строку из всех полученных элементов (штуковин), которые есть в классе books_repeat.Book
    //отвечает за вывод на печать
    public String toString() {
        return "author/authors: " + authorsToString() + ", title: " + title + ", genre: " + genre + ", id: " + id;
    }

    public String titleAndAuthorsToString() { //доп.метод, решающий задачу вывода названия и автора на печать
        return title + " / " + authorsToString();
    }

    //вспом.метод для вывода всех авторов
    //поскольку одно из полей - массив, для него отдельный метод toString, for для
    // перебирания и складывания в строку, которую возвращаем в предыдущий метод
    private String authorsToString() {
        String str = ""; //здесь будет накапливаться информация во время цикла
        for (int i = 0; i < authors.length; i++) {
            str += authors[i].toString() + ((i != authors.length - 1) ? " & " : "");//терн.оператор, перебираем цикл из авторов,
            // если i не равен последнему значению, ставим разделитель, если i=, то символ не нужен
        }
        return str;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

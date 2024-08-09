import java.util.Objects;
public class Book {

    String bookname;
    Author author;
    int publishYear;

    //конструктор для класса Book
    public Book(String bookname, Author author, int publishYear) {
        this.bookname = bookname;
        this.author = author;
        this.publishYear = publishYear;
    }

    //метод для получения информации о названии книги
    public String getBookName() {
        return bookname + " ";
    }

    //метод для получения информации об авторе
    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    // Сеттер для года публикации
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    // Переопределение метода toString
    @Override
    public String toString() {
        return "Книга: " + bookname + ", Автор: " + author.toString() + ", Год издания: " + publishYear;
    }
    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear &&
                Objects.equals(bookname, book.bookname) &&
                Objects.equals(author, book.author);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(bookname, author, publishYear);
    }
}

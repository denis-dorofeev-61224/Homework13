
import java.util.Objects;
public class Author {

    String name;
    String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    // Переопределение метода toString
    @Override
    public String toString() {
        return name + " " + surname;
    }
    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}


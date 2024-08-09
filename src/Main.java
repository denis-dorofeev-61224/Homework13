public class Main {
    public static void main(String[] args) {

        System.out.println("Hello JAVA!");


// Создание авторов
        Author author1 = new Author("Гарри ", "Гаррисон");
        Author author2 = new Author("Эдмонд ", "Гамильтон");

        // Создание книг
        Book book1 = new Book("Билл-герой галактики", author1, 1960);
        Book book2 = new Book("Возвращение к звёздам", author2, 1981);


        // Изменение года публикации книги с помощью сеттера
        book2.setPublishYear(1986);
        System.out.println("Обновленная информация о книге: " + book2.getPublishYear() + " год переиздания.");

        // Выводим информацию о книгах и их авторах с использованием toString
        System.out.println(book1.toString());
        System.out.println(book2.toString());

        // Выводим информацию об авторах с использованием toString
        System.out.println(author1.toString());
        System.out.println(author2.toString());

        // Сравниваем объекты Author и Book
        System.out.println(author1.equals(author2));  // Ожидается: false
        System.out.println(book1.equals(book2));      // Ожидается: false

        // Проверка хеш-кодов
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}


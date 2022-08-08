public class Main {

    private static String author;

    public static void main(String[] args) {

        Author Name1 = new Author("Lev", "Tolstoy");
        Book book1 = new Book(author, " War and peace", 1960);
        book1.setPublishingYear(1960);

        Author Name2 = new Author("Ivan", "Turgenev");
        Book book2 = new Book(author, " Fathers and children", 1970);
        book2.setPublishingYear(1970);

        System.out.println(book1.getName());
    }


}
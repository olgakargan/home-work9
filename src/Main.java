public class Main {

    private static String Author;

    public static void main(String[] args) {
        Author Name1 = new Author("Lev", "Tolstoy");
        Author Name2 = new Author("Ivan", "Turgenev");
        Book book1 = new Book(Author," War and peace", 1960);
        Book book2 = new Book(Author," Fathers and children", 1970);
        book1.setPublishingYear(1960);
        book2.setPublishingYear(1970);
        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());
        System.out.println(book1.getName());
    }


}
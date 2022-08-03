import java.util.Objects;

public class Book {
    private String Author;
    private final String Name;
    private int publishingYear;

    public Book(String Author, String Name, int publishingYear) {
        this.Author = Author;
        this.Name = Name;
        this.publishingYear = publishingYear;
    }


    public int getPublishingYear() {
        return publishingYear;
    }

    public String getName() {
        return Name;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Author" + this.Author + "Name" + this.Name + "publishingYear" + this.publishingYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(Name, book.Name);
    }

    public int getAuthor() {
        return 0;
    }
}


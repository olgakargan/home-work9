public class Author {
    private String name;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }
    public String toString() {
        return this.name + " " + this.lastName;
    }
}
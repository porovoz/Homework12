package homework12;

public class Book {
    private final String name;
    private final Author authorName;
    private int publicationYear;

    public Book(String name, Author authorName, int publicationYear) {
        this.name = name;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

package homework12;

import java.util.Objects;

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

    @Override
    public String toString() {
        return String.format("%s, '%s', %d", authorName, name, publicationYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book3 = (Book) o;
        return publicationYear == book3.publicationYear && Objects.equals(name, book3.name) && Objects.equals(authorName,
                book3.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, publicationYear);
    }
}

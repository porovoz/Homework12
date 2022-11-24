package homework12;
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Joanne", "Rowling");
        Author author1 = new Author("Rudyard", "Kipling");
        Author author2 = new Author("Agatha", "Christie");
        Author author3 = new Author("Joanne", "Rowling");
        Book book = new Book("Harry Potter and The Chamber of Secrets", author, 1998);
        Book book1 = new Book("The Jungle Book", author1, 1894);
        Book book2 = new Book("The Mysterious Affair at Styles", author2, 1916);
        System.out.println(author.getFirstName() + " " + author.getLastName() + " - '" + book.getName()
                + "'" + ", " + book.getPublicationYear());
        System.out.println(author1.getFirstName() + " " + author1.getLastName() + " - '" + book1.getName()
                + "'" + ", " + book1.getPublicationYear());
        System.out.println(author2.getFirstName() + " " + author2.getLastName() + " - '" + book2.getName()
                + "'" + ", " + book2.getPublicationYear());
        book.setPublicationYear(1995);
        System.out.println(book.getPublicationYear());
        System.out.println(author.getFirstName() + " " + author.getLastName() + " - '" + book.getName()
                + "'" + ", " + book.getPublicationYear());

        System.out.println();
        System.out.println(author);
        System.out.println(book);
        System.out.println();

        System.out.println("Are these Objects equal?");
        System.out.println(author.equals(author3));
        System.out.println("HashCode of first Object:");
        System.out.println(author.hashCode());
        System.out.println("HashCode of second Object:");
        System.out.println(author3.hashCode());

        System.out.println();
        System.out.println("Are these Objects equal?");
        System.out.println(author.equals(author1));
        System.out.println("HashCode of first Object:");
        System.out.println(author.hashCode());
        System.out.println("HashCode of second Object:");
        System.out.println(author1.hashCode());
    }
    }

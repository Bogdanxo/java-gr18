package library;

public class Library {
    private Book[] books;
    private final int MAX_LIBRARY_SIZE = 100;

    public Library() {
        this.books = new Book[MAX_LIBRARY_SIZE];
    }

    public void addBook(Book bookToAdd) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookToAdd;
                break;
            }
        }
    }

    public void removeBook(Book bookToRemove) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getNume() == bookToRemove.getNume()) {
                books[i] = null;
                break;
            }
        }
    }

    public Book[] getGetBooks() {
        return this.books;
    }

    public void printLibrary() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].toString());
            }
        }
    }

}

package bibliotheksmanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(String isbn, String title, int copies) {
        if (this.books.containsKey(isbn)) {
            Book bookExisting = this.books.get(isbn);
            bookExisting.setCopies(bookExisting.getCopies() + copies);
        } else {
            Book book = new Book(title, copies);
            this.books.put(isbn, book);
        }
    }

    public void printAllBooks() {
        for (Map.Entry<String, Book> entry : this.books.entrySet()) {
            System.out.println("ISBN: " + entry.getKey() + ", " + entry.getValue());
        }
    }


    public void borrowBook(String isbn) {
        try {
            Book book = findBook(isbn);
            book.setCopies(book.getCopies() - 1);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private Book findBook(String isbn) throws BookNotFoundException {
        if (this.books.containsKey(isbn)) {
            if (this.books.get(isbn).getCopies() > 0) {
                return this.books.get(isbn);
            } else {
                throw new BookNotFoundException("Book " + isbn + " already borrowed.");
            }
        } else {
            throw new BookNotFoundException();
        }
    }

}

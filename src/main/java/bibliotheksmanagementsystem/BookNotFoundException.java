package bibliotheksmanagementsystem;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super("ISBN was not found.");
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}

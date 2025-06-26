import java.util.ArrayList;


// Book class
class Book {
    String title;
    String author;
    boolean isIssued;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + !isIssued);
    }
}

// User class
class User {
    String name;

    User(String name) {
        this.name = name;
    }
}

// Library class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    void showAllBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    void issueBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title) && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued: " + title);
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    void returnBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title) && b.isIssued) {
                b.isIssued = false;
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Invalid return attempt.");
    }
}


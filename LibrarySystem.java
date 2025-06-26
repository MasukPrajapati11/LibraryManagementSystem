import java.util.Scanner;
// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book\n2. Show Books\n3. Issue Book\n4. Return Book\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String titleAdd = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(titleAdd, author));
                    break;

                case 2:
                    library.showAllBooks();
                    break;

                case 3:
                    System.out.print("Enter title to issue: ");
                    String titleIssue = sc.nextLine();
                    library.issueBook(titleIssue);
                    break;

                case 4:
                    System.out.print("Enter title to return: ");
                    String titleReturn = sc.nextLine();
                    library.returnBook(titleReturn);
                    break;

                case 5:
                    System.out.println("Thank you for using the Library!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

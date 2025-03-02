package Library;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import Library.Model.book;
import Library.Model.patron;

public class LibraryManagement {
    public static void main(String[] args){
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean runnning = true;
        
        while (running){
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.ptintln("4. Register Patrons");
            System.out.println("5. View Patrons");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("Enter the book name: ");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Enter the Author name: ");
                    String authorName = scanner.nextLine();
                    library.addBook(bookTitle, authorName, ISBN, numberCop);
                    break;
                case 2:
                    System.out.println("Enter the book name: ");
                    bookTitle = scanner.nextLine();
                    library.removeBook(bookTitle);
                    break;
                case 3:
                    List<String> books = library.getBooks();
                    for (String book : books){
                        System.out.println(book);
                    }
                case 4:
                    System.out.println("Enter the patron ")
                    break;
                case 5:
                    List<String> patrons = library.getPatrons();
                    for (String patron : patrons){
                        System.out.println(patron);
                    }
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
        System.out.println("Thank you for using the Inventory Management System!"); 
    }
}

    
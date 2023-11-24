package Interface;
import Book.Book;
import Book.Library;

import java.util.Scanner;

public class UserInterface {
    private int numOfPages;
    private String title;
    private String author;
    private Scanner scanner = new Scanner(System.in);
    public Library library = new Library();
    public void start(){
        System.out.println("Welcome to library, what do you want to do? \n enter 1 to search for book, enter 2 to check is the book available");


        System.out.println("enter num of book");
        int numOfPages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter title of book");
        String title = scanner.nextLine();
        System.out.println("enter author of book");
        String author = scanner.nextLine();
        if (author.equals("xD")){
            System.out.println("xDD");
        }
        PrintBooks(numOfPages, title,author);
    }
    public void AddBook(){
        Book book1 = new Book(numOfPages, title, author);
        library.addBook(book1);
    }
    public void PrintBooks(int numOfPages, String title, String author){
        library.printBooks();
    }
}

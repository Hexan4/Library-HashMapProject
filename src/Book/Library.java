package Book;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap();
    public void addBook(Book book){
        books.put(book.title, book);
    }
    public void printBooks(){
        for (Book book: books.values()){
            System.out.println(book);
        }
    }
}

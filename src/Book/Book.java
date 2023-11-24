package Book;

public class Book {
    public int numOfPages;
    public String title;
    public String author;
    public Book(int numOfPages, String title, String author){
        this.author = author;
        this.numOfPages = numOfPages;
        this.title = title;
    }

    @Override
    public String toString() {
        return "This book has: " + author + " as author, " + numOfPages + " pages and " + title + " is title!";
    }
}

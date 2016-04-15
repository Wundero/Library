import java.util.ArrayList;

public class Database {
    private ArrayList<Book> books = new ArrayList<>();
    
    public Database() {
    }
    
    @Override
    public String toString() {
        return books.toString();
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public boolean hasBook(String book) {
        return hasBook(new Book(book));
    }
    
    public void addBook(String book) {
        addBook(new Book(book));
    }
    
    public void removeBook(String book) {
        removeBook(new Book(book));
    }
    
    public boolean hasBook(Book book) {
        return books.contains(book);
    }
    
    public void addBook(Book book) {
        if(books.contains(book)) {
            books.get(books.indexOf(book)).add();
        } else {
            books.add(book);
        }
    }
    
    public void removeBook(Book book) {
        if(books.contains(book)) {
            if(books.get(books.indexOf(book))<=1) {
                books.remove(book);
            } else {
                books.get(books.indexOf(book)).remove();
            }
        }
    }
}

import java.util.Scanner;

public class Main {
  //args are names of books
    public static void main(String[] args) {
      Database db = new Database();
      System.out.println("Database initiated.");
      for(String book : args) {
        db.addBook(book);
      }
      System.out.println(db);
      
      System.out.println("Enter a name to search for: ");
      Scanner scn = new Scanner(System.in);
      String query = scn.nextLine();
      System.out.println("Matches: ")
      System.out.println(ListComparator.matches(query, db.getBooks()));
      System.out.println("Best match: ");
      Object match = ListComparator.bestMatch(query, db.getBooks());
      System.out.println(match);
    }
}

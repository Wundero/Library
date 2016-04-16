public class Main {
  //args are names of books
    public static void main(String[] args) {
      Database db = new Database();
      System.out.println("Database initiated.");
      for(String book : args) {
        db.addBook(book);
      }
      System.out.println(db);
    }
}

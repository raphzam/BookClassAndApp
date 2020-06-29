import java.util.HashMap;

public class DatabaseHashMap {
    HashMap <String, Book> databaseOfBooks;


    public DatabaseHashMap(){  //constructor
        this.databaseOfBooks = new HashMap<String, Book>();
    }

    public void addtoDataBase(String sku, Book book){
        databaseOfBooks.put(sku, book);
    }

    public void searchBySku(String sku){
        Book book = databaseOfBooks.get(sku);
        System.out.println("SKU:" + sku + " " + book.getDisplayText() + " $" + book.getPrice());
    }

    public void printAllSku(){
        for (String sku : databaseOfBooks.keySet()){
            System.out.print(sku + " ");
        }
        System.out.println();
    }




}













//
//    public setDatabase(){
//
//    }
//    public getData















//    public String searchBySKU (String sku) { //search by SKU method
//        //switch through SKUS
//
//
//        //String book = SKU + title + author + description +price
//        //return book
//        //or System.out.println(book);
//    }

//   public Database (String sku, String title, String author, String description, double price) {
//
//}
//    String[] words = new String[25];
//    words[0] = "hello";
//    Book[] books = new Book[6];
//    books[0] =
//    Book book = new Book();
//    Book [] books = new Book[6];
//

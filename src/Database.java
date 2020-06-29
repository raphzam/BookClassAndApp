import java.util.HashMap;

public class Database {
    private HashMap <String, Book> databaseOfBooks;


    public Database(){  //constructor
        this.databaseOfBooks = new HashMap<String, Book>();
    }

    public void addToDataBase(String sku, Book book){
        this.databaseOfBooks.put(sku, book);
    }

    public String searchBySku(String sku){
        if (databaseOfBooks.containsKey(sku)) {
            Book book = this.databaseOfBooks.get(sku);
            String bookInfo = "SKU:" + sku + " " + book.getDisplayText() + " $" + book.getPrice();
            return bookInfo;
        } else
            return "That book is not in the database";
    }

    public void printAllSku(){  //prints all SKUs in the hashmap when called
        for (String sku : this.databaseOfBooks.keySet()){
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

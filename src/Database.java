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
            String bookInfo = "SKU:" + sku + " " + book.getDisplayText() + " $" + book.getPrice(); //getDisplayText is a method of the book class
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



























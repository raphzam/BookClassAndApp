public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book (){
        System.out.println("the constructor has run");
    }

    public Book (String title, String author, String description, double price, boolean isInStock){
        this.isInStock = isInStock;
        this.price = price;
        this.description = description;
        this.author = author;
        this.title = title;
    }

    public String getTitle(){//
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }


    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price= price;
    }
    public double getPrice(){
        return this.price;
    }

    public void setInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    public boolean getIsInStock(){
        return this.isInStock;
    }

    //method that must take three arguments
    public String printBook(String title, String author, String description){

        String wholeBook = title + " " + author + " " + description;
        return wholeBook;

    }


    public String getDisplayText(){
        String wholeBook = "Title: " + this.title + "\t Author: " + this.author + "\t Description: " + this.description;
        return wholeBook;
    }

    public double getTotalPrice(int numOfBooks){

        double pricePerBook = 20;

        double totalPrice = pricePerBook*numOfBooks;
        if (this.isInStock == false){
            System.out.printf("We do not have your books %s in stock. We can order them and the cost will be: \n", this.title);
        }

        return totalPrice;

    }

}









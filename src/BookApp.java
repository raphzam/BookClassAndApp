public class BookApp {

    public static void main(String[] args){

        //creating a new book called firstBook and passing arguments to it
        Book firstBook = new Book("Java I", "Nora",
                "how to use classes and objects in java", 14.99, true);

        //printing out the title, author, and description of firstBook using a method defined in the Book class
        System.out.println(firstBook.getDisplayText());

        //overwriting variable in firstBook
        firstBook.setAuthor("Rey");
        firstBook.setDescription("basic syntax of java");


        //author should now be Rey
        System.out.println(firstBook.getDisplayText());

        Book secondBook = new Book("Java II", "Sue", "how to use more Java", 100, false);

        System.out.println(secondBook.getDisplayText());


        System.out.println(firstBook.getTotalPrice(20));//Java I is in stock
        System.out.println(secondBook.getTotalPrice(5));//Java II is not in stock and prints an additional message




    }
}



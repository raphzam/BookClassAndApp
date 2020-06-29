import java.util.Scanner;

public class BookApp {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

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


//        System.out.println(firstBook.getTotalPrice(20));//Java I is in stock
//        System.out.println(secondBook.getTotalPrice(5));//Java II is not in stock and prints an additional message

        Book bookOne = new Book("Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50, true);
        Book bookTwo = new Book("Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20, true);
        Book bookThree = new Book("OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky","Everything you need to know in one place", 45.00, true  );
        Book bookFour = new Book("Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50, true);
        Book bookFive = new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, true);
        Book bookSix = new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true);

        DatabaseHashMap myDatabase = new DatabaseHashMap();

        myDatabase.addtoDataBase("Java1001", bookOne);
        myDatabase.addtoDataBase("Java1002", bookTwo);
        myDatabase.addtoDataBase("Orcl1003", bookThree);
        myDatabase.addtoDataBase("Python1004", bookFour);
        myDatabase.addtoDataBase("Zombie1005", bookFive);
        myDatabase.addtoDataBase("Rasp1006", bookSix);

//        myDatabase.searchBySku("Java1001");
//        myDatabase.searchBySku("Java1002");


        while (true) {

            System.out.println("List of SKUs in the database");
            myDatabase.printAllSku();
            System.out.println("Enter a SKU to find out more information");
            String userSku = input.nextLine();
            myDatabase.searchBySku(userSku);
            System.out.println("Search again? (no or n to quit)");
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase("n")|| (userAnswer.equalsIgnoreCase("No"))){
                break;
            }

        }

        System.out.println("Application Done");


    }
}



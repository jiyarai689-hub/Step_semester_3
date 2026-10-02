package OOPFundamental.assignment_problems;

public class BookRecordClass {
     static class Book {
        String title;
        double price;
    }

    public static void main(String[] args) {

        // Create Book object
        Book book = new Book();

        // Set values
        book.title = "Clean Code";
        book.price = 650.0;

        // Display details
        System.out.println("Title: " + book.title + " | Price: Rs " + book.price);
    }
    
}

package JavaLearning.Constructors;

public class Book {
    //parameterized Constructor
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void displayBook() {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Rich Dad Poor Dad", 999);
        Book book1 = new Book("Think and Grow Rich", 599);

        book.displayBook();
        book1.displayBook();
    }
}

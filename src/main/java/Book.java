public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title +
                ", Author: " + author +
                ", Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("book1", "kjs", 50);
        Book b2 = new Book("book2", "msd", 60);

        b1.displayDetails();
        b2.displayDetails();
    }
}

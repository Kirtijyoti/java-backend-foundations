public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public void displayBill() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + calculateTotal());
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Toy", 200.0, 2);
        Product p2 = new Product(2, "Cat Food", 50.0, 3);
        Product p3 = new Product(3, "Hat", 150.0, 1);

        p1.displayBill();
        p2.displayBill();
        p3.displayBill();
    }
}

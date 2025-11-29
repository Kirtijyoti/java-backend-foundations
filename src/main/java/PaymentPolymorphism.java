interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {
    private String upiID;

    public UPIPayment(String upiID) {
        this.upiID = upiID;
    }

    public void pay(double amount) {
        System.out.println("Yo dawg, you paid: " + amount + " using UPI: " + upiID);
    }
}

class CardPayment implements Payment {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Yo dawg, you paid: " + amount + " using card: " + cardNumber);
    }
}

public class PaymentPolymorphism {
    public static void main(String[] args) {
        Payment payment[] = new Payment[2];

        payment[0] = new UPIPayment("kirti@gpay.com");
        payment[1] = new CardPayment("9876 5678 4444 1234");

        for (Payment x : payment) {
            x.pay(1000);
        }
    }
}

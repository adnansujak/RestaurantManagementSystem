public class DebitCardPayment implements PaymentMethod{
    public void bill(String amount) {
        System.out.println("Customer will pay $" + amount + "dollars with Debit  Card");
    }
}

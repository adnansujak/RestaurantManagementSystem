public class CashPayment implements PaymentMethod{
    public void bill(String amount) {
        System.out.println("Customer will pay $" + amount + " dollars with cash");
    }
}

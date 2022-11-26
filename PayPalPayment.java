public class PayPalPayment implements PaymentMethod{
    private String email;
    private String password;
    public void bill(String amount) {
        email = "...";
        password = "...";
        System.out.println("Customer will pay $" + amount + "dollars with PayPal");
    }
}

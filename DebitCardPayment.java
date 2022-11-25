public class DebitCardPayment implements PaymentMethod{
    public void bill(String amount) {
        System.out.println("Customer pays the money" + amount + "dollars with Debit  Card");
    }
}

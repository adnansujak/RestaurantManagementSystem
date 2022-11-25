import java.util.Scanner;

public class CustomerBillPay {
    public static void main(String[] args) {
        System.out.println("Please select Payment Type:" + "/r" + "Cash" + "/r" + "Debit Card"  + "/r" + "Credit Card" + "/r" + "Apple Pay" + "/r" + "PayPal");
        Scanner scanner = new Scanner (System.in);
        String paymentType = scanner.next();
        System.out.println("Payment type is:" + paymentType);

        System.out.println("\nPlease enter total amount to pay: ");
        Scanner scanner1 = new Scanner(System.in);
        String amount = scanner1.next();
        System.out.println("Total amount is: " + amount);

        PaymentContext ctx = null;
        ctx = new PaymentContext();

        if("Credit Card".equalsIgnoreCase(paymentType)) {
            ctx.setPaymentMethod(new CreditCardPayment());
        }
        else if("Debit Card".equalsIgnoreCase(paymentType)) {
            ctx.setPaymentMethod(new DebitCardPayment());
        }
        else if("Cash".equalsIgnoreCase(paymentType)) {
            ctx.setPaymentMethod(new CashPayment());
        }
        else if("Apple Pay".equalsIgnoreCase(paymentType)) {
            ctx.setPaymentMethod(new ApplyPayPayment());
        }
        else if("PayPal".equalsIgnoreCase(paymentType)) {
            ctx.setPaymentMethod(new PayPalPayment());
        }
        System.out.println("PayemntContext has: " + ctx.getPaymentMethod());
        ctx.bill(amount);
    }

}

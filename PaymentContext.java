public class PaymentContext {
    private PaymentMethod paymentMethod;
    public void setPaymentMethod(PaymentMethod method) {
        this.paymentMethod = method;
    }
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public void bill(String amount) {
        paymentMethod.bill(amount);
    }
}

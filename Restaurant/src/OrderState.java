public abstract class OrderState {
    String state;
    String display;
    double total;
    abstract public void order_place();
    abstract public void order_paid();
    abstract public void order_wait();
    abstract public void order_receive();
}

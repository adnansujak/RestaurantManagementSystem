public class Order {
    OrderState orderState;
    public Order() {
        orderState = new order_wait();
    }
    public void order_place()
    {
        orderState.order_place();
    }
    public void order_paid ()
    {
        orderState.order_paid ();
    }

    public void order_receive ()
    {
        orderState.order_receive ();
    }

    public void shiftNext() {
        orderState = OrderStateFactory.getNext(orderState);
    }
}


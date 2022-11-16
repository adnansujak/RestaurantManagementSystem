public class order_place extends OrderState{
    public order_place()
    {
        state = "placed";
    }

    public void order_wait(){
        display = "wait for place order";
        total += 0.0;
    }

    public void order_place() {
        display = "order has been placed";
        total += 0.0;
    }

    public void order_paid(){
        display = "order have not paid";
        total += 0.0;
    }

    public void order_receive()
    {
        display = "order have not receive";
        total += 0.0;
    }
}

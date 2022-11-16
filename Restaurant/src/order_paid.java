public class order_paid extends OrderState{
    public order_paid()
    {
        state = "paid";
    }

    public void order_wait(){
        display = "wait for place order";
        total += 0.0;
    }

    public void order_place() {
        display = "order have been placed";
        total += 0;
    }

    public void order_paid(){
        display = "order have been paid";
        total += 100.0;
    }

    public void order_receive()
    {
        display = "order have not receive";
        total += 100.0;
    }
}

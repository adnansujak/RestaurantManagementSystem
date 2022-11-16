public class order_receive extends OrderState{
    public order_receive()
    {
        state = "receive";
    }

    public void order_wait(){
        display = "wait for place order";
        total += 0.0;
    }

    public void order_place() {
        display = "order have placed";
        total += 0.0;
    }

    public void order_paid(){
        display = "order have paid";
        total += 100.0;
    }

    public void order_receive()
    {
        display = "order have received";
        total += 100.0;
    }
}

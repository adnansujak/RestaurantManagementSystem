public class order_wait extends OrderState{
    public order_wait()
    {
        state = "wait";
    }

    public void order_wait(){
        display = "wait for place order";
        total += 0.0;
    }

    public void order_place() {
        display = "order have not been placed";
        total += 0.0;
    }

    public void order_paid(){
        display = "order have not being paid";
        total += 0.0;
    }

    public void order_receive()
    {
        display = "order have not receive";
        total += 0.0;
    }
}

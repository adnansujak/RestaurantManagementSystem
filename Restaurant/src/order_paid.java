public class order_paid implements Customer_Status{

    public void order_wait(){
        System.out.println("no wait for order");
    }

    public void order_place() {
        System.out.println("no need to placed");
    }

    public void order_paid(){
        System.out.println("order have been paid");
    }

    public void order_receive()
    {
        System.out.println("order have not receive");
    }
}

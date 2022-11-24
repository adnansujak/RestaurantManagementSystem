public class order_place implements Customer_Status{
    public void order_wait(){
        System.out.println("no wait for order.");
    }

    public void order_place() {
        System.out.println("order has been placed.");
    }

    public void order_paid(){
        System.out.println("order have not paid.");
    }

    public void order_receive()
    {
        System.out.println("order have not receive.");
    }
}

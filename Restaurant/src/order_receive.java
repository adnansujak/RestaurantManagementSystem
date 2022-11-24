public class order_receive implements Customer_Status{

    public void order_wait(){
        System.out.println("no wait for order.");
    }

    public void order_place() {
        System.out.println("no order have placed.");
    }

    public void order_paid(){
        System.out.println("no order have paid.");
    }

    public void order_receive()
    {
        System.out.println("order have received.");
    }
}

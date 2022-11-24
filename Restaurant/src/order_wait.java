public class order_wait implements Customer_Status{
    public void order_wait(){
        System.out.println("wait for place order.");
    }

    public void order_place() {
        System.out.println("order have not placed.");
    }

    public void order_paid(){
        System.out.println("order have not paid.");
    }

    public void order_receive()
    {
        System.out.println("order have not receive.");
    }
}

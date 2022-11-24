public class order_receive implements Customer_Status{

    public void order_wait(){
        System.out.println("no wait for order");
//        display = "wait for place order";
//        total += 0.0;
    }

    public void order_place() {
        System.out.println("no order have placed");
//        display = "order have placed";
//        total += 0.0;
    }

    public void order_paid(){
        System.out.println("no order have paid");
//        display = "order have paid";
//        total += 100.0;
    }

    public void order_receive()
    {
        System.out.println("order have received");
//        display = "order have received";
//        total += 100.0;
    }
}

public class order_place implements Customer_Status{
    public void order_wait(){
        System.out.println("no wait for order");
//        display = "wait for place order";
//        total += 0.0;
    }

    public void order_place() {
        System.out.println("order has been placed");
//        display = "order has been placed";
//        total += 0.0;
    }

    public void order_paid(){
        System.out.println("order have not paid");
//        display = "order have not paid";
//        total += 0.0;
    }

    public void order_receive()
    {
        System.out.println("order have not receive");
//        display = "order have not receive";
//        total += 0.0;
    }
}

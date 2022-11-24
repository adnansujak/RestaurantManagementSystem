public class order_paid implements Customer_Status{

    public void order_wait(){
        System.out.println("no wait for order");
//        display = "wait for place order";
//        total += 0.0;
    }

    public void order_place() {
        System.out.println("no need to placed");
//        display = "order have been placed";
//        total += 0;
    }

    public void order_paid(){
        System.out.println("order have been paid");
//        display = "order have been paid";
//        total += 100.0;
    }

    public void order_receive()
    {
        System.out.println("order have not receive");
//        display = "order have not receive";
//        total += 100.0;
    }
}

public class order_wait implements Customer_Status{
//    double total;
    public void order_wait(){
//        display = "wait for place order";
//        total += 0.0;
//        total = 0.0;
//        System.out.println("wait for place order." + total);
        System.out.println("wait for place order.");
    }

    public void order_place() {
//        total = 0.0;
        System.out.println("order have not placed.");
//        display = "order have not been placed";
//        total += 0.0;
    }

    public void order_paid(){
//        total = 0.0;
//        System.out.println("order have not being paid."+ total);
        System.out.println("order have not paid.");
//        display = "order have not being paid";
//        total += 0.0;
    }

    public void order_receive()
    {
//        total = 0.0;
//        System.out.println("order have not receive." + total);
        System.out.println("order have not receive.");
//      display = "order have not receive";
//      total += 0.0;
    }
}

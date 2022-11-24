public class Statue {
    public static order_wait wait;
    public static order_place place;
    public static order_paid  paid;
    public static order_receive receive;

    private static Customer_Status statue;

    Statue(){
        wait = new order_wait();
        place = new order_place ();
        paid = new order_paid();
        receive = new order_receive();
    }

    public void setWaitStatue()
    {
        statue = wait;
    }

    public void setPlaceStatue()
    {
        statue = place;
    }

    public void setPayStatue()
    {
        statue = paid;
    }

    public void setReceiveStatue()
    {
        statue = receive;
    }

    public void order_wait()
    {
        statue.order_wait();
    }

    public void order_place()
    {
       statue.order_place();
    }

    public void order_paid()
    {
        statue.order_paid();
    }

    public void order_receive()
    {
        statue.order_receive();
    }

}

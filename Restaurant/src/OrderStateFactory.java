public class OrderStateFactory {
     public static OrderState getNext(OrderState currentState)
    {
        if(currentState.state.equals("wait"))
        {
            return new order_wait();
        }
        else if (currentState.state.equals("placed"))
        {
            return new order_place();        }
        else if (currentState.state.equals("paid"))
        {
            return new order_paid();
        }
        return new order_receive();
    }

//    abstract public void order_place();
//    abstract public void order_paid();
//    abstract public void order_wait();
//    abstract public void order_receive();
}

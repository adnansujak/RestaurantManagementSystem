public class StatePatternDemo {
    Statue statue;
    StatePatternDemo(String state)
    {
        statue = new Statue();
        if(state.equalsIgnoreCase("waiting"))
            statue.setWaitStatue();
        if(state.equalsIgnoreCase("place"))
            statue.setPlaceStatue();
        if(state.equalsIgnoreCase("pay"))
            statue.setPayStatue();
        if(state.equalsIgnoreCase("receive"))
            statue.setReceiveStatue();
        statue.order_wait();
        statue.order_place();
        statue.order_paid();
        statue.order_receive();
    }

    public static void main(String[] args)
    {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter customer statues: ");
//        String states = sc.next();
        System.out.println("When customer is waiting:");
        new StatePatternDemo("waiting");
        System.out.println();
        System.out.println("When customer is waiting:");
        new StatePatternDemo("place");
    }
}

import java.util.*;

public class Test {
    Statue statue;
    Test(String state)
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
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter customer statues: ");
        String states = sc.next();
        Test test = new Test(states); 
    }
}

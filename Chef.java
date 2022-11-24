public class Chef implements SeatWatcher {
 public void notify (int numOfSeatsOpen){
   System.out.println("chef notified. total number of open seats: " + numOfSeatsOpen);
 }
}

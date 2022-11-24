public class Manager implements SeatWatcher {
 public void notify (int numOfSeatsOpen){
   System.out.println("manager notified. total number of open seats: " + numOfSeatsOpen);
 }
}

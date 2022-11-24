public class Website implements SeatWatcher {
 public void notify (int numOfSeatsOpen){
   System.out.println("website notified. total number of open seats: " + numOfSeatsOpen);
 }
}

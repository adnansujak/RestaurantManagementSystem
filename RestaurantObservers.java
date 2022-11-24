import java.util.*;

public class RestaurantObservers {
  private List<SeatWatcher> seatWatchers = new ArrayList<>();
  //assume 100 available seats, this number can be changed
  private int number_of_seats = 100;
  //track number of current seats occupied
  private int current_occupied = 0;


  public void addWatcher(SeatWatcher seatWatcher){
    seatWatchers.add(seatWatcher);
  }

  public void removeWatcher(SeatWatcher seatWatcher){
    seatWatchers.remove(seatWatcher);
  }

  public void seatGroup(int number_of_customers){
    if (current_occupied + number_of_customers >= number_of_seats){
      System.out.println("Sorry, we do not have room for your group");
    } else {
      current_occupied += number_of_customers;
      notifyObservers();
    }
  }

  public void exitGroup(int number_of_customers){
    current_occupied -= number_of_customers;
    notifyObservers();
  }

  public void notifyObservers(){
    for (SeatWatcher seatWatcher : seatWatchers){
      seatWatcher.notify(number_of_seats - current_occupied);
    }
  }

  public int getCurrentSeats(){
    return number_of_seats - current_occupied;
  }

  public void setCurrentSeats(int seats){
    current_occupied = seats;
  }

}

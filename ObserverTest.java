import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {
  @org.junit.jupiter.api.Test
  void setSeats() {
      RestaurantObservers restaurantObserver = new RestaurantObservers();
      restaurantObserver.seatGroup(60);
      restaurantObserver.seatGroup(30);
      restaurantObserver.exitGroup(15);
      assertTrue(restaurantObserver.getCurrentSeats() == 25);
  }

  @org.junit.jupiter.api.Test
  void tooManyCustomers() {
      RestaurantObservers restaurantObserver = new RestaurantObservers();
      restaurantObserver.seatGroup(30);
      restaurantObserver.seatGroup(67);
      //this group should be rejected, because it would bring total customers above seating capacity
      restaurantObserver.seatGroup(13);
      assertTrue(restaurantObserver.getCurrentSeats() == 3);
  }

}

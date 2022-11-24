public class MainObserver {
  public static void main(String[] args){
    RestaurantObservers restaurantObserver = new RestaurantObservers();
    Chef chef = new Chef();
    Manager manager = new Manager();
    Website website = new Website();
    restaurantObserver.addWatcher(chef);
    restaurantObserver.addWatcher(manager);
    restaurantObserver.addWatcher(website);
    restaurantObserver.seatGroup(40);
    restaurantObserver.seatGroup(20);
    restaurantObserver.exitGroup(40);
    restaurantObserver.seatGroup(30);
    restaurantObserver.seatGroup(80);
  }
}

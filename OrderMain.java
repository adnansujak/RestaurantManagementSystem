public class OrderMain {

    public static void main(String[] args) {

        System.out.println("\n      ---------------");
        System.out.println("      ---KIDS MENU---");
        System.out.println("      ---------------\n\n");
        KidsMenuFactory kidsmenuFactory = new KidsMenuFactory();

        KidsMenu KidsAppetizer = kidsmenuFactory.viewMenu("kids appetizers");
        KidsAppetizer.ViewMenu();

        KidsMenu KidsMeal = kidsmenuFactory.viewMenu("kids meal");
        KidsMeal.ViewMenu();

        KidsMenu KidsDesserts = kidsmenuFactory.viewMenu("kids desserts");
        KidsDesserts.ViewMenu();

        KidsMenu KidsBeverages = kidsmenuFactory.viewMenu("kids beverages");
        KidsBeverages.ViewMenu();

    }
}

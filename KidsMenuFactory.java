public class KidsMenuFactory {
    public KidsMenu viewMenu(String menu) {

        if (menu.isEmpty()) {
            return new Error();
        }

        if (menu == "Kids Appetizers" || menu == "kids appetizers") {
            return new KidsAppetizers();

        }

        if (menu == "Kids Meal" || menu == "kids meal") {
            return new KidsMeal();
        }

        if (menu == "Kids Desserts" || menu == "kids desserts") {
            return new KidsDesserts();
        }

        if (menu == "Kids Beverages" || menu == "kids beverages") {
            return new KidsBeverages();
        } else {

            return new Error();

        }
    }
}

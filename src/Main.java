import models.Tshirts;
import models.Order;

public class Main {
    public static void main(String[] args) {
        // Create T-shirt objects
        Tshirts tShirt1 = new Tshirts("Gorkhali Batman", 572, 1235, "karuna",
                "Graphic text: You either die a hero or live long enough to see yourself be a villain", new String[]{"M", "L", "XL"});
        Tshirts tshirts2 = new Tshirts("Kathmandu Superman",683, 2346, "aruna", "HI", new String[]{"L","Xl","XLL"});


        Order order1 = new Order("Gopal Sharma", "0486756465",
                new int[]{572,681}, new double[]{12345,1780});


        // Print the bill with VAT
        order1.VAT();

    }
}
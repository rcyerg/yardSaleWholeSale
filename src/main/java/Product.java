
import java.util.*;

public class Product {

    private String name;

    private int qty;

    private float price;

    public Product(String name, int qty, float price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public void yardSaleWholeSale(){
        double total = this.price * this.qty;
        System.out.println("Name\tQty\t\tPrice\tTotal\t");
        System.out.println("----\t---\t\t-----\t-------");
        System.out.printf(this.name + "\t" + this.qty + "\t\t" + "$%.1f\t" + "$%.2f", price, total);
        System.out.println();
        System.out.println("\n\tThank you. Come again!!!");
        System.out.println();
        System.out.printf("Purchased on: %tA, %<tB %<td, %<tY", new Date());
    }

    public static void main(String[] args) {
        Product rice = new Product("Rice", 20, 5.0f);
        rice.yardSaleWholeSale();
    }
}

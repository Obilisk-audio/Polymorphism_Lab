import MusicProduct.MusicProduct;
import Interfaces.IProduct;
import java.util.ArrayList;

public class RecordShop {
    private String name;
    private double till;
    private ArrayList<IProduct> stock;

    public RecordShop(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public double calculateProfit(){
        double profit = 0;
        for (IProduct product : stock){
            profit += product.calculateProfit();
        }
        return profit;
    }

    public void addItemToStock(IProduct product){
        this.stock.add(product);
    }
    public int stockCount(){
        return this.stock.size();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }
    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<IProduct> getStock() {
        return stock;
    }
    public void setStock(ArrayList<IProduct> stock) {
        this.stock = stock;
    }
}
package MusicProduct;
import Interfaces.IProduct;
public abstract class MusicProduct implements IProduct {
    String name;
    String genre;
    String condition;
    double cost;
    double price;

    public MusicProduct(String name, String genre, String condition, double cost, double price){
        this.name = name;
        this.genre = genre;
        this.condition = condition;
        this.cost = cost;
        this.price = price;
    }
    public double calculateProfit(){
        return this.price - this.cost;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }








}

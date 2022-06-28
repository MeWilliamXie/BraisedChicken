public class Dish {
    private int id;
    private double price = 0;
    private boolean isHalfPrice = false;
    public Dish(int id, double price){
        this.id = id;
        this.price = price;
    }
    public Dish(int id, double price, boolean isHalfPrice){
        this.id = id;
        this.price = price;
        this.isHalfPrice = isHalfPrice;
    }

    public double getPrice() {
        return price;
    }
    public boolean getIsHalfPrice() {
        return isHalfPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHalfPrice(boolean halfPrice) {
        isHalfPrice = halfPrice;
    }
}

public class test {
    public static void main(String[] args) {
        Dish[] d = new Dish[3];
        d[0] = new Dish(1,22,true);
        d[1] = new Dish(2,5);
        d[2] = new Dish(3,12);
        System.out.println("总价格是：" + collectPrice(d));
    }
    public static double collectPrice(Dish[] d){
        double price1 = 0;
        double price2 = 0;
        for (Dish dish : d) {
            if(dish.getIsHalfPrice()){
                price1 += 0.5 * dish.getPrice();
            }else{
                price1 += dish.getPrice();
            }
            price2 += dish.getPrice();
        }
        return price1 < price2? price1 : price2;
    }
}

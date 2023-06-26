public class Cake {
    private String name;
    private float price;
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display(Cake cake){
        System.out.println(getName()+": ₹ "+getPrice()+" per pound");
    }
}

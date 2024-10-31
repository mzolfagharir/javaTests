enum Laptops{
    Mac(1500), Dell(2200), Asus(3500);
    private int price;
      Laptops(int price) {
         this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class LapPrice {
    public static void main(String[] args) {
        for(Laptops l : Laptops.values()) {
            System.out.println(l + " : " +l.getPrice());
        }
    }
}

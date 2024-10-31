enum Laptop{
    Dell, Asus, Mac, Lenovo, Acer
}
public class Demo {
    public static void main(String[] args) {
            Laptop[] l = Laptop.values();
            for(Laptop laptop : l){
                System.out.println(laptop);
            }
    }
}

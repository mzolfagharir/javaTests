interface A{
    void show();
}
public class Demo{
    public static void main(String[] args) {
        A test = ()->System.out.println("hello");
        test.show();
    }
}
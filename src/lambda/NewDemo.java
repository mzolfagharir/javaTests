package src.lambda;
interface A{
    void show();
}
public class NewDemo {
    public static void main(String[] args) {
        A test = ()->System.out.println("hello");
        test.show();
    }
}
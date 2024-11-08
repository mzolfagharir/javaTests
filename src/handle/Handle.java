package handle;
public class Handle {
    public static void main(String[] args) {
        int i = 0;
        try {
            int result = 10 % 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Not OK");
        }
    }
}
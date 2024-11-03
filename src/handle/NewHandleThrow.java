package handle;
public class NewHandleThrow {
    public static void main(String[] args) {
        int i = 3;
        try {
            int result = 10 / i;
            if(result==0)
                throw new ArithmeticException("I dont want to send message");
        }
        catch (ArithmeticException e) {
            System.out.println("Not OK");
        }
    }
}
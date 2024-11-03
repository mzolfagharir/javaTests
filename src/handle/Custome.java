package handle;
class MzolException extends Exception{
    public MzolException(String str){
        super(str);
    }
}
public class Custom {
    public static void main(String[] args) {
        int i = 5;
        try {
            int result = 10 % i;
            if(result==0)
                throw new MzolException("I dont want to send message");
        }
        catch (MzolException e) {
            System.out.println("Not OK");
        }
    }
}
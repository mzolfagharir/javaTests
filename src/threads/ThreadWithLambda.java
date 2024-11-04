package threads;
public class ThreadWithLambda {
    public static void main(String[] args) {
        Runnable obj = () ->
        {
            for(int i=1; i<10; i++){
                System.out.println("HI");
            }
        };
        Runnable objj = () ->
        {
            for(int i=1; i<10; i++){
                System.out.println("Hello");
            }
        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(objj);
        t1.start();
        t2.start();

    }
}
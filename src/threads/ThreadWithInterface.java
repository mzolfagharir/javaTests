package threads;
class Z implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<10; i++){
            System.out.println("HI");
        }
    }
}
class X implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<10; i++){
            System.out.println("Bye");
        }
    }
}
public class ThreadWithInterface {
    public static void main(String[] args) {
        Runnable obj = new Z();
        Runnable objj = new X();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(objj);
        t1.start();
        t2.start();

    }
}

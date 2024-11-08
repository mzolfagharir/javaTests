package threads;
class A extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("A Class");
            System.out.println(Thread.currentThread());
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("B Class");
            System.out.println(Thread.currentThread());
        }
    }
}
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        A test = new A();
        B test1 = new B();
        test.start();
        test1.start();

    }
}
package src.inter;
interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code() {
        System.out.println("Coding with laptop");
    }
}
class AllInOne implements Computer{
    public void code() {
        System.out.println("Code with Allinone");
    }
}
class Developer extends AllInOne{
    public void run(Computer sys){
        System.out.println("Im coding with " + sys.toString());
    }
}
public class Main {
    public static void main(String[] args) {
        Computer l = new Laptop();
        Computer a = new AllInOne();
        Developer ali = new Developer();
        ali.run(l);
    }
}
//Simple App for interface usage
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
class Developer extends {
    public void run(Computer sys){
        System.out.println("Im coding with " + sys.toString());
    }
}
public class Demo {
    public static void main(String[] args) {
        Computer l = new Laptop();
        Computer a = new AllInOne();
        Developer ali = new Developer();
        ali.run(l);
    }
}
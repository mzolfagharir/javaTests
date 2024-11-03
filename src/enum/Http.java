import java.util.Scanner;
enum Ht{
NotFound, Bandwidth, Forbidden
}
public class Http {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Http Error");
        String code = sc.nextLine();
        Ht Http = Ht.valueOf(code);
        switch (Http) {
            case NotFound:
                System.out.println("404 Not Found");
                break;
                case Bandwidth:
                    System.out.println("509");
                    break;
            default:
                System.out.println(Ht.Forbidden);
                break;
        }
    }
}

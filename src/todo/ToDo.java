package todo;
import java.util.Scanner;
public class ToDo extends Operations {
    public static void main(String[] args) {
        Operations a =new Operations();
        while (true){
            System.out.println("[1] Add");
            System.out.println("[2] Show");
            System.out.println("[3] Edit");
            System.out.println("[4] Exit");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input){
                case 1:
                    a.add();
                    break;
                case 2:
                    a.show();
                    break;
                case 3:
                    a.edit();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

        }
    }
package loops;
import java.util.Scanner;
public class Whiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your * QTY");
        int userInput = input.nextInt();
        int i = 0;
        while (i <= userInput) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i++;
        }
        System.out.println(" ");
        int ii = 0;
        while (ii <= userInput) {
            int jj = userInput;
            while (jj >= ii) {
                System.out.print("*");
                jj--;
            }
            System.out.println(" ");
            ii++;
        }
    }
}
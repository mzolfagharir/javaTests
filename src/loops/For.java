package loops;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Star");
        int userInput = input.nextInt();
        for(int i=0;i<=userInput;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for(int i=0;i<=userInput;i++){
            for(int j=userInput; j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
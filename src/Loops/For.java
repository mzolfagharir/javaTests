package Loops;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Star");
        int userInput = input.nextInt();
        for(int i=1; i<userInput; i++){
            for(int j=userInput; j>i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int ii=1; ii<userInput; ii++){
            for(int jj=1; jj<ii; jj++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

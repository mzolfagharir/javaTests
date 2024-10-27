package todo;
import java.util.Scanner;
public class Operations {
    private String[] task;
    private final Scanner sc = new Scanner(System.in);
    private int qty;
    public void add() {
        System.out.println("Enter Task QTY");
        qty = sc.nextInt();
        sc.nextLine();
        task = new String[qty];
        for (int i = 0; i <= task.length-1; i++) {
            System.out.println("Enter Task Number:" + (i));
            task[i] = sc.nextLine();
        }
        System.out.println("Done");
    }
    public void show(){
        for(int j=0; j<=qty-1;j++){
            System.out.println(j +" " + task[j]);
        }
    }
    public void edit(){
        show();
        System.out.println("Enter index number");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter New Task");
        String newIndex = sc.nextLine();
        task[index] = newIndex;
        show();
    }
}
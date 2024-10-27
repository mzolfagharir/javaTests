package arrays;
public class Multi {
    public static void main(String[] args) {
        int[][] myArray = new int[5][10];
        for(int i=0; i<myArray.length;i++){
            for(int j=0; j<10;j++){
                myArray[i][j] = (int) (Math.random()*100);
                System.out.print(" ");
                System.out.print(myArray[i][j]);
            }
            System.out.println(" ");
        }

        }
    }
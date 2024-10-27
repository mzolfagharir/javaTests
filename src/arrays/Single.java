//Simple single array to fill with random number
package arrays;
public class Single {

    public static void main(String[] args) {
        int[] myarray= new int[25];
        for(int i=1; i<=myarray.length-1; i++){
            myarray[i]=(int)(Math.random()*10);
            System.out.println(myarray[i]);
        }
    }
}
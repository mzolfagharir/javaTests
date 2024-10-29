package quiz;
import java.util.Scanner;
public class QuestionsService {
    Questions[] q = new Questions[5];
    String[] answers = new String[5];
    Scanner sc = new Scanner(System.in);
    public QuestionsService(){
        q[0]=new Questions(1,"Which Year java founded?","1995","2000","1996","2001","1995");
        q[1]=new Questions(2,"Int Size?","4","8","16","32","4");
        q[2]=new Questions(3,"Double Size?","32","64","8","9","8");
        q[3]=new Questions(4,"Java Founder?","Bill Gates","James Gosling","Bjarne Stroustrup","none","James Gosling");
        q[4]=new Questions(5,"Which Year java founded?","1995","2000","1996","2001","1995");
    }
    public void show(){
        int i =0;
        for(Questions all: q){
            System.out.printf("Question Number %d: %s  %s , %s , %s ,%s \n",all.getId(), all.getQuestion(), all.getOp1(), all.getOp2(), all.getOp3(), all.getOp4());
            answers[i] =sc.nextLine();
            i++;
        }
    }
}

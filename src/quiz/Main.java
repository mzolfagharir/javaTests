package quiz;
public class Main {
    public static void main(String[] args) {
        QuestionsService q = new QuestionsService();
        q.show();
        q.showScore();
    }
}
package project.quiz;

import java.util.Scanner;

public class QuestionsService {
    Question[] ques = new Question[5];
    String[] selection = new String[5];
    public QuestionsService(){
        ques[0] = new Question(1 , "Capital of India?" , "Mumbai" , "Hyderabad" , "Delhi" , "Ranchi" , "Delhi");
        ques[1] = new Question(2 , "Independence day of India?" , "15 aug" , "26 Jan" , "2 oct" , "16 jan" , "15 aug");
        ques[2] = new Question(3 , "Republic day of India?" , "26 jan" , "15 aug" , "2 oct" , "14 nov" , "26 jan");
        ques[3] = new Question(4 , "When was Java founded?" , "1995" , "1997" , "2005" , "1983" , "1995");
        ques[4] = new Question(5 , "Parent company of java?" , "Oracle" , "TCS" , "Microsoft" , "Sun Microsystems" , "Oracle");
    }
    public void playQuiz() {
        int i = 0;
        for (Question q : ques) {
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.print("Enter the answer: ");
            Scanner in = new Scanner(System.in);
            selection[i++] = in.nextLine();

        }
        System.out.println("Your answers: ");
        for (String s : selection) {
            System.out.println(s);
        }
    }
        public void printScore(){
            int score = 0;
            for(int i = 0; i < ques.length; i++){
                Question que = ques[i];
                String actualAns = que.getAns();
                String userAns = selection[i];
                if(userAns.equalsIgnoreCase(actualAns)){
                    score++;
                }
        }
            System.out.println("Your score is : "+score);

    }

}

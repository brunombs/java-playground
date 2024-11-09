import java.util.Scanner;

public class Whoooo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option1 = "Julia";
        String option2 = "Gabi";
        String option3 = "Exgf";
        String option4 = "exkisser";


        System.out.println("Who do you think Bruno is going to end up with?");
        String answer = scanner.nextLine();

        if(answer.equals(option1)) {
            System.out.println("Yeeeeees, that's right.");
        }
        else if(answer.equals(option2)) {
            System.out.println("Whooops, that's incorrect.");
        }
        else if(answer.equals(option3)) {
            System.out.println("Whooops, that's incorrect.");
        }
        else if(answer.equals(option4)) {
            System.out.println("Whooops, that's incorrect.");
        }
        else{
            System.out.println("Who's that?.");
        }



    }
}

import java.util.Scanner;

public class Ac1 {
    public static void main(String[] args) {
        int correctguesses = randomnumber();
        System.out.println("you got " + correctguesses + " correct guesses");
    }
    public static int randomnumber(){
        int correctguess = 0;
        int num = 10, guess = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 50; i > 0; i--){
            int randomnum = (int)Math.random()*(100 - 1);
            for( i = 10; i > 0; i--){
                System.out.println("you have " + num + " guesses, guess the number");
                guess = s.nextInt();
                num--;
                if(guess > randomnum - 5 && guess < randomnum + 5)
                    correctguess++;
            }
        }
        return correctguess;
    }
}

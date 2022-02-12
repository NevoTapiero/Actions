import java.util.Scanner;

public class Ac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        boolean finalval = magic(number);
        System.out.println(finalval);
    }
    public static boolean magic(int number){
        int num = 0;
        boolean val = true;
        int number2 = number;
        while (number2 > 0){
            number2 = number2/10;
            num++;
        }
        if(num % 2 == 0) {
            while (number != 0) {
                int y = number % 10;
                number = number / 10;
                int z = number % 10;
                if(z % y != 0)
                    val = false;
                if(val == false)
                    break;
                number = number / 10;
            }
        }
        else
            val = false;
        return val;
    }
}

import java.util.Scanner;

public class Ac3 {
    public static void main(String[] args) {
        Mountainclimbers();
    }
    public static void Mountainclimbers(){
        int height = 0, highest, height1 = 0, stakes1 = 0, stakes = 0, minstakes;
        Scanner s = new Scanner(System.in);
        System.out.println("what is the height of climber number one?");
        height1 = s.nextInt();
        System.out.println("how mach stakes did the climber used?");
        stakes1 = s.nextInt();
        highest = height1;
        minstakes = stakes1;
        for(int i = 1; i > 0; i--) {
            System.out.println("what is the height of the next climber?");
            height = s.nextInt();
            System.out.println("how mach stakes did the climber used?");
            stakes = s.nextInt();
            if(height > height1) {
                highest = height;
                minstakes = stakes;
            }
            else if(highest == height)
                if (stakes < minstakes)
                    minstakes = stakes;
        }
        System.out.println("the winner reached " + highest + " meters with " + minstakes + " stakes");
    }
}

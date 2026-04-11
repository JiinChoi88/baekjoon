import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();

        Score s = new Score();
        s.check(grade);
    }
}

class Score{
    public void check(String n){
        double total = 0;
        if (n.charAt(0) == 'A') {
            total = 4.0;
        } else if (n.charAt(0) == 'B') {
            total = 3.0;
        } else if (n.charAt(0) == 'C') {
            total = 2.0;
        } else if (n.charAt(0) == 'D') {
            total = 1.0;
        } else {
            total = 0.0;
        }

        if (n.length() == 2) {
            if (n.charAt(1) == '+') {
                total += 0.3;
            } else if (n.charAt(1) == '-') {
                total -= 0.3;
            }
        }

        System.out.printf("%.1f", total);
    }

}
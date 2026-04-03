import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt();
        Checking c = new Checking();
        c.check(a,b);
    }
}

class Checking{
    public void check(int a, int b){
        if(a == 0 && b<45){
            System.out.printf("23 %d", 60-(45-b));
        }else if (b<45){
            System.out.printf("%d %d", a-1,60-(45-b));
        }

        if(b>=45){
            System.out.printf("%d %d", a, b-45);
        }
    }
    
}
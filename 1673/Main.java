import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Checking c = new Checking();
        while (sc.hasNextLong()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            c.check(a,b);
        }
    }
}

class Checking{
    public void check(int a, int b){
        int chicken = a; //10
        // b = 3;
        int dojang = a;
        int cupon;
        while(dojang/b > 0){
            cupon = dojang/b;
            dojang = dojang%b;
            chicken += cupon;
            dojang += cupon;
        }
        
        System.out.printf("%d\n", chicken);

    }
}
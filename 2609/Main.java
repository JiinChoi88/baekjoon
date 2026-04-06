import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Solve s = new Solve();

        int num1 = s.n_max(a,b);
        int num2 = s.n_min(a,b);
        
        System.out.printf("%d\n", num1);
        System.out.printf("%d\n", num2);

    }
}

class Solve{
    public int n_max(int a, int b){
        int num;
        if(a<b){
            num = a;
        }else{
            num = b;
        }

        for(int i = num; i>0; i--){
            if(a%i == 0 && b%i == 0){
                return i;
            }
        }
        return 0;
    }

    public int n_min(int a, int b){
        int result = (a*b)/ n_max(a,b);
        return result;
    }
}
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Window w = new Window();

        w.oc(n);
    }
}

class Window{
    public static void oc(int n){
        int result = 0;
        for(int i = 1; i*i<=n; i++){
            result += 1;
        }

        System.out.printf("%d", result);
    }
}
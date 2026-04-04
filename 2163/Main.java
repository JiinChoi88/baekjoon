import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Checking c = new Checking();
        int cutting1 = c.cut(n);
        int cutting2 = c.cut2(n, m);
        System.out.printf("%d", cutting1+cutting2);
    }
}

class Checking{
    public int cut(int n){
        if(n== 1){
            return 0;
        }else{
            return n-1;
        }
    }

    public int cut2(int n, int m){
        if(m==1){
            return 0;
        }else{
            return (m-1)*n;
        }
    }
}

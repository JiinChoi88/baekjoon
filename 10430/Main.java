import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        Solution s = new Solution();
        s.one(a,b,c);
        s.two(a,b,c);
        s.three(a,b,c);
        s.four(a,b,c);

    }
}

class Solution{
    public void one(int a, int b, int c){
        int result = (a+b)%c;
        System.out.printf("%d\n", result);
    }

    public void two(int a, int b, int c){
        int result = ((a%c)+(b%c))%c;
        System.out.printf("%d\n", result);
    }

    public void three(int a, int b, int c){
        int result = (a*b)%c;
        System.out.printf("%d\n", result);
    }

    public void four(int a, int b, int c){
        int result = ((a%c)*(b%c))%c;
        System.out.printf("%d\n", result);
    }
}
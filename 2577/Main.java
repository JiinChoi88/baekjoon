import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        Calculator c = new Calculator();
        int mul = c.mult(A,B,C);

        c.last(mul);
    }
}

class Calculator{
    public int mult(int A, int B, int C){
        int result = A*B*C;
        return result;
    }

    public void last(int mul){
        int store;
        int mult = mul;
        int [] result = new int[10];
        while(mult > 0 ){
            store = mult % 10;
            result[store] += 1;
            mult = mult/10;
        }

        for(int i = 0; i<10; i++){
            System.out.printf("%d\n", result[i]);
        }

    }
}
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        Sol s = new Sol();
        s.solve(L,A,B,C,D);
    }
}

class Sol{
    public void solve(int L, int A, int B, int C, int D){
        int korea = 0;
        int math = 0;

        // A/C만 0인경우
        // B/D만 0인경우
        // 둘 다 0인경우
        // 둘 다 0 아닌경우
        int result = 0;

        if(A/C == 0 && B/D != 0){
            math = B/D;
            if(B%D != 0){
                math += 1;
            }
            result = L-math;
        }else if (B/D == 0 && A/C != 0){
            korea = A/C;
            if(A%C != 0){
                korea += 1;
            }
            result = L-korea;
        }else if (B/D == 0 && A/C == 0){
            result = L-1;
        }else{
            if(B/D < A/C){
                if(A%C != 0){
                    result = L-(A/C)-1;
                }else{
                    result = L-(A/C);
                }
            }else{
                if(B%D != 0){
                    result = L-(B/D)-1;
                }else{
                    result = L-(B/D);
                }
            }
        }
        
        

        System.out.printf("%d", result);

    }
}
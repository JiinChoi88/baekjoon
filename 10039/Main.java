import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] s = new int[5];
        for(int k = 0; k<5; k++){
            s[k] = sc.nextInt();
        }

        Average a = new Average();

        for(int i = 0; i<5 ; i++){
            s[i] = a.min(s[i]);
        }

        int result = 0;
        for(int j = 0; j<5; j++){
            result += s[j];
        }

        System.out.printf("%d", result/5);
    }
}

class Average{
    public int min(int n){
        if(n<40){
            return 40;
        }else{
            return n;
        }
    }

}
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double [] score = new double[num];
        for(int i = 0; i<num; i++){
            score[i] = sc.nextInt();
        }

        Avr a = new Avr();
        a.average(score, num);
    }
}

class Avr{
    public void average(double[] score, int num){
        double max = score[0];

        for(int i = 1; i<num; i++){
            if(max<score[i]){
                max = score[i];
            }
        }
        
        double total = 0;

        for(int k = 0; k<num; k++){
            score[k] = score[k]/max*100;
            total += score[k];
        }

        double result = total/num;
        System.out.printf("%f", result);

    }
}
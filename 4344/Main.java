import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int case_num = sc.nextInt();
        double[] result_arr = new double[case_num];
        Checking c = new Checking();

        for (int i = 0; i < case_num; i++) {
            result_arr[i] = c.check(sc);
        }

        for (int j = 0; j < case_num; j++) {
            System.out.printf("%.3f%%\n", result_arr[j]);
        }
    }
}

class Checking {
    public double check(Scanner sc) {
        int first = sc.nextInt();
        int[] score = new int[first];

        for (int i = 0; i < first; i++) {
            score[i] = sc.nextInt();
        }

        return average(score);
    }

    public double average(int[] score) {
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        double average = (double) total / score.length;

        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > average) {
                count += 1;
            }
        }

        double result = (double) count / score.length * 100;
        return result;
    }
}
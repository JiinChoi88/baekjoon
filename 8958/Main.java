import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Checking c = new Checking();
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            String pb = sc.next();
            c.check(pb);
        }

    }   
}

class Checking{
    public static void check(String pb){
        int total = 0;
        String data[] = pb.split("");
        int size = data.length;
        int count = 0;

        int i = 0;
        while(i<size){
            if(data[i].equals("O")){
                count += 1;
                i ++;
                total += count;
            }else{
                count = 0;
                i ++;
            }

        }
        System.out.printf("%d\n", total);
    }
}


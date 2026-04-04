import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        Checking c = new Checking();
        c.sol(x,y,w,h);
    }
}

class Checking{
    public void sol(int x, int y, int w, int h){

        int [] arr = {w-x, h-y, y, x};
        int min = arr[0];
        for(int i = 0; i<4; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        
        System.out.printf("%d", min);

    }
}
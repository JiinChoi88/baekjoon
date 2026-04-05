import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        Sol s = new Sol();
        String [] arr = new String[num];
        for(int i = 0; i<num; i++){
            int check = sc.nextInt();
            arr[i] = s.pb(check);
        }

        for(int i = 0; i<num; i++){
            System.out.printf("%s", arr[i]);
        }

    
    }
}

class Sol{
    public String pb(int n){
        int result = n*n;
        int length = String.valueOf(n).length(); 
        int digit = (int)Math.pow(10, length);
        
        if(result % digit== n){
            return "YES\n";
        }else{
            return "NO\n";
        }
        
        
    }
}

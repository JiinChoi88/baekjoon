# 로직 #

### 기존에 작성한 코드 ###
```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Window w = new Window();

        w.oc(n);
    }
}

class Window{
    public static void oc(int n){
        int count = 0;
        boolean [] args = new boolean[n];

        while(count < n ){
            for(int i = 0; i<n ; i++){
                if( ((i+1)%(count+1) == 0)){
                    args[i] = !args[i];
                }
            }
            count += 1;
        }

        int result = 0;
        for(int k = 0; k<n; k++){
            if(args[k] == true){
                result += 1;
            }
        }

        System.out.printf("%d", result);
    }
}
```

### 수정 코드 ###

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Window w = new Window();

        w.oc(n);
    }
}

class Window{
    public static void oc(int n){
        int result = 0;
        for(int i = 1; i*i<=n; i++){
            result += 1;
        }

        System.out.printf("%d", result);
    }
}
```

주어진 n은 21억까지 이므로 int, boolean을 쓰면 메모리, 시간 초과 됨.\
규칙 : n까지의 숫자 i가 2의 배수이며 n보다 같거나 작으면 count
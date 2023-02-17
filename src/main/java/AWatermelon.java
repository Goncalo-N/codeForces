import java.util.Scanner;

public class AWatermelon {  // Problem link : https://codeforces.com/problemset/problem/4/A
    public static void AWatermelon(){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w%2 == 0 && w!=2){
            System.out.println("YES");
        }else {
        System.out.println("NO");
        }

    }
}

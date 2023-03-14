import java.util.Scanner;

public class ABitInc { //Problem Link https://codeforces.com/problemset/problem/282/A
    public static void ABitInc(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inc = 0;
        for(int i = 0; i<n; i++){
            String temp = sc.next();
            if(temp.contains("+"))
                inc++;

            if(temp.contains("-"))
                inc--;
        }
        System.out.println(inc);
    }
}

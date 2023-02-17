import java.util.Scanner;

public class ATeam {  // Problem link : https://codeforces.com/problemset/problem/231/A
    public static void ATeam(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int total=0;
        for(int i = 0; i<n; i++){

            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            if(a+b+c >=2)
                total++;
            a = 0;
            b = 0;
            c = 0;
        }
        System.out.println(total);
    }
}
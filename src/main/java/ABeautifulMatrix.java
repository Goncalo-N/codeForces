import java.util.Scanner;

import static java.lang.Math.abs;

public class ABeautifulMatrix { //Problem link : https://codeforces.com/contest/263/problem/A
    public static void ABeautifulMatrix(){
    Scanner sc = new Scanner(System.in);
    int n;
    int col = 0, line = 0, loc = 0;

	for(int i=1; i<=5; i++){
        for(int j=1; j<=5; j++){
            n = sc.nextInt();
            if(n==1){
                line = i;
                col = j;
            }
        }
        loc = abs(3-line) + abs(3-col);
    }
    System.out.println(loc);
}
}

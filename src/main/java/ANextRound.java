import java.util.Scanner;

public class ANextRound {  // Problem link : https://codeforces.com/problemset/problem/158/A
    public static void ANextRound(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp=0;
        int total=0;
        int arr[] = new int[50];
        for(int i =0;i < n; i++)
            arr[i] = sc.nextInt();

        temp = arr[k-1];

        for(int i = 0; i<n; i++){
            if(arr[i] >= temp && arr[i]>=1)
                total++;
        }
        System.out.println(total);
    }
}

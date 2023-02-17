import java.util.Scanner;

public class AWayTooLongWords { // Problem link : https://codeforces.com/problemset/problem/71/A
    public static void AWayTooLongWords(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter;
        for(int i = 0; i<n;i++){
            counter = 0;
            String str = sc.next();
            sc.nextLine();
            if(str.length()>10) {
                for (int j = 0; j < str.length(); j++) {
                    if (j == 0 || j == str.length() - 1) {
                        if (counter != 0)
                            System.out.print(counter);
                        System.out.print(str.charAt(j));
                    } else {
                        counter++;
                    }

                }
            }else{
                System.out.print(str);
            }
            if(i!=n-1)
                System.out.println();

        }
    }
}

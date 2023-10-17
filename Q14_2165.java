import java.util.Scanner;

public class Q14_2165 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve2(n,1,2,3));
        solve(n,1,2,3);
        
    }

    static void solve(int n, int i, int j, int k) {
        if(n==1){
            System.out.println(i+" "+k);
            return;
        }
        solve(n-1, i, k, j);
        System.out.println(i+" "+k);
        solve(n-1, j, i, k);
    }static int solve2(int n, int i, int j, int k) {
        if(n==1){
            return 1;
        }
        int l=solve2(n-1, i, k, j);
        int r=solve2(n-1, j, i, k);
        return 1+l+r;
    }
}

import java.util.Scanner;

public class Q2_1083 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long arr[]=new long[(int) (n-1)];
        for(int i=0;i<n-1;i++)
            arr[i]=sc.nextLong();
        long sum=n*(n+1)/2;
        long s=0;
        for(int i=0;i<arr.length;i++)
            s+=arr[i];
        System.out.println(sum-s);
    }
}

import java.util.Scanner;

public class Q4_1094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }long c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                c+=arr[i-1]-arr[i];
                arr[i]=arr[i-1];
            }
        }System.out.println(c);

    }
}

import java.util.Scanner;

public class Q3_1069 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        String s=sc.nextLine();
        String n="ACGT";
        for(int i=0;i<n.length();i++){
            int sum=0;
            for(int j=0;j<s.length();j++){
                if(n.charAt(i)==s.charAt(j)){
                    sum++;
                    max=Math.max(max,sum);
                }
                else sum=0;
            } 
        }
        System.out.println(max);

    }   
}

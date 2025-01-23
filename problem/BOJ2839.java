import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        int n, answer=5000;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n/5+1; ++i){
            if((n-5*i)%3==0){
                answer=Math.min(answer, i+(n-5*i)/3);
            }
        }
        if(answer==5000)
            System.out.println(-1);
        else
            System.out.println(answer);

    }
}

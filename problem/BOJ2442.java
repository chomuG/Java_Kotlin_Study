import java.util.Scanner;

public class BOJ2442 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=1; i<=n; ++i){
            for(int j=n-i; j>0; --j){
                System.out.print(" ");
            }
            for(int j=0; j<i*2-1; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

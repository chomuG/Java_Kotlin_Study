import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        int[] pieces = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<6; ++i){
            pieces[i]=sc.nextInt();
        }
        System.out.println((1-pieces[0])+" "+(1-pieces[1])+" "+(2-pieces[2])+" "+(2-pieces[3])+" "+(2-pieces[4])+" "+(8-pieces[5])+" ");
    }
}

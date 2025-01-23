import java.util.Scanner;

public class BOJ1267 {
    public static void main(String[] args) {
        int n, callTime=0, yPrice=0, mPrice=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0; i<n; ++i){
            callTime=sc.nextInt();
            yPrice+=((callTime/30)*10+10);
            mPrice+=((callTime/60)*15+15);
        }

        if(yPrice<mPrice)
            System.out.println("Y "+yPrice);
        else if(mPrice<yPrice)
            System.out.println("M "+mPrice);
        else
            System.out.println("Y M "+yPrice);



    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ5698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read;
        while(!(read=br.readLine()).equals("*")){
            boolean isTautogram=true;
            String answer="";
            read=read.toLowerCase();
            String[] words = read.split(" ");
            for(int i=0; i<words.length-1; ++i){
                if(words[i].charAt(0)!=words[i+1].charAt(0)){
                    isTautogram=false;
                    break;
                }
            }
            answer=(isTautogram)?"Y":"N";
            System.out.println(answer);
        }
    }
}

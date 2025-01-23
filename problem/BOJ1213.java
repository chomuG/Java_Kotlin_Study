import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1213 {
    static int[] alphabets = new int[26];
    static String findPalindrome(){
        StringBuilder answer= new StringBuilder();
        int odd=0;
        String mid="";

        for(int i=0; i<26; ++i){//이름 만들기;
            char ch = (char) ('A'+i);
            String s = ""+ch;
            if(alphabets[i]%2!=0) {
                mid += s;
                odd++;
            }
            answer.append(s.repeat(alphabets[i] / 2));
            if(odd>1)
                return "I'm Sorry Hansoo";
        }

        return answer.toString()+mid+answer.reverse();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String name = read.readLine();

        for(int i=0; i<name.length(); ++i){//알파벳 갯수 추가
            alphabets[name.charAt(i)-'A']++;
        }

        System.out.println(findPalindrome());
    }
}

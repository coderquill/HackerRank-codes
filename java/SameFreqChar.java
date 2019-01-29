//https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SameaFreqChar {

    // Complete the isValid function below.
    static String isValid(String s) {
        int [] countOfChar = new int[26];
        int len = s.length();
        int count = 0,sum = 0, j=1;
        String ans = "NO";
        
        for(int i = 0; i < len; i++){
            countOfChar[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(countOfChar[i]!=0){
                count++;
                sum = sum+countOfChar[i];
            }
        }
        if((sum%count==0) || ((sum-1)%count==0) ||((sum+1)%count==0) )
            ans = "YES";

        
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

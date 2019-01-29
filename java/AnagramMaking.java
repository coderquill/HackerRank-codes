//https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AnagramMaking{

    
    static int makeAnagram(String a, String b) {
        int lenOfa = a.length();

        int lenOfb = b.length();

        int [] count1 = new int [26];

        int [] count2 = new int [26];

        int i,j,sum = 0;

        for( i = 0; i < lenOfa; i++)
            count1[a.charAt(i)-'a']++;

        for( i = 0; i < lenOfb; i++)
            count2[b.charAt(i)-'a']++;

        for( i = 0; i < 26; i++)
            sum = sum + Math.abs(count1[i]-count2[i]);
 

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


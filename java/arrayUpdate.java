//https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayUpdate{

    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [] arr = new int [10000000];
        int a,b,value;
        for(int i=0;i<n;i++)
            arr[i]=0;
        for(int i=0; i<m; i++){
            a=scanner.nextInt();
            b=scanner.nextInt();
            value=scanner.nextInt();
            for(int j=a-1; j<=b-1; j++){
            arr[j]=arr[j]+value;
            }
            
        }
        int max = arr[0];
        for(int k=1; k<n;k++){
                if(max<arr[k])
                    max=arr[k];
        }
            System.out.println(max);


    }
}


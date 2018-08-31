/*For example
A = {1,2,3,4,5,6}.

He rotates the array clockwise i.e. after rotation the array A = {6,1,2,3,4,5} and delete the last element that is {5} so A = {6,1,2,3,4}. Again he rotates the array for the second time and deletes the second last element that is {2} so A = {4,6,1,3}, doing these steps when he reaches 4th time, 4th last element does not exists so he deletes 1st element ie {1} so A={3,6}. So continuing this procedure the last element in A is {3}, so o/p will be 3.
 

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of each test case contains an integer N. Then in the next line are N space separated values of the array A.
 

Output:
For each test case in a new line print the required result.
Input
2
4
1 2 3 4
6
1 2 3 4 5 6

Output:
2
3*/

import java.util.*;
import java.lang.*;
import java.io.*;

class arrayRotate {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		//System.out.println(t);
		for(int j = 0; j < t; j++)
        {
            int n = scan.nextInt();
            //System.out.println(n);
    		int [] a = new int[n];
    		for(int i = 0; i < n; i++)
    		{
    		    a[i] = scan.nextInt();
    		}
    		int key = func(a,n);
    		/*for(int i = 0; i < n; i++)
    		{
    		    System.out.print(a[i]+" ");
    		}*/
    		System.out.println(a[key]);
    		
        }
		
	}
	
	public static int func(int a[], int n)
	{
	    if (n==1)
	      return 0;
	    else
	        if(n%2!=0)
	               return (((n/2)+3)/2);
	        else 
	            return (((n/2)+1)/2);
	}
	      
	
}

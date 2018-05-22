import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] freq= new int[5];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==1)
            {
                freq[0]++;
            }
            if(ar[i]==2)
            {
                freq[1]++;
            }
            if(ar[i]==3)
            {
                freq[2]++;
            }
            if(ar[i]==4)
            {
                freq[3]++;
            }
            if(ar[i]==5)
            {
                freq[4]++;
            }
        }
        int max=freq[0];
        int p=0;
        for(int i=0;i<5;i++)
        {
            if(freq[i]>max)
            {
                max=freq[i];
                p=i;
            }    
        }
        //System.out.println(max);
        //System.out.println(p);
        return p+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

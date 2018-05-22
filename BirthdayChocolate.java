import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int j=0;
        int sum=0;
        int count=0;
        for(int p=m;p<=n;p++)
        {
            for(int i=j;i<p;i++)
            {
                sum=sum+s[i];
            }
            if(sum==d)
            {
                count++;
            }
            //System.out.println(sum+" "+ count+ " "+ j + " "+ p);
            sum=0;
            j++;
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}

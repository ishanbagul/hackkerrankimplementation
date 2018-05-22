import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int high,low;
        int[] res= new int[2];
        int maxcount=0,mincount=0;
        high=s[0];
        low=s[0];
        int j=1;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]>high)
            {
                high=s[i];
                //System.out.println(high+ "high");
                maxcount++;
            }
            else if(s[i]<low)
            {
                low=s[i];
                //System.out.println(low+ "low");
                mincount++;
            }    
        }
        res[0]=maxcount;
        res[1]=mincount;
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}

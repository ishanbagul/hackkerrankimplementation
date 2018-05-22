import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int posa=0;
        int counta=0;
        for(int a_i=0;a_i<m;a_i++)
        {
            posa= a+apple[a_i];
            if(posa>=s && posa<=t)
            {
                counta++;
            }
        }
        int poso=0;
        int counto=0;
        
         for(int o_i=0;o_i<n;o_i++)
         {
            poso= b+orange[o_i];
            if(poso>=s && poso<=t)
            {
                counto++;
            } 
             
         }
         System.out.println(counta);
         System.out.println(counto);   
    }
}

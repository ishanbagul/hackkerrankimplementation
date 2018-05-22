import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int checker= a[0];
        int count=0;
        int c1=0;
        int c2=0;
        while(checker<=b[m-1])
        {
            int bin=9;
            c1=0;
            c2=0;
            for(int i=0;i<n;i++)
            {
                
                double q= (double)checker/a[i];
                //System.out.println(q);
                if(q==(int)q)
                {
                    c1++;
                    //System.out.println(q);
                    //System.out.println(c1);    
                }
                //System.out.println(c1);  
               if(c1==n)
               {
                   bin=1;
               }    
                }
            if(bin==1)
            {
                for(int i=0;i<m;i++)
                {    
                 double q= (double) b[i]/checker;
                //System.out.println(q);
                if(q==(int)q)
                {
                    c2++;
                    //System.out.println(q);
                    //System.out.println(c2);    
                }
                //System.out.println(c2);
                }    
               if(c2==m)
               {
                   count++;
               }    
            }    
           
            //System.out.println(bin);
            //System.out.println(checker);
            //System.out.println(count);
            //System.out.println(" ");
            checker= checker+a[0];
        }     
    System.out.println(count);
          
    }
}

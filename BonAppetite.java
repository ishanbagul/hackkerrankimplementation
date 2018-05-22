import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,k,bch,btot=0,ret,bac;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        k= in.nextInt();
        int it[] = new int[n];
        for(int i=0;i<n;i++)
        {
            it[i]=in.nextInt();
            //System.out.println(it[i]);
        }
        bch=in.nextInt();
        //System.out.println(n+ " "+ k + " "+ bch);
        for(int i=0;i<n;i++)
        {
            if(i!=k)
            {
                btot=btot+ it[i];
            }    
        }
        bac=btot/2;
        //System.out.println(bac);
        if(bac==bch)
        {
            System.out.println("Bon Appetit");
        }
        else
        {
            ret= bch-bac;
            System.out.println(ret);
        }    
    }
}

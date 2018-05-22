import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int pos1=x1;
        int pos2=x2;
        if(x2>x1 && v2>v1 || x1>x2 && v1>v2)
        {
            System.out.println("NO");
        }    
        else
        {
            while(pos1<=500000000 && pos2<=500000000)
            {
                pos1=pos1+v1;
                pos2=pos2+v2;
                //System.out.println(pos1+" "+pos2);
                if(pos1==pos2)
                {
                    System.out.println("YES");
                    break;
                }    
                    
            }
            if(pos1!=pos2)
            {
                System.out.println("NO");
            }    
        }    
    }
}

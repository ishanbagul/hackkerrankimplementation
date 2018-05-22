import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String solve(int year){
        // Complete this function
        int[] days= new int[12];
        days[0]=31;
        days[1]=28;
        days[2]=31;
        days[3]=30;
        days[4]=31;
        days[5]=30;
        days[6]=31;
        days[7]=31;
        days[8]=30;
        days[9]=31;
        days[10]=30;
        days[11]=31;
        int sum=0;
        int i=0;
        String dtret= new String();
        if(year==1918)
        {
             days[1]=15;
            while(sum<=256-days[i+1])
            {
                sum=days[i]+sum;
                i++;
                  
            }
            //System.out.println(sum+ " "+ i);
            if(sum==256)
            {
                i++;
               dtret= days[i]+"."+"0"+i+"."+year;
            }
            else if(sum<256)
            {
                int dt=256-sum;
                int j=i+1;
                dtret= dt+"."+"0"+j+"."+year;
            }    
        }
        else if(year<1918 && year>=1700)
        {
            if(year%4==0)
            {
                days[1]=29;
            }
            while(sum<=256-days[i+1])
            {
                sum=days[i]+sum;
                i++;
                  
            }
            //System.out.println(sum+ " "+ i);
            if(sum==256)
            {
                i++;
               dtret= days[i]+"."+"0"+i+"."+year;
            }
            else if(sum<256)
            {
                int dt=256-sum;
                int j=i+1;
                dtret= dt+"."+"0"+j+"."+year;
            }    
           
        }
        else if(year>1918 && year<=2700)
        {
            if(year%400==0 || (year%4==0 && year%100!=0))
            {
                days[1]=29;
                //System.out.println("Here");
            }
            while(sum<=256-days[i+1])
            {
                sum=days[i]+sum;
                i++;
                  
            }
            //System.out.println(sum+ " "+ i);
            if(sum==256)
            {
                i++;
               dtret= days[i]+"."+"0"+i+"."+year;
            }
            else if(sum<256)
            {
                int dt=256-sum;
                int j=i+1;
                //System.out.println(j);
                dtret= dt+"."+"0"+j+"."+year;
            }    
        }    
        return dtret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}

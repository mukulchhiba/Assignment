/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.String.format;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.HashMap;
import java.text.ParseException;
import java.util.Collections;
public class hashmap 
{
public static void main(String args[])throws ParseException
{
    Scanner sc=new Scanner(System.in);
    HashMap<Date,Integer>hmap=new HashMap<Date,Integer>();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       
        String m1=sc.next();
        Date d1=sdf.parse(m1);
       
        Integer n1=sc.nextInt();
  
        String m2=sc.next();
        Date d2=sdf.parse(m2);
        Integer n2=sc.nextInt();
        Date d3=sdf.parse("1970-01-01");
        Date d4=sdf.parse("2100-01-01");
         if(d1!=null && d2!=null && n1!=null && n2!=null && d1.compareTo(d3)>0 && n1>0 && n1<=1000000 && n2>0 && n2<=1000000 && d1.compareTo(d4)<0  )
         {    
         
    Calendar calendar1 = Calendar.getInstance();
    calendar1.setTime(d1);

    Calendar calendar2 = Calendar.getInstance();
    calendar2.setTime(d2);
    hmap.put(d1,n1);
    Date currentDate = calendar1.getTime();
    while(!currentDate.equals(calendar2.getTime())){
        calendar1.add(Calendar.DAY_OF_MONTH, 1);
         //hmap.put(currentDate, b2);
        currentDate = calendar1.getTime();
        //System.out.println(currentDate);
        //hmap.put(d1,b1);
        hmap.put(currentDate, n2);
        int a=(n2+n1)/2;
        n2=a;
        //hmap.put(currentDate,b2);

    }
        //hmap.put(d2,b2);
         
        
        
        System.out.print(hmap);
         }
         else
         {
             System.out.print("1");
         }
    
        
}
}

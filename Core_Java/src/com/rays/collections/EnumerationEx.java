
package com.rays.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
       // v.add(4); //allow duplicates
      //  v.add("e");  //allow
     //  v.add(null); //allow multi. null
      
       //Note:ArrayList can't enumerate(it will error at compile time method element is undefined) only allow for iterator but vactor(histrocial class) allow both 
        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

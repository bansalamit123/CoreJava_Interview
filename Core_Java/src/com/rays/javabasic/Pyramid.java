
package com.rays.javabasic;

public class Pyramid {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5-i;j>0;j--) {
				System.out.print(" ");
			}			
			for(int j=i;j>0;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();	
		}
	}

}
//**Outer loop (`i`)** total 5 rows control karta hai.
//- **Pehla inner loop (`j=5-i`)** har row ke starting me kitni spaces print karni hain wo control karta hai, jo pyramid ka structure banata hai.
//- **Doosra inner loop (`j=i`)** kitne `*` print hone hain us row me wo decide karta hai, aur har `*` ke baad ek space dalta hai.
//- **System.out.println()** next line me shift kar deta hai, takki nayi row start ho sake.
//
//
//
//


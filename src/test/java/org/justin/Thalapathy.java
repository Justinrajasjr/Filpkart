











package org.justin;

public class Thalapathy {
     public static void main(String[] args) {
		
	

	String s ="Justin Raj Arokkiasamy";
	 String[] s1 = s.split(" ");
	 String s2="";
	 System.out.println(s1.length);
	 for (int i = 0; i < s1.length; i++) {
		if(i!=1) {System.out.print(s1[i]);}
		
		/*else {
			 for (int j = s1[i].length()-1; j >=0; j--) {
				 char	 c2 = s1[i].charAt(j);
				 System.out.print(c2);
				 
			 }*/
		//}
		 
		System.out.print(" ");
	}
	   System.out.println();
	 for (int i = 0; i <= s.length(); i++) { 
		// System.out.println(i);
		 int j=2;
		 for (;j < i; j++) {
			 char c3 = s.charAt(j);
			System.out.print(c3);
		}System.out.println();
		
	}
	 
	
}}

package org.justin;

public class Eritga {
	public static void main(String[] args) {
		String s="SARATH KUMAR";
		String[] split = s.split(" ");
		for(int i=0;i<split.length;i++) {
			if(i==1) {
				StringBuffer sb=new StringBuffer();
				sb.append(split[i]);
				sb.reverse();
				System.out.println(split[0]+" "+sb);
			}
		}
	}

}

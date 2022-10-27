package org.justin;

public class Dzire {
	
public static void main(String[] arg) {
	int [] a = {1,2,3,4};
	int [] b = {1,4,2,5};
    int count=0,count1=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if(a[i]==b[j]) {
				count++;
			}
		}
			if(count==0) {
				System.out.println(a[i]);
			}
			count=0;
			}
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if(b[i]==a[j]) {
			count1++;
		}
	}
		if(count1==0) {
			System.out.println(b[i]);
		}
		count1=0;
		}
	}
		
	}



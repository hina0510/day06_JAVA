package array;

import java.util.Scanner;

public class TestClass07 {
public static void main(String[] args) {
	int arr[] = {10, 54, 13, 17, 25, 30};
	Scanner input = new Scanner(System.in);
	System.err.print("짝?홀?");
	String str = input.next();
	for(int i=0;i<arr.length;i++) {
		if(str.equals("짝")) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}else {
			if(i%2==1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	/*
	for(int i=str.equals("짝")?0:1;i<arr.length;i+=2) {
		System.out.println(arr[i]);
	}
	*/
}
}

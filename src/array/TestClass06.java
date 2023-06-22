package array;

import java.util.Scanner;

public class TestClass06 {
public static void main(String[] args) {
	int arr[] = {10, 54, 13, 17, 25, 30};
	
	Scanner input = new Scanner(System.in);
	System.err.print("짝수?홀수?");
	String str = input.next();
	
	for(int num:arr) {
		if(str.equals("짝수")) {
			if(num%2==0) {
				System.out.println("짝수 : "+num);
			}
		}else {
			if(num%2==1) {
				System.out.println("홀수 : "+num);
			}
		}
	}
	
}
}

package array;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	String[] str = new String[3];
	System.out.println(str.length);
	System.out.println("[0] : "+str[0]);
	
	Scanner input = new Scanner(System.in);
	for(int i=0;i<str.length;i++) {
		System.out.println(i+"번째 입력");
		str[i]=input.next();
	}
	System.out.println("---출력---");
	for(int i=0;i<str.length;i++) {
		System.out.println(i+". "+str[i]);
	}
}
}

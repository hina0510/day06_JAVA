package list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass04 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	for(int i=0;i<3;i++) {
		System.err.println(i+"번째 입력");
		String msg = input.next();
		arr.add(msg);
	}System.out.println("arr : "+arr);
	System.out.println("찾는 값 입력 : ");
	String search = input.next();
	System.out.println("contains : "+arr.contains(search));
	System.out.println("indexOf : "+arr.indexOf(search));
}
}

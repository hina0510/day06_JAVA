package list;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class TestClass05 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	arr.add("김밥");
	arr.add("라면");
	arr.add("순대");
	System.out.println("arr : "+arr);
	
	System.out.println("변경할 위치 1번 인덱스");
	int index=1;
	System.out.println("변경할 값 라면 -> 라멘");
	String name = "라멘";
	arr.set(index, name);
	System.out.println("변경 후 : "+arr);
}
}

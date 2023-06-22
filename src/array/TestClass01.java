package array;

public class TestClass01 {
public static void main(String[] args) {
	/*
		배열
		같은 자료형으로 여러 개의 연속된 공간을 할당받아 사용
		자료형[] 배열명;
		자료형 배열명[];
		자료형 [] 배열명 = 초기화;
		
		인덱스
		배열은 여러개의 공간을 만들어 사용하므로 해당하는 각각의 공간에 접근하기 위한 방법으로 index를 활용한다
		index는 0부터 시작한다
	 */
	int[] arr = new int[5];
	arr[0] = 1000;
	arr[1] = 2000;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
}
}

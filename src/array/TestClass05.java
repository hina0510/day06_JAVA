package array;

public class TestClass05 {
public static void main(String[] args) {
	int arr[] = {10, 54, 13, 17, 25, 30};
	for(int num:arr) {
		if(num%2==0) {
			System.out.println("짝수 : "+num);
		}else {
			System.out.println("홀수 : "+num);
		}
	}
}
}

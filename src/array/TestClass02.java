package array;

public class TestClass02 {
public static void main(String[] args) {
	double dos[] = new double[] {1.11, 2.22, 3.33};
	System.out.println(dos.length);
	for(int i=0; i<dos.length;i++) {
		System.out.println(i+". "+dos[i]);
	}
	System.out.println("========");
	System.out.println(dos[0]);
	System.out.println(dos[1]);
	System.out.println(dos[2]);
}
}

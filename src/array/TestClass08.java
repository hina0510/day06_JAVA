package array;

import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class TestClass08 {
public static void main(String[] args) {
	String[] id = new String[5];
	String[] pw = new String[5];
	Scanner sc = new Scanner(System.in);
	int num;
	String nid, npw;
	
	while(true) {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 모든 회원 보기");
		System.out.println("4. 나가기");
		System.out.print(">>>");
		num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			if(id[0]==null) {
				System.out.println("회원가입하세요");
			}else {
				System.out.print("id 입력 : ");
				nid=sc.next();
				System.out.print("pw 입력 : ");
				npw=sc.next();
				for(int i=0;i<id.length;i++) {
					if(id[i]!=null) {
						if(nid.equals(id[i])) {
							if(npw.equals(pw[i])) {
								System.out.println("인증 통과");
							}else {
								System.out.println("비밀번호 틀림");
							}
						}else {
							System.out.println("존재하지 않는 id입니다");
						}
					}
				}
			}
			break;
		case 2 : 
			for(int i = 0;i<id.length;i++) {
				System.out.print("저장할 id 입력 : ");
				nid = sc.next();
				if(nid.equals(id[i])) {
					System.out.println("존재하는 id입니다");
					System.out.println("다시 입력...");
				}if(id[i]==null) {
					id[i]=nid;
					System.out.print("저장할 pw 입력 : ");
					npw = sc.next();
					pw[i]=npw;
					System.out.println("등록되었습니다");
					break;
				}
			}
			break;
		case 3 : 
			if(id[0]==null) {
				System.out.println("저장된 정보가 없습니다");
			}else {
				System.out.println("id\tpassword");
				System.out.println("--------------------");
				for(int i=0;i<id.length;i++) {
					if(id[i]!=null) {
						System.out.println(id[i]+"\t"+pw[i]);
					}
				}
				System.out.println("--------------------");
			}
			break;
		case 4 : 
			System.out.println("종료합니다");
			break;
		}
	}
}
}

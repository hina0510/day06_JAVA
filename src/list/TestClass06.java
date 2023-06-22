package list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass06 {
public static void main(String[] args) {
	ArrayList<String> id = new ArrayList<>();
	ArrayList<String> pw = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int num, idindex, pwindex;
	String inputid, inputpw, newid, newpw, answer;
	
	while(true) {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 회원정보 확인");
		System.out.print(">>>");
		num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			if(id.size()==0) {
				System.out.println("회원가입하세요");
			}else {
				System.out.print("id 입력 : ");
				inputid=sc.next();
				System.out.print("pw 입력 : ");
				inputpw=sc.next();
				for(int i=0;i<id.size();i++) {
					if(id.contains(inputid)==true) {
						idindex = id.indexOf(inputid);
						pwindex = pw.indexOf(inputpw);
						if(idindex==pwindex && pw.contains(inputpw)==true) {
							System.out.println("인증 통과");
							System.out.println("===LOGIN===");
							System.out.println("1. 비밀번호 변경");
							System.out.println("2. 계정 삭제");
							System.out.print(">>>");
							num = sc.nextInt();
							switch(num) {
							case 1 : 
								System.out.print("아이디 확인 : ");
								inputid = sc.next();
								System.out.print("비밀번호 확인 : ");
								inputpw = sc.next();
								if(id.contains(inputid)==true){
									idindex = id.indexOf(inputid);
									pwindex = pw.indexOf(inputpw);
									if(idindex==pwindex && pw.contains(inputpw)==true) {
										System.out.print("새 비밀번호 : ");
										newpw = sc.next();
										pw.set(idindex, newpw);
										System.out.println("비밀번호가 변경되었습니다");
										inputpw = newpw;
										break;
									}else {
										System.out.println("pw 틀림");
									}
								}else {
									System.out.println("id 틀림");
								}
								break;
							case 2 : 
								if(id.contains(inputid)==true) {
									idindex = id.indexOf(inputid);
									pwindex = pw.indexOf(inputpw);
									if(idindex==pwindex && pw.contains(inputpw)==true) {
										System.out.print("계정을 삭제하시겠습니까?(네, 아니요)");
										answer = sc.next();
										if(answer.equals("네")) {
											id.remove(inputid);
											pw.remove(inputpw);
											System.out.println("계정이 삭제되었습니다");
										}
									}
								}
								break;
							}
					}else if(pw.contains(inputpw)==false){
						System.out.println("비밀번호 틀림");
					}
				}else if(id.contains(inputid)==false){
					System.out.println("존재하지 않는 id입니다");
				}
			}
		}
		break;
		case 2 : 
			while(true) {
				System.out.print("저장할 id 입력 : ");
				newid = sc.next();
				if(id.contains(newid)==true) {
					System.out.println("존재하는 id입니다");
					System.out.println("다시 입력...");
				}else{
					id.add(newid);
					System.out.print("저장할 pw 입력 : ");
					newpw = sc.next();
					pw.add(newpw);
					System.out.println("등록되었습니다");
					break;
				}
			}
		break;
		case 3 : 
			if(id.size()==0) {
				System.out.println("저장된 정보가 없습니다");
			}else {
				System.out.println("id\tpassword");
				System.out.println("--------------------");
				for(int i=0;i<id.size();i++) {
					System.out.println(id.get(i)+"\t"+pw.get(i));
				}
				System.out.println("--------------------");
			}
		break;
		}
	}
	
}
}

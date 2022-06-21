package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
public static void main(String[] args) { //작성자 이용학
	/*  구글 이메일 계정을 체크하는 기능 구현 
	 *  1. @ 기호가 1개 포함되어야 합니다.	(메시지 : 이메일 형식이 아닙니다.)
	 *  		ㄴ indexof 가 -1이 아니고 indexof 와 lastindexof 가 같은 값인가?
	 *  
	 *  2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)
	 *  		ㄴ '@' 의 indexof 를 구해서 그 뒤부터 끝까지 substring 추출한 문자열을 equals 비교
	 *  
	 *  3. 2번이 참일 떄 @ 앞까지의 문자열(계정이름)만 추출합니다.
	 *  		ㄴ '@' 의 indexof 를 구해서 처음 부터 '@' 이전 까지의 문자열 substring 저장
	 *  
	 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
	 *  		ㄴ 3번의 문자열이 length() 값 6인지 비교
	 *  
	 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
	 *   		ㄴ indexof('$') , indexof('%') 가 모두 -1이 아니면 허용안하는 기호 포함
	 */

	Scanner sc = new Scanner(System.in);
	String email;//@입력받을 메일
	String account;//@앞에
	String domain;//@뒤에
	boolean isvalid = true;
		
	System.out.print("사용할 이메일을 입력해 주세요 : ");
	email = sc.nextLine(); //메일 입력받기
	
	
	int mark = email.indexOf('@'); //@ 찾기위한 도구 ,@위치
	
	if(mark==-1) { // *@가 입력받은 문자열에 없을경우
		isvalid = false;
		System.out.println(isvalid+" : @를 포함시켜서 다시 입력해 주세요!");
	}
	else if(mark!=-1) { //@가 있을경우
		domain = email.substring(mark+1); //도메인 변수에 저장
		if(!domain.equals("gmail.com")) { //도메인 변수 와 gmail 문자열이 다를경우
			isvalid = false;
			System.out.println(isvalid+" :도메인이 gmail이 아닙니다."); //에러 출력
		}
		else { 
			
			account = email.substring(0,mark); //@앞까지 저장하는 변수
			
			int length = account.length(); //account 글자수를 저장하는 변수
			if(length<6) { // @포함,도메인 일치, * account가 6글자 미만일시
				isvalid = false;
				System.out.println(isvalid+" :6글자미만 입니다."); //에러 출력
			}
			else { 
				if(email.indexOf('$')==-1 && email.indexOf('%') ==-1) { //@포함 , 도메인 일치 , account 6글자 이상 , 특수문자 미포함
					System.out.println("입력하신 이메일은 "+email+"입니다."); // 조건 모두 충족시 이메일 출력
				}
				else {  //@포함,도메인일치,account6글자이상  *특수문자 포함시
					isvalid = false;
					System.out.println(isvalid+" :특수문자 $,%를 제외시켜주세요."); //에러출력
				}
				
			}
	}
sc.close();
	
	//입력값이 처리조건 1,2,4,5에 해당하지않으면  오류메시지를 출력하고, isvalid 변수를 false로 변경 -> isvalid 출력
	













}
}
}


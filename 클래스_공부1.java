package 자바0926;

class 붕어빵{
	public static String 붕어빵을만들다(String 재료) {
		return 재료+"붕어빵을 만들었습니다";
	}
	public static int 붕어빵수량을파악하다(int 수량) {
		return 수량;
	}
	
}




// *클래스 이름을 만들 때는 항상 앞자리는 대문자를 입력한다.
// *클래스 안에 메소드가 위치한다.
// *프로젝트 ->패키지 ->클래스 ->메소드(가장 작은 단위)
// 자바파일에 public class는 1개만 작성할 수 있다.(단, 외부클래스일 경우)
class Pizza{ //class 시작

	public static void 피자를먹다() {
		System.out.println("백종원피자 냠냠");
	}
	/* public static 접근제어자
	 * 리턴타입 String
	 * 메소드 이름 피자를주문하다
	 * 파라미터 타입 String int
	 */
	public static String 피자를주문하다(String 피자이름, int 수량) {//메소드 시작
	return "불고기피자";
	}//메소드 끝
} //class 끝

public class 클래스_공부1 {

	public static void main(String[] args) {
		/*
		 * int : 데이터 타입
		 * x : 변수 이름
		 * = : 대입 연산자
		 * 100 : 데이터
		 */
		int x =100;
		/* Pizza : 데이터 타입 (자바는 클래스도 데이터 타입이다. 기본 데이터타입 8 + 클래스 1 = 9개)
		 * p : 변수이름
		 * new pizza() : 클래스 데이터
		 */
		Pizza p = new Pizza(); //new pizza(); pizza 클래스를 불러온 것
		p.피자를먹다(); //Pizza클래스 안에있는 피자를먹다 메소드 호출
		붕어빵 팥붕어빵 = new 붕어빵();
		
		String 결과 = 팥붕어빵.붕어빵을만들다("팥");
		System.out.println(팥붕어빵.붕어빵을만들다("팥"));
		System.out.println(결과);
		int 수량 = 팥붕어빵.붕어빵수량을파악하다(10);
		System.out.println("붕어빵은 "+수량+"개 있습니다.");
}
	}

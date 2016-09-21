package chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		int k = 0;
		try {
			System.out.println("파일오픈");
			k = 1000 / a;
			System.out.println("more code...");
		} catch (ArithmeticException ex) {
			//return; //로그남기기 (파일)
			
			System.out.println("죄송합니다. 예기치 않은 오류가 발생했습니다."); //(정상종료)
			
			//최후의 방법 
			//ex.printStackTrace();

			//복구는 사실상 어려움.

			// 안좋은 이유는 코드가 복잡해 짐 . 블럭안이 지역변수가 되서 k를 인식하지 못함. k를 위로 다시 선언해줌.
			// 코드를 읽기 힘들어짐.

		}finally{
			System.out.println("자원정리");
		}
		//return을 할경우에는 마지막이 실행이 안되고 finally만 실행이 되므로 finally를 써주는 이유
		//return 이 없는 경우에는 결과가 오류 난 경우에는 finally가 있으나 마나 한것과 똑같이 나올수 있다.
		System.out.println("결과는 : " + k);
	}

}

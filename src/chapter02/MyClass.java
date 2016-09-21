package chapter02;

import java.io.IOException;

public class MyClass {
	public void dangerousMethod() throws MyException, IOException{ //예기치 않은 예외상황
		System.out.println("normal....");
		boolean isDanger = true;
		if(isDanger){
			//예외상황이 발생
			//ex) 네트워크 오류, io 오류
			throw new MyException("예외상황 발생");
		}
		System.out.println("normal....");
	}
}

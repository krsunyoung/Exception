package chapter02;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		try {
			myClass.dangerousMethod();
		}
		//아래 둘중 하나의 오류가 났을때 알려줌.
		catch(IOException | MyException e){
			e.printStackTrace();
		}
		
//		catch (Exception e){
//			e.printStackTrace();
//		} 
		//아래 두개를 부모 Exception으로 한번에 받을수 있다.
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch(MyException e){
//			e.printStackTrace();
//		}
	}

}

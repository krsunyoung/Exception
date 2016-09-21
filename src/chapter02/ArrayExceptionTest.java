package chapter02;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		for(int i = 0; i<a.length; i ++){ 
//			for(int i = 0; i<=a.length; i ++){ //논리에러  이런경우 try catch안해도 됨
			//Uncheck 립센션은 고쳐주는것이 나음.
			//Checked 립센션은 컴터이상(시스템외부요인 )으로 발견한 에러. 반드시 try chatch를 하라고 강조함. 
			a[i]=i;
		}
		
	}

}

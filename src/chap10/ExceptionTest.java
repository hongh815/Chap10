package chap10;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		try {			
			 i = Integer.parseInt(args[0]);
			 j = Integer.parseInt(args[1]);
			System.out.println(i / j);
		}
		catch (Exception e) { //모든 예외결과 동일하게 처리하는 메소드 -->> 상위예외 캐치
			System.out.println("모든 예외 동일 처리합니다.");
		}
		//catch(ArrayIndexOutOfBoundsException e) { //하위예외 캐치이므로 상위예외 캐치보다 먼저 선언해야 오류가 안난다
		//	System.out.println("반드시 2개의 값을 입력해야만 실행됩니다.");
		}/*catch(NumberFormatException e) {
			System.out.println("정수값을 입력해야만 실행됩니다.");
		}catch(ArithmeticException e) {
			System.out.println("0을 입력하면 안됩니다.");
		} //발생하는 오류 타입을 위에 catch(이 안에) 쓴다. */
		//System.out.println("메인종료");
		//예외자바 클래스 정의
		String s = null;
		//System.out.println(s.length()); //NullPointerException
		
	}


/*
 * class xxxxxException extends Exception 클래스 정의
 * Exception e = new Exception();
 * 
 * class B extents A{}
 * A a1 = new B();
 * B b1 = (B)new A(); //ClassCastException
 */



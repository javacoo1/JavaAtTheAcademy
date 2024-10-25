
//	Singleton patter(객체를 유일하게 하나만 만들어 사용하고 싶을 때)
public class SMain {
	public static void main(String[] args) {
		
		//	자기 자신 : 이름, 나이
		
		Me me = Me.getMe();
		System.out.println(me);
		
		Me me2 = Me.getMe();
		System.out.println(me2);
		
		me.setAge(101);
		
		//	아이언맨 : 이름, 나이 -> 정보출력
		iRM iron = iRM.getIrm();
//		System.out.println(iron.getName());
//		System.out.println(iron.getAge());
		iron.printInfo();
		
	}
}

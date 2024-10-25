
public class Me2 {
	private String name;
	private int age;
	private static Me2 me;

//	final = 상수로써 쓸 수 있다. (한번 저장된 뒤에는 변경불가)
//	static final = 상수다. (초기화값에서 변경불가)
	
	public static Me2 getMe() {
		if (me == null) {
			//	me 인스턴스가 생성된 적 없다면
			me = new Me2("자바바박박벅벅", 25); 
		}
		return me;
	}
	
	

	private Me2() {
		// TODO Auto-generated constructor stub
	}

	private Me2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

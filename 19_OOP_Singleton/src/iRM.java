
public class iRM {
	private String name;
	private int age;
	private static final iRM IRM = new iRM("아이롱맨", 45);
			
			private iRM() {
				// TODO Auto-generated constructor stub
			}

			private iRM(String name, int age) {
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

			public static iRM getIrm() {
				return IRM;
			}
			
			void printInfo() {
				System.out.println(IRM.getName());
				System.out.println(IRM.IRM.getAge());
			}
	
	
}

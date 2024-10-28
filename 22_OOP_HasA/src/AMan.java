
public class AMan {
	private String name;
	private int age;
	private String gender;
	private ADog pet;
	
	public AMan() {
		// TODO Auto-generated constructor stub
	}

	
	
	public AMan(String name, int age, String gender, ADog pet) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.pet = pet;
	}



	public AMan(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		if (pet !=null) {
			System.out.println("------pet------");
//			System.out.println(pet.getName());
//			System.out.println(pet.getAge());
//			System.out.println(pet.getSpecies());			
			pet.info();
		}
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
}

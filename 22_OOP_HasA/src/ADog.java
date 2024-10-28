
public class ADog {
	
	private String name;
	private int age;
	private String species;
	
	public ADog() {
		// TODO Auto-generated constructor stub
	}

	public ADog(String name, int age, String species) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(species);
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	
	
	
	
	
}

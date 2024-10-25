
public class Computer {
//	 속성, 필두, 멤버변수, 인스턴스 변수
	double cpu;
	int ram;
	int hdd;
	
	void printInfo() {
		System.out.printf("cpu : %.1f\n",cpu);
		System.out.printf("ram : %d\n", ram);
		System.out.printf("hdd : %d\n", hdd);
	}
}


public class MainClass4 {
	void display1() {
		System.out.println("MainClass4:display() call...(instance method)");
	}
	// �޸𸮿� ���� => �ʿ��ϸ� ������, ��� ��ġ�� ����� ����
	
	static void display2() {
		System.out.println("MainClass4:display() call...(static method)");
	}
	//
	public static void main(String[] args) {
		MainClass4.display2();
	}

}

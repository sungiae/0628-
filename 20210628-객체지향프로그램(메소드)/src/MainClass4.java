
public class MainClass4 {
	void display1() {
		System.out.println("MainClass4:display() call...(instance method)");
	}
	// 메모리에 저장 => 필요하면 언제든, 어느 위치든 사용이 가능
	
	static void display2() {
		System.out.println("MainClass4:display() call...(static method)");
	}
	//
	public static void main(String[] args) {
		MainClass4.display2();
	}

}

// ���� (��Ī)

class Student{
	String name;
	int hakbun;
	String sex;
	String subject;
}
public class MainClass2 {

	public static void main(String[] args) {
		Student s; // �޸𸮿� ������ �ȵ� ���� => s=null
		s=new Student();
		System.out.println(s); 
		s=new Student();
		System.out.println(s);
//		==> ������� �ٸ��� ���´�	
		s.hakbun=100;
		System.out.println(s.hakbun);
		s=new Student();
		System.out.println(s.hakbun);
		s.name="ȫ�浿";
		
	}

}

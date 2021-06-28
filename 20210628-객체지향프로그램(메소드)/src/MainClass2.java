// 참조 (별칭)

class Student{
	String name;
	int hakbun;
	String sex;
	String subject;
}
public class MainClass2 {

	public static void main(String[] args) {
		Student s; // 메모리에 저장이 안된 상태 => s=null
		s=new Student();
		System.out.println(s); 
		s=new Student();
		System.out.println(s);
//		==> 결과값이 다르게 나온다	
		s.hakbun=100;
		System.out.println(s.hakbun);
		s=new Student();
		System.out.println(s.hakbun);
		s.name="홍길동";
		
	}

}
